
/*
COMPUTING TAX PROGRAM 
FILING CASE SWITCH
*/

package ch3_project;

import java.util.Scanner;

public class ComputingTax {

	  public static void main(String[] args)
	  {
		//SCANNER INPUT   
		Scanner input = new Scanner(System.in); 
		
		//PROMPTS USER TO ENTER 0-3 FOR SPECIFIC TAX FILINGS 
		System.out.println("(Single Filer: 0, Married Jointly: 1 or " + 
		"Qualified Widow_er, Married Separately: 2, "
		+ "Head of House Hold: 3) Please Enter Filing Status: ");
		
		//DECALRES NEW INTEGER 
		int status = input.nextInt(); 
		
		//PROMPTS USER TO ENTER TAX INCOME 
		System.out.println("Enter the taxable income: ");
		
		//DECLARES NEW DOUBLE DATA TYPE FOR INCOME
		double income = input.nextDouble(); 
		
		//TAX: 0 FOR DOUBLE DATA TYPE
		double tax = 0; 

		//SWITCH STATEMENT TO COMPUTE PERSONAL INCOME TAX: 
	
		//SINGLE FILERS: 
		if (status == 0)
		{
			if (income <= 8350)
				tax = income * 0.10; 
			
			else if (income <= 33950)
				tax = 8350 * .10 + (income - 8350) * .15; 
			
			else if (income <= 82250)
				tax = 8350 * .10 + (33950 - 8350) * .15 + 
				(income - 33950) * .25; 
			
			else if (income <= 171550)
				tax = 8350 * .10 + (33950 - 8350) * .15 + 
				(82250 - 33950) * .25 + (income -82250) * .28;
			
			else if (income <= 372590)
				tax = 8350 * .10 + (33950 - 8350) * .15 + 
				(82250 - 33950) * .25 + (171550 - 82250) * .28 + 
				(income - 171550) * .33; 
			
			else 
				tax = 8350 * .10 + (33950 - 8350) * .15 + 
				(82250 - 33950) * .25 + (171550 - 82250) * .28 + 
				(372950 - 171550) * .33 + (income - 372950) * .35; 
			
		}
		//MARRIED FILING JOINTLY OR QUALIFIED WIDOW
		if (status == 1)
		{
			if (income <= 16700)
				tax = income * 0.10; 
			
			else if (income <= 67900)
				tax = 16700 * .10 + (income - 16700) * .15; 
			
			else if (income <= 137051)
				tax = 16700 * .10 + (67900 - 16700) * .15 + 
				(income - 67900) * .25; 
			
			else if (income <= 208851)
				tax = 16700 * .10 + (67900 - 16700) * .15 + 
				(137050 - 67900) * .25 + (income - 137050) * .28;
			
			else if (income <= 372951)
				tax = 16700 * .10 + (67900 - 16700) * .15 + 
				(137050 - 67900) * .25 + (208851 - 137050) * .28 + 
				(income - 208851) * .33; 
			
			else   
				tax = 16700 * .10 + (67900 - 16700) * .15 + 
				(137050 - 67900) * .25 + (208851 - 137050) * .28 + 
				(372951 - 208851) * .33 + (income - 372951) * .35; 
						
		}
		//MARRIED FILING SEPARATELY
		if (status == 2)
		{
			if (income <= 8350)
				tax = income * 0.10; 
			
			else if (income <= 33950)
				tax = 8350 * .10 + (income - 8350) * .15; 
			
			else if (income <= 68525)
				tax = 8350 * .10 + (33950 - 8350) * .15 + 
				(income - 33950) * .25; 
			
			else if (income <= 104425)
				tax = 8350 * .10 + (33950 - 8350) * .15 + 
				(68525 - 33950) * .25 + (income - 68525) * .28;
			
			else if (income <= 186475)
				tax = 8350 * .10 + (33950 - 8350) * .15 + 
				(68525 - 33950) * .25 + (104425 - 68525) * .28 + 
				(income - 104425) * .33; 
			
			else 
				tax = 8350 * .10 + (33950 - 8350) * .15 + 
				(68525 - 33950) * .25 + (104425 - 68525) * .28 + 
				(186475 - 104425) * .33 + (income - 186476) * .35; 
			
			
		}
		//HEAD OF HOUSEHOLD 
		if (status == 3)
		{
			if (income <= 11950)
				tax = income * 0.10; 
			
			else if (income <= 45500)
				tax = 11950 * .10 + (income - 11950) * .15; 
			
			else if (income <= 117450)
				tax = 11950 * .10 + (45500 - 11950) * .15 + 
				(income - 45500) * .25; 
			
			else if (income <= 190200)
				tax = 11950 * .10 + (45500 - 11950) * .15 + 
				(117450 - 45500) * .25 + (income - 117450) * .28;
			
			else if (income <= 372951)
				tax = 11950 * .10 + (45500 - 11950) * .15 + 
				(117450 - 45500) * .25 + (190200 - 117450) * .28 + 
				(income - 190200) * .33; 
			
			else 
				tax = 11950 * .10 + (45500 - 11950) * .15 + 
				(117450 - 45500) * .25 + (190200 - 117450) * .28 + 
				(372951 - 190200) * .33 + (income - 372951) * .35; 
						
		}
		
		//PRINTS OUT RESULT 
		System.out.println("Personal Income Tax: " +(int)(tax*100) / 100.0);
		  
	  } 
	
}
