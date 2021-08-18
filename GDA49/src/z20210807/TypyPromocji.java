package z20210807;

public enum TypyPromocji {
    STANDARDOWA(6, "standardowa"),
    PREMIUM(10,"premium"),
    SUPERB(15,"superb"),
    NOWAPROMOCJA (70,"nowa promocja") ;
    //jeżeli na szaro to nie obsłużona/wywolana nigdzie
    //stale do ktorych mozemy sie odwolywac, tylko do tych 3, żadnych innych

    private final int stawka;
    private final String opis;

    public String getOpis() {
        return opis;
    }

//  PRzed setterami getterami
//    STANDARDOWA,

//    PREMIUM,
//    SUPERB,
//    NOWAPROMOCJA //jeżeli na szaro to nie obsłużona/wywolana nigdzie ;
//    //stale do ktorych mozemy sie odwolywac, tylko do tych 3, żadnych innych

   // private int stawka;

    TypyPromocji (int stawka, String opis) {
        this.stawka=stawka; //wartosc do konstruktora
        this.opis=opis;
    }

    public int getStawka() {
        return  stawka;
    }

}
