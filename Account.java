//package Account;

import java.io.*;
import java.util.*;
//import Calc;

class Account{
	private static int min=1,max=5;
	private static boolean b;
	private static String s="",sx="",sy="";
	private static StringTokenizer st;	
	private static double x=0 ,y=0;
	private static int num;
		
	private static void writeMenu(){
		System.out.println("Choose any point below,then write number of it and put Enter:");
		System.out.println("0-Exit");
		System.out.println("1-Add");
		System.out.println("2-Sub");
		System.out.println("3-Mult");
		System.out.println("4-Div");
		System.out.println("5-All"); 
	}
	
	private static String readString(){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in,"Cp866"));
			String s=br.readLine();	
			return s;
		}catch(Exception e){
			System.out.println("Error!");
			return "";
		}
	}
	
	private static int getNumberOfOperand(){
		try{
		int num=Integer.parseInt(readString());
		if(num==0)System.exit(num);
		return num;
		}catch(Exception e){
			return -1;
		}
	}
	
	private static double operands(int num,double x, double y){
		Calc calculator=new Calc();
		switch(num){
			case 1:return calculator.Add(x,y);
			case 2:return calculator.Sub(x,y);
			case 3:return calculator.Mult(x,y);
			case 4:return calculator.Div(x,y);
			case 5:calculator.All(x,y);
		}
		return 0;
	}
	
	private static void enterTwoOperands(){
		do{
			try{
				s=readString();
				st=new StringTokenizer(s);
				sx=st.nextToken();
				x=Double.parseDouble(sx);
				sy=st.nextToken();
				y=Double.parseDouble(sy);
			}catch(Exception e){
				System.out.println("Not correct operands!");
				sy="";
				sx="";
			}
		}while(sy=="");
	}
	
	private static void enterOneOperands(){
		while(true){
			try{
				System.out.println("Put y and Enter for continue, or anything and Enter for chouse new operands");
				s=readString();
				if(!s.equals("y"))break;
				s="";
				System.out.println("Put number");
				sy=readString();
				y=Double.parseDouble(sy);
				writeMenu();
				num=getNumberOfOperand();
				x=operands(num,x,y);
				if(num==max)break;
			}catch(Exception e){
				System.out.println("Not correct operand!");	
			}
		}
	}
	
	public static void main(String[] args){
		while(true){
			num=-1;
			do{
				writeMenu();
				num=getNumberOfOperand();
				if(num<min||num>max)
					System.out.println("Not correct number!");
			}while(num<min||num>max);
			System.out.println("Write two operands:");
			enterTwoOperands();
			x=operands(num,x,y);
			if(num!=max)
			enterOneOperands();
			num=-1;
		}
	}
}