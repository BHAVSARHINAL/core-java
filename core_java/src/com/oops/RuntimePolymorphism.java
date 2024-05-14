package com.oops;
/**
 * <h3>This program represents the rate of the interest of diffrent bank.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 4-04-2024
 */
class RBI {

	int getRateOfInterest() {
		return 0;
	}

}

class SBI extends RBI {

	@Override
	public int getRateOfInterest() {
		return 8;
	}

}

class ICICI extends RBI {

	public int getRateOfInterest() {
		return 7;
	}

}

class AXIS extends RBI {

	public int getRateOfInterest() {
		return 9;
	}

}

public class RuntimePolymorphism {

	public static void main(String args[]) {
		SBI sbi = new SBI();
		ICICI icici = new ICICI();
		AXIS axis = new AXIS();
		System.out.println("SBI Rate of Interest is : " + sbi.getRateOfInterest() + " %");
		System.out.println("ICICI Rate of Interest is : " + icici.getRateOfInterest() + " %");
		System.out.println("AXIS Rate of Interest is : " + axis.getRateOfInterest() + " %");
	}

}