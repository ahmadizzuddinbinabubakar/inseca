package com.izzutech.inseca.model;

import java.math.BigDecimal;

public class QuantitativeDataModel {

	BigDecimal price;
	BigDecimal peRatio;
	BigDecimal projectedGrowthRate;
	BigDecimal value;
	boolean isUndervalued;
	boolean isPassiveInvestment;
	boolean isActiveInvestment;
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getPeRatio() {
		return peRatio;
	}
	public void setPeRatio(BigDecimal peRatio) {
		this.peRatio = peRatio;
	}
	public BigDecimal getProjectedGrowthRate() {
		return projectedGrowthRate;
	}
	public void setProjectedGrowthRate(BigDecimal projectedGrowthRate) {
		this.projectedGrowthRate = projectedGrowthRate;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public boolean getIsUndervalued() {
		return isUndervalued;
	}
	public void setIsUndervalued(boolean undervalued) {
		this.isUndervalued = undervalued;
	}
	public boolean getIsPassiveInvestment() {
		return isPassiveInvestment;
	}
	public void setIsPassiveInvestment(boolean isPassiveInvestment) {
		this.isPassiveInvestment = isPassiveInvestment;
	}
	public boolean getIsActiveInvestment() {
		return isActiveInvestment;
	}
	public void setIsActiveInvestment(boolean isActiveInvestment) {
		this.isActiveInvestment = isActiveInvestment;
	}
	


	
}
