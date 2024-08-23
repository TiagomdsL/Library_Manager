package librarymanager.facade;

import java.time.LocalDate;

public interface IBook {
	
	public String getTitle();
	
	public String getAuthor();
	
	public String getDescription();
	
	public LocalDate getDate();
	
	public double getPrice();
	
	public boolean matches(String regex);
	
	 @Override
	String toString();
}
