import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("�g��(cm)=");
		double height = sc.nextDouble() / 100;
		System.out.print("�̏d(kg)=");
		double weight = sc.nextDouble();
		double bmi = weight / height / height;
		double b = ((double)Math.round(bmi * 100))/100;
		System.out.println(b);
	}
}
