import java.util.*;
public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the month number to know its name");
		int m= Sc.nextInt();
		
		if(m==1)
			System.out.println("Jan");
		
		else if(m==2)
			System.out.println("Feb");
		
		else if(m==3)
			System.out.println("Mar");
		
		else if(m==4)
			System.out.println("Apr");
		
		else if(m==5)
			System.out.println("May");
		
		else if(m==6)
			System.out.println("June");
		
		else if(m==7)
			System.out.println("July");
		
		else if(m==8)
			System.out.println("Aug");
		
		else if(m==9)
			System.out.println("Sep");
		
		else if(m==10)
			System.out.println("Oct");
		
		else if(m==11)
			System.out.println("Nov");
		
		else if(m==12)
			System.out.println("Dec");
		
		else
			System.out.println("Wrong Input");
		
		Sc.close();

	}

}