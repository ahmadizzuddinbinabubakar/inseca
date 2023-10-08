package com.izzutech.inseca.model;

import java.util.ArrayList;
import java.util.List;

public class BalanceSheetModelList {

	private List<BalanceSheetModel> balanceSheetModels;

    public BalanceSheetModelList() {
    	balanceSheetModels = new ArrayList<>();
    }

	public List<BalanceSheetModel> getBalanceSheetModels() {
		return balanceSheetModels;
	}

	public void setBalanceSheetModels(List<BalanceSheetModel> balanceSheetModels) {
		this.balanceSheetModels = balanceSheetModels;
	}


    
    
}
