import java.util.Scanner;


public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("a: " + a + " b: " + b + " c: " + c);

		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		int sum= a+b+c;
		System.out.println("Sum:"+sum);
		float mean=sum/2;
		System.out.println("Mean:"+mean);
		double d = 2.3;
		float f = 2.3f;

		if(a>b && a>c){
			System.out.println("Max Value:"+a);
		}else if(b>a && b>c) {
             System.out.println("Min Value:"+b);
			}
		else{
			System.out.println("Max Value:"+c);
		}

		if(a<b && a<c){
			System.out.println("Min Value:"+a);
		}else if(b<a && b<c){
			System.out.println("Min Value:"+b);
		}else{
			System.out.println("Min Value"+c);
		}
		
        
	}

}
