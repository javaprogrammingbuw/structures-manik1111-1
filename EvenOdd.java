import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		for(int i=1;i<n;i++){
			if(i%2==0){
				i=i+1;
				System.out.println(i);
			}else{
				System.out.println(i);
			}
		}
	}
	
}
