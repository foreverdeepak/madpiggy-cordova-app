package com.softdive.madpiggy.app.client.malllist;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.global.AppConstant;
import com.softdive.madpiggy.app.client.jsinterop.Native;
import com.softdive.madpiggy.app.client.model.Image.ImageType;
import com.softdive.madpiggy.app.client.model.helper.ImageHelper;
import com.softdive.madpiggy.app.client.model.helper.MallWrapper;
import com.softdive.madpiggy.app.client.util.Util;
import com.softdive.madpiggy.app.client.widget.celllist.CellWidget;

public class MallWidget extends CellWidget<MallWrapper> {
	
	private static final int SCALE_DIMENSION = 100;
	@UiField Label mallName;
	@UiField Label mallDistance;
	@UiField Label mallAddress;
	@UiField Element favImage;
	@UiField Image mallImage;
	private MallWrapper mallWrapper;

	private static MallWidgetUiBinder uiBinder = GWT.create(MallWidgetUiBinder.class);

	interface MallWidgetUiBinder extends UiBinder<Widget, MallWidget> {
	}

	public MallWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void render(MallWrapper mallWrapper) {
		this.mallWrapper = mallWrapper;
		com.softdive.madpiggy.app.client.model.Image mallImg = ImageHelper.getCoverImage(mallWrapper.getMall(), ImageType.TINY);
		mallImage.setUrl(AppConstant.MP_M_URL + mallWrapper.getMall().getId() + "/" + mallImg.getFilename());
		
		mallImage.setHeight(SCALE_DIMENSION + String.valueOf(Unit.PX));
		mallImage.setWidth(SCALE_DIMENSION + String.valueOf(Unit.PX));
		//100 imagewidth + 10+10 buttons width
		mallName.setText(mallWrapper.getMall().getMallName());
		mallDistance.setText(Native.convertTo2decimalplaces(mallWrapper.getMall().getDistance())+"KM");
		mallAddress.setText(Util.prepareAddress(mallWrapper.getMall().getAddress()));
		if(mallWrapper.isLiked()){
			favImage.setClassName("liked");
		}else{
			favImage.setClassName("dislike");
		}
		
	}
	
	public MallWrapper getMallWrapper() {
		return mallWrapper;
	}
	
	public Element getFavImage() {
		return favImage;
	}
}
