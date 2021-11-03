package prototypeMethod;

import java.util.Hashtable;

public class Albero {

	private static Hashtable<Integer,Decorazione> alberoMap = new Hashtable<Integer,Decorazione>();
	
	public static Decorazione getDecorazione(int tipo)
	{
		Decorazione dec = alberoMap.get(tipo);
		return (Decorazione) dec.clone();
	}
	
	public static void carica()
	{
		Stella stella = new Stella();
		stella.setId(1);
		alberoMap.put(stella.getId(), stella);
		
		Palla palla = new Palla();
		palla.setId(2);
		alberoMap.put(palla.getId(), palla);
		
		Palla p1= (Palla) palla.clone();
		p1.setId(3);
		alberoMap.put(p1.getId(),palla);
	}

	
}
