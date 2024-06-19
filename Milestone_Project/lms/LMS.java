package com.rps.milestone.lms;

public class LMS {

	public static void main(String[] args) {
		Library lib = new Library();

		lib.addBooks(new Book("BookOfRoots", "Prakash", "ISBN1"));
		lib.addBooks(new Book("BookOfTraffic", "Teja", "ISBN2"));
		lib.addBooks(new Book("BookOfTrees", "Pavan", "ISBN3"));
		lib.addBooks(new Book("BookOfStudio", "Manohar", "ISBN4"));
		lib.addBooks(new Book("BookOfDeath", "Feroz", "ISBN5"));

		System.out.println("All books in th library");
		lib.displayBooks();
		System.out.println();

		String title = "BookOfDeath";
		//Linear Search
		long startTime = System.nanoTime();
		int lsIndex = lib.linearSearch(title);
        long endTime = System.nanoTime();
        long lsTime = endTime - startTime;
        System.out.println(lsTime);
		
		if (lsIndex != -1) {
			System.out.println("Book found using linear search: " + lib.getBooks().get(lsIndex));
		} else {
			System.out.println("Book not found using linear search");
		}
		
		//Binary Search
		startTime = System.nanoTime();
		int bsIndex = lib.binarySearch(title);
		endTime = System.nanoTime();
		long bsTime = endTime - startTime;
		System.out.println(bsTime);
		
		if (bsIndex != -1) {
			System.out.println("Book found using binary search: " + lib.getBooks().get(bsIndex));
		} else {
			System.out.println("Book not found using binary search");
		}
		
		//Compare Search Performance
		
		if(lsTime==bsTime) {
			System.out.println("Both having same performance..");
		}
		else if (lsTime < bsTime) {
			System.out.println("Linear search has better performance than the binary search");
		}
		else {
			System.out.println("Binary search has better performance than the linear search..");
		}
		

	}

}
