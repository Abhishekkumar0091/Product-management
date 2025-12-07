import java.util.ArrayList;

public class ProductDao 
{
	//By using collation
	
	ArrayList<Product> products=new ArrayList<Product>();
	
    public void addProduct(Product p)
    //this is method to add product.
    {
    	products.add(p);
    	System.out.println("\nProduct has been added successfully\n");
    }
    
	public void showProducts()
	//this is method to show product.
	{
		if(products.isEmpty())
			System.out.println("\nProduct cart is empty");
		else
			for(Product p:products)
			{
				System.out.println(p);
			}
		System.out.println();
	}
	public void deleteProducts()
	{
		if(products.isEmpty())
			System.out.println("\nProduct cart is empty");
		else
		{
			products.clear();
			System.out.println("\nAll product has been deleted");
		}
		System.out.println();
	}

	
}
