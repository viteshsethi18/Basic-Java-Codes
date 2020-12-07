import java.util.*;
import java.util.Arrays;
public class Student {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = new int[10];
		Scanner S = new Scanner(System.in);
		System.out.println("enter marks of 10 students");
		int i;
		for (i=0; i<10; i++){
		int z = S.nextInt();
		marks[i]=z;
	}
	Arrays.sort(marks);
    for (i=0; i<10; i++){
    	if(marks[i]>39 && marks[i]<=50){
    		System.out.println(marks[i]+" "+"Pass");
    	}
    	else if (marks[i]>=51 && marks[i]<=75){
    		System.out.println(marks[i]+" "+"Merit");
    	}
    	else if(marks[i]>=76){
    		System.out.println(marks[i]+" "+"Distinction");
    	}
    }
    S.close();
	}
}
    

