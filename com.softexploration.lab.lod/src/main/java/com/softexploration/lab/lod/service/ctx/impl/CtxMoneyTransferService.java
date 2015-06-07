package com.softexploration.lab.lod.service.ctx.impl;

import com.softexploration.lab.lod.account.SavingAccount;
import com.softexploration.lab.lod.service.MoneyTransferResult;
import com.softexploration.lab.lod.service.ctx.MoneyTransferContext;
import com.softexploration.lab.lod.service.ctx.MoneyTransferService;

public class CtxMoneyTransferService implements
		MoneyTransferService<SavingAccount> {

	@Override
	public MoneyTransferResult makeMoneyTransfer(
			MoneyTransferContext<SavingAccount> ctx) {
		MoneyTransferResult result = null;
		String sourceAccountNumber = ctx.getSourceAccount().getAccountNumber(); // does
																				// it
																				// respect
																				// the
																				// LoD?
		String targetAccountNumber = ctx.getTargetAccount().getAccountNumber(); // does
																				// it
																				// respect
																				// the
																				// LoD?
		// rest of the implementation goes here
		return result;
	}

}
