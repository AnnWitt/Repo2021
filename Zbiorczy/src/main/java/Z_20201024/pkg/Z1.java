package Z_20201024.pkg;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Z1 {
    public static void main(String[] args) {
        //lista - ArrayList <typ danych>
        ArrayList<String> lista=new ArrayList();
        //ArrayList lista=new ArrayList();
       // ArrayList <String> listaStr=new ArrayList();
        String[] tablicaS;
        lista.add("Sebastian");
        lista.add("Marian"); //mozna dodawac
        lista.size();
        lista.remove("Marian"); //usunie pierwszego MAriana
        lista.get(0); //get 10 element na liscie

/*        for (int i=0;i<lista.size() ;i++) {

        }*/

        for(String s:lista) { //s parametr licznik, idzie po lista
            System.out.println(s);

        }

    }


}
