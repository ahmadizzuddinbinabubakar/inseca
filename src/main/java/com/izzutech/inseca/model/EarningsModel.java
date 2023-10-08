package com.izzutech.inseca.model;

import java.math.BigDecimal;
import java.util.Date;

public class EarningsModel {

    Date fiscalDateEnding;	
    BigDecimal reportedEPS;
    
	public Date getFiscalDateEnding() {
		return fiscalDateEnding;
	}
	public void setFiscalDateEnding(Date fiscalDateEnding) {
		this.fiscalDateEnding = fiscalDateEnding;
	}
	public BigDecimal getReportedEPS() {
		return reportedEPS;
	}
	public void setReportedEPS(BigDecimal reportedEPS) {
		this.reportedEPS = reportedEPS;
	}
    
    
}
