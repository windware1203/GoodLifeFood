package ut;
/**
 * ShoppingCart
 * used to compute delivery
 */
import java.util.*;
public class ShoppingCart
{
	ArrayList<String> productList = new ArrayList<String>();;
	private int totalBefore; //source value
	private int delivery;
	private int totalAfter; //value after add delivery
	
	public boolean check()
	{
		if(totalBefore > 400)return true;
		else return false;
	}
	public void shoppingCart()
	{
		this.totalAfter = 0;
		this.totalBefore = 0;
	}
	public void addProduct(String productCode,int price)
	{
		productList.add(productCode);
		totalBefore += price;
	}
	public void checkOut()
	{
		if(totalBefore < 1200)
			delivery = 200;
		else if(totalBefore >= 1200)
			delivery = 0;
		for(int i = 0; i < productList.size() ;i++)
		{
			productList.get(i);
			System.out.println();
		}
		totalAfter = totalBefore + delivery;
		System.out.println("Delivery:	"+delivery);
		System.out.println("Total:	"+totalAfter);
	}
	
}