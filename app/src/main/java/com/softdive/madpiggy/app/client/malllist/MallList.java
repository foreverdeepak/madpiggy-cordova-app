package com.softdive.madpiggy.app.client.malllist;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.model.helper.MallWrapper;
import com.softdive.madpiggy.app.client.widget.celllist.CellList;

public class MallList extends Composite {
	
	@UiField(provided = true) CellList<MallWrapper> mallListContainer;

	private static MallListUiBinder uiBinder = GWT.create(MallListUiBinder.class);

	interface MallListUiBinder extends UiBinder<Widget, MallList> {
	}

	public MallList() {
		mallListContainer = new CellList<>(new MallCell());
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public void render(Collection<MallWrapper> malls, int index) {
		mallListContainer.render(malls, index);
	}

	public CellList<MallWrapper> getList() {
		return mallListContainer;
	}
	
	

}
