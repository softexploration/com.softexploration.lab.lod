package com.softexploration.lab.lod.service.impl;

import java.math.BigDecimal;

import com.softexploration.lab.lod.account.SavingAccount;
import com.softexploration.lab.lod.service.MoneyTransferResult;
import com.softexploration.lab.lod.service.MoneyTransferService;

public class LoDMoneyTransferService implements
		MoneyTransferService<SavingAccount> {

	@Override
	public MoneyTransferResult makeMoneyTransfer(SavingAccount sourceAccount,
			SavingAccount targetAccount, BigDecimal amount) {
		MoneyTransferResult result = null;
		String sourceAccountNumber = sourceAccount.getAccountNumber(); // respects
																	   // the
		String targetAccountNumber = targetAccount.getAccountNumber(); // LoD
		// rest of the implementation goes here
		return result;
	}
}