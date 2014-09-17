package src.Menu;

import src.Utils;

public abstract class BaseMenu {


    protected void printMenu(){
        print("0 - Выйти!");
    };

    protected boolean select(int i){
        switch (i){
            case 0:
                print("Возвращайся");
                System.exit(0);
                return true;
        }
        return false;
    };

    protected void print(String s){
        // Легко можно будет заенить на другой источник, например файл
        System.out.println(s);
    }

    protected void print(int s,int type){
        switch(type){
            case 10:System.out.print(s);print("");break;
            case 2:System.out.print(Integer.toBinaryString(s));print(""); break;
            case 16:System.out.print(Integer.toHexString(s));print("");

        }
    }

    private static int getNumberOfOperand(){
        try{
            int num=Integer.parseInt(Utils.readStringFromConsol());
            return num;
        }catch(Exception e){
            return -1;
        }
    }

    protected void getValue() {
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


}
