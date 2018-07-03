package demo;

class Mastermind {
	
		static void tellen () 
	{
		int teller;
		for (teller = 1; teller <= 20; teller++)	
		{
			System.out.println("Ik ren " + teller + " maal rond die tafel");
		}
	}	
	
	public static void main(String[] args)
	{
		tellen();
		
		
		System.out.println("===========");
		System.out.println("Mastermind klaar");
	}

}
