package com.softexploration.lab.lod.account.id;

public class IbanAccountId implements AccountId {

	private String iban;

	public IbanAccountId(String iban) {
		this.iban = iban;
	}

	@Override
	public String getAccountNumber() {
		return iban;
	}

}