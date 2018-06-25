package main;

public class Book {

	private String Id;
	
	private String ISBN;
	
	private String Title;
	
	private Member LoanTo;

	public final String getId() {
		return Id;
	}

	public final void setId(String id) {
		Id = id;
	}

	public final String getISBN() {
		return ISBN;
	}

	public final void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public final String getTitle() {
		return Title;
	}

	public final void setTitle(String title) {
		Title = title;
	}

	public Member getLoanTo() {
		return LoanTo;
	}

	public void setLoanTo(Member loanTo) {
		LoanTo = loanTo;
	}

	public Book(String id, String iSBN, String title) {
		Id = id;
		ISBN = iSBN;
		Title = title;
	}
	
	
	
}
