package abstractfactory;

public class FactoryProducer {
	 public static AbstractFactory getFactory(boolean rounded){   
	      if(rounded){
	         return new FiguraFactoryCarina();         
	      }else{
	         return new FiguraFactory();
	      }
	   }
}
