package test;

public class Vissenkom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vissenkom vissenkom = new Vissenkom();
		vissenkom.visInVissenkom = new Vis();
		vissenkom.visInVissenkom.zwemmen();
	}
	Vis visInVissenkom;

}

class Vis{
	String kleur;
	int topsnelheid;
	
	void zwemmen()
	{
		topsnelheid = 20;
	}
}
