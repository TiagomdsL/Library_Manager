package librarymanager.core;

import java.util.Collection;
import java.util.ArrayList;

import librarymanager.facade.IBook;
import librarymanager.facade.ILibrary;

public class Library implements ILibrary {

	private Collection<IBook> library;
	
	public Library() {
		this.library = new ArrayList<>();
	}
	
	@Override
	public int getNumberOfBooks() {
		return library.size();
	}

	@Override
	public boolean addBook(IBook book) {
		if(!library.contains(book)) {
			library.add(book);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteBook(IBook book) {
		if(library.contains(book)) {
			library.remove(book);
			return true;
		}
		return false;
	}

	@Override
	public Collection<IBook> getBooks() {
		return library;
	}

	@Override
	public Collection<IBook> getMatches(String regexp) {
		Collection<IBook> res = new ArrayList<>();
		for(IBook b: library) {
			if(b.matches(regexp))
				res.add(b);
		}
		return res;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(IBook b: library) {
			sb.append(b);
			sb.append("\n");
		}
		return sb.toString();	
	}
}
