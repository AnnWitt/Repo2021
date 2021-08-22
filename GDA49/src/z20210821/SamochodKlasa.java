package z20210821;

public class SamochodKlasa {

    private String color="Czerwony";
private int przebieg=100000;
    private String marka;


    // gettery i settery
    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }


    public String getColor(){
        return color;
    }

    public void setColor (String colorWprowadzony) {  //kolor wprowadzony

        this.color = colorWprowadzony; //this to czerwony
    }

    //koniec get set

    //metoda
    public void wyswietlPrzegieg () {
        System.out.println(this.przebieg);

    }



}
