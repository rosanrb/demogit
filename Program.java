package test;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		Program program = new Program();
		ArrayList<Fiets> fietsenlijst = new ArrayList<Fiets>();
		fietsenlijst.add(new Fiets(1, "jan"));
		fietsenlijst.add(new Fiets(2, "piet"));
		fietsenlijst.add(new Fiets(3, "klaas"));
		fietsenlijst.remove(1);
		fietsenlijst.clear();
		fietsenlijst.add(new Fiets(1, "jan"));
		fietsenlijst.add(new Fiets(2, "piet"));
		fietsenlijst.add(new Fiets(3, "klaas"));
		
		for(Fiets f: fietsenlijst)
		{
			if(f.naamEigenaar.equals("piet"))
			{
				f.poetsFiets();
			}
		}
		program.gepoetsteFietsen(fietsenlijst);
		Fiets[][] fietsenstalling =  new Fiets[5][4];
		fietsenstalling[0][3] = new Fiets(4, "jantje");
		fietsenstalling[5][4] = new Fiets(5, "pietje");
		fietsenstalling[3][1] = new Fiets(6, "klaasje");
		for(int x = 0; x < fietsenstalling.length; x++)
		{
			for(int y = 0; y < fietsenstalling[x].length; y++)
			{
				if(fietsenstalling[x][y].fietsgepoetst)
				{
					fietsenstalling[x][y].fietsgepoetst = false;
				}
			}
		}
	}
	ArrayList<Fiets> gepoetsteFietsen(ArrayList<Fiets> fietsenlijst)
	{
		ArrayList<Fiets> gf = new ArrayList<>();
		for(Fiets f: fietsenlijst)
		{
			if(f.fietsgepoetst)
			{
				gf.add(f);
			}
		}
		return gf;
	}
}

class Fiets
{
	int fietsnummer;
	String naamEigenaar;
	boolean fietsgepoetst;
	
	Fiets(int nummer, String eigenaar)
	{
		fietsnummer = nummer;
		naamEigenaar = eigenaar;
		fietsgepoetst = false;
	}
	void poetsFiets()
	{
		fietsgepoetst = true;
	}
}

