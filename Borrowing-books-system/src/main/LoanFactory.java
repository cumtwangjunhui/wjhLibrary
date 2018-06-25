package main;

import java.util.Calendar;
import java.util.Date;

public class LoanFactory {

	public static Loan CreatLoan(Book book,Member member){
		Loan loan= new Loan();
		loan.setBook(book);
		loan.getBook().setLoanTo(member);
		loan.setMember(member);
		Date now=new Date();
		loan.setLoanDate(now);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 10);
		Date dateForReturn=c.getTime();
		loan.setDateForReturn(dateForReturn);
		return loan;
	}
}
