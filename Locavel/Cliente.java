
/**
 * A Client class.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Cliente
{
	// Atributes of a client.
	private String nome;
	private int num_carteira;
	
	/**
 	 * Default constructor
 	 *
 	 * @param nome Name of the client.
 	 * @param num_carteira Driver's license id of the client.
 	 */
	public Cliente(   String nome
					, int num_carteira   )
	{
	
		this.nome = nome;
		this.num_carteira = num_carteira;
		
	}


	// Gets as Sets methods
	public void setNome( String nome )
	{
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}

	public void setCarteira( int carteira )
	{
		this.num_carteira = num_carteira;
	}

	public int getNumCarteira()
	{
		return num_carteira;
	}

	/**
	 * Print the exclusive client fields.
	 */
	public void printCliente()
	{
		System.out.println( "Nome do cliente: " + getNome()
							+ "\nNumero do Carteira de Motorista: " + getNumCarteira() );
	}

}