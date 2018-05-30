package test;

public class OefeningPlatform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OefeningPlatform oefening = new OefeningPlatform();
		StringBuilder stringb = new StringBuilder("Hallo, dit is een string voor een StringBuilder");
		int sindex = stringb.indexOf("is");
		System.out.println(sindex);
		String ssubstring = stringb.substring(11, 20);
		System.out.println(ssubstring);
	}

}
