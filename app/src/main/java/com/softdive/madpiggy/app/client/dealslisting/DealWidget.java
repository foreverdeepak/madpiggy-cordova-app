package com.softdive.madpiggy.app.client.dealslisting;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.detail.DetailPagerViewImpl;
import com.softdive.madpiggy.app.client.detail.ItemData;
import com.softdive.madpiggy.app.client.global.AppConstant;
import com.softdive.madpiggy.app.client.jsinterop.Native;
import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.model.Image.ImageType;
import com.softdive.madpiggy.app.client.model.helper.ImageHelper;
import com.softdive.madpiggy.app.client.util.ImageLoaderQueue;
import com.softdive.madpiggy.app.client.widget.celllist.CellWidget;
import com.softdive.madpiggy.app.client.widget.celllist.staggered.StaggeredViewProps;

public class DealWidget extends CellWidget<Advertisement> {

	private static DealWidgetUiBinder uiBinder = GWT.create(DealWidgetUiBinder.class);

	interface DealWidgetUiBinder extends UiBinder<Widget, DealWidget> {
	}
	String animId = "";
	@UiField Label title;
	@UiField Label descr;
	@UiField Label companyName;
	@UiField Label rating;
	@UiField Image dealImage;
	@UiField Image companyImage;
	@UiField DivElement dummy;
	@UiField Image exclusiveImage;
	//@UiField CoreAnimatedPages pages;
	private double width;
	private double originalImageHeight;
	private double originalImageWidth;
	private Advertisement model;
	private static final int CONTENT_HEIGHT = 95;
	@UiField DivElement secondAnimPage;
	@UiField HTMLPanel selectable;
	@UiField HTMLPanel dealDetailContainer;
	
	public DealWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		
		/*selectable.addDomHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				DealWidget.this.observer.fireSelection(DealWidget.this.index);
			}
		}, ClickEvent.getType());*/
	}
	
	@Override
	public void render(Advertisement model) {
		this.model = model;
		animId = "anim-"+model.getId();
		selectable.getElement().getElementsByTagName("core-animated-pages").getItem(0).setAttribute("id", animId);
		
		com.softdive.madpiggy.app.client.model.Image dealImg = ImageHelper.getCoverImage(model, ImageType.THUMB);
		originalImageHeight = dealImg.getHeight();
		originalImageWidth = dealImg.getWidth();
		ImageLoaderQueue.IMAGE_LOADER_QUEUE.push(new ImageLoaderQueue.ImageHolder(dealImage, AppConstant.MP_AD_URL+model.getId()+"/"+dealImg.getFilename()));
		com.softdive.madpiggy.app.client.model.Image companyImg = ImageHelper.getCoverImage(model.getCompany(), ImageType.TINY);
		ImageLoaderQueue.IMAGE_LOADER_QUEUE.push(new ImageLoaderQueue.ImageHolder(companyImage, AppConstant.MP_C_URL+model.getCompany().getId()+"/"+companyImg.getFilename()));
		
		exclusiveImage.setVisible(model.isExclusive());
		
	}
	
	public int getHeight() {
		dummy.getStyle().setDisplay(Display.NONE);
		return getCalulatedCoverImageHeight() + CONTENT_HEIGHT;
	}

	@Override
	public void onPropertiesLoad(StaggeredViewProps props) {
		this.width = props.itemWidth;
		dealImage.setWidth(width+"px");
		dealImage.getElement().getStyle().setMargin(0, Unit.PX);
		dealImage.setHeight(getCalulatedCoverImageHeight()+"px");
		
		title.setText(model.getTitle());
		descr.setText(model.getDescription());
		companyName.setText(model.getCompany().getName());
		rating.setText(" Rating: "+model.getRating());
		
		title.getElement().getStyle().setMarginLeft(5, Unit.PX);
		descr.getElement().getStyle().setMarginLeft(5, Unit.PX);
		companyName.getElement().getStyle().setMarginLeft(5, Unit.PX);
		companyName.getElement().getStyle().setMarginTop(5, Unit.PX);
		rating.getElement().getStyle().setMarginLeft(5, Unit.PX);
		rating.getElement().getStyle().setMarginTop(5, Unit.PX);
	}
	
	private int getCalulatedCoverImageHeight() {
		return (int) (originalImageHeight / (originalImageWidth / width));
	}

	public void endAnimation() {
		endAnimationInternal(animId);
	}

	public void startAnimation(ItemData itemData) {
		dealDetailContainer.clear();
		dealDetailContainer.add(new DetailPagerViewImpl(itemData));
		setTopAnLeft(0, 0);
		startAnimationInternal(animId);
	}
	private native void startAnimationInternal(String animId) /*-{
		$wnd.document.getElementById(animId).selected = 1;
	}-*/;

	private native void endAnimationInternal(String animId) /*-{
		$wnd.document.getElementById(animId).selected = 0
	}-*/;

	public void setTopAnLeft(int top, int left) {
		secondAnimPage.getStyle().setTop(0, Unit.PX);
		secondAnimPage.getStyle().setLeft(0, Unit.PX);
		secondAnimPage.getStyle().setHeight(Native.getWindowHeight(), Unit.PX);
	}
}
