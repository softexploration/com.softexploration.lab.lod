package com.softexploration.lab.lod;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.softexploration.lab.lod.account.CheckingAccount;
import com.softexploration.lab.lod.account.SavingAccount;
import com.softexploration.lab.lod.account.id.IbanAccountId;
import com.softexploration.lab.lod.service.ctx.MoneyTransferContext;
import com.softexploration.lab.lod.service.ctx.impl.CtxMoneyTransferService;
import com.softexploration.lab.lod.service.impl.LoDMoneyTransferService;
import com.softexploration.lab.lod.service.impl.NonLoDMoneyTransferService;

/**
 * This is not a real test. The purpose is to demonstrate usage of different
 * services.
 *
 */
public class MoneyTransferServiceTest {

	com.softexploration.lab.lod.service.ctx.MoneyTransferService<SavingAccount> ctxMoneyTransferServiceForSavingAccount;
	com.softexploration.lab.lod.service.MoneyTransferService<SavingAccount> moneyTransferServiceForSavingAccount;
	com.softexploration.lab.lod.service.MoneyTransferService<CheckingAccount> moneyTransferServiceForCheckingAccount;

	@Before
	public void setUp() {
		ctxMoneyTransferServiceForSavingAccount = new CtxMoneyTransferService();
		moneyTransferServiceForSavingAccount = new LoDMoneyTransferService();
		moneyTransferServiceForCheckingAccount = new NonLoDMoneyTransferService();
	}

	@Test
	public void testCtxMoneyTransferServiceForSavingAccount() {
		MoneyTransferContext<SavingAccount> ctx = new MoneyTransferContext<>(
				new SavingAccount(new IbanAccountId("12")), new SavingAccount(
						new IbanAccountId("34")), BigDecimal.valueOf(1000.));
		ctxMoneyTransferServiceForSavingAccount.makeMoneyTransfer(ctx);
	}

	@Test
	public void testMoneyTransferServiceForSavingAccount() {
		SavingAccount sourceAccount = new SavingAccount(new IbanAccountId("12"));
		SavingAccount targetAccount = new SavingAccount(new IbanAccountId("34"));
		BigDecimal amount = BigDecimal.valueOf(1000.);
		moneyTransferServiceForSavingAccount.makeMoneyTransfer(sourceAccount,
				targetAccount, amount);
	}

	@Test
	public void testMoneyTransferServiceForCheckingAccount() {
		CheckingAccount sourceAccount = new CheckingAccount(new IbanAccountId(
				"12"));
		CheckingAccount targetAccount = new CheckingAccount(new IbanAccountId(
				"34"));
		BigDecimal amount = BigDecimal.valueOf(1000.);
		moneyTransferServiceForCheckingAccount.makeMoneyTransfer(sourceAccount,
				targetAccount, amount);
	}
}
