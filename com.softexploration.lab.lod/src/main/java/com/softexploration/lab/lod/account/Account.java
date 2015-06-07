package com.softexploration.lab.lod.account;

import com.softexploration.lab.lod.account.id.AccountId;

public abstract class Account {

	private AccountId accountId;

	public Account(AccountId accountId) {
		this.accountId = accountId;
	}

	public AccountId getAccountId() {
		return accountId;
	}
}
