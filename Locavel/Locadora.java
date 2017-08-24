import java.util.*;
import java.text.SimpleDateFormat;

/**
 * A Locator class to manage the vehicle's list.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Locadora
{
	// The database of vehicles.
	private ArrayList< Veiculo > veiculos;

	/**
 	 * A Car class as a Vehicle subclass.
 	 */
	public Locadora()
	{

		veiculos = new ArrayList< Veiculo >();

	}

	/**
     * Method to add a vehicle in Locator's database.
     * 
     * @param veiculo Vehicle object to be added.
	 */
	public void addVeiculo( Veiculo veiculo )
	{
		System.out.println( ">>> Adicionando Veiculo na base de dados <<<\n" );
		veiculos.add( veiculo );
	}

	/**
     * Print all the vehicles presents on Locator's database.
	 */
	public void printAll()
	{
		for ( Veiculo current : veiculos )
		{
			// The if-else are just for diferentiate the prints in each class.
     		if ( current.getTipoVeiculo().equals("Carro") )
     		{
     			current = (Carro) current;

     		} else if ( current.getTipoVeiculo().equals("Moto") )
     		{
     			current = (Moto) current;
     		} else {

     			System.out.println( ">>> Error, bad element in Database. Leaving the conexion!! <<<" );
     			break;
     		}

     		// Prints a single element by time.
     		current.print();
		}	
	}

	/**
     * Print all the rented vehicles presents on Locator's database.
	 */
	public void printAlugados()
	{
		System.out.println( ">>> Carros Alugados <<<" );
		for ( Veiculo current : veiculos )
		{
			if ( current.isAlugado() )
	     	{	
	     		if ( current.getTipoVeiculo().equals("Carro") )
	     		{
	     			current = (Carro) current;

	     		} else if ( current.getTipoVeiculo().equals("Moto") )
	     		{
	     			current = (Moto) current;
	     		} else {

	     			System.out.println( ">>> Error, bad element in Database. Leaving the conexion!! <<<" );
	     			break;
	     		}

	     		current.print();
	     	}
		}
		System.out.println( ">>> Fim da lista de alugados <<<\n" );
	}

	/**
     * Print all the non-rented vehicles presents on Locator's database.
	 */
	public void printNaoAlugados()
	{
		System.out.println( ">>> Carros Disponiveis para aluguel <<<" );
		for ( Veiculo current : veiculos )
		{
			if ( !current.isAlugado() )
	     	{	
	     		if ( current.getTipoVeiculo().equals("Carro") )
	     		{
	     			current = (Carro) current;

	     		} else if ( current.getTipoVeiculo().equals("Moto") )
	     		{
	     			current = (Moto) current;
	     		} else {

	     			System.out.println( ">>> Error, bad element in Database. Leaving the conexion!! <<<" );
	     			break;
	     		}

	     		current.print();
	     	}
		}
		System.out.println( ">>> Fim da lista de disponiveis <<<\n" );
	}

	/**
     * Method to rent a available vehicle on Locator's database.
     * 
     * @param cliente Client to be the Renter.
     * @oaram veiculo Vehicle to be rented.
	 */
	public void alugar( Cliente cliente, Veiculo veiculo )
	{
		if ( veiculo.isAlugado() )
		{
			System.out.println( "Este veiculo já está alugado!" );
		} else 
		{
			Calendar data = Calendar.getInstance();

			System.out.println( ">>> Alugando o veiculo : " );
			veiculo.print();
			veiculo.setAluguelVeiculo( true );
			veiculo.setCliente( cliente );
			veiculo.setDataAlug( data );
		}	
	}

	/**
     * Method to prints a receipt of a rent.
     * 
     * @param cliente Renter client.
     * @oaram veiculo Rented vehicle.
	 */
	public void printRecibo( Cliente cliente, Veiculo veiculo )
	{
		if ( veiculo.isAlugado() 
			&&	veiculo.getCliente() == cliente )
		{
			if ( veiculo.getTipoVeiculo().equals("Carro") )
     		{
     			veiculo = (Carro) veiculo;

     		} else if ( veiculo.getTipoVeiculo().equals("Moto") )
     		{
     			veiculo = (Moto) veiculo;
     		}

     		Calendar vencimento = veiculo.getDataVenc( veiculo.getDataAlug() );
     		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			String data_text = df.format( vencimento.getTime() );


     		System.out.println( ">>> Recibo <<<");
     		veiculo.print();
     		System.out.println( "Custo : R$" + veiculo.getCusto() );
     		System.out.println( "Data de vencimento do aluguel: " + data_text );

     		System.out.println( ">>> Fim do Recibo <<<\n" );
		} else 
		{
			System.out.println( "Informações incorretas. Falha ao buscar informações para gerar recibo!!!!");
		}
	}

	/**
     * Method to turn back a rented vehicle to a Locator. Prints the receipt too.
     * 
     * @param cliente Renter client.
     * @oaram veiculo Rented vehicle.
	 */
	public void devolucao( Cliente cliente, Veiculo veiculo )
	{
		// Validates if the client is the really renter and the car are really rented.
		if ( veiculo.getCliente() == cliente && veiculo.isAlugado() )
		{
			// Picks up the actual Date.
			Calendar pagamento = Calendar.getInstance(); // Hora do pagamento.
			
			if ( veiculo.getTipoVeiculo().equals("Carro") )
     		{
     			veiculo = (Carro) veiculo;

     		} else if ( veiculo.getTipoVeiculo().equals("Moto") )
     		{
     			veiculo = (Moto) veiculo;
     		}

     		// Calculate the limit date.
			Calendar vencimento = veiculo.getDataVenc( veiculo.getDataAlug() );

			if ( pagamento.before( vencimento ) )
			{
				printRecibo( cliente, veiculo );
				veiculo.setAluguelVeiculo( false );
				veiculo.setCliente( null );

				System.out.println( ">>>> Operação realizada com sucesso!! <<<<\n" );
			} else 
			{
				// Calculate the penalty.
				int atraso = pagamento.get( Calendar.DAY_OF_YEAR ) - vencimento.get( Calendar.DAY_OF_YEAR );
				double valor_com_multa = veiculo.getCusto() + (veiculo.getCusto() * 0.02 * atraso);

				printRecibo( cliente, veiculo );
				System.out.println( "Como houve um atraso de " + atraso + " dias então terá que pagar um adicional de R$" + ( veiculo.getCusto() * 0.02 * atraso ) );
				System.out.println( "Logo, o novo custo total é R$" + valor_com_multa );
				System.out.println( ">>> Final do adicional <<<\n" );

				veiculo.setAluguelVeiculo( false );
				veiculo.setCliente( null );
			}
		}
	}

}