import java.lang.NumberFormatException;

public class ProfessorHorista extends Professor
{
	private int total_horas;
	private String salario_hora;

	// Default constructor.
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
