import java.lang.IllegalArgumentException;

public class Chocolate extends ProdutoNaoDuravel
{
	private String forma; // Barra, Ovo, Bombom.
	private String tipo;  // Branco, Ao leite, Amargo, Com castanha.

	public Chocolate( String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String data_de_valid
						, String genero 
						, String forma
						, String tipo         ) throws IllegalArgumentException
	{

		super( nome, preco, marca, descricao, data_de_fabr, data_de_valid, genero );

		if( forma != null && tipo != null )
		{
			this.forma = forma;
			this.tipo  = tipo;
		} else 
		{
			throw new IllegalArgumentException( "Chocolate Mold or Type can't be null!!" );
		}

	}

	// Gets and Sets methods.
	public void setForma( String forma ) throws IllegalArgumentException
	{
		if ( forma != null )
		{
			this.forma = forma;
		} else 
		{
			throw new IllegalArgumentException( "Chocolate Mold can't be null!!" );
		}
	}

	public String getForma()
	{
		return forma;
	}

	public void setTipo( String tipo ) throws IllegalArgumentException
	{
		if ( tipo != null )
		{
			this.tipo = tipo;
		} else 
		{
			throw new IllegalArgumentException( "Chocolate Type can't be null!!" );
		}
	}

	public String getTipo()
	{
		return tipo;
	}
}