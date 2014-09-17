package src.Calc;

public class DecimalCalc implements ICalc{
	
	public int add(int a,int b){
		return a+b;
	}
	
	public int sub(int a,int b){
		return a-b;
	}
	
	public int mult(int a,int b){
		return a*b;
	}
	
	public int div(int a,int b) throws Exception{
		if(b!=0){
			return a/b;
		}
		else
			new Exception("Делить на ноль - плохо!");
		return 0;
	}

    @Override
    public int calculate(TYPE_DO type, int a, int b) throws Exception{
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