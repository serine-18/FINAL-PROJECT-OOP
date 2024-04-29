public class PC {

        UC uc;
        Peripherique[] peripheriques;

        public PC() {
            
        }
    
        public PC(UC uc, Peripherique[] peripheriques) {
            this.uc = uc;
            this.peripheriques = peripheriques;
        }
        
    public PC(PC pc) {
        this.uc = pc.uc;
        this.peripheriques = pc.peripheriques;
    }
    
}