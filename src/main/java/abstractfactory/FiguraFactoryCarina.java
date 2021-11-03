package abstractfactory;

public class FiguraFactoryCarina extends AbstractFactory {

	@Override
	Figura getFigura(String type) {
		if(type == null){
	         return null;
	      }    
	      
	      if(type.equalsIgnoreCase("quadrato")){
	         return new QuadratoCarino();
	         
	      }else if(type.equalsIgnoreCase("cerchio")){
	         return new CerchioCarino();
	      }
	      
	      return null;
	}

}
