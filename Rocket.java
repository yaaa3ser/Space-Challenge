
public class Rocket {
    int cost;
    int weight;
    int maxWeight;
    double launchExplosion;
    double landingCrash;
    int currentWeight;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        return this.currentWeight + item.weight <= maxWeight;
    }

    public void carry(Item item) {
        this.currentWeight += item.weight;
    }
    
}
