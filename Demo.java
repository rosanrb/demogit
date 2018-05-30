package test;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza[] pizzalijst = new Pizza[4];
		pizzalijst[0] = new Pizza("kaas");
		pizzalijst[1] = new Pizza("salami");
		pizzalijst[2] = new Pizza("groenten");
		pizzalijst[3]= new Pizza("tomatensaus");
		for(int i = 0; i < pizzalijst.length; i++)
		{
			System.out.println(pizzalijst[i].ingedrient);
		}
		for(Pizza p: pizzalijst)
		{
			System.out.println(p.ingedrient);
		}
	}

}

class Pizza{
	String ingedrient;
	Pizza(String pizzaingredient)
	{
		ingedrient = pizzaingredient;
	}
}
