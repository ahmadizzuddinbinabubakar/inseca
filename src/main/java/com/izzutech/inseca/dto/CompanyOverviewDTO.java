package com.izzutech.inseca.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyOverviewDTO {
	
	@JsonProperty("Symbol")
    String symbol;
	
	@JsonProperty("AssetType")
    String assetType;
	
	@JsonProperty("Name")
    String name;
	
	@JsonProperty("Description")
    String description;
	
	@JsonProperty("CIK")
    String cIK;
	
	@JsonProperty("Exchange")
    String exchange;
	
	@JsonProperty("Currency")
    String currency;
	
	@JsonProperty("Country")
    String country;
	
	@JsonProperty("Sector")
    String sector;
	
	@JsonProperty("Industry")
    String industry;
	
	@JsonProperty("Address")
    String address;
	
	@JsonProperty("FiscalYearEnd")
    String fiscalYearEnd;
	
	@JsonProperty("LatestQuarter")
    String latestQuarter;
	
	@JsonProperty("MarketCapitalization")
    String marketCapitalization;
	
	@JsonProperty("EBITDA")
    String eBITDA;
	
	@JsonProperty("PERatio")
    String pERatio;
	
	@JsonProperty("PEGRatio")
    String pEGRatio;
	
	@JsonProperty("BookValue")
    String bookValue;
	
	@JsonProperty("DividendPerShare")
    String dividendPerShare;
	
	@JsonProperty("DividendYield")
    String dividendYield;
	
	@JsonProperty("EPS")
    String ePS;
    
    @JsonProperty("RevenuePerShareTTM")
    String revenuePerShareTTM;
    
    @JsonProperty("ProfitMargin")
    String profitMargin;
    
    @JsonProperty("OperatingMarginTTM")
    String operatingMarginTTM;
    
    @JsonProperty("ReturnOnAssetsTTM")
    String returnOnAssetsTTM;
    
    @JsonProperty("ReturnOnEquityTTM")
    String returnOnEquityTTM;
    
    @JsonProperty("RevenueTTM")
    String revenueTTM;
    
    @JsonProperty("GrossProfitTTM")
    String grossProfitTTM;
    
    @JsonProperty("DilutedEPSTTM")
    String dilutedEPSTTM;
    
    @JsonProperty("QuarterlyEarningsGrowthYOY")
    String quarterlyEarningsGrowthYOY;
    
    @JsonProperty("QuarterlyRevenueGrowthYOY")
    String quarterlyRevenueGrowthYOY;
    
    @JsonProperty("AnalystTargetPrice")
    String analystTargetPrice;
    
    @JsonProperty("TrailingPE")
    String trailingPE;
    
    @JsonProperty("ForwardPE")
    String forwardPE;
    
    @JsonProperty("PriceToSalesRatioTTM")
    String priceToSalesRatioTTM;
    
    @JsonProperty("PriceToBookRatio")
    String priceToBookRatio;
    
    @JsonProperty("EVToRevenue")
    String eVToRevenue;
    
    @JsonProperty("EVToEBITDA")
    String eVToEBITDA;
    
    @JsonProperty("Beta")
    String beta;
    
    @JsonProperty("52WeekHigh")
    String _52WeekHigh;
    
    @JsonProperty("52WeekLow")
    String _52WeekLow;
    
    @JsonProperty("50DayMovingAverage")
    String _50DayMovingAverage;
    
    @JsonProperty("200DayMovingAverage")
    String _200DayMovingAverage;
    
    @JsonProperty("SharesOutstanding")
    String sharesOutstanding;
    
    @JsonProperty("DividendDate")
    String dividendDate;
    
    @JsonProperty("ExDividendDate")
    String exDividendDate;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getcIK() {
		return cIK;
	}

	public void setcIK(String cIK) {
		this.cIK = cIK;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFiscalYearEnd() {
		return fiscalYearEnd;
	}

	public void setFiscalYearEnd(String fiscalYearEnd) {
		this.fiscalYearEnd = fiscalYearEnd;
	}

	public String getLatestQuarter() {
		return latestQuarter;
	}

	public void setLatestQuarter(String latestQuarter) {
		this.latestQuarter = latestQuarter;
	}

	public String getMarketCapitalization() {
		return marketCapitalization;
	}

	public void setMarketCapitalization(String marketCapitalization) {
		this.marketCapitalization = marketCapitalization;
	}

	public String geteBITDA() {
		return eBITDA;
	}

	public void seteBITDA(String eBITDA) {
		this.eBITDA = eBITDA;
	}

	public String getpERatio() {
		return pERatio;
	}

	public void setpERatio(String pERatio) {
		this.pERatio = pERatio;
	}

	public String getpEGRatio() {
		return pEGRatio;
	}

	public void setpEGRatio(String pEGRatio) {
		this.pEGRatio = pEGRatio;
	}

	public String getBookValue() {
		return bookValue;
	}

	public void setBookValue(String bookValue) {
		this.bookValue = bookValue;
	}

	public String getDividendPerShare() {
		return dividendPerShare;
	}

	public void setDividendPerShare(String dividendPerShare) {
		this.dividendPerShare = dividendPerShare;
	}

	public String getDividendYield() {
		return dividendYield;
	}

	public void setDividendYield(String dividendYield) {
		this.dividendYield = dividendYield;
	}

	public String getePS() {
		return ePS;
	}

	public void setePS(String ePS) {
		this.ePS = ePS;
	}

	public String getRevenuePerShareTTM() {
		return revenuePerShareTTM;
	}

	public void setRevenuePerShareTTM(String revenuePerShareTTM) {
		this.revenuePerShareTTM = revenuePerShareTTM;
	}

	public String getProfitMargin() {
		return profitMargin;
	}

	public void setProfitMargin(String profitMargin) {
		this.profitMargin = profitMargin;
	}

	public String getOperatingMarginTTM() {
		return operatingMarginTTM;
	}

	public void setOperatingMarginTTM(String operatingMarginTTM) {
		this.operatingMarginTTM = operatingMarginTTM;
	}

	public String getReturnOnAssetsTTM() {
		return returnOnAssetsTTM;
	}

	public void setReturnOnAssetsTTM(String returnOnAssetsTTM) {
		this.returnOnAssetsTTM = returnOnAssetsTTM;
	}

	public String getReturnOnEquityTTM() {
		return returnOnEquityTTM;
	}

	public void setReturnOnEquityTTM(String returnOnEquityTTM) {
		this.returnOnEquityTTM = returnOnEquityTTM;
	}

	public String getRevenueTTM() {
		return revenueTTM;
	}

	public void setRevenueTTM(String revenueTTM) {
		this.revenueTTM = revenueTTM;
	}

	public String getGrossProfitTTM() {
		return grossProfitTTM;
	}

	public void setGrossProfitTTM(String grossProfitTTM) {
		this.grossProfitTTM = grossProfitTTM;
	}

	public String getDilutedEPSTTM() {
		return dilutedEPSTTM;
	}

	public void setDilutedEPSTTM(String dilutedEPSTTM) {
		this.dilutedEPSTTM = dilutedEPSTTM;
	}

	public String getQuarterlyEarningsGrowthYOY() {
		return quarterlyEarningsGrowthYOY;
	}

	public void setQuarterlyEarningsGrowthYOY(String quarterlyEarningsGrowthYOY) {
		this.quarterlyEarningsGrowthYOY = quarterlyEarningsGrowthYOY;
	}

	public String getQuarterlyRevenueGrowthYOY() {
		return quarterlyRevenueGrowthYOY;
	}

	public void setQuarterlyRevenueGrowthYOY(String quarterlyRevenueGrowthYOY) {
		this.quarterlyRevenueGrowthYOY = quarterlyRevenueGrowthYOY;
	}

	public String getAnalystTargetPrice() {
		return analystTargetPrice;
	}

	public void setAnalystTargetPrice(String analystTargetPrice) {
		this.analystTargetPrice = analystTargetPrice;
	}

	public String getTrailingPE() {
		return trailingPE;
	}

	public void setTrailingPE(String trailingPE) {
		this.trailingPE = trailingPE;
	}

	public String getForwardPE() {
		return forwardPE;
	}

	public void setForwardPE(String forwardPE) {
		this.forwardPE = forwardPE;
	}

	public String getPriceToSalesRatioTTM() {
		return priceToSalesRatioTTM;
	}

	public void setPriceToSalesRatioTTM(String priceToSalesRatioTTM) {
		this.priceToSalesRatioTTM = priceToSalesRatioTTM;
	}

	public String getPriceToBookRatio() {
		return priceToBookRatio;
	}

	public void setPriceToBookRatio(String priceToBookRatio) {
		this.priceToBookRatio = priceToBookRatio;
	}

	public String geteVToRevenue() {
		return eVToRevenue;
	}

	public void seteVToRevenue(String eVToRevenue) {
		this.eVToRevenue = eVToRevenue;
	}

	public String geteVToEBITDA() {
		return eVToEBITDA;
	}

	public void seteVToEBITDA(String eVToEBITDA) {
		this.eVToEBITDA = eVToEBITDA;
	}

	public String getBeta() {
		return beta;
	}

	public void setBeta(String beta) {
		this.beta = beta;
	}

	public String get_52WeekHigh() {
		return _52WeekHigh;
	}

	public void set_52WeekHigh(String _52WeekHigh) {
		this._52WeekHigh = _52WeekHigh;
	}

	public String get_52WeekLow() {
		return _52WeekLow;
	}

	public void set_52WeekLow(String _52WeekLow) {
		this._52WeekLow = _52WeekLow;
	}

	public String get_50DayMovingAverage() {
		return _50DayMovingAverage;
	}

	public void set_50DayMovingAverage(String _50DayMovingAverage) {
		this._50DayMovingAverage = _50DayMovingAverage;
	}

	public String get_200DayMovingAverage() {
		return _200DayMovingAverage;
	}

	public void set_200DayMovingAverage(String _200DayMovingAverage) {
		this._200DayMovingAverage = _200DayMovingAverage;
	}

	public String getSharesOutstanding() {
		return sharesOutstanding;
	}

	public void setSharesOutstanding(String sharesOutstanding) {
		this.sharesOutstanding = sharesOutstanding;
	}

	public String getDividendDate() {
		return dividendDate;
	}

	public void setDividendDate(String dividendDate) {
		this.dividendDate = dividendDate;
	}

	public String getExDividendDate() {
		return exDividendDate;
	}

	public void setExDividendDate(String exDividendDate) {
		this.exDividendDate = exDividendDate;
	}
    
}
