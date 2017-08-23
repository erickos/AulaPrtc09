import java.lang.IllegalArgumentException;

public class ProdutoNaoDuravel extends Produto
{

	private String data_de_valid;
	private String genero;

	public ProdutoNaoDuravel( String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String data_de_valid
						, String genero ) throws IllegalArgumentException
	{
		super( nome, preco, marca, descricao, data_de_fabr );

		if ( data_de_valid != null && genero != null )
		{
			this.data_de_valid = data_de_valid;
			this.genero = genero;
		} else
		{
			throw new IllegalArgumentException( "Date or Gender can't be null!!!" );
		}
	}

	// Gets and Sets methods.
	public void setDataDeValid( String data_de_valid ) throws IllegalArgumentException
	{
		if ( data_de_valid != null )
		{
			this.data_de_valid = data_de_valid;
		} else 
		{
			throw new IllegalArgumentException( "Date can't be null!!" );
		}
	}

	public String getDataDeValid()
	{
		return data_de_valid;
	}

	public void setGenero( String genero ) throws IllegalArgumentException
	{
		if ( genero != null )
		{
			this.genero = genero;
		} else 
		{
			throw new IllegalArgumentException( "Gender can't be null!!" );
		}
	}

	public String getGenero()
	{
		return genero;
	}

}

