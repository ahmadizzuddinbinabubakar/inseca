package com.izzutech.inseca.service;

import org.springframework.web.client.RestTemplate;

import com.izzutech.inseca.model.CompanyOverviewModel;
import com.izzutech.inseca.service.dto.CompanyOverviewDTO;
import com.izzutech.inseca.service.dto.MapDTOtoModel;
import com.izzutech.inseca.util.KeyConstants;

public class AlphavantageAPI {
	
	private static String KEY_ALPHAVANTAGE = KeyConstants.KEY_ALPHAVANTAGE;

	public static CompanyOverviewModel getCompanyOverview(String ticker) throws Exception {
		
		String url = "https://www.alphavantage.co/query?function=OVERVIEW&symbol=" +ticker+ "&apikey=" +KEY_ALPHAVANTAGE;
		RestTemplate restTemplate = new RestTemplate();
		CompanyOverviewDTO companyOverviewDTO = restTemplate.getForObject(url, CompanyOverviewDTO.class);
		CompanyOverviewModel companyOverviewModel = MapDTOtoModel.mapCompanyOverview(companyOverviewDTO);

		return companyOverviewModel;
	}
	
	public static CompanyOverviewDTO getCompanyOverviewRaw(String ticker) throws Exception {
		
		String url = "https://www.alphavantage.co/query?function=OVERVIEW&symbol=" +ticker+ "&apikey=" +KEY_ALPHAVANTAGE;
		RestTemplate restTemplate = new RestTemplate();
		CompanyOverviewDTO companyOverviewDTO = restTemplate.getForObject(url, CompanyOverviewDTO.class);

		return companyOverviewDTO;
	}
	
	public static CompanyOverviewModel getBalanceSheets(String ticker) throws Exception {
		
		String url = "https://www.alphavantage.co/query?function=OVERVIEW&symbol=" +ticker+ "&apikey=" +KEY_ALPHAVANTAGE;
		RestTemplate restTemplate = new RestTemplate();
		CompanyOverviewDTO companyOverviewDTO = restTemplate.getForObject(url, CompanyOverviewDTO.class);
		CompanyOverviewModel companyOverviewModel = MapDTOtoModel.mapCompanyOverview(companyOverviewDTO);

		return companyOverviewModel;
	}
	
	//todo:get balanceSheet
}
