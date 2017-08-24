/**
 * Main class to execute the project.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Main 
{
	public static void main( String[] args )
	{
		// Instatiates a new Locator.
		Locadora data = new Locadora();

		// Instatiating four new vehicles.
		Carro carro = new Carro( "Fiat", "Palio", "PPP-1234", 1.0, "4" );
		Moto moto = new Moto( "Kawasaki", "Ninja 650", "AAA-4321", "Eletrica", 650 );
		Carro carro1 = new Carro( "Honda", "Civic", "AAA-1234", 2.0, "4" );
		Moto moto1 = new Moto( "Honda", "Bros 225", "BBB-4321", "Eletrica", 225 );

		// Adding them to a Locator's database.
		data.addVeiculo( carro );
		data.addVeiculo( moto );
		data.addVeiculo( carro1 );
		data.addVeiculo( moto1 );

		// Showing them.
		data.printAll();

		// Print the rented vehicles. Expected : No one
		data.printAlugados();

		// Print the non-rented vehicles. Expected : Everyone.
		data.printNaoAlugados();

		// Instatiate a client to test.
		Cliente cliente = new Cliente( "Erick" , 12345 );

		// Rent a moto and picks up the receipt.
		data.alugar( cliente, moto1 );
		data.printRecibo( cliente, moto1 );	

		// Rent a car and picks up the receipt.
		data.alugar( cliente, carro1 );
		data.printRecibo( cliente, carro1 );

		// Prints the non-rented vehicles. Expected: 2 of them, excluding the Civic and Bros 225. 
		data.printNaoAlugados();

		// Testing the devolution of two rested without delay.
		data.devolucao( cliente, moto1 );
		data.devolucao( cliente, carro1 );

	}
}