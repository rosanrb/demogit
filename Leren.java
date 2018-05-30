package test;

public class Leren
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leren start = new Leren();
		int getal = 8;
		Boek leesboek = new Boek();
		lezen(leesboek);
		lezen(getal);
		System.out.println("getal: " + getal);
	}
	
	static void lezen(Boek boek)
	{
		boek.boeknumer = 1;
	}
	static void lezen(int aantalBoeken)
	{
		System.out.println("getal: " + aantalBoeken);
		aantalBoeken = 1;
		System.out.println("aantalBoeken: " + aantalBoeken);
	}
}

class Boek
{
	int boeknumer;
	String naam;
	boolean gelezen;	
}
