import java.lang.IllegalArgumentException;

public class Celular extends ProdutoDuravel
{

	private double tamanho_tela;
	private int armazenamento; // Em MB.

	private static double min_tamanho_tela = 2.0;
	private static int min_armazenamento = 8;

	public Celular(  String nome
				,  double preco
				,  String marca
				,  String descricao
				,  String data_de_fabr
				,  String material_pred
				,  int    durabilidade
				,  double tamanho_tela
				,  int    armazenamento ) throws IllegalArgumentException
	{
		super( nome, preco, marca, descricao, data_de_fabr, material_pred, durabilidade );
		if ( tamanho_tela >= min_tamanho_tela && armazenamento > min_armazenamento )
		{
			this.tamanho_tela = tamanho_tela;
			this.armazenamento = armazenamento;
		} else 
		{
			throw new IllegalArgumentException( "Screen size can't be smaller than the default (" + min_tamanho_tela + "\") or Storage size can't be smaller than the default (" + min_armazenamento + "MB)!!!" );
		}

	}

	// Gets and Sets methods.
	public void setTamanhoTela( double tamanho_tela ) throws IllegalArgumentException
	{
		if ( tamanho_tela >= min_tamanho_tela )
		{
			this.tamanho_tela = tamanho_tela;
		} else 
		{
			throw new IllegalArgumentException( "Screen size can't be smaller than the default ("+ min_tamanho_tela +"\")!!" );
		}
	}

	public double getTamanhoTela()
	{
		return tamanho_tela;
	}

	public void setArmazenamento( int armazenamento ) throws IllegalArgumentException
	{
		if ( armazenamento >= min_armazenamento )
		{
			this.armazenamento = armazenamento;
		} else 
		{
			throw new IllegalArgumentException( "Storage size can't be ("+ min_armazenamento +" MB)!!" );
		}
	}

	public int getArmazenamento()
	{
		return armazenamento;
	}

}