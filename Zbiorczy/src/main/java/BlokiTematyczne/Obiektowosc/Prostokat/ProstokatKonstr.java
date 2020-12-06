package BlokiTematyczne.Obiektowosc.Prostokat;

public class ProstokatKonstr {

/*    ĆWICZENIE : Utwórz klasę Prostokąt. Danymi dla tej klasy będą: góra, lewy, szerokość, wysokość.
    Utwórz następujące konstruktory;
		- określone są 4 parametry: lewy, góra, szerokość i wysokość
		- szerokość i wysokość nie jest określona (obie to 0)
		- wysokość nie jest określona (jest równa szerokości), tworzymy kwadrat
    Utworzy metody które zwracają:
            - obwód prostokąta
	- pole prostokąta
    Stwórz w metodzie main kilka prostokątów i wypisz na ekran ich pola.*/

    int gora;
    int lewy;
    int szerokosc;
    int wysokosc;

    public ProstokatKonstr(int gora, int lewy, int szerokosc, int wysokosc) {
        this.gora = gora;
        this.lewy = lewy;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public ProstokatKonstr(int szerokosc) {
        this.szerokosc = szerokosc;
        wysokosc = szerokosc;
    }

    public ProstokatKonstr(int gora, int lewy) {
        this.gora = gora;
        this.lewy = lewy;
        //szerokosc=0; domyslnie
        //wysokosc=0;
    }

    public int poleProstokata () {

        return (this.wysokosc)*(this.szerokosc);
    }

    public int obwProstokata () { //w () bo dodatkowe argumenty nie sa juz potrzebne, to bylby inny prostokat

        return ((this.wysokosc)+(this.szerokosc))*2;
    }

    public int getGora() {
        return gora;
    }

    public void setGora(int gora) {
        this.gora = gora;
    }

    public int getLewy() {
        return lewy;
    }

    public void setLewy(int lewy) {
        this.lewy = lewy;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

}
