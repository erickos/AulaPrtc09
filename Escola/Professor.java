import java.lang.IllegalArgumentException;

public class Professor
{
	private String nome;
	private String matricula;
	private int idade;
	
	// Default constructor.
	public Professor( String nome, String matricula, int idade ) throws IllegalArgumentException
	{
		if ( idade > 16 || nome.equals( null ) || matricula.equals( null ) )
		{
			this.nome = nome;
			this.matricula = matricula;
			this.idade = idade;
		} else 
		{
			throw new IllegalArgumentException( "Name and/or registry can't be null or age can't be smaller than 16!!!!" );
		}
	}

	public void setNome( String nome )
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return nome;
	}

	public void setMatricula( String matricula )
	{
		this.matricula = matricula;
	}

	public String getMatricula()
	{
		return matricula;
	}			

	public void setIdade( int idade )
	{
		this.idade = idade;
	}

	public int getIdade()
	{
		return idade;
	}
}
