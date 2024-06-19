package com.rps.milestone.shoppingcart;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerService {

	private Queue<String> serviceRequest;

	public CustomerService() {
		this.serviceRequest=new LinkedList<>();
	}
	
	public void addRequest(String request) {
		serviceRequest.add(request);
	}
	
	public String processNextRequest() {
		return serviceRequest.poll();
	}
	
	public void viewPendingRequests() {
		System.out.println("Pending Service Requests: ");
		int count=0;
		for (String request : serviceRequest) {
			count++;
			System.out.println("_ "+request);
		}
		if (count==0) {
			System.out.println("No Pending Requests Are Available");
		}
		
	}
	
}
