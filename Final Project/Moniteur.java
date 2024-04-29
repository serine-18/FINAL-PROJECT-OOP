public class  Moniteur extends Peripherique {
    
    int ClDeConsommation;
    int dimension;
    int resolutionMax;
    
     //Constructeur 
     public Moniteur(int id, String modele, int classe_consommation, int dimension, int resolutionMax) {
        super(id, modele);
        this.ClDeConsommation = classe_consommation;
        this.dimension = dimension;
        this.resolutionMax = resolutionMax;
    }

    @Override
    public double calculerPuissance(){
      return (ClDeConsommation * dimension + resolutionMax * 0.015);
      
    }
    
}
