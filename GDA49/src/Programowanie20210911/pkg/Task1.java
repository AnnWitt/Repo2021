package Programowanie20210911.pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
    //SDAasci();
    //OkragSrObw();
       /* System.out.println("Podaj średnicę okręgu");
        Scanner scan=new Scanner(System.in);
        float userInput=scan.nextFloat();*/
       // OkragSrObw2(userInput);
        OkragSrObw(); //z walidacja na ty[p danych

    }

    //////-------------
    private static void SDAasci () {
        System.out.println(Character.toString(83) +
                        Character.toString(68) +
                        Character.toString(65));
        /*String s=Character.toString(83);
        String d=Character.toString(68);
        String a=Character.toString(65);*/
        //char s =0b01010011 inne formaty
        //char a=0x41
        //System.out.println(s + d +a);
    }
    private static float getDiameterFromUser() {
        Scanner userInput=new Scanner(System.in);
        //System.out.println("Podaj średnicę okręgu");
        float diameter=0;

        //walidacja
        try {
            System.out.println("Please insert diameret: ");
             diameter=userInput.nextFloat();
        } catch(InputMismatchException ex) {
            System.out.println("Wrong format");
            //System.exit(1); //wyjscie zaminnie do a
            diameter=getDiameterFromUser(); //a
        }

        return diameter;
    }
    private static void OkragSrObw () {
        float diameter=getDiameterFromUser();
       float CircumFerenceCircle= (float) (diameter*Math.PI);
       //float AreaOfCircle=(float) Math.PI*(diameter/2)*(diameter/2);
        System.out.println("kor Mathpow");
       float AreaOfCircle=(float) Math.PI* (float)Math.pow(diameter/2, 2);
       //System.out.println((float) Math.pow(3, 2));//
        System.out.println("Wprowadzono średnicę " + diameter + "\n" +
                "Srednica okręgu wynosi " + CircumFerenceCircle + "\n" +
                "Pole okręgu wynosi " + AreaOfCircle);
    }
    private static  void OkragSrObw2 (float userInput) {
        float diameter= userInput;
        float CircumFerenceCircle= (float) (diameter*Math.PI);
        float AreaOfCircle=(float) Math.PI*(diameter/2)*(diameter/2);
        System.out.println("Wprowadzono średnicę " + diameter + "\n" +
                "Srednica okręgu wynosi " + CircumFerenceCircle + "\n" +
                "Pole okręgu wynosi " + AreaOfCircle);
    }


}
