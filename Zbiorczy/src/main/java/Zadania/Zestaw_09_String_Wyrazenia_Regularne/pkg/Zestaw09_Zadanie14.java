package Zadania.Zestaw_09_String_Wyrazenia_Regularne.pkg;

/////////////WAZNE - KONWERSJE STRING/CHAR/INT + TABLICE NA NICH

import java.util.Arrays;

public class Zestaw09_Zadanie14 {

    public static void main(String[] args) {

        // String slowo = "abrakadabraz";
        String slowo = "dupa dupa";
        int kod = 6;

        //String[] tblString = slowo.split("");
        char[] tblChar = slowo.toCharArray();

//char c = s.charAt(0);
//char[] c_arr = g.toCharArray(); //tablica charów ze stringow
        // char t=(char) (tblChar[4]+2); //int na char


        //System.out.println("tablica string");
        // System.out.println(Arrays.toString(tblString));
        //  System.out.println(tblString[0].charAt(0));
        // System.out.println(tblChar[4] + kod);
        // char t = (char) (tblChar[4] + kod);
        System.out.println("tablica char");
        System.out.println(Arrays.toString(tblChar));

        //122 = z
        //97=a
        for (int i = 0; i < slowo.length(); i++) {
            if ((tblChar[i]) != 32) {
                if ((tblChar[i] + kod) > 122 || (tblChar[i] + kod) < 97) {
                    if ((tblChar[i] + kod) > 122) {
                        tblChar[i] = (char) (97 + Math.abs(tblChar[i] + kod - 122) - 1); //-1 aby liczyło się też "a"
                    }
                    if ((tblChar[i] + kod) < 97) {
                        tblChar[i] = (char) (122 - Math.abs(97 - (tblChar[i] + kod)) + 1); //aby wchdzilo tez z
                    }
                    //tu te dwa warunki
                } else {
                    tblChar[i] = (char) (tblChar[i] + kod);
                }

            }
        }

        System.out.println("tablica char po petli");
        System.out.println(Arrays.toString(tblChar));


    }

}
