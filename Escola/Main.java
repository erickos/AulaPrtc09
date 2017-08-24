import java.text.DecimalFormat;
/**
 * Main class to execute the project.
 *
 * @author Erick de Oliveira Silva.
 * @version 2017.08.23
 */
public class Main
{
	public static void main( String[] args )
	{

		// Instatiate a Definitive teacher.
		ProfessorRegime professorReg = new ProfessorRegime( "Yoda", "15423", 300, 1500.00 );

		// Instatiate a Substitute teacher.
		ProfessorHorista professorHor = new ProfessorHorista( "Tyler", "54321", 30, 16, "50.00" );

		// DecimalFormat Object to format double numbers.
		DecimalFormat df = new DecimalFormat("#0.00");

		// Testes 
		// Testes Gets ProfessorRegime.
		System.out.println( ">>> ProfessorRegime <<< " );
		System.out.println( "Name : " + professorReg.getNome()
							+ "\nMatricule : " + professorReg.getMatricula()
							+ "\nAge : " + professorReg.getIdade()
							+ "\nSalary : R$" + df.format( professorReg.getSalario() ) );

		System.out.println();

		// Testes Gets ProfessorHorista.
		System.out.println( ">>> ProfessorHorista <<< " );
		System.out.println( "Name : " + professorHor.getNome()
							+ "\nMatricule : " + professorHor.getMatricula()
							+ "\nAge : " + professorHor.getIdade()
							+ "\nHours in work : " + professorHor.getTotalHoras()
							+ "\nSalary per hour : R$" + df.format( Double.parseDouble( professorHor.getSalarioHora() ) ) 
							+ "\nTotal Salary : " + df.format( professorHor.salario() ) );


		// Testes Sets ProfessorRegime.
		professorReg.setNome( "Obi-Wan" );
		professorReg.setMatricula( "12345" );
		professorReg.setIdade( 70 );
		professorReg.setSalario( 1000.00 );

		System.out.println( "\n>>> New ProfessorRegime <<<" );
		System.out.println( "Name : " + professorReg.getNome()
							+ "\nMatricule : " + professorReg.getMatricula()
							+ "\nAge : " + professorReg.getIdade()
							+ "\nSalary : R$" + df.format( professorReg.getSalario() ) );


		// Testes Sets ProfessorHorista.
		professorHor.setNome( "Durden" );
		professorHor.setMatricula( "9808" );
		professorHor.setIdade( 30 );
		professorHor.setTotalHoras( 12 );
		professorHor.setSalarioHora( "100.00" );

		// Testes Gets ProfessorHorista.
		System.out.println( "\n>>> New ProfessorHorista <<< " );
		System.out.println( "Name : " + professorHor.getNome()
							+ "\nMatricule : " + professorHor.getMatricula()
							+ "\nAge : " + professorHor.getIdade()
							+ "\nHours in work : " + professorHor.getTotalHoras()
							+ "\nSalary per hour : R$" + df.format( Double.parseDouble( professorHor.getSalarioHora() ) ) 
							+ "\nTotal Salary : " + df.format( professorHor.salario() ) );
	}
}
