package com.izzutech.inseca.quantan;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import com.izzutech.inseca.dto.MapModeltoDTO;
import com.izzutech.inseca.dto.QuantitativeDataDTO;
import com.izzutech.inseca.model.BalanceSheetModel;
import com.izzutech.inseca.model.CompanyOverviewModel;
import com.izzutech.inseca.model.QuantitativeDataModel;
import com.izzutech.inseca.service.AlphavantageAPI;

public class QuantitativeAnalysis {	

	public QuantitativeDataDTO doQuantitativeAnalysis(String ticker) {
		
		QuantitativeDataModel quantitativeDataModel = doAnalysis(ticker);
		QuantitativeDataDTO quantitativeDataDTO = MapModeltoDTO.mapQuantitativeData(quantitativeDataModel);
		return quantitativeDataDTO;
		
	}
	
	public QuantitativeDataModel doAnalysis(String ticker) {

		QuantitativeDataModel quantitativeDataModel = new QuantitativeDataModel();
		try {
			CompanyOverviewModel companyOverview = AlphavantageAPI.getCompanyOverview(ticker);
			
			BigDecimal price = companyOverview.get_50DayMovingAverage();
			
			BigDecimal projectedGrowthRate = companyOverview.getpERatio().divide(companyOverview.getpEGRatio(), 8, RoundingMode.HALF_EVEN);
			
		    //value = current earnings x 8.5 x 2 x (expected annual growth rate for 7-10 years)
			BigDecimal currentEarnings = companyOverview.get_50DayMovingAverage().divide(companyOverview.getpERatio(), 8, RoundingMode.HALF_EVEN);
			BigDecimal value = currentEarnings.multiply(new BigDecimal(8.5)).multiply(new BigDecimal(2)).multiply(projectedGrowthRate);
			
			boolean isUndervalued = false;
			if(price.compareTo(new BigDecimal(2.0/3.0).multiply(value)) < 0) {
				isUndervalued = true;
			}
			
			List<BalanceSheetModel> balanceSheetModels = AlphavantageAPI.getBalanceSheets(ticker);
			BalanceSheetModel latestBalanceSheet = balanceSheetModels.get(0);
			
			//todo: isPassiveInvestment, isActiveInvestment
//			passive_investment(ticker, totalAssets, totalLiabilities, peRatio, marketCap, annualEarnings)
			
			quantitativeDataModel.setPrice(price);
			quantitativeDataModel.setPeRatio(companyOverview.getpERatio());
			quantitativeDataModel.setProjectedGrowthRate(projectedGrowthRate);
			quantitativeDataModel.setValue(value);
			quantitativeDataModel.setIsUndervalued(isUndervalued);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return quantitativeDataModel;		
	}
	
	public boolean isPassiveInvestment(String ticker, BigDecimal totalAssets, BigDecimal totalLiabilities, BigDecimal peRatio, BigDecimal marketCap, BigDecimal annualEarnings) {
		
//        - conservatively financed ((assets/liabilities) > 200%)
//        - dividend paid for at least past 20 years
//        - no earnings deficit for last 10 years
//        - earnings growth at least 20% for last 10 years or 2.9% annually
//        - cheap assets (market cap < (assets - liabilities )*1.5)
//        - cheap earnings (p/e ratio < 50)
		
		boolean isPassiveInvestment = false;
		
		boolean isConservativelyFinanced = false;
		BigDecimal alRatio = totalAssets.divide(totalLiabilities).multiply(new BigDecimal(100));
		if(alRatio.compareTo(new BigDecimal(200)) > 0) {
			isConservativelyFinanced = true;
		}
		
		//todo: get dividend history
		
		return isPassiveInvestment;
	}
	
	
	
}
