package src;

public class BookCopy {
	private Book book;
	private String barcode;
	private String status;
	
	BookCopy(Book book, String barcode, String status){
		this.book = book;
		this.barcode = barcode;
		this.status = status;
		
	}
	
	public Book getBook(){
		return this.book;
	}
	public String getStatus(){
		return this.status;
	}
	public boolean setStatus(String newstt){
		this.status = newstt;
		return true;
	}
	public String getBarcode(){
		return this.barcode;
	}
	
	public String toString(){
		String str = "";
		str += this.barcode + " | ";
		str += this.status + " " + System.lineSeparator();
		return str;
	}
}
