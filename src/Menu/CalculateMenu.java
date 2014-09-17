package src.Menu;

import src.Calc.ICalc;
import src.Utils;

public class CalculateMenu extends BaseMenu {

    private int a;
    private int b;

    private ICalc calc;
    private ICalc.TYPE_DO lastOperation;

    public CalculateMenu(ICalc calc,int type){
        this.calc = calc;
        CountinueMenu countinueMenu = new CountinueMenu();

            print("Введите число:");
            a = getNumb(type);
           boolean flagcountinue = false;
           while (true) {
               if (!flagcountinue){
                   selectAnotherOperation();
               }
               selectSecond(type);
               flagcountinue = countinueMenu.needContinue();
           }

    }
    private void selectAnotherOperation(){
        printMenu();
        getValue();
    }

    private void selectSecond(int type){
        print("Введите число:");
        b = getNumb(type);
        try {
            a = doWork(a,b);
            print("Результат: ");
            print(a,type);
        } catch (Exception e) {
            print("Недопустимая операция!");
        }
    }

    private int doWork(int a, int b) throws Exception{
        return calc.calculate(lastOperation,a,b);
    }

    private int getNumb(int type) {
        int value = 0;
        boolean haveValue = false;
        while (!haveValue) {
            try {
                value = Utils.getInt(type);
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
