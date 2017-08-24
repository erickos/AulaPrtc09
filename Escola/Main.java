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

		// Testes 
		// Testes Gets ProfessorRegime.
		System.out.println( "Name : " + professorReg.getNome()
							+ "\nMatricule : " + professorReg.getMatricula()
							+ "\nAge : " + professorReg.getIdade()
							+ "\nSalary : " +professorReg.getSalario() );



	}
}
