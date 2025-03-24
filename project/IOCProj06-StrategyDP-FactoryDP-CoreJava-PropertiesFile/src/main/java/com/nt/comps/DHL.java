package com.nt.comps;




public final class DHL implements Courier {
	
	public DHL() {
		System.out.println("DHL: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		return " order id "+oid+" order  is set for deliver using DHL Courier Service";
	}

}
