package factorymethod;

public class FiguraFactory {

	public FiguraFactory() {
		
	}
	public Figura getFigura(FiguraEnum type)
	{
		Figura fig = null;
		switch(type)
		{
		case cerchio:
			fig = new Cerchio();
			break;
		case quadrato:
			fig = new Quadrato();
			break;
		case triangolo:
			fig = new Triangolo();
			break;
		
		}
	
		return fig;
	}

}
