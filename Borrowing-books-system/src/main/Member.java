package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member {

	private String Id;
	
	private String Name;
	
	private List<Loan> Loans= new ArrayList();
	
	
	
	public Member(String id, String name) {
		Id = id;
		Name = name;
	}

	public void Return(Book book){
		book.setLoanTo(null);
		for(Loan loan1:Loans){
			if(loan1.getBook()==book){
				loan1.MaskAsReturn();
				Loans.remove(loan1);
				System.out.println("还书成功");
				break;
			}
		}
	}
	
	public boolean CanLoan(Book book){
		if(book.getLoanTo()!=null){
			System.out.println("该书已借出，借书失败！");
			return false;
		}else{
			MaxBook maxBook=new MaxBook();
			if( !maxBook.IsSatisfy(this)){
				return false;
			}
			Loanjudgment loanjudgment=new Loanjudgment(book);
			return loanjudgment.IsSatisfy(this);
		}
	}
	
	public Loan Loan(Book book){
				Loan loan= LoanFactory.CreatLoan(book, this);
				Loans.add(loan);
			return loan;
	}
	
	public Loan FindCurrentLoanFor(Book book){
		 System.out.println("您所借的书id:"+book.getId()+"-ISBN:"+book.getISBN()+"-Titil:"+book.getTitle());
		 return null;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Loan> getLoans() {
		return Loans;
	}

	public void setLoans(List<Loan> loans) {
		Loans = loans;
	}

	
}
