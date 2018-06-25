package main;

import java.util.List;

public class MaxBook implements ISpecification {

	@Override
	public boolean IsSatisfy(Member member) {
		
		List<Loan> loan=member.getLoans();
		int number=0;
		
		if(loan!=null){
			for(Loan loan1:loan){
				number=number+1;
			}
		} 
		if(number<3){
			return true;
		}
		System.out.println("您借书已达3本，无法再借阅！");
		return false;
	}

}
