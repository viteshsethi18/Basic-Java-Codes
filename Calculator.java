
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);
		char s = args[1].charAt(0);
		int c = 0;
		if (s=='+'){
		c = a+b;	
		} else if (s=='-'){
		c = a-b;
		} else if (s=='*'){
		c = a*b;	
		} else if (s=='/'){
		c = a/b;	
		} else {
			System.out.println("enter correct operator");
		}
            System.out.println(c);
	}

}
