package z20210822.varargs;

public class SamochodV {
    private String model;
    private TypSilnikaEn typSilnika;
    private String kolor;
    private String marka;
    private Silnik silnik;


    public SamochodV() { }

    public static SamochodBuilder builderCar () {
        return new SamochodBuilder();
    }

    public static final class SamochodBuilder { //builder
        private String model;
        private TypSilnikaEn typSilnika;
        private String kolor;
        private String marka;
        private Silnik silnik;

        public SamochodBuilder withModel(String model){ // dla kazdego z powyzszych
            this.model=model;
            return this;
        }

        public SamochodBuilder withtypSilnika(TypSilnikaEn typSilnika){ // dla kazdego z powyzszych
            this.typSilnika=typSilnika;
            return this;
        }

        public SamochodBuilder withSilnik(Silnik silnik){ // dla kazdego z powyzszych
            this.silnik=silnik;
            return this;
        }

        public SamochodBuilder withkolor(String kolor){ // dla kazdego z powyzszych
            this.kolor=kolor;
            return this;
        }

        public SamochodBuilder withMarka(String marka){ // dla kazdego z powyzszych
            this.marka=marka;
            return this;
        }



        public SamochodV build(){
            SamochodV car = new SamochodV();
            car.model = this.model;
            car.marka = this.marka;
            car.silnik = this.silnik;
            car.typSilnika = this.typSilnika;
            car.kolor = this.kolor;
            return car;
        }


    }
    //koniec SamochodBuilder

    public String getModel() {
        return model;
    }

    public TypSilnikaEn getTypSilnika() {
        return typSilnika;
    }

    public String getKolor() {
        return kolor;
    }

    public String getMarka() {
        return marka;
    }





}
