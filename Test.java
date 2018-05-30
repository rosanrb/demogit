package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 44;
		Koffie koffie = new Koffie();
		koffie.temperatuur = 34;
		verkopen(r); // argument = Waarde
		System.out.println("in main: " + r);
		verkopen(koffie);
		System.out.println(koffie.temperatuur);
	}
	static void verkopen(int inhoud) // parameter = Variabele //signature = aantal paramters, type parameters en de volgorde
	{
		inhoud = 66;
		System.out.println("werkt");
	}
	
	static void verkopen(Koffie k)
	{
		System.out.println("in leeglopen " + k.temperatuur);
		k.temperatuur = 48;
	}
}

class Koffie
{
	int temperatuur;
}