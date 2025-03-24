package com.nt.comps;




public final class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		return " order id "+oid+" order  is set for deliver using BlueDart Courier Service";
	}

}
