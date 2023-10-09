package com.izzutech.inseca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.izzutech.inseca.dto.BalanceSheetDTO;
import com.izzutech.inseca.dto.BalanceSheetDTOList;
import com.izzutech.inseca.dto.CompanyOverviewDTO;
import com.izzutech.inseca.dto.EarningsDTO;
import com.izzutech.inseca.dto.EarningsDTOList;
import com.izzutech.inseca.dto.MapDTOtoModel;
import com.izzutech.inseca.model.BalanceSheetModel;
import com.izzutech.inseca.model.CompanyOverviewModel;
import com.izzutech.inseca.model.EarningsModel;
import com.izzutech.inseca.util.KeyConstants;

public class AlphavantageAPI {
	
	private static String KEY_ALPHAVANTAGE = KeyConstants.KEY_ALPHAVANTAGE;

	public static CompanyOverviewDTO getCompanyOverviewRaw(String ticker) throws Exception {
		
		String url = "https://www.alphavantage.co/query?function=OVERVIEW&symbol=" +ticker+ "&apikey=" +KEY_ALPHAVANTAGE;
		RestTemplate restTemplate = new RestTemplate();
		CompanyOverviewDTO companyOverviewDTO = restTemplate.getForObject(url, CompanyOverviewDTO.class);

		return companyOverviewDTO;
	}
	
	public static CompanyOverviewModel getCompanyOverview(String ticker) throws Exception {		
		CompanyOverviewModel companyOverviewModel = MapDTOtoModel.mapCompanyOverview(getCompanyOverviewRaw(ticker));
		return companyOverviewModel;
	}
	
	public static List<BalanceSheetDTO> getBalanceSheetsRaw(String ticker) throws Exception {
		
		String url = "https://www.alphavantage.co/query?function=BALANCE_SHEET&symbol=" +ticker+ "&apikey=" +KEY_ALPHAVANTAGE;
		RestTemplate restTemplate = new RestTemplate();
		BalanceSheetDTOList balanceSheetDTOList = restTemplate.getForObject(url, BalanceSheetDTOList.class);
		List<BalanceSheetDTO> balanceSheetDTOs = balanceSheetDTOList.getBalanceSheetDTOs();

		return balanceSheetDTOs;
	}
	
	public static List<BalanceSheetModel> getBalanceSheets(String ticker) throws Exception {
		List<BalanceSheetDTO> balanceSheetDTOs = getBalanceSheetsRaw(ticker);
		List<BalanceSheetModel> balanceSheetModels = new ArrayList<BalanceSheetModel>();
		for(BalanceSheetDTO dto: balanceSheetDTOs) {
			BalanceSheetModel balanceSheetModel = MapDTOtoModel.mapBalanceSheet(dto);
			balanceSheetModels.add(balanceSheetModel);
		}
		return balanceSheetModels;
	}
	
	public static List<EarningsDTO> getEarningsRaw(String ticker) throws Exception {
		
		String url = "https://www.alphavantage.co/query?function=EARNINGS&symbol=" +ticker+ "&apikey=" +KEY_ALPHAVANTAGE;
		RestTemplate restTemplate = new RestTemplate();
		EarningsDTOList earningsDTOList = restTemplate.getForObject(url, EarningsDTOList.class);
		List<EarningsDTO> earningsDTOs = earningsDTOList.getEarningsDTOs();

		return earningsDTOs;
	}
	
	public static List<EarningsModel> getEarnings(String ticker) throws Exception {
		List<EarningsDTO> earningsDTOs = getEarningsRaw(ticker);
		List<EarningsModel> earningsModels = new ArrayList<EarningsModel>();
		for(EarningsDTO dto: earningsDTOs) {
			EarningsModel earningsModel = MapDTOtoModel.mapEarnings(dto);
			earningsModels.add(earningsModel);
		}
		return earningsModels;
	}
	
	
	//todo: get time series
	
}
