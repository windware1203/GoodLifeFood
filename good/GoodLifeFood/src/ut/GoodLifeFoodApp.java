package ut;
public class GoodLifeFoodApp {
    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to GoodLifeFood Application.");
        System.out.println();
		ShoppingCart cart = new ShoppingCart();
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            String productCode = Console.getString(
                    "Enter product code: ");
            int quantity = Console.getInt(
                    "Enter quantity:     ", 0, 1000);

            // get the Product object
            Product product = ProductDB.getProduct(productCode);

            GoodLifeFood GoodLifeFood = new GoodLifeFood(product, quantity);

            // display the output
            System.out.println();
            System.out.println("GoodLife Food");
            System.out.println("Code:        " + product.getCode());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price:       " + product.getPriceFormatted());
            System.out.println("Quantity:    " + GoodLifeFood.getQuantity());
            System.out.println("Total:       "
                    + GoodLifeFood.getTotalFormatted() + "\n");
			String code = product.getCode();
			int price = product.getPrice();
			cart.addProduct(code,price);
            choice = Console.getString("Continue? (y/n): ");
			if(!cart.check())
			{
				System.out.println("Your total is less than NTD400. Please buy more products.");
				choice = "y";
			}
            System.out.println();
        }cart.checkOut();
    }
}