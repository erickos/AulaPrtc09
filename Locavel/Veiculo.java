import java.util.Calendar;
/**
 * Class to define a generic vehicle
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Veiculo
{
	private String tipo_veiculo;

	// Default atributes of any vehicle.
	private String marca;
	private String modelo;
	private String placa;
	private boolean is_Alugado;

	private Cliente cliente;
	private Calendar data_aluguel;

	/**
	 * Default constructor.
	 *
	 * @param marca Brand of the vehicle.
	 * @param modelo Model of the vehicle.
	 * @param placa Combination in vehicle board.
	 */
	public Veiculo(   String marca
			, String modelo
			, String placa )
	{
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;

		this.tipo_veiculo = "";
		this.is_Alugado = false;
		this.cliente = new Cliente( null, 1 );
		this.data_aluguel.getInstance();
	}

	// Gets and Sets methods.
	public void setMarca( String marca )
	{
		this.marca = marca;
	}

	public String getMarca()
	{
		return marca;
	}

	public void setModelo( String modelo )
	{
		this.modelo = modelo;
	}

	public String getModelo()
	{
		return modelo;
	}

	public void setPlaca( String placa )
	{
		this.placa = placa;
	}

	public String getPlaca()
	{
		return placa;
	}

	public void setTipoVeiculo( String tipo_veiculo )
	{
		this.tipo_veiculo = tipo_veiculo;
	}

	public String getTipoVeiculo()
	{
		return tipo_veiculo;
	}

	public void setAluguelVeiculo( boolean is_Alugado )
	{
		this.is_Alugado = is_Alugado;
	}

	public boolean isAlugado()
	{
		return is_Alugado;
	}

	public void setCliente( Cliente cliente )
	{
		this.cliente = cliente;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setDataAlug( Calendar data_aluguel )
	{
		this.data_aluguel = data_aluguel;
	}

	public Calendar getDataAlug()
	{
		return data_aluguel;
	}

	public Calendar getDataVenc( Calendar data_aluguel )
	{
		return data_aluguel;
	}

	/**
	 * Default definition on vehicle to gost, just for Car and Motocycle inherit.
	 */
	public double getCusto()
	{
		return 100.0;
	}

	/**
	 * Prints the vehicle geral fields. If is rented the client are printed too.
	 */
	public void print()
	{
		if ( is_Alugado )
		{
			cliente.printCliente();
			System.out.println( "Marca : " + getMarca() 
				  + "\nModelo : " + getModelo()
			          + "\nPlaca : " + getPlaca()  );
			

		} else 
		{
			System.out.println( "Marca : " + getMarca() 
				  + "\nModelo : " + getModelo()
			          + "\nPlaca : " + getPlaca()  );	
		}
		
	}

}
