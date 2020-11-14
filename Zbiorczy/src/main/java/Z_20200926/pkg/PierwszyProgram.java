package Z_20200926.pkg;

class PierwszyProgram {

    public static void main(String[] args) {


        String zm1 = "Hello World";
        String zm2 = "Mam na imię";
        String zm3 = "Ania";

        String imie = "Ania\nWittmann";

        System.out.println(imie);

        String zmall = zm1 + " " + zm2 + " " + zm3;
        System.out.println(zmall);

        // \n -->npwy wiersz

        //(zm1\n zm2\n zm3); -- wykombinuj jak to zrobic zmiennymi

        zm1 = "Hello World";
        zm1 = zm1 + "\n";
        zm2 = "Mam na imię\n";
        zm3 = "Ania\n";
        String zm4 = "\n";
        String zmall2 = zm1 + zm2 + zm3; //moze tez z zm4 jako newline
        System.out.println(zmall2);
        //System.out.println("Ania\nBartek\nKasia");
        //System.out.println(zm1\new zm2\new zm3);
    }
}
