import java.lang.IllegalArgumentException;

public class Refrigerante extends ProdutoNaoDuravel
{

	private int qtd_litros; // Em ml.
	private String tipo;    // Diet, light, normal.

	private static int min_qtd_litros = 150;

	public Refrigerante( String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String data_de_valid
						, String genero
						, int    qtd_litros
						, String tipo         ) throws IllegalArgumentException
	{
		super( nome, preco, marca, descricao, data_de_fabr, data_de_valid, genero );

		if ( qtd_litros >= min_qtd_litros && tipo != null )
		{
			this.qtd_litros = qtd_litros;
			this.tipo = tipo;
		} else 
		{
			throw new IllegalArgumentException( "Quantity of liters can't be smaller than the minimum default value ("+ min_qtd_litros +" ml) or Type can't be null" );
		}
	}


	// Gets and Sets methods.
	public void setQtdLitros( int qtd_litros ) throws IllegalArgumentException
	{
		if ( qtd_litros >= min_qtd_litros )
		{
			this.qtd_litros = qtd_litros;
		} else 
		{
			throw new IllegalArgumentException( "Quantity of liters can't be smaller than the minimum default value ("+ min_qtd_litros +" ml)!!");
		}
	}

	public int getQtdLitros()
	{
		return qtd_litros;
	}

	public void setTipo( String tipo ) throws IllegalArgumentException
	{
		if ( tipo != null )
		{
			this.tipo = tipo;
		} else 
		{
			throw new IllegalArgumentException( "Soda Type can't be null!!");
		}
	}

	public String getTipo()
	{
		return tipo;
	}
}