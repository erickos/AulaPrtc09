import java.lang.IllegalArgumentException;

public class Pizza extends ProdutoNaoDuravel
{

	private String tamanho;
	private String recheio;

	public Pizza( String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String data_de_valid
						, String genero
						, String tamanho
						, String recheio ) throws IllegalArgumentException
	{

		super( nome, preco, marca, descricao, data_de_fabr, data_de_valid, genero );

		if ( tamanho != null && recheio != null )
		{
			this.tamanho = tamanho;
			this.recheio = recheio;
		} else 
		{
			throw new IllegalArgumentException( "Pizza's size and stuffing can't be null!!" );
		}

	}

	// Gets and Sets methods.
	public void setTamanho( String tamanho ) throws IllegalArgumentException
	{
		if ( tamanho != null )
		{
			this.tamanho = tamanho;
		} else 
		{
			throw new IllegalArgumentException( "Pizza's size can't be null!!");
		}
	}

	public String getTamanho()
	{
		return tamanho;
	}

	public void setRecheio( String recheio ) throws IllegalArgumentException
	{
		if ( recheio != null )
		{
			this.recheio = recheio;
		} else 
		{
			throw new IllegalArgumentException( "Pizza's stuffing can't be null!!");
		}
	}

	public String getRecheio()
	{
		return recheio;
	}

}