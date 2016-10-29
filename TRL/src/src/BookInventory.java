package src;

import java.util.HashMap;
import java.util.Map;

public class BookInventory {
	private static Map<String, Book> bookInventory = new HashMap<String, Book>();
	private static Map<String, BookCopy> bookCopyInventory = new HashMap<String, BookCopy>();
	
	BookInventory(){
			for(int i = 0; i<10; i++){
				String isbn = "isbn" + i;
				Book b = new Book("name" + i, isbn, "author" + i, 5);
				bookInventory.put(isbn, b);
				for(int j = 0; j<5; j++){
					String barcode = isbn + "barcode" + j;
					BookCopy c = new BookCopy(b, barcode, "present");
					bookCopyInventory.put(barcode, c);
				}
			}
	}
	public Map<String, Book> getBookInventory(){
		return bookInventory;
	}
	public Map<String, BookCopy> getBookCopyInventory(){
		return bookCopyInventory;
	}
	public Book getBook(String isbn){
		Book b = bookInventory.get(isbn);
		return b;
	}
	
	public boolean addBook(Book b){
		String key = b.getISBN();
		bookInventory.put(key, b);
		return true;
	}
	
	public boolean removeBook(String isbn){
		bookInventory.remove(isbn);
		return true;
	}
	
	public boolean changeBookQuantity(String isbn, int newq){
		Book b = bookInventory.get(isbn);
		b.setQuantity(newq);
		bookInventory.replace(isbn, b);
		return true;
	}
	
	public BookCopy getBookCopy(String barcode){
		BookCopy c = bookCopyInventory.get(barcode);
		return c;
	}
	
	
	public boolean addBookCopy(BookCopy c){
		String key = c.getBarcode();
		bookCopyInventory.put(key, c);
		return true;
	}
	
	public boolean removeBookCopy(String barcode){
		bookCopyInventory.remove(barcode);
		return true;
	}
	
	public boolean changeCopyStatus(String barcode, String news){
		BookCopy c = bookCopyInventory.get(barcode);
		c.setStatus(news);
		bookCopyInventory.replace(barcode, c);
		return true;
	}
	
	public void printAllCopyInfo(){
		String str = "Barcode | Status " + System.lineSeparator();
		for (Map.Entry<String, BookCopy> entry : bookCopyInventory.entrySet()){
			BookCopy c = entry.getValue();
			str += c.toString(); 
		}
		System.out.println(str);
		
		
	}
	
	public void printAllBookInfo(){
		String str = "ISBN | Name | Author | Quantity " + System.lineSeparator();
		for (Map.Entry<String, Book> entry : bookInventory.entrySet()){
			Book b = entry.getValue();
			str += b.toString();
		}
		System.out.println(str);
	}
}
	

