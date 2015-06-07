package com.softexploration.lab.lod.account;

import com.softexploration.lab.lod.account.id.AccountId;

public class SavingAccount extends Account {

	public SavingAccount(AccountId accountId) {
		super(accountId);
	}

	public String getAccountNumber() {
		return getAccountId().getAccountNumber();
	}
}