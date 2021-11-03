package factorymethod;


public class Main {

	public static void main(String[] args) {
		
		FiguraFactory ff = new FiguraFactory();
		
		ff.getFigura(FiguraEnum.quadrato).stampaFigura();
		ff.getFigura(FiguraEnum.triangolo).stampaFigura();
		
		
	}

}
