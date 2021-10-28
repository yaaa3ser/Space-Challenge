import java.io.*;
import java.util.*;

public class Simulation {
    
    public ArrayList<Item> loadItems(String fileName) throws Exception {
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        ArrayList<Item> items = new ArrayList();

        while(input.hasNextLine()){
            String line = input.nextLine();
            String[] oneItem = line.split("=");
            items.add(new Item(oneItem[0], Integer.valueOf(oneItem[1])));   
        }
        return items;
    }
    
    public ArrayList<Rocket> loadU1(ArrayList<Item> Items){
        Rocket rocket = new U_1();
        ArrayList<Rocket> u1_fullyLoaded = new ArrayList(); 
        
        for(Item i : Items){
            while(!rocket.canCarry(i)){
                u1_fullyLoaded.add(rocket);
                rocket = new U_1();
            }
            rocket.carry(i);
        }
        u1_fullyLoaded.add(rocket);
        return u1_fullyLoaded;
    }
    
    public ArrayList<Rocket> loadU2(ArrayList<Item> Items){
        Rocket rocket = new U_2();
        ArrayList<Rocket> u2_fullyLoaded = new ArrayList(); 
        
        for(Item i : Items){
            while(!rocket.canCarry(i)){
                u2_fullyLoaded.add(rocket);
                rocket = new U_2();
            }
            rocket.carry(i);
        }
        u2_fullyLoaded.add(rocket);
        return u2_fullyLoaded;
    }
    
    public int runSimulation(ArrayList<Rocket> list){
        int cnt = 0;
        for(Rocket r : list){
            while(!r.launch()){
                cnt++;
                r.launch();
            }
            while(!r.land()){
                cnt++;
                r.land();
            }
        }
        int budget = (list.size() + cnt)*list.get(0).cost;
        return budget;
    }
}
