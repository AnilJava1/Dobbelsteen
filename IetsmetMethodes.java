package demo;

class IetsmetMethodes 
{
	static void stelJeVoorZeg (String naam)
	{
		System.out.println("Hoi, ik ben " + naam);
		naam = "Anil";
	}
	
	public static void main(String[] args) 
	{
		String naam;
		naam = "Anil";
		stelJeVoorZeg (naam);				
		
		String g = "lezen";
		String z = "zwemmen";
		String m = "motorrijden";
		
		System.out.println("mijn hobby's zijn: " + g + "," + " " + z + " " + "en" + " " + m );
		
		//System.out.println("1 van mijn hobby's is lezen;");
		//System.out.println("een andere hobby is zwemmen;");
		//System.out.println("daarnaast geniet ik van motorrijden.");
		
		
		System.out.println("==========");
		System.out.println("Is dit correct?");

	}

}
