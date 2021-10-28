import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        //1
        Simulation sim = new Simulation();
        //2
        ArrayList<Item> phase1 = sim.loadItems("phase 1.txt");
        ArrayList<Item> phase2 = sim.loadItems("phase 2.txt");
        //3.1
        ArrayList<Rocket> u1FleetPhase1 = sim.loadU1(phase1);
        ArrayList<Rocket> u1FleetPhase2 = sim.loadU1(phase2);
        //3.2
        ArrayList<Rocket> u2FleetPhase1 = sim.loadU2(phase1);
        ArrayList<Rocket> u2FleetPhase2 = sim.loadU2(phase2);
        //4
        int budgetU1phase1 = sim.runSimulation(u1FleetPhase1);
        System.out.println("Budget of U1 fleet for phase 1 = " + budgetU1phase1 + " (millions)");

        int budgetU1phase2 = sim.runSimulation(u1FleetPhase2);
        System.out.println("Budget of U1 fleet for phase 2 = " + budgetU1phase2 + " (millions)");

        System.out.println("Total budget of U1 fleet = " + (budgetU1phase1 + budgetU1phase2) + " (millions)\n");
        //5
        int budgetU2phase1 = sim.runSimulation(u2FleetPhase1);
        System.out.println("Budget of U2 fleet for phase 1 = " + budgetU2phase1 + " (millions)");

        int budgetU2phase2 = sim.runSimulation(u2FleetPhase2);
        System.out.println("Budget of U2 fleet for phase 2 = " + budgetU2phase2 + " (millions)");
 
        System.out.println("Total budget of U2 fleet = " + (budgetU2phase1 + budgetU2phase2) + " (millions)\n");
        System.out.print("So, we should choose the minimum cost which here is: ");
        if((budgetU1phase1 + budgetU1phase2)<(budgetU2phase1 + budgetU2phase2)) System.out.println("U1");
        else System.out.println("U2");
    }
}
