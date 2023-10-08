package com.izzutech.inseca.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuantitativeDataDTO {

	@JsonProperty("price")
	String price;
	
	@JsonProperty("peRatio")
	String peRatio;
	
	@JsonProperty("projectedGrowthRate")
	String projectedGrowthRate;
	
	@JsonProperty("value")
	String value;
	
	@JsonProperty("isUndervalued")
	String isUndervalued;
	
	@JsonProperty("isPassiveInvestment")
	String isPassiveInvestment;
	
	@JsonProperty("isActiveInvestment")
	String isActiveInvestment;
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPeRatio() {
		return peRatio;
	}
	public void setPeRatio(String peRatio) {
		this.peRatio = peRatio;
	}
	public String getProjectedGrowthRate() {
		return projectedGrowthRate;
	}
	public void setProjectedGrowthRate(String projectedGrowthRate) {
		this.projectedGrowthRate = projectedGrowthRate;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getIsUndervalued() {
		return isUndervalued;
	}
	public void setIsUndervalued(String isUndervalued) {
		this.isUndervalued = isUndervalued;
	}
	public String getIsPassiveInvestment() {
		return isPassiveInvestment;
	}
	public void setIsPassiveInvestment(String isPassiveInvestment) {
		this.isPassiveInvestment = isPassiveInvestment;
	}
	public String getIsActiveInvestment() {
		return isActiveInvestment;
	}
	public void setIsActiveInvestment(String isActiveInvestment) {
		this.isActiveInvestment = isActiveInvestment;
	}	
}
