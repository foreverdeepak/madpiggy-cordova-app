package com.softdive.madpiggy.app.client.widget.celllist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.EventTarget;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Touch;
import com.google.gwt.event.dom.client.TouchCancelEvent;
import com.google.gwt.event.dom.client.TouchEndEvent;
import com.google.gwt.event.dom.client.TouchMoveEvent;
import com.google.gwt.event.dom.client.TouchStartEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.googlecode.mgwt.dom.client.event.tap.Tap;
import com.googlecode.mgwt.dom.client.event.touch.TouchHandler;
import com.googlecode.mgwt.dom.client.recognizer.EventPropagator;
import com.googlecode.mgwt.ui.client.widget.touch.TouchWidgetImpl;

public class CellList<T> extends Composite implements HasCellSelectedHandler, ProvidesItem<T>, CellSelectionObserver {

	protected static final EventPropagator EVENT_PROPAGATOR = GWT.create(EventPropagator.class);
	
	protected static final Logger logger = Logger.getLogger(CellList.class.getName());
	
	private class InternalTouchHandler implements TouchHandler {
		private boolean moved;
		private int index;
		private Element node;
		private Element touchTarget;
		private int x;
		private int y;
		private boolean started;

		@Override
		public void onTouchCancel(TouchCancelEvent event) {

		}

		@Override
		public void onTouchMove(TouchMoveEvent event) {
			Touch touch = event.getTouches().get(0);
			if (Math.abs(touch.getPageX() - x) > Tap.RADIUS || Math.abs(touch.getPageY() - y) > Tap.RADIUS) {
				moved = true;
				// deselect
				if (node != null) {
					if(CellList.this.appearance.css() != null) {
						node.removeClassName(CellList.this.appearance.css().selected());
					}
					stopTimer();
				}
			}
		}

		@Override
		public void onTouchEnd(TouchEndEvent event) {
			if (node != null) {
				if(CellList.this.appearance.css() != null) {
					node.removeClassName(CellList.this.appearance.css().selected());
				}
				stopTimer();
			}
			if (started && !moved && index != -1) {
				fireSelectionAtIndex(index, touchTarget);
			}
			node = null;
			started = false;
		}

		@Override
		public void onTouchStart(TouchStartEvent event) {
			started = true;

			x = event.getTouches().get(0).getPageX();
			y = event.getTouches().get(0).getPageY();

			if (node != null) {
				if(CellList.this.appearance.css() != null) {
					node.removeClassName(CellList.this.appearance.css().selected());
				}
			}
			moved = false;
			index = -1;
			// Get the event target.
			EventTarget eventTarget = event.getNativeEvent().getEventTarget();
			if (eventTarget == null) {
				return;
			}

			// no textnode or element node
			if (!Node.is(eventTarget) && !Element.is(eventTarget)) {
				return;
			}

			// Have to comment out below line as scroll does not work, if it is
			// present.
			// event.preventDefault();

			// text node use the parent..
			if (Node.is(eventTarget) && !Element.is(eventTarget)) {
				Node target = Node.as(eventTarget);
				eventTarget = target.getParentElement().cast();
			}

			// no element
			if (!Element.is(eventTarget)) {
				return;
			}
			Element target = eventTarget.cast();
			touchTarget = target;
			// Find cell
			String idxString = "";
			while ((target != null) && ((idxString = target.getAttribute("__idx")).length() == 0)) {

				target = target.getParentElement();
			}
			if (idxString.length() > 0) {
				try {
					index = Integer.parseInt(idxString);
					node = target;
					startTimer(node);
				} catch (Exception e) {
				}
			}

		}
	}

	private static final CellListAppearance DEFAULT_APPEARANCE = GWT.create(CellListAppearance.class);

	private static final TouchWidgetImpl impl = GWT.create(TouchWidgetImpl.class);

	protected final Cell<T> cell;

	protected Timer timer;

	@UiField public FlowPanel container;
	@UiField public HTMLPanel footer;
	protected CellListAppearance appearance;

	private int height;
	//private Map<Integer, T> itemMap = new HashMap<Integer, T>();
	//protected Map<Integer, CellWidget<T>> cellWidgetMap = new HashMap<Integer, CellWidget<T>>();
	private ArrayList<T> itemList = new ArrayList<>();
	protected ArrayList<SimplePanel> cellWidgetList = new ArrayList<>();

	public CellList(Cell<T> cell) {
		this(cell, DEFAULT_APPEARANCE, true);
	}

