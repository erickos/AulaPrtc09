import java.util.ArrayList;

public class Deposito
{
	private ArrayList< Produto > produtos;

	/** 
	 * Default Construtor. Initialize the ArrayList of Products.
	 */
	public Deposito()
	{
		produtos = new ArrayList< Produto >();
	}

	/**
	 * Add a 'Produto' item on database.
	 *
	 * @param theProduto Item to be added on database.
	 */
	public void addProduto( Produto theProduto )
	{
		produtos.add( theProduto );
	}

	/**
	 * Remove a 'Produto' item with name equal the parameter.
	 *
	 * @param nome The name of the product to be removed.
	 */
	public void removerProduto( String nome )
	{
		for ( Produto current : produtos )
		{
			if ( current.getNome().equals( nome ) )
			{
				produtos.remove( current );

				// Leaves the for.
				break;
			}
		}
	}
	
	/**
	 * Informs the quantity of registered products on Database.
	 *
	 * @return The size of Products ArrayList.
	 */
	public int getQtdProdutos()
	{
		System.out.println( "Has " + produtos.size() + " on Database." );
		return produtos.size();
	}

	/**
	 * Informs if the Database are empty.
	 *
	 * @return true if the database is empty, false in otherwise.
	 */
	public boolean is_Empty()
	{
		if ( produtos.isEmpty() )
		{
			System.out.println( "The Database is empty!" );
		} else 
		{
			System.out.println( "The Database are not empty!" );
			getQtdProdutos();
		}
		return produtos.isEmpty();
	}

	/**
	 * Informs the Product with more price value on Database.
	 *
	 * @return Product object to a item with the larger price.
	 */
	public Produto mostValuable()
	{
		Produto most = new Produto( "default", 0.0, "default", "default", "default" );

		for ( Produto current : produtos )
		{
			if ( current.getPreco() > most.getPreco() )
			{
				most = current;
			}
		}

		return most;
	}

}
