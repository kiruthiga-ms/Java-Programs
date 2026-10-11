package javapractice;
import java.util.Scanner;
public class practice2{
	public static void main(String[]args) {
	    
		//Question 1
		System.out.println("Hello World");
		
		
		//Question 2
		int a=10;
		int b=5;
		System.out.println("Addition="+(a+b));
		System.out.println("Substaction="+(a-b));
		System.out.println("Multiplication="+(a*b));
		System.out.println("Division="+(a/b));
		System.out.println("Modulus="+(a%b));
		
		
		//Question3
		double number=25;
		double squareRoot=Math.pow(number,0.5);
		System.out.println("square Root="+squareRoot);
		
		
		//Question4
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base:");
		double base=sc.nextDouble();
		System.out.println("Enter the height:");
		double height=sc.nextDouble();
		double area=0.5*base*height;
		System.out.println("Area of a Triangle="+area);			
		
		
		//Question5
		sc=new Scanner(System.in);
	    double c=sc.nextDouble();
		System.out.println("Enter the d value");
	    double d=sc.nextDouble();
	    Double result1=(c+d)*(c+d);
	    Double result2=(c-d)*(c-d);
	    Double result3=(c*d)-(c*d);
		System.out.println("(c+d)^2="+result1);
		System.out.println("(c-d)^2="+result2);
		System.out.println("(c^2-d^2="+result3);
		
	
		//Question6
	    sc=new Scanner(System.in);
		System.out.println("Enter the First value(q):");
		int q=sc.nextInt();
		System.out.println("Enter the Second value(r):");
		int r=sc.nextInt();
		System.out.println("Before swap:q="+q+",r=" +r);
		int temp=q;
		q=r;
		r=temp;
		System.out.println("After swap:q="+q+",r=" +r);
		sc.close();
		
		
		
		//Question7
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the kilometer distance:");
		double km=sc.nextDouble();
		double mile=km*0.63;30
		System.out.println("Miles:"+mile);
		
		
		//Question8
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the celcius:");
		double celsius=sc.nextDouble();
		double Farenheit=(celsius*1.8)+32;
		System.out.println("Enter the Farenheit:"+Farenheit);
		
		
		
		
		//Question9
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number=sc.nextInt();
		int lasttwoDigit=number%10;
		System.out.println("LastDigit:"+lasttwoDigit);
		
		
		//Question10
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int integer=sc.nextInt();
	    int lasttwointeger=(integer%100);
	    System.out.println("Enter the last two digit:"+lasttwointeger);
	    
		
		
		//Question11
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number=sc.nextInt();
		int middleDigit=(number/100)%10;
		int square=middleDigit*middleDigit;
		System.out.println("The square"+middleDigit+"is:"+square);
        
		

		
		
		
		
		
		
		
	}
}



