package com.program;

import java.util.Scanner;

public class kullaniciBilgileriBirlestirme {

	public static void main(String[] args) {

		String[] ad = { "sema", "sena", "sanem", "selda" };
		String[] soyad = { "bereket", "kalem", "neyim", "�zt�rk" };
		int[] kilo = { 58, 60, 52, 256 };
		boolean[] ogrenciMi = { true, true, false, true };

		Scanner scanner = new Scanner(System.in);
		System.out.println("l�tfen bir say� giriniz");
		int sayi = scanner.nextInt();

		for (int i = 0; i < ogrenciMi.length; i++) {
			if (i == sayi) {
				String ogr = "��renci";
				if (ogrenciMi[i] == false) {
					ogr = "��renci de�il";
				}
				System.out.println("ad� " + ad[i] + " soyad� " + soyad[i] + " kilosu " + kilo[i] + " ve " + ogr);
			}
		}
	}

}
