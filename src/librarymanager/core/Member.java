package librarymanager.core;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import librarymanager.facade.IBook;
import librarymanager.facade.IMember;

public class Member implements IMember {
	private int id;
	private String name;
	private Map<IBook, Integer> rentedBooks;
	private double balance;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
		this.rentedBooks = new HashMap<>();
		this.balance = 0.0;
	}

	@Override
	public int getMemberId() {
		return id;
	}

	@Override
	public String getMemberName() {
		return name;
	}

	@Override
	public List<IBook> getRentedBooks() {
		return new ArrayList<>(rentedBooks.keySet());
	}

	@Override
	public Boolean addBookToRented(IBook book, int days) {
		return rentedBooks.computeIfAbsent(book, b -> days) == days;
	}

	@Override
	public Boolean removeBookFromRented(IBook book) {
		if(rentedBooks.containsKey(book)) {
			rentedBooks.remove(book);
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append(id).append("\n").append(name).toString();
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void spend(double amount) {
		balance -= amount;
	}
}
