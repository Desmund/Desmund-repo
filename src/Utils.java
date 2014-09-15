package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utils {

    public static String readStringFromConsol() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in,"Cp866"));
        String s=br.readLine();
        return s;

    }

    public static int getInt() throws Exception{
        int num=Integer.parseInt(readStringFromConsol());
        return num;
    }
}
