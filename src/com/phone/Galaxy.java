package com.phone;

public class Galaxy extends Phone implements Ringable{

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return "Galaxy" + this.getVersionNumber() + " says " + this.getRingTone();
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Unlocking via finger print";
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Galaxy " + this.getVersionNumber() + " from " + this.getCarrier());
	}

}
