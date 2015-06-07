package com.softexploration.lab.lod.account.id;

public class BbanAccountId implements AccountId {

	private String bban;

	public BbanAccountId(String bban) {
		this.bban = bban;
	}

	@Override
	public String getAccountNumber() {
		return bban;
	}
}