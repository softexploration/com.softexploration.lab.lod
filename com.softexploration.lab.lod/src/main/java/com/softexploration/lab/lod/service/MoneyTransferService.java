package com.softexploration.lab.lod.service;

import java.math.BigDecimal;

public interface MoneyTransferService<AT> {

	MoneyTransferResult makeMoneyTransfer(AT sourceAccount, AT targetAccount,
			BigDecimal amount);
}