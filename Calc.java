import java.io.*;
import java.util.*;

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
	
	public static void main(String[] args){
		final int min=1,max=5;
		boolean b;
		String s="",sx="",sy="";
		StringTokenizer st;
		BufferedReader br;
		int num=0;
		double x=0 ,y=0;
		do{
			System.out.println("Choose any point below,then write number of it and put Enter:");
			System.out.println("1-Add");
			System.out.println("2-Sub");
			System.out.println("3-Mult");
			System.out.println("4-Div");
			System.out.println("5-All"); 
			//ввод числа;
			try{
				br = new BufferedReader(new InputStreamReader(System.in,"Cp866"));
				s=br.readLine();
				num=Integer.parseInt(s);
			}catch(Exception e){
				System.out.println("Not correct number!");
			}
		}while(num<min||num>max);
		System.out.println("Write two operands:");
		//ввод x и y;
		do{
			try{
				br = new BufferedReader(new InputStreamReader(System.in,"Cp866"));
				s=br.readLine();
				st=new StringTokenizer(s);
				sx=st.nextToken();
				x=Double.parseDouble(sx);
				sy=st.nextToken();
				y=Double.parseDouble(sy);
			}catch(Exception e){
				System.out.println("Not correct operands!");
				sx="";
			}
		}while(sx=="");

		do{
			switch(num){
				case 1:x=Add(x,y);break;
				case 2:x=Sub(x,y);break;
				case 3:x=Mult(x,y);break;
				case 4:x=Div(x,y);break;
				case 5:All(x,y);break;
				default:
					System.out.println("Not correct number!");
			}
			if(num==max)break;
			System.out.println("If you prefer to continue this operation write number and put Enter,else write anything and put Enter");
			//ввод y;
			try{
				br = new BufferedReader(new InputStreamReader(System.in,"Cp866"));
				s=br.readLine();
				y=Integer.parseInt(s);
			}catch(Exception e){
				s="";
			}
		}while(s!="");
		//Очистки экрана нет!!!!!!!!!!!
	}
}