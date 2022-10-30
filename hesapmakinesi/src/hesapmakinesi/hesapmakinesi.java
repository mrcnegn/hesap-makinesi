package hesapmakinesi;

import java.util.Scanner;

public class hesapmakinesi {

	public static void main(String[] args) {
		
		int s1,s2,sonuç,toplam,çarpma,çýkarma,bölme;
		 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("birinci sayýyý giriniz:");
		s1=input.nextInt();
		
		System.out.println("ikinci sayýyý giriniz:");
		s2=input.nextInt();
		
		System.out.println("1- Toplama \n 2- Çýkarma \n 3- Çarpmna \n 4- Bölme ");
		
		System.out.println("islemi þeçiniz:");
		sonuç=input.nextInt();
		
		switch(sonuç) {
			
		 case 1: {
			 
			 toplam=s1+s2;
			 
			 System.out.println(s1 + "+" + s2 + "toplamý" + "=" + toplam );
			 break;
		 }
		 case 2: {
					 
					 çýkarma=s1-s2;
					 
					 System.out.println(s1 + "-" + s2 + "çýkarýnca" + "=" + çýkarma );
					 break;
				 }
					
		 case 3: {
			 
			 çarpma=s1*s2;
			 
			 System.out.println(s1 + "*" + s2 + "çarpýmý" + "=" + çarpma );
			 break;
		 }
			
		 case 4: {
			 
			 bölme=s1/s2;
			 
			 System.out.println(s1 + "/" + s2 + "bölümü" + "=" + bölme );
			 break;
		 }
	
			
		}
	}

}
