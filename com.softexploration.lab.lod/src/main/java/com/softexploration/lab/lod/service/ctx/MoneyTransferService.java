package com.softexploration.lab.lod.service.ctx;

import com.softexploration.lab.lod.service.MoneyTransferResult;

public interface MoneyTransferService<AT> {

	MoneyTransferResult makeMoneyTransfer(MoneyTransferContext<AT> ctx);
}