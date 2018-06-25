package main;

import java.util.Date;

public class Loan {

	private String Id;
	
	private Date LoanDate;
	
	private Date DateForReturn;
	
	private Date ReturnDate;
	
	private Book book;
	
	private Member member;
	
	public boolean HasNotBeenReturn(){
		return ReturnDate==null;
	}
	
	public void MaskAsReturn(){
		Date now=new Date();
		ReturnDate=now;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Date getLoanDate() {
		return LoanDate;
	}

	public void setLoanDate(Date loanDate) {
		LoanDate = loanDate;
	}

	public Date getDateForReturn() {
		return DateForReturn;
	}

	public void setDateForReturn(Date dateForReturn) {
		DateForReturn = dateForReturn;
	}

	public Date getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(Date returnDate) {
		ReturnDate = returnDate;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
}
