package ut;
public class ProductDB {

    public static Product getProduct(String productCode) {
        
        Product product = new Product();

        product.setCode(productCode);
        if (productCode.equalsIgnoreCase("Apple")) 
		{
            product.setDescription("fruit");
            product.setPrice(27);
		}
		else if (productCode.equalsIgnoreCase("kiwi")) 
		{
			product.setDescription("fruit");
            product.setPrice(38);
		}
		else if (productCode.equalsIgnoreCase("Mango")) 
		{
            product.setDescription("fruit");
            product.setPrice(49);
		}	
		else if (productCode.equalsIgnoreCase("Carrot")) 
		{
            product.setDescription("vegetables");
            product.setPrice(61);
		}
		else if (productCode.equalsIgnoreCase("Celery")) 
		{
            product.setDescription("vegetables");
            product.setPrice(54);
        }
		else if (productCode.equalsIgnoreCase("Chocolate cakes")) 
		{
            product.setDescription("Sweet cakes");
            product.setPrice(152);
        }
		else if (productCode.equalsIgnoreCase("Orange cakes")) 
		{
            product.setDescription("Sour and Sweet cakes");
            product.setPrice(112);
        }
		else 
		{
            product.setDescription("Unknown");
        }
        return product;
    }
}