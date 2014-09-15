package src.Menu;

import src.Utils;

public class MainMenu extends BaseMenu {

    @Override
    public void printMenu() {
        print("1 - Начать считать");
        print("2 - Выбрать калькулятор");
        super.printMenu();
        getValue();
    }

    private void getValue() {
        int value = 0;
        boolean haveValue = false;
        while (!haveValue) {
            try {
                value = Utils.getInt();
                haveValue = select(value);
                if (!haveValue){
                    print("Выбор не верный!");
                }
            } catch (Exception e) {
                print("Нужно ввести число!");
            }
        }
    }

    @Override
    public boolean select(int i) {
           switch (i){
              case 1:
                  //todo  1-Начать считать
                  return true;
               case 2:
                   //todo 2-Выбрать калькулятор
                   return true;
               default:
                   return super.select(i);
           }

    }
}
