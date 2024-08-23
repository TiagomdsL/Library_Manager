package librarymanager.facade;

import java.util.List;
 

public interface IMember {
	
	public int getMemberId();
	
	public String getMemberName();
	
	public List<IBook> getRentedBooks();
	
	public Boolean addBookToRented(IBook book, int days);
	
	public Boolean removeBookFromRented(IBook book);
	
	public double getBalance();
	
	public void deposit(double amount);
	
	public void spend(double amount); 
	
	@Override
	String toString();
}
