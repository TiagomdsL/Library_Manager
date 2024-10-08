package librarymanager.core;

import java.time.LocalDate;

import librarymanager.facade.IBook;

public class Book implements IBook {
	private String title;
	private String author;
	private String description;
	private LocalDate date;
	private double price;
	
	public Book(String title, String author, String description, String date, double price) {
		this.title = title;
		this.author = author;
		this.description = description;
		this.date = LocalDate.parse(date);
		this.price = price;
	}
	
	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getAuthor() {
		return author;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public LocalDate getDate() {
		return date;
	}

	@Override
	public double getPrice() {
		return price;
	}
	
	public boolean matches(String regex) {
		return title.matches(regex)|| author.matches(regex) || description.matches(regex);
	}
	
	@Override
	public boolean equals(Object obj) {
		 if (this == obj) return true;  
		 if (obj == null || getClass() != obj.getClass()) return false; 
		 Book book = (Book) obj; 
		 return title.equals(book.title) &&
		        author.equals(book.author) &&
		        description.equals(book.description) &&
		        date.equals(book.date) &&
		        price - book.price < 0.0001;
		
	}
	@Override
	public int hashCode() {
	    return java.util.Objects.hash(title, author, description, date, price);
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append(title).append("\nBy ").append(author).append("\n").append(price).append("€").toString();
		
	}
}
