public class Main
{
	public static void main( String[] args )
	{
		// New database.
		Deposito database = new Deposito();
				
		Celular celular = new Celular( "iPhone 4", 2000.00, "Apple","A smartphone", "2010.12.20", "Aço", 2, 4.0, 16000 );
		Carro   carro   = new Carro  ( "Civic", 80000.00, "Honda", "Car", "2015.10.20", "Aço", 6, 2016, "Sedan");

		database.is_Empty();
		
		database.addProduto( celular );
		database.addProduto( carro   );
		
		database.is_Empty();
		database.mostValuable();
	
		database.printDatabase();
	}

}
