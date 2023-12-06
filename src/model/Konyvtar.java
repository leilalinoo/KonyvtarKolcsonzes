package model;

public class Konyvtar {

    private AbstractTermek[] abstraktTermekek;
    static int abstractTermekDb;

    public Konyvtar() {
        this(5);
    }

    public Konyvtar(int db) {
        abstraktTermekek = new AbstractTermek[db];
        abstractTermekDb = 0;
    }

}
