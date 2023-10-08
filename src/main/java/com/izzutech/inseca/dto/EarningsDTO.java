package com.izzutech.inseca.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EarningsDTO {

	@JsonProperty("fiscalDateEnding")
    String fiscalDateEnding;
	
	@JsonProperty("reportedEPS")
    String reportedEPS;

	public String getFiscalDateEnding() {
		return fiscalDateEnding;
	}

	public void setFiscalDateEnding(String fiscalDateEnding) {
		this.fiscalDateEnding = fiscalDateEnding;
	}

	public String getReportedEPS() {
		return reportedEPS;
	}

	public void setReportedEPS(String reportedEPS) {
		this.reportedEPS = reportedEPS;
	}
	
	
}
