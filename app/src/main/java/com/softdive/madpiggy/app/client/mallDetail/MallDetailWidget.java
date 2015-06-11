package com.softdive.madpiggy.app.client.mallDetail;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.orientation.OrientationChangeEvent.ORIENTATION;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPanel;
import com.softdive.madpiggy.app.client.global.AppConstant;
import com.softdive.madpiggy.app.client.jsinterop.Native;
import com.softdive.madpiggy.app.client.mallDetail.MallDetailView.Presenter;
import com.softdive.madpiggy.app.client.model.Image.ImageType;
import com.softdive.madpiggy.app.client.model.Mall;
import com.softdive.madpiggy.app.client.model.helper.ImageHelper;
import com.softdive.madpiggy.app.client.util.ImageLoaderQueue;

public class MallDetailWidget extends Composite {

	@UiField FlexPanel parentContainer;
	@UiField HTMLPanel mallName;
	@UiField HTMLPanel mallDescription;
	@UiField Image mallCoverImage;
	private Mall mall;

	private static MallDetailWidgetUiBinder uiBinder = GWT.create(MallDetailWidgetUiBinder.class);

	interface MallDetailWidgetUiBinder extends UiBinder<Widget, MallDetailWidget> {
	}

	public MallDetailWidget(Mall mall) {
		this.mall = mall;
		initWidget(uiBinder.createAndBindUi(this));
		com.softdive.madpiggy.app.client.model.Image img = ImageHelper.getCoverImage(mall, ImageType.LARGE);
		
		if (img != null) {
			mallCoverImage.setHeight(getCalulatedCoverImageHeight(img)+"px");
			ImageLoaderQueue.IMAGE_LOADER_QUEUE.push(new ImageLoaderQueue.ImageHolder(mallCoverImage, AppConstant.MP_M_URL
					+ mall.getId() + "/" + img.getFilename()));
		} else {
			int mockHeight = (Native.getWindowHeight()/100)*40;
			mallCoverImage.setHeight(mockHeight+"px");
			ImageLoaderQueue.IMAGE_LOADER_QUEUE.push(new ImageLoaderQueue.ImageHolder(mallCoverImage, ""));
		}
		mallName.getElement().setInnerText(mall.getMallName());
		mallDescription.getElement().setInnerText(mall.getDescription());
	}

	private int getCalulatedCoverImageHeight(com.softdive.madpiggy.app.client.model.Image img) {
		return (int) ((double) img.getHeight() / (img.getWidth() * 1.00) * Native.getWindowWidth());
	}

	public void onOrientationChange(ORIENTATION orientation) {
		if (mall != null) {
			com.softdive.madpiggy.app.client.model.Image img = ImageHelper.getCoverImage(mall, ImageType.LARGE);
			
			if (img != null) {
				mallCoverImage.setHeight(getCalulatedCoverImageHeight(img)+"px");
			}
		}
	}

	public void setPresenter(Presenter presenter) {
	}

}
