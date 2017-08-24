import java.util.Calendar;
/**
 * A Car class as a Vehicle subclass.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Moto extends Veiculo
{
	private String tipo_partida;
	private int cilindradas;

	/**
	 * Default constructor.
	 *
	 * @param marca Brand of the vehicle.
	 * @param modelo Model of the vehicle.
	 * @param placa Combination in vehicle board.
	 * @param tipo_partida Ignition type on a motocycle vehicle.
	 * @param cilindradas Quantity of cylinders on a motocycle vehicle.
	 */
	public Moto(  String marca
				, String modelo
				, String placa
				, String tipo_partida
				, int cilindradas )
	{
		super( marca, modelo, placa );

		this.tipo_partida = tipo_partida;
		this.cilindradas = cilindradas;

		setTipoVeiculo( "Moto" );
	}

	// Gets and Sets methods.
	public void setTipoPartida( String tipo_partida )
	{
		this.tipo_partida = tipo_partida;
	}

	public String getTipoPartida()
	{
		return tipo_partida;
	}

	public void setCilindradas( int cilindradas )
	{
		this.cilindradas = cilindradas;
	}

	public int getCilindradas()
	{
		return cilindradas;
	}

	/**
	 * Gets the limit day to turn back the rent.
	 *
	 * @param data_aluguel The date of the rent. 
	 * @return A Calendar date to limit day to turn baj the rent.
	 */
	public Calendar getDataVenc( Calendar data_aluguel )
	{
		data_aluguel.add( Calendar.DATE, 3 );
		return data_aluguel;
	}

	/**
	 * Prints the Motocycle exclusive fields.
	 */
	public void print()
	{
		System.out.println( ">>> Moto <<<" );
		super.print();
		System.out.println( "Tipo de Partida : " + getTipoPartida()
							+ " cc \nCilindradas : " + getCilindradas() );

		System.out.println();
	}

	/**
	 * Calculates the total cost of rent.
	 *
	 * @return Total cost value.
	 */
	public double getCusto()
	{
		return 2 * cilindradas;
	}
}