import java.lang.IllegalArgumentException;

public class Produto
{
	private String nome;
	private double preco;
	private String marca;
	private String descricao;
	private String data_de_fabr;


	public Produto ( String nome, double preco, String marca, String descricao, String data_de_fabr ) throws IllegalArgumentException
	{
		if ( preco >= 0.0 && nome != null && marca != null
			&& descricao != null && data_de_fabr != null )
		{
			this.nome = nome;
			this.preco = preco;
			this.marca = marca;
			this.descricao = descricao;
			this.data_de_fabr = data_de_fabr;
		} else 
		{
			throw new IllegalArgumentException( "Text arguments can't be null or Price can't be negative!!!" );
		}
	}

	// Gets and Sets methods.
	public void setNome( String nome ) throws IllegalArgumentException
	{
		if ( nome != null )
		{
			this.nome = nome;
		} else
		{
			throw new IllegalArgumentException( "Name can't be null!!" );
		}
	}

	public String getNome()
	{
		return nome;
	}

	public void setPreco( double preco ) throws IllegalArgumentException
	{
		if ( preco >= 0.0 )
		{
			this.preco = preco;
		} else 
		{
			throw new IllegalArgumentException( "Price can't be negative!!" );
		}
	}

	public double getPreco()
	{
		return preco;
	}

	public void setMarca( String marca ) throws IllegalArgumentException
	{
		if ( marca != null )
		{
			this.marca = marca;
		} else 
		{
			throw new IllegalArgumentException( "Brand can't be null!!" );
		}
	}

	public String getMarca()
	{
		return marca;
	}

	public void setDescricao( String descricao ) throws IllegalArgumentException
	{
		if ( descricao != null )
		{
			this.descricao = descricao;
		} else 
		{
			throw new IllegalArgumentException( "Description can't be null!!" );
		}
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDataDeFabr( String data_de_fabr ) throws IllegalArgumentException
	{
		if ( data_de_fabr != null )
		{
			this.data_de_fabr = data_de_fabr;
		} else 
		{
			throw new IllegalArgumentException( "Fabrication date can't be null!!" );
		}
	}

	public String getDataDeFabr()
	{
		return data_de_fabr;
	}


	public void print()
	{
		System.out.println( "Name   	  : " + getNome()
				  + "\nPrice  	  : R$ " + getPreco()
				  + "\nBrand        : " + getMarca()
				  + "\nDescription  : " + getDescricao() 
				  + "\nManufacture Day : "+ getDataDeFabr() );
	}

}
