package exo4;

public abstract class Forme {
    public abstract double calculerAire();
}

public class Cercle extends Forme {
    private double rayon;
    
    @Override
    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }
}