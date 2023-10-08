package com.izzutech.inseca.service.dto;

import java.util.Date;

import com.izzutech.inseca.model.CompanyOverviewModel;
import com.izzutech.inseca.util.DataTypeConverterUtil;

public class MapDTOtoModel {
	
	public static CompanyOverviewModel mapCompanyOverview(CompanyOverviewDTO companyOverviewDTO) {
		CompanyOverviewModel companyOverviewModel = new CompanyOverviewModel();
		companyOverviewModel.setSymbol(companyOverviewDTO.getSymbol());
		companyOverviewModel.setAssetType(companyOverviewDTO.getAssetType());
		companyOverviewModel.setName(companyOverviewDTO.getName());
		companyOverviewModel.setDescription(companyOverviewDTO.getDescription());
		companyOverviewModel.setcIK(companyOverviewDTO.getcIK());
		companyOverviewModel.setExchange(companyOverviewDTO.getExchange());
		companyOverviewModel.setCurrency(companyOverviewDTO.getCurrency());
		companyOverviewModel.setCountry(companyOverviewDTO.getCountry());
		companyOverviewModel.setSector(companyOverviewDTO.getSector());
		companyOverviewModel.setIndustry(companyOverviewDTO.getIndustry());
		companyOverviewModel.setAddress(companyOverviewDTO.getAddress());
		companyOverviewModel.setFiscalYearEnd(companyOverviewDTO.getFiscalYearEnd());
		companyOverviewModel.setSymbol(companyOverviewDTO.getSymbol());
		if(companyOverviewDTO.getLatestQuarter() != null && !companyOverviewDTO.getLatestQuarter().equalsIgnoreCase("None")) {
			String originDateFormat = "yyyy-MM-dd";
			Date latestQuarter = DataTypeConverterUtil.stringToDate(companyOverviewDTO.getLatestQuarter(), originDateFormat);
			companyOverviewModel.setLatestQuarter(latestQuarter);
		}
		companyOverviewModel.setMarketCapitalization(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getMarketCapitalization()));
		companyOverviewModel.seteBITDA(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.geteBITDA()));
		companyOverviewModel.setpERatio(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getpERatio()));
		companyOverviewModel.setpEGRatio(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getpEGRatio()));
		companyOverviewModel.setBookValue(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getBookValue()));
		companyOverviewModel.setDividendPerShare(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getDividendPerShare()));
		companyOverviewModel.setMarketCapitalization(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getMarketCapitalization()));
		companyOverviewModel.setDividendYield(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getDividendYield()));
		companyOverviewModel.setePS(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getePS()));
		companyOverviewModel.setRevenuePerShareTTM(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getRevenuePerShareTTM()));
		companyOverviewModel.setProfitMargin(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getProfitMargin()));
		companyOverviewModel.setOperatingMarginTTM(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getOperatingMarginTTM()));
		companyOverviewModel.setReturnOnAssetsTTM(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getReturnOnAssetsTTM()));
		companyOverviewModel.setReturnOnEquityTTM(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getReturnOnEquityTTM()));
		companyOverviewModel.setRevenueTTM(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getRevenueTTM()));
		companyOverviewModel.setGrossProfitTTM(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getGrossProfitTTM()));
		companyOverviewModel.setDilutedEPSTTM(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getDilutedEPSTTM()));
		companyOverviewModel.setQuarterlyEarningsGrowthYOY(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getQuarterlyEarningsGrowthYOY()));
		companyOverviewModel.setQuarterlyRevenueGrowthYOY(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getQuarterlyRevenueGrowthYOY()));
		companyOverviewModel.setAnalystTargetPrice(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getAnalystTargetPrice()));
		companyOverviewModel.setTrailingPE(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getTrailingPE()));
		companyOverviewModel.setForwardPE(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getForwardPE()));
		companyOverviewModel.setPriceToSalesRatioTTM(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getPriceToSalesRatioTTM()));
		companyOverviewModel.setPriceToBookRatio(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getPriceToBookRatio()));
		companyOverviewModel.seteVToRevenue(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.geteVToRevenue()));
		companyOverviewModel.seteVToEBITDA(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.geteVToEBITDA()));
		companyOverviewModel.setBeta(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getBeta()));
		companyOverviewModel.set_52WeekHigh(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.get_52WeekHigh()));
		companyOverviewModel.set_52WeekLow(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.get_52WeekLow()));
		companyOverviewModel.set_50DayMovingAverage(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.get_50DayMovingAverage()));
		companyOverviewModel.set_200DayMovingAverage(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.get_200DayMovingAverage()));
		companyOverviewModel.setSharesOutstanding(DataTypeConverterUtil.stringToBigDecimal(companyOverviewDTO.getSharesOutstanding()));
		if(companyOverviewDTO.getDividendDate() != null && !companyOverviewDTO.getDividendDate().equalsIgnoreCase("None")) {
			String originDateFormat = "yyyy-MM-dd";
			Date dividendDate = DataTypeConverterUtil.stringToDate(companyOverviewDTO.getDividendDate(), originDateFormat);
			companyOverviewModel.setDividendDate(dividendDate);
		}
		if(companyOverviewDTO.getExDividendDate() != null && !companyOverviewDTO.getExDividendDate().equalsIgnoreCase("None")) {
			String originDateFormat = "yyyy-MM-dd";
			Date exDividendDate = DataTypeConverterUtil.stringToDate(companyOverviewDTO.getExDividendDate(), originDateFormat);
			companyOverviewModel.setExDividendDate(exDividendDate);
		}

		return companyOverviewModel;
	}

}
