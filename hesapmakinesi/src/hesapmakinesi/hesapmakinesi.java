package hesapmakinesi;

import java.util.Scanner;

public class hesapmakinesi {

	public static void main(String[] args) {
		
		int s1,s2,sonu�,toplam,�arpma,��karma,b�lme;
		 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("birinci say�y� giriniz:");
		s1=input.nextInt();
		
		System.out.println("ikinci say�y� giriniz:");
		s2=input.nextInt();
		
		System.out.println("1- Toplama \n 2- ��karma \n 3- �arpmna \n 4- B�lme ");
		
		System.out.println("islemi �e�iniz:");
		sonu�=input.nextInt();
		
		switch(sonu�) {
			
		 case 1: {
			 
			 toplam=s1+s2;
			 
			 System.out.println(s1 + "+" + s2 + "toplam�" + "=" + toplam );
			 break;
		 }
		 case 2: {
					 
					 ��karma=s1-s2;
					 
					 System.out.println(s1 + "-" + s2 + "��kar�nca" + "=" + ��karma );
					 break;
				 }
					
		 case 3: {
			 
			 �arpma=s1*s2;
			 
			 System.out.println(s1 + "*" + s2 + "�arp�m�" + "=" + �arpma );
			 break;
		 }
			
		 case 4: {
			 
			 b�lme=s1/s2;
			 
			 System.out.println(s1 + "/" + s2 + "b�l�m�" + "=" + b�lme );
			 break;
		 }
	
			
		}
	}

}
