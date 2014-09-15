package src.Menu;

public class CountinueMenu extends BaseMenu {


    private boolean value = false;

    public boolean needContinue(){
        printMenu();
        getValue();
        return value;
    }

    @Override
    protected void printMenu() {
        print("1 - Продолжить?");
        print("2 - Сменить операцию!");
    }

    @Override
    protected boolean select(int i) {
        switch (i){
            case 1:
                value = true;
                return true;
            case 2:
                value = false;
                return true;
        }
        return super.select(i);
    }
}
