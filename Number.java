import java.util.*;
public class Number {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter 3 digit number");
		int number[] = new int[3];
		for (int i=0; i<3; i++){
			int m = Sc.nextInt();
			number[i] = m;
		}
		
		for (int c=0;c<3;c++){
			for (int d=0;d<3;d++){
				for (int e=0;e<3;e++){
					if (c!=d && d!=e && e!=c){
						System.out.println(number[c]+""+ number[d]+""+number[e]);
					}
				}
			}
		}
		
        Sc.close();
	}

}
