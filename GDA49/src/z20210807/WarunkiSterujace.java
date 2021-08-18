package z20210807;

public class WarunkiSterujace {

    public static void main(String[] args) {
    //procesujTypyPromocji(TypyPromocji.STANDARDOWA);

        int cenaSamochodu=20000;
        int stawka=TypyPromocjiSwitch2(TypyPromocji.STANDARDOWA,0);
    TypyPromocjiSwitch(TypyPromocji.PREMIUM);
        //TypyPromocjiSwitch2(TypyPromocji.STANDARDOWA,10); idzie z promocji + to
        // 10 jako jakies dodakowe znizki z  return typyPromocji.getStawka() +znizka; /
        int obnizka=100-stawka;
        int nowaCena=(obnizka*cenaSamochodu)/100;
        System.out.println("cena przed obnizka:" + cenaSamochodu);
        System.out.println("stawka obnizki z promocji: " + stawka);
        System.out.println("cena po obnizce: " + nowaCena);


    }

    //---metody prywatne
    private static void procesujTypyPromocji(TypyPromocji typyPromocji) {

        if (typyPromocji==TypyPromocji.STANDARDOWA) {
            System.out.println(" Promocja Standardowa ");
        } else if (typyPromocji==TypyPromocji.PREMIUM) {
            System.out.println("typ promocji premium");
        } else if (typyPromocji==TypyPromocji.SUPERB) {
            System.out.println("typ promocji superb " + typyPromocji);
        } else {
            System.out.println("Dana promocja nie obsługiwana"); //poniekad obsuga bledu jeżeli ktos by dodal
            //wartosc a zapomnial dopisac warunku
        }
    }

    private static int TypyPromocjiSwitch (TypyPromocji typyPromocji){

        //void + return
        //int + break

//zmienic tak aby w zaleznosci okreslalo jakas znizke np 5%)
        switch (typyPromocji) {
            case STANDARDOWA:
                System.out.println(typyPromocji.getOpis());
                return typyPromocji.getStawka(); //przy getterach zamiast break
            case SUPERB:
                System.out.println(typyPromocji.getOpis());
                return typyPromocji.getStawka(); //przy getterach zamiast break

            // Możemy tego użyć tylko w jednym miejscu
//            case PREMIUM:
//            case NOWAPROMOCJA:
//            case PREMIUM2:
//            case NOWAPROMOCJA2:
//                System.out.println(typyPromocji.getOpis());
//                return;

            case PREMIUM:
            case NOWAPROMOCJA:
                System.out.println("nowapromocja i premium "  + typyPromocji); // dla obu przypadków - nie trzeba
                //// dla kazdego z osobna
                return typyPromocji.getStawka();
            default:
                System.out.println("danej promocji nie obslugujemy");
                throw new RuntimeException(); //musi byc bo coś zwracamy (przy int
        }

    }

    private static int TypyPromocjiSwitch2 (TypyPromocji typyPromocji, int znizka){

        //void + return
        //int + break

//zmienic tak aby w zaleznosci okreslalo jakas znizke np 5%)
        switch (typyPromocji) {
            case STANDARDOWA:
                System.out.println(typyPromocji.getOpis());
                return typyPromocji.getStawka() +znizka; //przy getterach zamiast break
            case SUPERB:
                System.out.println(typyPromocji.getOpis());
                return typyPromocji.getStawka(); //przy getterach zamiast break

            // Możemy tego użyć tylko w jednym miejscu
//            case PREMIUM:
//            case NOWAPROMOCJA:
//            case PREMIUM2:
//            case NOWAPROMOCJA2:
//                System.out.println(typyPromocji.getOpis());
//                return;

            case PREMIUM:
            case NOWAPROMOCJA:
                System.out.println("nowapromocja i premium "  + typyPromocji); // dla obu przypadków - nie trzeba
                //// dla kazdego z osobna
                return typyPromocji.getStawka();
            default:
                System.out.println("danej promocji nie obslugujemy");
                throw new RuntimeException(); //musi byc bo coś zwracamy (przy int
        }

    }

    //--
}
