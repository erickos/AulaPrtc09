import java.lang.IllegalArgumentException;

public class ProfessorRegime extends Professor
{
	private double salario;

	public ProfessorRegime( String nome, String matricula, int idade, double salario ) throws IllegalArgumentException
	{
		super( nome, matricula, idade );
		if ( salario < 0.0 ) 
		{
			
			this.salario = salario;
		} else {
			throw new IllegalArgumentException( "Salary can't be negative!!!" );
		}
	}

	public void setSalario( double salario )
	{
		this.salario = salario;
	}

	public double getSalario()
	{
		return salario;
	}
}
