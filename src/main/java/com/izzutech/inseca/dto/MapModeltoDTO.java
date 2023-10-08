package com.izzutech.inseca.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.izzutech.inseca.model.CompanyOverviewModel;
import com.izzutech.inseca.model.QuantitativeDataModel;

public class MapModeltoDTO {
	
	public static QuantitativeDataDTO mapQuantitativeData(QuantitativeDataModel quantitativeDataModel) {
		
		QuantitativeDataDTO quantitativeDataDTO = new QuantitativeDataDTO();
		quantitativeDataDTO.setPrice(quantitativeDataModel.getPrice().toString());
		quantitativeDataDTO.setPeRatio(quantitativeDataModel.getPeRatio().toString());
		quantitativeDataDTO.setProjectedGrowthRate(quantitativeDataModel.getProjectedGrowthRate().toString());
		quantitativeDataDTO.setValue(quantitativeDataModel.getValue().toString());
		quantitativeDataDTO.setIsUndervalued(String.valueOf(quantitativeDataModel.getIsUndervalued()));
		quantitativeDataDTO.setIsPassiveInvestment(String.valueOf(quantitativeDataModel.getIsPassiveInvestment()));
		quantitativeDataDTO.setIsActiveInvestment(String.valueOf(quantitativeDataModel.getIsActiveInvestment()));

		return quantitativeDataDTO;
	}
	

}
