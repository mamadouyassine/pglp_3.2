package fr.uvsq.pglp;

public class Employe implements AllEmploye {
    final private int salaire=1500;
    private int startyear;
    public Employe(int startyear) {
        this.startyear=startyear;
    }
    @Override
    public double salaire() {
        // TODO Auto-generated method stub
        return salaire+(2020-this.startyear);
    }



}
