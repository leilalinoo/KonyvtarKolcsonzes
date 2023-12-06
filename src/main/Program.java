package main;

import model.Konyvtar;

public class Program {

    public static void main(String[] args) {
        Program program = new Program();
        program.feledat();
    }

    private void feledat() {
        Konyvtar konyvtar = new Konyvtar();
        konyvtar.run();
    }
}
