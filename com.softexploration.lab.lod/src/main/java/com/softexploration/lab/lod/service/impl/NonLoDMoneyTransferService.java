package com.softexploration.lab.lod.service.impl;

import java.math.BigDecimal;

import com.softexploration.lab.lod.account.CheckingAccount;
import com.softexploration.lab.lod.service.MoneyTransferResult;
import com.softexploration.lab.lod.service.MoneyTransferService;

public class NonLoDMoneyTransferService implements
		MoneyTransferService<CheckingAccount> {

	@Override
	public MoneyTransferResult makeMoneyTransfer(CheckingAccount sourceAccount,
			CheckingAccount targetAccount, BigDecimal amount) {
		MoneyTransferResult result = null;
		String sourceAccountNumber = sourceAccount.getAccountId()
				.getAccountNumber(); // breaks the LoD
		String targetAccountNumber = targetAccount.getAccountId()
				.getAccountNumber(); // breaks the LoD
		// rest of the implementation goes here
		return result;
	}
}