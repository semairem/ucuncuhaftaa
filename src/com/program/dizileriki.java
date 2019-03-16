package com.program;



public class dizileriki {


	public static void main(String[] args) {
		
		String[] satir= {"1","2","3"};
		String[] sutun= {"A","B","C","D"};
		String[][] satirSutunDizisi=new String[satir.length][sutun.length];
		
		for (int i = 0; i < satir.length; i++) {
//			System.out.println(satir[i]);
			for ( int j = 0; j < sutun.length; j++) {
				
			    satirSutunDizisi[i][j]=sutun[j]+satir[i];
				System.out.print(sutun[j]+satir[i]);
				
			
				
			}
			System.out.println();
		}
	
}
	}
