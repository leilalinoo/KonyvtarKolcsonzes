package model;

public class Konyv extends AbstractTermek implements Kolcsonozheto {

    boolean kolcsonozheto;

    public Konyv(String szerzo, String cim, ALLAPOT allapot) {
        super(szerzo, cim, allapot);
        this.kolcsonozheto = true;
    }

    @Override
    public void kolcsonoz(int tulSzam) {
        this.kolcsonozheto = false;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
