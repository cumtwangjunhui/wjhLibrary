package main;

import java.util.List;

public class Loanjudgment implements ISpecification {
	
	Book wantBook;
	
	public Loanjudgment(Book book){
		this.wantBook=book;
	}

	@Override
	public boolean IsSatisfy(Member member) {
		List<Loan> loan=member.getLoans();
		
		if(loan!=null){
			for(Loan loan1:loan){
				if(wantBook==loan1.getBook()){
					System.out.println("您已经借阅了此书，无法再次借阅！");
					return false;
				}
			}
		}
		System.out.println("借书成功！");
		return true;
	}

}
