package com.softdive.madpiggy.app.client.outletlist;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.global.AppConstant;
import com.softdive.madpiggy.app.client.jsinterop.Native;
import com.softdive.madpiggy.app.client.model.Image.ImageType;
import com.softdive.madpiggy.app.client.model.Outlet;
import com.softdive.madpiggy.app.client.model.helper.ImageHelper;
import com.softdive.madpiggy.app.client.model.helper.OutletWrapper;
import com.softdive.madpiggy.app.client.util.Util;
import com.softdive.madpiggy.app.client.widget.celllist.CellWidget;

public class OutletListWidget extends CellWidget<OutletWrapper> {
	
	@UiField Label companyName;
	@UiField Label outletAddress;
	@UiField Element favImage;
	@UiField Image outletImage;
	@UiField Label outletDistance;
	private Outlet outlet;
	private static final int SCALE_DIMENSION = 100;

	private static OutletListWidgetUiBinder uiBinder = GWT.create(OutletListWidgetUiBinder.class);

	interface OutletListWidgetUiBinder extends UiBinder<Widget, OutletListWidget> {
	}

	public OutletListWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void render(OutletWrapper model) {
		Outlet outlet = model.getOutlet();
		this.outlet = outlet;
		outletDistance.setText(Native.convertTo2decimalplaces(outlet.getDistance())+"Km");
		com.softdive.madpiggy.app.client.model.Image outletImg = ImageHelper.getCoverImage(outlet.getCompany(), ImageType.TINY);
		outletImage.setUrl(AppConstant.MP_C_URL + outlet.getCompany().getId() + "/" + outletImg.getFilename());
		
		outletImage.setHeight(SCALE_DIMENSION+"px");
		outletImage.setWidth(SCALE_DIMENSION+"px");
		companyName.setText(outlet.getCompany().getName());
		outletAddress.setText(Util.prepareAddress(model.getOutlet().getAddress()));
		if(model.isLiked()){
			favImage.setClassName("liked");
		}else{
			favImage.setClassName("dislike");
		}
	}
	
	
	
	public Element getFavImage() {
		return favImage;
	}
	

	public Outlet getOutlet() {
		return outlet;
	}
	

}
