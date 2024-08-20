package librarymanager.facade;

import java.util.List;

public interface IMember {
	
	public int getMemberId();
	
	public String getMemberName();
	
	public List<IBook> getRentedBooks();
	
	public Boolean addBookToRented();
	
	public Boolean removeBookFromRented();
}
