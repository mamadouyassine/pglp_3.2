package fr.uvsq.pglp;
import java.util.ArrayList;
import static junit.framework.Assert.assertTrue;

public class AllEmployeTest {
    public void test() {
        Vendeur v1 = new Vendeur(10);
        Vendeur v2 = new Vendeur(20);
        Employe e1=new Employe(2010);
        Employe e2=new Employe(2005);
        Manageur M1=new Manageur(10);
        Manageur M2=new Manageur(20);
        ArrayList <AllEmploye> listEmploye=new ArrayList<AllEmploye>();
        listEmploye.add(v1);
        listEmploye.add(v2);
        listEmploye.add(e2);
        listEmploye.add(e1);
        listEmploye.add(M1);
        listEmploye.add(M2);
        double salaireTotal=0;
        for(int i=0;i < listEmploye.size();i++)
            salaireTotal+=listEmploye.get(i).salaire();
        assertTrue(salaireTotal==13055);
    }
}
