package com.izzutech.inseca.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TimeSeriesMonthlyDTO {
	
	@JsonProperty("1. open")
    String open;
	
	@JsonProperty("2. high")
    String high;
	
	@JsonProperty("3. low")
    String low;
	
	@JsonProperty("4. close")
    String close;
	
	@JsonProperty("5. adjusted close")
    String adjustedClose;
	
	@JsonProperty("6. volume")
    String volume;
	
	@JsonProperty("7. dividend amount")
    String dividendAmount;

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public String getClose() {
		return close;
	}

	public void setClose(String close) {
		this.close = close;
	}

	public String getAdjustedClose() {
		return adjustedClose;
	}

	public void setAdjustedClose(String adjustedClose) {
		this.adjustedClose = adjustedClose;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getDividendAmount() {
		return dividendAmount;
	}

	public void setDividendAmount(String dividendAmount) {
		this.dividendAmount = dividendAmount;
	}
	
	
}
