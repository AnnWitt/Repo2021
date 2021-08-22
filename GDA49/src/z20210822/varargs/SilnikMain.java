package z20210822.varargs;

public class SilnikMain {
    public static void main(String[] args) { //tak tworzymy obiekty
        Silnik silnik= Silnik.builder()
                .withMoc(10)
                .withPojemnosc("2.0")
                .withKolor("bialy")
                .withTypSilnika(TypSilnikaEn.Diesel)
                .withModel("Seat")
                .build();
        System.out.println("silnik moc " + silnik.getMoc() + "\n" +"pojemnosc " + silnik.getPojemnosc() +"\n" + "kolor "+
                silnik.getKolor() + "\n" + "typ silnika " +  silnik.getTypSilnika() + "\n" + "model " + silnik.getModel() );

    }
}


