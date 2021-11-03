package factorymethod;

public enum FamigliaEnum {
	ASTERISCHI,
	TRATTINI,
	PERCENTUALE;
	public char car;
	
	
	public char setChar(FamigliaEnum type) {
		switch(type)
		{
		case ASTERISCHI:
			car = '*';
			break;
		case TRATTINI:
			car = '-';
			break;
		case PERCENTUALE:
			car = '%';
		}
		return car;
	
	}
	public char getChar()
	{
		return car;
	}
	
	
	
	
	
}
