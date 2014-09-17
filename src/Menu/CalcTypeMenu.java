package src.Menu;

/**
 * Created by Denis on 17.09.2014.
 */
public class CalcTypeMenu extends BaseMenu {
    public static byte type=10;

    @Override
    protected void printMenu() {
        print("1 - Десятичный");
        print("2 - Двоичный");
        print("3 - Шестнадцатеричный");
        getValue();
    }

    @Override
    protected boolean select(int i) {
        switch(i){
            case 1: type=10; return true;
            case 2: type=2; return true;
            case 3: type=16; return true;
            default:
                return super.select(i);
        }
    }
}
