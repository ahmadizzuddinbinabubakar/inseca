package com.izzutech.inseca.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BalanceSheetDTOList {

	@JsonProperty("annualReports")
	private List<BalanceSheetDTO> balanceSheetDTOs;

    public BalanceSheetDTOList() {
    	balanceSheetDTOs = new ArrayList<>();
    }

	public List<BalanceSheetDTO> getBalanceSheetDTOs() {
		return balanceSheetDTOs;
	}

	public void setBalanceSheetDTOs(List<BalanceSheetDTO> balanceSheetDTOs) {
		this.balanceSheetDTOs = balanceSheetDTOs;
	}
    
    
}
