package model;

import java.util.UUID;

public abstract class AbstractTermek {

    //UUID
    //id, hossz, szerzo, cim, allapot (enum), kidobando
    private UUID id;
    private String szerzo;
    private String cim;

    enum ALLAPOT {
        JOALLAPOTU, KIVALLO, ENYHENSERULT, SZAKADT
    };
    private ALLAPOT allapot;
    private boolean kidobando;

    public AbstractTermek(String szerzo, String cim, ALLAPOT allapot) {
        this.id = UUID.randomUUID();  // UUID uuid = UUID.randomUUID();
        this.szerzo = szerzo;
        this.cim = cim;
        this.allapot = allapot;
        this.kidobando = false;
    }

    public void kuka(UUID id) {
        this.kidobando = true;
        System.out.println("Ezt a könyvet nem lehet kikölcsönözni!");
    }

    public void allapotValtozas(ALLAPOT ujAllapot) {
        this.allapot = ujAllapot;
    }

    public UUID getId() {
        return id;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getCim() {
        return cim;
    }

    public ALLAPOT getAllapot() {
        return allapot;
    }

    @Override
    public String toString() {
        return "AbstractTermek{" + "id=" + id + ", szerzo=" + szerzo + ", cim=" + cim + ", allapot=" + allapot + '}';
    }

}
