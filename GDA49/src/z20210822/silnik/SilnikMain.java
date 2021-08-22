package z20210822.silnik;

public class SilnikMain {
    public static void main(String[] args) { //tak tworzymy obiekty
        Silnik silnik=Silnik.builder()
                .withMoc(10)
                .withPojemnosc("2.0")
                .build();
        System.out.println("silnik - parametry " + silnik.getMoc() + " xxx " + silnik.getPojemnosc());

    }
}


