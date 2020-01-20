package eggs;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner (System.in);
		
		System.out.println(">########################################################################");
		System.out.println("Zdraveite! Haide da svarim nqkolko qica.");
		System.out.println("Kolko qica iskate da svarite?");
		System.out.println(">########################################################################");
		
		while(NumberOfEggs.getNumberofeggs()<=2) {
			System.out.println("Slojete gi v...." + Cooking.cookingpots[1] + "!");
			break;		
		}
		while(NumberOfEggs.getNumberofeggs()==6) {
			System.out.println("Slojete gi v...." + Cooking.cookingpots[2] + "!");
			break;		
		}
		while(NumberOfEggs.getNumberofeggs()<=12) {
			System.out.println("Slojete gi v...." + Cooking.cookingpots[3] + "!");
			break;		
		}
		while(NumberOfEggs.getNumberofeggs()>12) {
			System.out.println("Slojete gi v...." + Cooking.cookingpots[4] + "!");
			break;		
		}
	
	
		
		

		
		System.out.println(">########################################################################");
		System.out.println("Molq slojete voda v  nqkoi poshoceniqt po-gore sud!");
		System.out.println("Kakvi qica iskate da prigotvite?");
		System.out.println(">########################################################################");
		
		int arr=0;
		
		for( arr=0;arr < SortOfEggs.sortEgtype().length; arr++) {
			
			System.out.println((arr + 1) + ". " + SortOfEggs.sortEgtype()[arr]);
			
		}
		
		arr = sc.nextInt();
		
		if (arr==1) {
			
			System.out.println("Kogato vodata e dostatuchno goreshta gi slojete da se varqt za 3 min");
			
		}else 
			
			if (arr==2) {
			
			System.out.println("Kogato vodata e dostatuchno goreshta gi slojete da se varqt za 5 min");
			
		}else 
			
			if(arr==3) {
			
			System.out.println("Kogato vodata e dostatuchno goreshta gi slojete da se varqt za 7 min");
		}else 
				
			if(arr==4) {
				
			System.out.println("Kogato vodata e dostatuchno goreshta gi slojete da se varqt za 10 min");
			
			
		}else {
			System.out.println(">########################################################################");
			System.out.println("Vuznikna greshka molq izberete validna opciq ot 1 do 4");		
			System.out.println(">########################################################################");
			System.exit(0);
			
		}
		
		System.out.println(">########################################################################");
		System.out.println("Zaleite gi sus studena voda za da moje da gi obelite po-lesno.");
		System.out.println(">########################################################################");
		System.out.println("Priqten apetit.");		
		System.out.println(">########################################################################");
	}					
  }

