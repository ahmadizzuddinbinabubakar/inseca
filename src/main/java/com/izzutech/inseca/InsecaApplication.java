package com.izzutech.inseca;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.izzutech.inseca.dto.BalanceSheetDTO;
import com.izzutech.inseca.dto.CompanyOverviewDTO;
import com.izzutech.inseca.dto.QuantitativeDataDTO;
import com.izzutech.inseca.quantan.QuantitativeAnalysis;
import com.izzutech.inseca.service.AlphavantageAPI;

@SpringBootApplication
@RestController
public class InsecaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(InsecaApplication.class, args);
	}
	
	@GetMapping("/")
    public String home() {
      return String.format("Intelligent Security Analysis (InSecA)");
    }
	
	@GetMapping("/get-company-overview")
	public CompanyOverviewDTO getCompanyOverview(@RequestParam String ticker) throws Exception {	
		return AlphavantageAPI.getCompanyOverviewRaw(ticker);
	}
	
	@GetMapping("/get-balance-sheets")
	public List<BalanceSheetDTO> getBalanceSheet(@RequestParam String ticker) throws Exception {	
		return AlphavantageAPI.getBalanceSheetsRaw(ticker);
	}
	
	//http://localhost:8080/quantitative-analysis?ticker=TSLA
	@GetMapping("/quantitative-analysis")
    public QuantitativeDataDTO quantitativeAnalysis(@RequestParam String ticker) {		
		QuantitativeAnalysis quantitativeAnalysis = new QuantitativeAnalysis();
		return quantitativeAnalysis.doQuantitativeAnalysis(ticker);
    }

}
