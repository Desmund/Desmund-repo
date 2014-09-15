//package Calc;

class Calc{
	
	public static double Add(double a,double b){
		System.out.println(a+"+"+b+"="+(a+b));
		return a+b;
	}
	
	public static double Sub(double a,double b){
		System.out.println(a+"-"+b+"="+(a-b));
		return a-b;
	}
	
	public static double Mult(double a,double b){
		System.out.println(a+"*"+b+"="+a*b);
		return a*b;
	}
	
	public static double Div(double a,double b){
		if(b!=0){
			System.out.println(a+"/"+b+"="+(a/b));
			return a/b;
		}
		else
			System.out.println("Divizion by zero!");
		return 0;
		
	}

	public static void All(double a,double b){
		Add(a,b);
		Sub(a,b);
		Mult(a,b);
		Div(a,b);
	}
}