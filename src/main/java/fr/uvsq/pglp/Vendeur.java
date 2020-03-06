package fr.uvsq.pglp;

public class Vendeur implements AllEmploye {
    final private int base=2000;
    private int commission;
    public Vendeur(int commission) {
        this.commission=commission;
    }

    @Override
    public double salaire() {
        // TODO Auto-generated method stub
        return base+commission;
    }
}
