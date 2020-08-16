package com.social.rajneesh.comp.service.impl;

import com.social.rajneesh.comp.service.ChainAssembly;

public class Company1ChainAssembly implements ChainAssembly {

	private int chainLength;
	private float chainAssemblyPrice;
	
	
	public Company1ChainAssembly(int chainLength, float chainAssemblyPrice) {
		this.chainLength = chainLength;
		this.chainAssemblyPrice = chainAssemblyPrice;
	}

	@Override
	public int getChainLength() {
		// TODO Auto-generated method stub
		return chainLength;
	}

	@Override
	public float getChainAssemblyPrice() {
		// TODO Auto-generated method stub
		return chainAssemblyPrice;
	}

}
