package test;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import main.Book;
import main.Loan;
import main.Member;

public class ReturnTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
	 	Book book1 = new Book("001","isbnJava","《Java》");
        Book book2 = new Book("002","isbnHtml5","《HTML5》");
        Book book3 = new Book("003","isbnJava5","《java5》");
        Book book4 = new Book("003","isbnJava8","《java8》");
        
        Member member1 = new Member("user1","测试1");
          
        System.out.println(LocalDateTime.now()+"用户1借阅《Java》");
        if(member1.CanLoan(book1)){
        	member1.Loan(book1);
        }
        System.out.println(LocalDateTime.now()+"用户1借阅《HTML5》");
        if(member1.CanLoan(book2)){
        	member1.Loan(book2);
        }
        System.out.println(LocalDateTime.now()+"用户1借阅《java5》");
        if(member1.CanLoan(book3)){
        	member1.Loan(book3);
        }
        
        System.out.println(LocalDateTime.now()+"用户1归还《java》");
        member1.Return(book1);
        
        System.out.println("==============");
        System.out.println(LocalDateTime.now()+"用户1再次借阅《Java》");
        if(member1.CanLoan(book1)){
        	member1.Loan(book1);
        }
	}
	
	

}