	public CellList(Cell<T> cell, boolean useTouchEvent) {
		this(cell, DEFAULT_APPEARANCE, useTouchEvent);
	}
	
	public CellList(Cell<T> cell, CellListAppearance appearance, boolean useTouchEvent) {
		this.cell = cell;
		this.appearance = appearance;
		
		initWidget(this.appearance.uiBinder().createAndBindUi(this));
		
		hideFooter();

		if(useTouchEvent) {
			InternalTouchHandler touchHandler = new InternalTouchHandler();
			impl.addTouchHandler(this, touchHandler);
		}
	}

	public HandlerRegistration addCellSelectedHandler(CellSelectedHandler cellSelectedHandler) {
		return addHandler(cellSelectedHandler, CellSelectedEvent.getType());
	}
	
	public void render(final Collection<T> models, final int index) {
		if (models.size() == 0) {
			return;
		}
		renderInternal(models, index);
		Scheduler.get().scheduleDeferred(new ScheduledCommand() {
			
			@Override
			public void execute() {
			}
		});
	}

	public void renderInternal(Collection<T> models, int index) {
		int i = index;
		for (T model : models) {
			itemList.add(i, model);
			
			SimplePanel panel = new SimplePanel();
			panel.getElement().setAttribute("__idx", String.valueOf(i));
			if(CellList.this.appearance.css() != null) {
				panel.getElement().addClassName(this.appearance.css().entry());
				if (cell.canBeSelected(model)) {
					panel.getElement().addClassName(this.appearance.css().canbeSelected());
				}
				
				if (i == 0) {
					panel.getElement().addClassName(this.appearance.css().first());
				}
				
				if (models.size() - 1 == i) {
					panel.getElement().addClassName(this.appearance.css().last());
				}
			}
			
			try {
				CellWidget<T> cellWidget = cell.createWidget();
				cellWidget.setIndex(i);
				cellWidget.setObserver(this);
				cellWidget.render(model);
				panel.add(cellWidget);
				setProperties(cellWidget);
				cellWidgetList.add(i, panel);
				container.add(panel);
				height = height + panel.getOffsetHeight();
				i++;
				setTopOfFooter();
			} catch (Exception e) {}
			
		}
		
		for (int counter = 0; counter<cellWidgetList.size(); counter ++) {
			cellWidgetList.get(counter).getElement().setAttribute("__idx", String.valueOf(counter));
		}
	}
	
	protected void setTopOfFooter() {
	}
	
	protected void loading(boolean isLoading) {
		
	}
	
	protected void setProperties(CellWidget<T> cellWidget) {
		
	}
	
	public void onOrientationChange() {
		
	}
	
	public void setSelectedIndex(int index, boolean selected) {
		if(CellList.this.appearance.css() != null) {
			Node node = getElement().getChild(index);
			Element li = Element.as(node);
			if (selected) {
				li.addClassName(this.appearance.css().selected());
			} else {
				li.removeClassName(this.appearance.css().selected());
			}
		}
	}

	protected void fireSelectionAtIndex(int index, Element touchTarget) {
		EVENT_PROPAGATOR.fireEvent(this, new CellSelectedEvent(index, this, touchTarget));
	}

	@UiFactory
	public CellListAppearance getAppearance() {
		return appearance;
	}

	protected void startTimer(final Element node) {
		if (timer != null) {
			timer.cancel();
			timer = null;
		}

		timer = new Timer() {

			@Override
			public void run() {
				node.addClassName(CellList.this.appearance.css().selected());
			}
		};
		timer.schedule(150);
	}

	protected void stopTimer() {
		if (timer != null) {
			timer.cancel();
			timer = null;
		}
	}

	@Override
	public T getItem(int key) {
		return itemList.get(key);
	}

	@Override
	public void fireSelection(int index) {
		fireSelectionAtIndex(index, null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public CellWidget<T> getWidget(int key) {
		return (CellWidget<T>) cellWidgetList.get(key).getWidget();
	}
	
	public int getScrollHeight() {
		return 0;
	}
	
	public Collection<T> getModelList() {
		return itemList;
	}
	
	public void clear() {
		itemList.clear();
		cellWidgetList.clear();
		container.clear();
	}
	
	public void showFooter() {
		footer.getElement().getStyle().setDisplay(Display.BLOCK);
	}
	
	public void hideFooter() {
		footer.getElement().getStyle().setDisplay(Display.NONE);
	}
}