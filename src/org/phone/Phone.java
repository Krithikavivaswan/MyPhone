package org.phone;

//Different datatypes order
public class Phone {

	private void phoneInfo(String Name) {
		System.out.println("Brand of the phone is " + Name);

	}

	private void phoneInfo(String SIM, int Version, char Network) {
		System.out.println("SIM company is " + SIM + Version + Network);

	}

	private void phoneInfo(long Imei, double Version) {
		System.out.println("IMEI number is " + Imei + "\n" + "Android Version " + Version);

	}

	private void phoneInfo(boolean abc) {
		System.out.println("Is the Phone currently active " + abc);

	}

	public static void main(String[] args) {
		Phone p = new Phone();
		p.phoneInfo("Nokia Plus");
		p.phoneInfo("JIO ", 4, 'G');
		p.phoneInfo(245678975l, 10.18);
		p.phoneInfo(true);

	}
}
