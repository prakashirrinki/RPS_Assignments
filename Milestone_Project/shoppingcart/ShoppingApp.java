package com.rps.milestone.shoppingcart;

public class ShoppingApp {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		PurchaseHistory history=new PurchaseHistory();
		CustomerService service=new CustomerService();
		
		cart.addItem("Rice Bag");
		cart.addItem("Shampoo");
		cart.addItem("Drinks");
		cart.addItem("Soaps");
		cart.viewCart();
		cart.addItem("Mobile");
		cart.removeItem("Rice Bag");
		cart.viewCart();
		
		history.saveCart(cart);
		
		history.viewPurchaseHistory();
		
		service.addRequest("Shampoo");
		service.addRequest("Mobile");
		service.viewPendingRequests();
		
		String processedRequest=service.processNextRequest();
		System.out.println("Processed request: "+processedRequest);
		String processedRequest1=service.processNextRequest();
		System.out.println("Processed request: "+processedRequest1);
		service.viewPendingRequests();
	}

}
