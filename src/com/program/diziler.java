package com.program;

import java.util.Random;
import java.util.Scanner;

public class diziler {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("lütfen üretilmesini istediðiniz kadar sayý giriniz ");
		
		int uretilecekSayi=input.nextInt();
		int[] dizi=new int[uretilecekSayi];
		
		Random uretilecek=new Random();
		for (int i = 0; i < uretilecekSayi; i++) {
			
			int sayi=uretilecek.nextInt(100);
			dizi[i]=sayi;
		}
		
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		int enBuyuk=0;
		int enKucuk=100;
		 for (int i = 0; i < dizi.length; i++) {
			if(enBuyuk<=dizi[i]) {
				enBuyuk=dizi[i];
				}
			if(dizi[i]<=enKucuk) {
				enKucuk=dizi[i];
				}
			
		}
		 System.out.println("En büyük sayý:"+enBuyuk);
		 System.out.println("En küçük sayý:"+enKucuk);
	}
     
	
}
