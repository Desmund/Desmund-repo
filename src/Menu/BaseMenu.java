package src.Menu;

import src.Utils;

public abstract class BaseMenu {
    public void printMenu(){
        print("0 - Выйти!");
    };

    protected boolean select(int i){
        switch (i){
            case 0:
                System.exit(0);
                return true;
        }
        return false;
    };

    protected void print(String s){
        // Легко можно будет заенить на другой источник, например файл
        System.out.println(s);
    }

    private static int getNumberOfOperand(){
        try{
            int num=Integer.parseInt(Utils.readStringFromConsol());
            return num;
        }catch(Exception e){
            return -1;
        }
    }


}
