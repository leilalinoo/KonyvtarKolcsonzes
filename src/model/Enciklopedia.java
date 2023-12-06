package model;

import java.util.UUID;

public class Enciklopedia extends AbstractTermek {

    private boolean hasznalatban; //kikölcsönözni nem lehet, de lehet, hogy valaki éppen a könyvtárban olvassa

    public Enciklopedia(String szerzo, String cim, ALLAPOT allapot) {
        super(szerzo, cim, allapot);
        this.hasznalatban = false;
    }

    public void eppOlvassak() {
        this.hasznalatban = true;
    }

}
