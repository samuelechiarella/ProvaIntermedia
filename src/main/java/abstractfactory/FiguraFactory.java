package abstractfactory;

public class FiguraFactory extends AbstractFactory {

	@Override
	
	public  Figura getFigura(String type) {
		  if(type == null){
		         return null;
		      }        
		      
		      if(type.equalsIgnoreCase("quadrato")){
		         return new Quadrato();
		         
		      }else if(type.equalsIgnoreCase("triangolo")){
		         return new Triangolo();
		      }
		      else if(type.equalsIgnoreCase("cerchio")){
		    	  return new Cerchio();
		      }
		      
		      return null;
		   }
	}


