package Zadania.Do_Zrobienia.ZWczesniejszych.pkg.OX_od_nowa.pkg;

public class plansza {
    // final oznacza ze to jest stala tzn. taka zmienna ktorej po piewszym nadaniu
    // wartosic nie moge zmienic
    public final static int ROZMAR_PALNSZY = 3;
    public final static char KOLKO = 'o';
    public final static char KRZYZYK = 'x';
    private char[][] daneGry = new char[ROZMAR_PALNSZY][ROZMAR_PALNSZY];
    private char ostatnioWstawionyZnak;
    private boolean czyKoniecGry;
    public boolean czyKoniecGry() {
        // na prace domowa
        // dokonczyc ponizsze metody i cala czyKoniecGry
        sprawdzCzyKoniecWPionie();
        sprawdzCzyKoniecWPoziomie();
        sprawdzCzyKoniecWPrawejPrzekatnej();
        sprawdzCzyKoniecWLewejPrzekatnej();
        sprawdzCzyPlanszaPelna();
        //ustatwic konic gry lub nie
        czyKoniecGry = true;
        return false;
    }
    private boolean sprawdzCzyKoniecWPionie() {
        return false;
    }
    private boolean sprawdzCzyKoniecWPoziomie() {
        return false;
    }
    private boolean sprawdzCzyKoniecWPrawejPrzekatnej() {
        return false;
    }
    private boolean sprawdzCzyKoniecWLewejPrzekatnej() {
        return false;
    }
    private boolean sprawdzCzyPlanszaPelna() {
        return false;
    }
    public boolean postawZnak(char znak, int x, int y) {
        // sprawdz czy moge
        if (czyMogePostawicZnak(znak, x, y)) {
            daneGry[x][y] = znak;
            ostatnioWstawionyZnak = znak;
            return true;
        }
        return false;
    }
    private boolean czyMogePostawicZnak(char znak, int x, int y) {
        // na prace domowe
        // 1 sprawidzic czy podany znako jest ok
        // sprawdzić czy podane wspolrzedne sa ok
        if (daneGry[x][y] == KRZYZYK || daneGry[x][y] == KOLKO) {
            return false;
        }
        return true;
    }
    public void narysujPlansze() {
        for (int i = 0; i < ROZMAR_PALNSZY; i++) {
            for (int j = 0; j < ROZMAR_PALNSZY; j++) {
                System.out.print(daneGry[i][j]);
            }
            System.out.println();
        }
    }
    public String podajZwyciezce() {
        if (czyKoniecGry) {
            if (ostatnioWstawionyZnak == KOLKO) {
                return "Wygral gracz KOLKO;";
            }
            return "Wygral gracz KRZYZYk";
        }
        return "remis????";
    }

}
