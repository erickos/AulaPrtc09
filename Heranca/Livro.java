import java.lang.IllegalArgumentException;

public class Livro extends ProdutoDuravel
{

	private String autor;
	private int numero_de_pag;
	private String edicao;

	private static int min_num_pages = 10; // Default

	public Livro(  String nome
				,  double preco
				,  String marca
				,  String descricao
				,  String data_de_fabr
				,  String material_pred
				,  int    durabilidade
				,  String autor
				,  int    numero_de_pag
				,  String edicao        ) throws IllegalArgumentException
	{
		super( nome, preco, marca, descricao, data_de_fabr, material_pred, durabilidade );
		
		if (   autor != null 
			&& numero_de_pag > min_num_pages 
			&& edicao != null )
		{
			this.autor = autor;
			this.numero_de_pag = numero_de_pag;
			this.edicao = edicao;
		} else 
		{
			throw new IllegalArgumentException( "Author can't be null, Number of pages can't be smaller than the default value or edition can't be null!!" );
		}
	}

	public void setAutor( String autor ) throws IllegalArgumentException
	{
		if ( autor != null )
		{
			this.autor = autor;
		} else 
		{
			throw new IllegalArgumentException( "Author can't be null!!" );
		}
	}

	public String getAutor()
	{
		return autor;
	}

	public void setNumeroDePag( int numero_de_pag ) throws IllegalArgumentException
	{
		if ( numero_de_pag > min_num_pages )
		{
			this.numero_de_pag = numero_de_pag;
		} else 
		{
			throw new IllegalArgumentException( "Number of pages can't be smaller than the default value!!" );
		}
	}

	public int getNumeroDePag()
	{
		return numero_de_pag;
	}

	public void setEdicao( String edicao ) throws IllegalArgumentException
	{
		if ( edicao != null )
		{
			this.edicao = edicao;
		} else 
		{
			throw new IllegalArgumentException( "Edition can't be null!!" );
		}
	}

	public String getEdicao()
	{
		return edicao;
	}

}