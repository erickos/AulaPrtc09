import java.lang.IllegalArgumentException;

/**
 * Definition of a professor class.
 *
 * @author Erick de Oliveira Silva.
 * @version 2017.08.23
 */
public class Professor
{
	private String nome;
	private String matricula;
	private int idade;
	
	/**
	 * Default constructor, throws exception if the argument are invalid.
	 *
	 * @param nome Name of the teacher.
	 * @param matricula Teacher's id on school.
	 * @param idade Teacher's age.
	 */ 
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

	// Gets and Sets methods.
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
