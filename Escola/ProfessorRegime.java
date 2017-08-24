import java.lang.IllegalArgumentException;

/**
 * Definition of a Definitive Teacher class as Professor subclass.
 *
 * @author Erick de Oliveira Silva.
 * @version 2017.08.23
 */
public class ProfessorRegime extends Professor
{
	private double salario;

	/**
	 * Default constructor, throws exception if the argument are invalid.
	 *
	 * @param nome Name of the teacher.
	 * @param matricula Teacher's id on school.
	 * @param idade Teacher's age.
	 * @oaram salario Total of the teacher's salary amount.
	 */ 
	public ProfessorRegime( String nome, String matricula, int idade, double salario ) throws IllegalArgumentException
	{
		super( nome, matricula, idade );
		if ( salario > 0.0 ) 
		{
			
			this.salario = salario;
		} else {
			throw new IllegalArgumentException( "Salary can't be negative!!!" );
		}
	}

	// Gets and Sets methods.
	public void setSalario( double salario )
	{
		this.salario = salario;
	}

	public double getSalario()
	{
		return salario;
	}
}
