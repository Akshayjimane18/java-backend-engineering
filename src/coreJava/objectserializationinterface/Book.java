package coreJava.objectserializationinterface;

import java.io.Serializable;

public class Book implements Serializable {
	private int  bookid;
	private String bookname;
	private int bookprize;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int i) {
		this.bookid = i;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getBookprize() {
		return bookprize;
	}
	public void setBookprize(int i) {
		this.bookprize = i;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname
				+ ", bookprize=" + bookprize + "]";
	}
	
	
	
	

}
