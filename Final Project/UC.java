public class UC extends PC{

    double freq_CPU;
    int capacite_RAM;
    double puissance;
    
    public UC(double freq_CPU, int capacite_RAM, double puissance) {
        this.freq_CPU = freq_CPU;
        this.capacite_RAM = capacite_RAM;
        this.puissance = puissance;
    }

    public double getPuissance() {
        return puissance;
    }
    
}