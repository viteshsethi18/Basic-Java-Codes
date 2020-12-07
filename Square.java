import java.util.*;
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner Ss = new Scanner(System.in);
    System.out.println("Enter 10 numbers");
    int a = 0;
    int sum = 0;
    int number[]= new int[10];
    for (int i=0; i<10; i++){
    	int m = Ss.nextInt();
    	number[i] = m;
    }
    for (int i=0; i<10; i++){
    	a=number[i]*number[i];
    	sum+=a;
    }
    System.out.println(sum);
    Ss.close();
	}

}
