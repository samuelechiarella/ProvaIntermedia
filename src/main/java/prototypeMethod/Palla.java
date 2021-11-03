package prototypeMethod;

public class Palla extends Decorazione {

	public Palla() {
		tipo = "Palla";
		id = 1;
		//disegna();
	}
	@Override
	void disegna() {
		System.out.println("Ho decorato l'albero con una pallina");
		
	}
	@Override
	public Decorazione clone() {
		Palla clone = new Palla();
		return clone;
	}

}
