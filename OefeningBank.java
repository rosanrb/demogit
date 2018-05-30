package test;

import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.IIOException;

public class OefeningBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OefeningBank nieuwoef = new OefeningBank();
		Bank bank = new Bank();
		bank.klantEen = new Persoon();
		bank.klantTwee = new Persoon();
		bank.klantEen.banknummer = 1;
		bank.klantTwee.banknummer = 2;
		bank.personenlijst.add(bank.klantEen);
		bank.personenlijst.add(bank.klantTwee);
		bank.overschrijven(bank.klantEen, bank.klantTwee, 34);
	}
}

class Bank
{
	ArrayList<Persoon> personenlijst = new ArrayList<Persoon>();
	Persoon klantEen;
	Persoon klantTwee;
	
	void overschrijven(Persoon p1, Persoon p2, int bedrag)
	{
		p1.geldHoeveelheid = p1.geldHoeveelheid - bedrag;
		p2.geldHoeveelheid = p2.geldHoeveelheid + bedrag;
	}
	
	Persoon vindPersoonBanknummer(int banknummer)
	{
		for(int i = 0; i < personenlijst.size(); i++)
		{
			if(personenlijst.get(i).banknummer == banknummer)
			{
				return personenlijst.get(i);
			}
		}
		return new Persoon();
	}
}

class Persoon
{
	int geldHoeveelheid;
	int banknummer;
}