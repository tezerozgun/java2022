package javademos;

import java.util.Iterator;

public class recapdemo1 {

	public static void main(String[] args) {

		int sayı1 = 100;
		int sayı2 = 200;
		int sayı3 = 300;

		int enBuyuk = sayı2;

		if (enBuyuk < sayı2) {
			enBuyuk = sayı2;
		}
		if (sayı2 < sayı3) {
			enBuyuk = sayı3;

		}
		System.out.println(enBuyuk);

	}

}
