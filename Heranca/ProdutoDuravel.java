import java.lang.IllegalArgumentException;

public class ProdutoDuravel extends Produto
{
	private String material_pred;
	private int durabilidade;

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
