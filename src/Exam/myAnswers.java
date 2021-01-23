package Exam;

import java.util.Scanner;

public class myAnswers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Take input from the user and Print if the number is less than or greater than 100 using Ternary Operator
		//firstQuestion();
		
		//2.Take a number from user and Print if the number is
		//less than 200 and even number otherwise print invalid number using Logical Operator
		
		//secondQuestion();
		
		
		//3.Write a Fibonoci’s series program as 0 11 2 3 5 8...n numbers and run in the command prompt
		
		//thirdQuestion();
		
		//4.Calculate tips for the check(eg . Java TipCalculator < check amoiunt > <%tips>)
		
		//forthQuestion();
		
		//5.Take a year as input and Print the year is leap year or not a leap year using Nested-if else statement
		
		//fifthQuestion();
		
		//6.Check whether an alphabet is vowel or consonant using switch statement
		//sixthQuestion();
		
		//7.Write a program using nested switch statement. 
		//Take input from user in form of “” and print the current running movies at the theater. E.g.

		//seventhQuestion();
		
		
		//8.Write Java Program using for-loop statement Excepted Output :How Many Rows You Want to Print ? 8
		//eighthQuestion();
		
		//9.Write Java Program using for-loop statement Excepted Output :How Many Rows You Want to Print ?
		
		//ninethQuestion();
		
		//Write a program to input indefinite numbers and then calculate the sum of only the positive numbers. 
		//The program terminates when negative numbers is input
		//tenthQuestion();
		
		//Write a program to print year from 1 to 4000 except leap years using Continue statement.
		//eleventhQuestion();
		
		//12.By using do while loop, write Java program 
		//to prompt the user to choose the correct answer from a list of answer choices of a question.
		//twelvethQuestion();
		
		//13.Write a program to remove White Spaces from string in Java? 
		// ”Enter input string to be cleaned from white spaces...!” INPUT :OneSpace TwoSpaces ThreeSpaces FourSpaces Tab End
		// thirteenthQuestion();
		
		//14.Write a JAVA program that will generate/output the following numbers.
		//1, 2, 4, 7, 11, 16, 22,29 37 46 56 67 79 92
		
		//fourteenthQuestion();
		
		
		//15.Write a Java program to detect key presses.If the user pressed number keys( from 0 to 9), 
		//the program will tell the number that is pressed, otherwise, program will show "Not allowed".
		//fifteenthQuetion();
		
		//16.Write a Java program that allows the user to choose the correct answer of a question. See the example below:
		/*
		 * 
		 * What is the correct way to declare a variable to store an integer value in
			 Java?
			a. int 1x=10;
			b. int x=10;
			c. float x=10.0f;
			d. string x="10";
			Enter your choice: c
			````
		 * 
		 */
		
		//sixteenthQuetion();
		
		
	}
	
	
	  public static void firstQuestion () {
		  
		  
			Scanner input = new Scanner (System.in);
			
			System.out.println("Please Entre a number : ");
			
			double a = input.nextDouble();
			
			System.out.println(a < 100  ? "less than hundred" : "greater than hundred");
		
		
		
	}
	  
	  
	  public static void secondQuestion () {
		  
	        @SuppressWarnings("resource")
			Scanner input = new Scanner (System.in);
			
			System.out.println("entre a number : ");
			
			int num= input.nextInt();
			
			if(num<200 && num%2==0) {
				
				System.out.println(num);
			}
			else System.out.println("Invalid number");
		   
	  }
	  
	  
	  public static void thirdQuestion () {
		  
		  int n1=0,n2=1,n3,i,count=10;    
			 System.out.print(n1+" "+n2);  
			    
			 for(i=2;i<count;++i)  
			 {    
			  n3=n1+n2;    
			  System.out.print(" "+n3);    
			  n1=n2;    
			  n2=n3;    
			 } 
		 
	  }
	  
	  
	  public static void forthQuestion () {
		  
		    @SuppressWarnings("resource")
			Scanner input = new Scanner (System.in);
			
			System.out.println("enter the Tip Percentage :");
			double tipPercentage=input.nextDouble();
			
			System.out.println("enter the check Amount :");
			double checkAmount=input.nextDouble();
			
			double tip = (tipPercentage*checkAmount)/100;
			
			System.out.println(tip);
		 
	  }
	  
	  
	  
	  public static void fifthQuestion () {
		  
		  	@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
		  	System.out.println("enter any Year:");
		  	int year = input.nextInt();
		  	
		      boolean isLeap = false;

		      if(year % 4 == 0)
		      {
		          if( year % 100 == 0)
		          {
		              if ( year % 400 == 0)
		                  isLeap = true;
		              else
		                  isLeap = false;
		          }
		          else
		              isLeap = true;
		      }
		      else {
		          isLeap = false;
		      }

		      if(isLeap==true)
		          System.out.println(year + " this year is leap.");
		      else
		          System.out.println(year + " this year is not leap");
		 
	  }
	  
	  
	  public static void sixthQuestion () {
		  
		    Scanner input = new Scanner(System.in);
		  	System.out.println("enter a charachter:");
		  	char ch = input.next().charAt(0);
		  
			  if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
		            System.out.println(ch + " is vowel");
		        else
		            System.out.println(ch + " is consonant");
		  
	  }
	  
	  
	  public static void seventhQuestion () {
		  
		    Scanner input = new Scanner(System.in);
		  	System.out.println("enter a theater name :");
		  	String theater = input.next();
		  
			  switch (theater) {
				  
				    case "1F" :
				    	  System.out.println("In fairfax cinemax currently running movie : thor");
				    	  break;
				    case "2F" :
				    	  System.out.println("In dc cinemax currently running movie : Mission Impossible");
				    	  break;
				    
				    default :
				    	  System.out.println("Sorry Information not available Yet ");
				    	  break;
			    		
			    		
			  }
				  
				  
	    }
	  
	  
	  public static void eighthQuestion () {
		       int count = 8;
		       int space = 0;	
		  		for (int i =1 ; i<=count ; i++) {
		  			space = count-i;
		  			
		  			for(int s=1 ; s<=space; s++) {
		  				System.out.print(" ");
		  			}
		  			
		  			
		  			for (int j=1;j<=i;j++) {
		  				
		  				System.out.print(j+" ");
		  			}
		  			
		  			System.out.println();
		  		}
		  			
		  
				
				    
		}
	  
	  
	  public static void ninethQuestion () {
		  
		  int count = 9;
	       int space = 0;	
	  		for (int i =1 ; i<=count ; i++) {
	  			space = count-i;
	  			
	  			for(int s=1 ; s<=space; s++) {
	  				System.out.print(" ");
	  			}
	  			
	  			
	  			for (int j=1;j<=i;j++) {
	  				
	  				System.out.print(i+" ");
	  			}
	  			
	  			System.out.println();
	  		}
	   }
	  
	  
	  public static void tenthQuestion () {
		    Scanner input = new Scanner(System.in);
		    int sum=0,val=0;
		    while (val >= 0) {
		    	 System.out.println("enter a number5 :");
		    	 val=input.nextInt();
				 sum =val+sum;
		    }
		    
		    System.out.println(sum);
		     	
		  
	  }
	  
	  
	  public static void eleventhQuestion () {
		  
		      
		      for (int i=1 ; i<=4000 ;i++) {
		    	  
			    	  if(i % 4 == 0)
					      {
					          if( i % 100 == 0)
					          {
					              if ( i % 400 == 0)
					            	  System.out.println(i);
					              else
					                 continue;
					          }
					          else
					        	  System.out.println(i);
					      }
					      else {
					         continue;
					      }
	
				      
			 }

		      
		 
	  }
	  
	  
	  
	  public static void twelvethQuestion () {
		    Scanner input = new Scanner(System.in);
		    char resp,condVal;
		   
		    System.out.println("What is the command keyword to exit a loop in Java?\n" + 
		    		"a.quit\n" + 
		    		"b.continue\n" + 
		    		"c.break\n" + 
		    		"d.exit");
		   
			do {
		    	 System.out.println("Enter your choice");
		    	 resp=input.next().charAt(0);
		    	 if (resp!='c') System.out.println("Incorrect!");
		    	 else {
		    		 
		    		 System.out.println("Congratulation!\n" +
		    		 "Again? press y to continue:");
		    		 condVal=input.next().trim().charAt(0);
		    		 
		    		 if(condVal=='y') { 
		    		    resp='0';
		    			 continue; 
		    		 }
		    		 else break;
		    		 
		    	 }
		    	 		
				 
		    } while (resp !='c');
		    
		    
		     	
		  
	  }
	  
	  
	  public static void thirteenthQuestion () {
		  
		  Scanner input = new Scanner (System.in);
		  System.out.println("enter your Sting : ");
		  String myString =input.nextLine().trim();
		  System.out.println(myString);
		  
	  }
	  
	  
	  public static void fourteenthQuestion() {
		  
		  int sum = 1;
		  int count =20;
		  for (int i=0 ; i<count;i++ ) {
			  sum=sum+i;
			  System.out.print(sum+" ");
		  }
		  
		  
	  }
	  
	 public static void fifteenthQuetion() {
			  
		  Scanner input = new Scanner (System.in);
		  System.out.println("enter your number : ");
		  int val =input.nextInt();
		  System.out.println((val>=0 && val<=9 ) ? val : "Not allowed" );
		  
			  
	}
	 
	 public static void sixteenthQuetion() {
		  
		    Scanner input = new Scanner(System.in);
		    char resp,condVal;
		    
		    System.out.println(" What is the correct way to declare a variable to store an integer value in\n" + 
		    		"	 Java?\n" + 
		    		"	a. int 1x=10;\n" + 
		    		"	b. int x=10;\n" + 
		    		"	c. float x=10.0f;\n" + 
		    		"	d. string x=\"10\";");
		   
			
		    	 System.out.println("Enter your choice");
		    	 resp=input.next().charAt(0);
		    	 if (resp!='b') System.out.println("Incorrect!");
		    	 else {
		    		 
		    		 System.out.println("Congratulation!\n");
		    		 
		    	 }
		    	 		
			
		  
		  
	  }
	  
	 
	
	
	  
	  
	  
	  
	  
	  
	  
	  
	 
		  
		  
        
				  
		  
	  
	  

}
