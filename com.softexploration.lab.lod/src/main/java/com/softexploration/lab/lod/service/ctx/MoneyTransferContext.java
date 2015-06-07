package com.softexploration.lab.lod.service.ctx;

import java.math.BigDecimal;

public class MoneyTransferContext<AT> {

	private AT sourceAccount;
	private AT targetAccount;
	private BigDecimal amount;

	public MoneyTransferContext(AT sourceAccount, AT targetAccount,
			BigDecimal amount) {
		this.sourceAccount = sourceAccount;
		this.targetAccount = targetAccount;
		this.amount = amount;
	}

	public AT getSourceAccount() {
		return sourceAccount;
	}

	public AT getTargetAccount() {
		return targetAccount;
	}

	public BigDecimal getAmount() {
		return amount;
	}
}