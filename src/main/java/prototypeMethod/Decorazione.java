package prototypeMethod;

public abstract class Decorazione{
	
	protected String tipo;
	protected Integer	id;
	
	abstract void disegna();
	
	public String getTipo()
	{
		return tipo;
	}
	public Integer getId()
	{
		return id;

	}
	public void setId(int id)
	{
		this.id = id;
	}
	public abstract Decorazione clone();
}
