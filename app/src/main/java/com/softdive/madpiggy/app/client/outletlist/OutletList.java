package com.softdive.madpiggy.app.client.outletlist;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.model.helper.OutletWrapper;
import com.softdive.madpiggy.app.client.widget.celllist.CellList;
import com.softdive.madpiggy.app.client.widget.celllist.HasCellSelectedHandler;

public class OutletList extends Composite {
	
	@UiField(provided = true) CellList<OutletWrapper> outletListContainer;

	private static OutletListUiBinder uiBinder = GWT.create(OutletListUiBinder.class);

	interface OutletListUiBinder extends UiBinder<Widget, OutletList> {
	}

	public OutletList() {
		outletListContainer = new CellList<>(new OutletsCell());
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public void render(Collection<OutletWrapper> models, int index) {
		outletListContainer.render(models, index);
	}
	
	public HasCellSelectedHandler getList() {
		return outletListContainer;
	}
	
	public void showFooter() {
		outletListContainer.showFooter();
	}
	
	public void hideFooter() {
		outletListContainer.hideFooter();
	}
	
	public int getChilCount() {
		return outletListContainer.getModelList().size();
	}
	
}
