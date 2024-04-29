public class Peripherique extends PC{
    int ID;
   String modele;
   

   public Peripherique(int id, String modele) {
    this.ID = id;
    this.modele = modele;
}
public int getId() {
    return ID;
}

public String getModele() {
    return modele;
}
   public double calculerPuissance(){
    return 0;
   }
}
