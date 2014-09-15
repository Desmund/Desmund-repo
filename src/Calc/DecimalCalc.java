package src.Calc;

public class DecimalCalc implements ICalc{
	
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
			new Exception("Делить на ноль - плохо!");
		return 0;
	}

    @Override
    public double calculate(TYPE_DO type, double a, double b) throws Exception{
        switch (type){
            case ADD:
                return add(a, b);
            case SUB:
                return sub(a, b);
            case MULT:
                return mult(a, b);
            case DIV:
                return div(a, b);
            default:
                new Exception("Неизвестная оверация для этого калькулятора!");
                return 0;
        }

    }
}