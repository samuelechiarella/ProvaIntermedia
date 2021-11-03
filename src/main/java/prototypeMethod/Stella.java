package prototypeMethod;

public class Stella extends Decorazione{

	public Stella()
	{
		tipo = "Stella";
		id = 0;
		//disegna();
	}
	void disegna() {
		System.out.println("ho decorato l'abero con una stellina");
		
	}
	@Override
	public Decorazione clone() {
		Stella clone = new Stella();
		return clone;
	}

}
