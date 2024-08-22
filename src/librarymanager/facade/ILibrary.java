package librarymanager.facade;

import java.util.Collection;


public interface ILibrary {

	int getNumberOfBooks();
	
	boolean addBook(IBook book);
	
	boolean deleteBook(IBook book);

	public Collection<IBook> getBooks ();
	
	public Collection<IBook> getMatches(String regexp);
	
 	 @Override
	String toString();
}
