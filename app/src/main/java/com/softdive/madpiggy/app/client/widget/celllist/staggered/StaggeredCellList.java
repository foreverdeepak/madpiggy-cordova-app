package com.softdive.madpiggy.app.client.widget.celllist.staggered;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.dom.client.Style;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.SimplePanel;
import com.googlecode.mgwt.dom.client.event.orientation.OrientationChangeEvent;
import com.googlecode.mgwt.dom.client.event.orientation.OrientationChangeHandler;
import com.googlecode.mgwt.ui.client.MGWT;
import com.softdive.madpiggy.app.client.widget.celllist.Cell;
import com.softdive.madpiggy.app.client.widget.celllist.CellList;
import com.softdive.madpiggy.app.client.widget.celllist.CellWidget;

public class StaggeredCellList<T> extends CellList<T> {
	
	Map<Integer, Integer> columnHeightMap;
	StaggeredViewProps props;
	int lowestColumn;

	public StaggeredCellList(Cell<T> cell) {
		super(cell, new StaggeredCellListAppearance(), true);
		footer.getElement().getStyle().setPosition(Position.ABSOLUTE);
		initProps();
	}

	private void initProps() {
		columnHeightMap = new HashMap<Integer, Integer>();
		props = new StaggeredViewProps();
		for (int i = 0; i < props.columnCount; i++) {
			columnHeightMap.put(i, 0);
		}
		setContainerStyle();
		
		MGWT.addOrientationChangeHandler(new OrientationChangeHandler() {
			
			@Override
			public void onOrientationChanged(OrientationChangeEvent event) {
				//TODO
			}
		});
	}
	
	@Override
	protected void setProperties(CellWidget<T> panel) {
		//CssUtil.setTransitionDuration(panel.getElement(), 250);
		Map.Entry<Integer, Integer> lowestEntry = getLowestHeight();
		int columnIndex = lowestEntry.getKey();
		int top = lowestEntry.getValue();
		int left = columnIndex*(props.itemWidth + props.itemMargin);
		
		panel.getElement().getStyle().setWidth(props.itemWidth, Unit.PX);
		panel.getElement().getStyle().setTop(top, Unit.PX);
		panel.getElement().getStyle().setLeft(left, Unit.PX);
		panel.onPropertiesLoad(props);
		int panelHeight = panel.getHeight();
		panel.getElement().getStyle().setHeight(panelHeight, Unit.PX);
		panel.getElement().getStyle().setPosition(Position.ABSOLUTE);
		
		columnHeightMap.put(columnIndex, top + panel.getHeight() + props.itemMargin);
		lowestColumn = getLowestHeight().getValue();
	}
	
	private void setContainerStyle() {
		Style style = container.getElement().getStyle();
		style.setPosition(Position.RELATIVE);
		style.setProperty("margin", "auto");
		style.setWidth(props.containerWidth, Unit.PX);
	}
	
	private Map.Entry<Integer, Integer> getLowestHeight() {
		Map.Entry<Integer, Integer> lowest = columnHeightMap.entrySet().iterator().next();
		for (Map.Entry<Integer, Integer> entry : columnHeightMap.entrySet()) {
			if(entry.getValue() < lowest.getValue()) {
				lowest = entry;
			}
		}
		return lowest;
	}
	
	private Map.Entry<Integer, Integer> getHighestHeight() {
		Map.Entry<Integer, Integer> heighest = columnHeightMap.entrySet().iterator().next();
		for (Map.Entry<Integer, Integer> entry : columnHeightMap.entrySet()) {
			if(entry.getValue() > heighest.getValue()) {
				heighest = entry;
			}
		}
		return heighest;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void onOrientationChange() {
		initProps();
		for (SimplePanel w : cellWidgetList) {
			setProperties((CellWidget<T>)w.getWidget());
		}
	}
	
	@Override
	public int getScrollHeight() {
		return lowestColumn;
	}
	
	@Override
	public void clear() {
		super.clear();
		initProps();
	}
	
	@Override
	protected void setTopOfFooter() {
		footer.getElement().getStyle().setTop(getHighestHeight().getValue(), Unit.PX);
	}
}
