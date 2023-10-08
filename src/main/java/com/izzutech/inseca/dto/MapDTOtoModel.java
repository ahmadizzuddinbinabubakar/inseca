package com.izzutech.inseca.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.izzutech.inseca.model.BalanceSheetModel;
import com.izzutech.inseca.model.CompanyOverviewModel;
import com.izzutech.inseca.model.EarningsModel;
import com.izzutech.inseca.util.Constants;
import com.izzutech.inseca.util.DataTypeConverterUtil;

public class MapDTOtoModel {
		
	public static CompanyOverviewModel mapCompanyOverview(CompanyOverviewDTO companyOverviewDTO) {
		
		String originDateFormat = Constants.DF_YMD;
		
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
		companyOverviewModel.setLatestQuarter(DataTypeConverterUtil.stringToDate(companyOverviewDTO.getLatestQuarter(), originDateFormat));
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
		companyOverviewModel.setDividendDate(DataTypeConverterUtil.stringToDate(companyOverviewDTO.getDividendDate(), originDateFormat));		
		companyOverviewModel.setExDividendDate(DataTypeConverterUtil.stringToDate(companyOverviewDTO.getExDividendDate(), originDateFormat));

		return companyOverviewModel;
	}
	
	public static BalanceSheetModel mapBalanceSheet(BalanceSheetDTO balanceSheetDTO) {
		
		String originDateFormat = Constants.DF_YMD;
		
		BalanceSheetModel balanceSheetModel = new BalanceSheetModel();
		balanceSheetModel.setFiscalDateEnding(DataTypeConverterUtil.stringToDate(balanceSheetDTO.getFiscalDateEnding(), originDateFormat));
		balanceSheetModel.setReportedCurrency(balanceSheetDTO.getReportedCurrency());
		balanceSheetModel.setTotalAssets(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getTotalAssets()));
		balanceSheetModel.setTotalCurrentAssets(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getTotalCurrentAssets()));
		balanceSheetModel.setCashAndCashEquivalentsAtCarryingValue(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getCashAndCashEquivalentsAtCarryingValue()));
		balanceSheetModel.setCashAndShortTermInvestments(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getCashAndShortTermInvestments()));
		balanceSheetModel.setInventory(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getInventory()));
		balanceSheetModel.setCurrentNetReceivables(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getCurrentNetReceivables()));
		balanceSheetModel.setTotalNonCurrentAssets(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getTotalNonCurrentAssets()));
		balanceSheetModel.setPropertyPlantEquipment(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getPropertyPlantEquipment()));
		balanceSheetModel.setAccumulatedDepreciationAmortizationPPE(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getAccumulatedDepreciationAmortizationPPE()));
		balanceSheetModel.setIntangibleAssets(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getIntangibleAssets()));
		balanceSheetModel.setIntangibleAssetsExcludingGoodwill(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getIntangibleAssetsExcludingGoodwill()));
		balanceSheetModel.setGoodwill(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getGoodwill()));
		balanceSheetModel.setInvestments(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getInvestments()));
		balanceSheetModel.setLongTermInvestments(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getLongTermInvestments()));
		balanceSheetModel.setShortTermInvestments(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getShortTermInvestments()));
		balanceSheetModel.setOtherCurrentAssets(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getOtherCurrentAssets()));
		balanceSheetModel.setOtherNonCurrentAssets(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getOtherNonCurrentAssets()));
		balanceSheetModel.setTotalLiabilities(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getTotalLiabilities()));
		balanceSheetModel.setTotalCurrentLiabilities(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getTotalCurrentLiabilities()));
		balanceSheetModel.setCurrentAccountsPayable(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getCurrentAccountsPayable()));
		balanceSheetModel.setDeferredRevenue(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getDeferredRevenue()));
		balanceSheetModel.setCurrentDebt(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getCurrentDebt()));
		balanceSheetModel.setShortTermDebt(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getShortTermDebt()));
		balanceSheetModel.setTotalNonCurrentLiabilities(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getTotalNonCurrentLiabilities()));
		balanceSheetModel.setCapitalLeaseObligations(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getCapitalLeaseObligations()));
		balanceSheetModel.setLongTermDebt(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getLongTermDebt()));
		balanceSheetModel.setCurrentLongTermDebt(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getCurrentLongTermDebt()));
		balanceSheetModel.setLongTermDebtNoncurrent(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getLongTermDebtNoncurrent()));
		balanceSheetModel.setShortLongTermDebtTotal(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getShortLongTermDebtTotal()));
		balanceSheetModel.setOtherCurrentLiabilities(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getOtherCurrentLiabilities()));
		balanceSheetModel.setOtherNonCurrentLiabilities(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getOtherNonCurrentLiabilities()));
		balanceSheetModel.setTotalShareholderEquity(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getTotalShareholderEquity()));
		balanceSheetModel.setTreasuryStock(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getTreasuryStock()));
		balanceSheetModel.setRetainedEarnings(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getRetainedEarnings()));
		balanceSheetModel.setCommonStock(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getCommonStock()));
		balanceSheetModel.setCommonStockSharesOutstanding(DataTypeConverterUtil.stringToBigDecimal(balanceSheetDTO.getCommonStockSharesOutstanding()));
		
		return balanceSheetModel;
	}
	
	public static EarningsModel mapEarnings(EarningsDTO earningsDTO) {
		
		String originDateFormat = Constants.DF_YMD;
		
		EarningsModel earningsModel = new EarningsModel();
		earningsModel.setFiscalDateEnding(DataTypeConverterUtil.stringToDate(earningsDTO.getFiscalDateEnding(), originDateFormat));
		earningsModel.setReportedEPS(DataTypeConverterUtil.stringToBigDecimal(earningsDTO.getReportedEPS()));

		return earningsModel;
	}

}
