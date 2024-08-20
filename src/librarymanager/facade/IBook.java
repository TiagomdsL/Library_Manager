package librarymanager.facade;

import java.time.LocalDateTime;

public interface IBook {
	
	public String getTitle();
	
	public String getAuthor();
	
	public String getDescription();
	
	public LocalDateTime getDate();
	
	public Float getPrice();
}
