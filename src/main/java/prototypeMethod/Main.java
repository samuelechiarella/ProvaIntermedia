package prototypeMethod;

public class Main {

	public static void main(String[] args) {
		Albero.carica();
		
		Decorazione decorazione1 = (Decorazione) Albero.getDecorazione(2);
		System.out.println("Decorazione: " +decorazione1.getTipo() + "   ID = "+decorazione1.getId());
		
		Decorazione decorazione2 = (Decorazione) Albero.getDecorazione(1);
		System.out.println("Decorazione: " +decorazione2.getTipo());
		Decorazione decorazione3 = (Decorazione) Albero.getDecorazione(3);
		System.out.println("Decorazione: " +decorazione3.getTipo());
	}
}

