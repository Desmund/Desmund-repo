package src.Menu;

import src.Calc.DecimalCalc;

public class MainMenu extends BaseMenu {

    @Override
    public void printMenu() {
        print("1 - Начать считать");
        print("2 - Выбрать калькулятор");
        super.printMenu();
        getValue();
    }

    @Override
    public boolean select(int i) {
           switch (i){
              case 1:
                  new CalculateMenu(new DecimalCalc(),new CalcTypeMenu().type);
                  return true;
               case 2:
                   CalcTypeMenu c=new CalcTypeMenu();
                   c.printMenu();
                   new CalculateMenu(new DecimalCalc(),new CalcTypeMenu().type);
                   return true;
               default:
                   return super.select(i);
           }

    }
}
