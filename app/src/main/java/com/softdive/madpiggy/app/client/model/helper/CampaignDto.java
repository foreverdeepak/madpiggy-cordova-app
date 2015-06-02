package com.softdive.madpiggy.app.client.model.helper;

import com.softdive.madpiggy.app.client.model.Campaign;
import com.softdive.madpiggy.app.client.model.CampaignSummaryReport;

public class CampaignDto {

	private Campaign campaign;
	private CampaignSummaryReport campaignSummaryReport;

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public CampaignSummaryReport getCampaignSummaryReport() {
		return campaignSummaryReport;
	}

	public void setCampaignSummaryReport(CampaignSummaryReport campaignSummaryReport) {
		this.campaignSummaryReport = campaignSummaryReport;
	}

}
