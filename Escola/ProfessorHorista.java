import java.lang.NumberFormatException;

/**
 * Definition of a Substitute Teacher class as Professor subclass.
 *
 * @author Erick de Oliveira Silva.
 * @version 2017.08.23
 */
public class ProfessorHorista extends Professor
{
	private int total_horas;
	private String salario_hora;

	/**
	 * Default constructor, throws exception if the argument are invalid.
	 *
	 * @param nome Name of the teacher.
	 * @param matricula Teacher's id on school.
	 * @param idade Teacher's age.
	 * @oaram total_horas Total of hours worked by teacher.
	 * @param salario_hora Value of each hour of teacher work.
	 */ 
	public ProfessorHorista( String nome, String matricula, int idade, int total_horas, String salario_hora ) throws NumberFormatException
	{
		super( nome, matricula, idade );
		try
		{	
			if ( total_horas > 0 && Double.parseDouble( salario_hora ) > 0.0 )
			{	
				
				this.total_horas = total_horas;
				this.salario_hora = salario_hora;
			}

		} catch ( NumberFormatException e )
		{
			e.toString();
		}	
	}	

	// Gets and Sets methods.
	public void setTotalHoras( int total_horas )
	{
		this.total_horas = total_horas;
	}

	public int getTotalHoras()
	{
		return total_horas;
	}

	public void setSalarioHora( String salario_hora )
	{
		this.salario_hora = salario_hora;
	}

	public String salario_hora()
	{
		return salario_hora;
	}

	public double salario()
	{
		double salario_horaDoubl = Double.parseDouble( salario_hora );
		
		return ( total_horas * salario_horaDoubl );
	}
}
