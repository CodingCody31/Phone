package com.phone;

public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		
		return "iPhone " + this.getVersionNumber() + " says " + this.getRingTone();
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Unlocking via facial recognition";
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("iPhone " + this.getVersionNumber() + " from " + this.getCarrier()); 
	}

}
