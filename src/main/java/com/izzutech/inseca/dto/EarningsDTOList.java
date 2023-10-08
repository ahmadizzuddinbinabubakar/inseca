package com.izzutech.inseca.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EarningsDTOList {

	@JsonProperty("annualEarnings")
	private List<EarningsDTO> earningsDTOs;

    public EarningsDTOList() {
    	earningsDTOs = new ArrayList<>();
    }

	public List<EarningsDTO> getEarningsDTOs() {
		return earningsDTOs;
	}

	public void setEarningsDTOs(List<EarningsDTO> earningsDTOs) {
		this.earningsDTOs = earningsDTOs;
	}
    
}
