package z20210821;

public class MainHotel {
    public static void main(String[] args) {

        hotel hotelHiltor=new hotel("Hilton");
        System.out.println("z parametami " + hotelHiltor.getName());
        hotel hotelSheraton=new hotel();
        hotelSheraton.setName("sheraton z metody aby nie było puste");
        System.out.println("z parametami " + hotelSheraton.getName());
        hotel hotelMeriot =new hotel("Meriot",30);
        System.out.println("Meriot i ile miejsc " + hotelMeriot.getName() + " " + hotelMeriot.getIloscDostepnychmiejsc());

        //Dog pies=new Dog("aaaa");
        Dog pies= Dog.stworzPsa("ddd");
        System.out.println("imie psa " + pies.getName());

        KlasaWklasie.Wew studentZM=new KlasaWklasie.Wew();
        System.out.println("wyswietl wiek studenta" + studentZM.mycnumber);
        KlasaWklasie stZew=new KlasaWklasie();
        System.out.println("z zewnetrznej " + stZew.mycnumberOut);
        stZew.mycnumberOut=30; //zmiana na obręb całej klasy
        System.out.println("z zewnetrznej " + stZew.mycnumberOut);
    }


}
