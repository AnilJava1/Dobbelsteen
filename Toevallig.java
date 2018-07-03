package demo;

import java.util.Random;

class Toevallig {

	public static void main(String[] args) 
	{
		int totalcount = 0;
				Random toeval = new Random();
				for (int i = 1; i <= 100; i++)
		{
				int getal = toeval.nextInt(6) + 1;
		System.out.println(getal);
		if (getal == 3)
			totalcount ++;
			
		}
		System.out.println("Hoe vaak is er 3 gegooid? " + totalcount);
		
		
		
				System.out.println("==========");
		System.out.println("Toevallig klaar");

	}

}
