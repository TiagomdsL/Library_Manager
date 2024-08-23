package librarymanager.facade;

import java.util.List;

public interface ITransaction {
	
	public IMember getMember();
	
	public List<IBook> getBooks();
	
	public void processTransaction();
	
	public double finalPrice();
	
	@Override
	String toString();
}
