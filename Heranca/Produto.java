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
		if ( preco > 0 || !nome.equals(null) || !marca.equals(null)
			|| descricao.equals(null) || data_de_fabr.equals(null) )
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

	public void setNome( String nome )
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return nome;
	}

	public void setPreco( double preco )
	{
		this.preco = preco;
	}

	public double getPreco()
	{
		return preco;
	}

	public void setMarca( String marca )
	{
		this.marca = marca;
	}

	public String getMarca()
	{
		return marca;
	}

	public void setDescricao( String descricao )
	{
		this.descricao = descricao;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDataDeFabr( String data_de_fabr )
	{
		this.data_de_fabr = data_de_fabr;
	}

	public String getDataDeFabr()
	{
		return data_de_fabr;
	}

}
