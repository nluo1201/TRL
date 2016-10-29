package src;

public class Book {
	private String Name;
	private String ISBN;
	private String Author;
	private int Quantity;
	
	Book(String name, String isbn, String author, int quantity){
		this.Name = name;
		this.ISBN = isbn;
		this.Author = author;
		this.Quantity = quantity;
	}
	public String getName(){
		return this.Name;
	}
	public String getISBN(){
		return this.ISBN;
	}
	public String getAuthor(){
		return this.Author;
	}
	public int getQuantity(){
		return this.Quantity;
	}
	public boolean setQuantity(int newq){
		this.Quantity = newq;
		return true;
	}
	
	public String toString(){
		String binfo = "";
		binfo += this.ISBN + " | ";
		binfo += this.Name + " | ";
		binfo += this.Author + " | ";
		binfo += this.Quantity + System.lineSeparator();
		return binfo;
	}
	
}
