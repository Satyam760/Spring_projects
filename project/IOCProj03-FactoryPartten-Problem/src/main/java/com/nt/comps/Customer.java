package com.nt.comps;

public class Customer extends Person{
	
	private int txid;
	private double billAmount;
	
	public Customer(String name, String addrs, AadharDetails aadhar,int txid,double billAmount) {
		super(name, addrs, aadhar);
		System.out.println("Custmour: 5-param constructor");
		this.billAmount=billAmount;
		this.txid=txid;
	}

	@Override
	public String toString() {
		return super.toString()+"Customer [txid=" + txid + ", billAmount=" + billAmount + "]";
	}
	
	
}
