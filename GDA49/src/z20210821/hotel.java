package z20210821;

public class hotel {
    private String name;
    private int iloscDostepnychmiejsc;

    public hotel(String name,int iloscDostepnychmiejsc) {
        this.name=name;
        this.iloscDostepnychmiejsc=iloscDostepnychmiejsc;
    }

    public hotel(String name) { //konstruktor jednoargumentowy z paramtrami

        this.name = name; //name z tej klasy staje sie name z konstruktora/metody
    }

    public hotel() { //konstruktor bez parametrów

        this.name = name; //name z tej klasy staje sie name z konstruktora/metody
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIloscDostepnychmiejsc() {
        return iloscDostepnychmiejsc;
    }

    public void setIloscDostepnychmiejsc(int iloscDostepnychmiejsc) {
        this.iloscDostepnychmiejsc = iloscDostepnychmiejsc;
    }
}
