package src.Calc;

public interface ICalc {
    public enum TYPE_DO{
        ADD,
        SUB,
        MULT,
        DIV;

        public static TYPE_DO formInt(int i) {
            switch (i){
                case 1:
                    return ADD;
                case 2:
                    return SUB;
                case 3:
                    return MULT;
                case 4:
                    return DIV;
            }
            return null;
        }
    }

    public int calculate(TYPE_DO type, int a,int b) throws Exception;
}
