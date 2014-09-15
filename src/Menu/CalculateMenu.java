package src.Menu;

import src.Calc.ICalc;
import src.Utils;

public class CalculateMenu extends BaseMenu {

    private double a;
    private double b;

    private ICalc calc;
    private ICalc.TYPE_DO lastOperation;

    public CalculateMenu(ICalc calc){
        this.calc = calc;
        CountinueMenu countinueMenu = new CountinueMenu();

            print("Введите число:");
            a = getNumb();
           boolean flagcountinue = false;
           while (true) {
               if (!flagcountinue){
                   selectAnotherOperation();
               }
               selectSecond();
               flagcountinue = countinueMenu.needContinue();
           }

    }
    private void selectAnotherOperation(){
        printMenu();
        getValue();
    }

    private void selectSecond(){
        print("Введите число:");
        b = getNumb();
        try {
            a = doWork(a,b);
            print("Результат: " + a);
        } catch (Exception e) {
            print("Недопустимая операция!");
        }
    }

    private double doWork(double a, double b) throws Exception{
        return calc.calculate(lastOperation,a,b);
    }

    private int getNumb() {
        int value = 0;
        boolean haveValue = false;
        while (!haveValue) {
            try {
                value = Utils.getInt();
                haveValue = true;
            } catch (Exception e) {
                print("Нужно ввести число!");
            }
        }
        return value;
    }

    @Override
    public void printMenu() {
        print("Нужно выбрать операцию:");
        print("1 - Сложить");
        print("2 - Вычесть");
        print("3 - Уножить");
        print("4 - Разденить");
        super.printMenu();
    }

    @Override
    protected boolean select(int i) {
        switch (i){
            case 1:
            case 2:
            case 3:
            case 4:
                lastOperation = ICalc.TYPE_DO.formInt(i);
             return true;
           default:
               super.select(i);
        }
        return false;
    }


}
