public class Main {
    
    public static void main(String[] args) {

        UC uc = new UC(3.5, 8, 500);
        Peripherique[] peripheriques = new Peripherique[]{
            new Clavier(1, "Logitech", 102, 5),
            new Moniteur(2, "Dell", 5, 18, 1700)
        };

        PC pc0 = new PC(uc, peripheriques);

        double puissanceMoniteur = ((Moniteur) peripheriques[1]).calculerPuissance();
            System.out.println("Puissance du moniteur : " + puissanceMoniteur + " Watts.");


}
}
