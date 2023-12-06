package model;

public class Konyvtar {

    private AbstractTermek[] termekek;
    static int termekDb;

    public Konyvtar() {
        this(5);
    }

    public Konyvtar(int db) {
        termekek = new AbstractTermek[db];
        termekDb = 0;
    }

    public void run() {
        Konyv konyv1 = new Konyv("Babits", "Könyv címe", AbstractTermek.ALLAPOT.KIVALLO);
        felvesz(konyv1);
        System.out.println(konyv1.toString());
    }

    private void kolcsonozheto() {

    }

    private void felvesz(AbstractTermek termek) {
        if (termekDb < termekek.length) {
            termekek[termekDb++] = termek;
        } else {
            System.out.println("Elfogytak a könyvek!");
            //String uzenet = "Elfogytak a könyvek!";
        }
    }

}
