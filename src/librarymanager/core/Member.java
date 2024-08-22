package librarymanager.core;

import java.util.List;
import java.util.ArrayList;

import librarymanager.facade.IBook;
import librarymanager.facade.IMember;

public class Member implements IMember {
	private int id;
	private String name;
	private List<IBook> rentedBooks;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
		this.rentedBooks = new ArrayList<>();
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
		return rentedBooks;
	}

	@Override
	public Boolean addBookToRented(IBook book) {
		if(!rentedBooks.contains(book)) {
			rentedBooks.add(book);
			return true;
		}
		return false;
	}

	@Override
	public Boolean removeBookFromRented(IBook book) {
		if(rentedBooks.contains(book)) {
			rentedBooks.remove(book);
			return true;
		}
		return false;
	}

}
