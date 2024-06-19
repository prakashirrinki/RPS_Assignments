package com.rps.milestone.lms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

	private List<Book> books;

	public Library() {
		books = new ArrayList<>();
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void addBooks(Book book) {
		books.add(book);
		Collections.sort(books);
	}

	public void removeBooks(Book book) {
		books.remove(book);
	}

	public int linearSearch(String title) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getTitle().equalsIgnoreCase(title)) {
				return i;
			}
		}
		return -1;
	}

	public int binarySearch(String title) {
		int left = 0;
		int rigth = books.size() - 1;
		while (left <= rigth) {
			int mid = left + (rigth - left) / 2;
			int comparison = books.get(mid).getTitle().compareTo(title);
			if (comparison == 0) {
				return mid;
			} else if (comparison < 0) {
				left = mid + 1;
			} else {
				rigth = mid - 1;
			}
		}
		return -1;
	}

	public void displayBooks() {
		for (Book book : books) {
			System.out.println(book);
		}
	}

}
