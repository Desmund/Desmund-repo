package src.Calc;

class DecimalCalc implements ICalc{
	
	public double add(double a,double b){
		return a+b;
	}
	
	public double sub(double a,double b){
		return a-b;
	}
	
	public double mult(double a,double b){
		return a*b;
	}
	
	public double div(double a,double b) throws Exception{
		if(b!=0){
			return a/b;
		}
		else
			new Exception("Divizion by zero!");
		return 0;
	}
}