package BlokiTematyczne.Obiektowosc.ModyfikatoryDostepuPKG;

class Main {
    public static void main(String[] args) {

        ModyfikatoryDostepu md=new ModyfikatoryDostepu();
        //int a=md.metodaPrivate; //blad
        //md.setMetodaPrivate(3); blad jeżeli w getter/setrer jest private, jesli public to zadziala
        md.setMetodaDefault(1);
        md.setMetodaPublic(2);
        int b=md.getMetodaPublic();
        int b2=md.metodaPublic=20; //bezposrednie wywolanie ,metody bez gettera i settera. dla private nie zadziala

        int c=md.getMetodaDefault();

        System.out.println("public " + b + " default " + c + " - private nie zadziala bo inna clasa " + " b2 " + b2);
        System.out.println("ale jesli w tej samej klasie");

        Main mdprvclass=new Main();
        mdprvclass.setMetodaPRVwklasie(10);
        System.out.println("metoda prv ale w tej samej klasie " + mdprvclass.getMetodaPRVwklasie());
    }

    private int metodaPRVwklasie;

    private int getMetodaPRVwklasie() {
        this.metodaPRVwklasie=metodaPRVwklasie+3;
        return this.metodaPRVwklasie;
    }
    private void setMetodaPRVwklasie(int mprvcl) {
        metodaPRVwklasie = mprvcl;
    }
}

class ModyfikatoryDostepu {

    private int metodaPrivate;
    public int metodaPublic;
    int metodaDefault;

    private void setMetodaPrivate (int mprv) {
        metodaPrivate=mprv;
    }
    private int getMetodaPrivate() {
        return metodaPrivate;
    }

    public int getMetodaPublic() {
        return metodaPublic;
    }
    public void setMetodaPublic(int mpubl) {
        metodaPublic = mpubl;
    }


    int getMetodaDefault() {
        return metodaDefault;
    }
   void setMetodaDefault(int mdef) {
        metodaDefault = mdef;
    }
}
