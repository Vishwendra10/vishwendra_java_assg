package com.training.ehandlingassg01;
import java.util.Collection;

import com.training.exceptions.NegativeMarksException;
/**
 * @author vishwendra.singh
 */
import com.training.exceptions.ResultException;

public class DriverClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try 
		{
			StudentResult sr1= new StudentResult(-1);
			Student s1= new Student(01, "abc", "Pune", sr1);
			s1.checkResult();
			System.out.println(s1);
		}
		catch(NegativeMarksException ne)
			{
				System.out.println("Negative marks exception---");
				System.out.println("Exception :  "+ ne);
			}
		catch(ResultException re)
			{
			System.out.println("Failed result exception----");
			System.out.println("Exception :  "+ re);
			}
		

	}

}
