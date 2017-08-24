import java.util.Calendar;
import java.lang.IllegalArgumentException;
/**
 * A Car class as a Vehicle subclass.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Carro extends Veiculo
{
	// Exclusive atribute of a car.
	private double potencia_motor;
	private String qtd_portas;
	
	/**
	 * Default constructor.
	 *
	 * @param marca Brand of the vehicle.
	 * @param modelo Model of the vehicle.
	 * @param placa Combination in vehicle board.
	 * @oaram potencia_motor Motor force in a car vehicle.
	 * @param qtd_portas Number of doors in a car vehicle.
	 */
	public Carro(     String marca
			, String modelo
			, String placa
			, double potencia_motor
			, String qtd_portas  ) throws IllegalArgumentException
	{
		super( marca, modelo, placa );


		if ( potencia_motor >= 1.0 && potencia_motor <= 3.0 )
		{
			this.potencia_motor = potencia_motor;
			this.qtd_portas = qtd_portas;
			setTipoVeiculo( "Carro" );
		} else 
		{
			throw new IllegalArgumentException( "Potência do motor deve estar entre 1.0 e 3.0!!!");
		}

	}

	// Gets and Sets methods.
	public void setPotenciaMotor( double potencia_motor )
	{
		this.potencia_motor = potencia_motor;
	}

	public double getPotenciaMotor()
	{
		return potencia_motor;
	}

	public void setQtdPortas( String qtd_portas )
	{
		this.qtd_portas = qtd_portas;
	}

	public String getQtdPortas()
	{
		return qtd_portas;
	}

	/**
     * Method to calculate tem limit day to return with a vehicle.
     * 
     * @param data_aluguel Date when the vehicle has be rented.
     * @return Date when the rent is over.
	 */
	public Calendar getDataVenc( Calendar data_aluguel )
	{
		data_aluguel.add( Calendar.DATE, 2 );
		return data_aluguel;
	}

	/**
	 * Calculates the total cost of rent.
	 *
	 * @return Total cost value.
	 */
	public double getCusto()
	{
		return 100 * potencia_motor;
	}

	/**
	 * Print the exclusive fields of a car.
	 */
	public void print()
	{
		System.out.println( ">>> Carro <<<" );
		super.print();
		System.out.println( "Potencia do Motor : " + getPotenciaMotor()
							+ " cv \nQuantidade de Portas : " + getQtdPortas() );
		System.out.println();
	}
}
