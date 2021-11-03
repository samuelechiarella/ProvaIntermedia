package abstractfactory;

public class Cliente {
	public static void main(String[] args) {
		AbstractFactory af = FactoryProducer.getFactory(false);
		Figura figura1= af.getFigura("quadrato");
		figura1.stampaFigura();
		Figura figura2= af.getFigura("cerchio");
		figura2.stampaFigura();
		
		AbstractFactory af2 = FactoryProducer.getFactory(true);
		Figura figuraC1 = af2.getFigura("quadrato");
		figuraC1.stampaFigura();
	}
}
