public class Clavier extends Peripherique{
    int NbTouches;
    double puissance;

    //Constructeur 
    public Clavier(int id, String modele, int NbTouches, double puissance) {
        super(id, modele); 
        this.NbTouches = NbTouches;
        this.puissance = puissance;
    }
    
    @Override
    public double calculerPuissance() {
        return puissance;
    }
}
