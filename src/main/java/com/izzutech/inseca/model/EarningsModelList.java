package com.izzutech.inseca.model;

import java.util.ArrayList;
import java.util.List;

public class EarningsModelList {

	private List<EarningsModel> earningsModels;

    public EarningsModelList() {
    	earningsModels = new ArrayList<>();
    }

	public List<EarningsModel> getEarningsModels() {
		return earningsModels;
	}

	public void setEarningsModels(List<EarningsModel> earningsModels) {
		this.earningsModels = earningsModels;
	}
    
}
