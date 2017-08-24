import java.lang.IllegalArgumentException;

/**
 * Implements ProdutoDuravel as a Produto subclass.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class ProdutoDuravel extends Produto
{
	private String material_pred;
	private int durabilidade;

	/**
	 * Default constructor.
	 *
	 * @param nome Name of the product.
	 * @param preco Price of the product.
	 * @param marca Brand of the product.
	 * @param data_de_fabr Manufacture date of the product.
	 * @param material_pred Predominant material of the durable product.
	 * @param durabilidade Durability, in years, of the durable product.
	 */ 
	public ProdutoDuravel( String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String material_pred
						, int    durabilidade      ) throws IllegalArgumentException
	{
		super( nome, preco, marca, descricao, data_de_fabr );

		if ( material_pred != null && durabilidade > 0 )
		{
			this.material_pred = material_pred;
			this.durabilidade = durabilidade;
		} else
		{
			throw new IllegalArgumentException( "Predominant material can't be null or durability can't be negative or zero!!" );
		}
	}

	// Gets and Sets methods.
	public void setMaterialPred( String material_pred ) throws IllegalArgumentException
	{
		if ( material_pred != null )
		{
			this.material_pred = material_pred;
		} else 
		{
			throw new IllegalArgumentException( "Predominant material isn't null!!'" );
		}
	}

	public String getMaterialPred()
	{
		return material_pred;
	}

	public void setDurabilidade( int durabilidade ) throws IllegalArgumentException
	{
		if ( durabilidade > 0 )
		{
			this.durabilidade = durabilidade;
		} else 
		{
			throw new IllegalArgumentException( "Durability can't negative!!!" );
		}
	}

	public int getDurabilidade()
	{
		return durabilidade;
	}

}
