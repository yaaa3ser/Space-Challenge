
public class U_2 extends Rocket {
    public U_2 (){
        cost = 120;
        weight = 18000;
        maxWeight = 29000;
        launchExplosion = 0.0;
        landingCrash = 0.0;
        currentWeight = weight;
    }

    public boolean launch() {
        int randomValue = (int)(Math.random() * 100 + 1);
        this.launchExplosion = 4.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);

        return this.launchExplosion <= randomValue;
    }

    public boolean land() {
        int randomValue = (int)(Math.random() * 100 + 1);
        this.landingCrash = 8.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);

        return this.landingCrash <= randomValue;
    }
}
