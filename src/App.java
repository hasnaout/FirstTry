public class App {
    public static void main(String[] args) throws Exception {
       Bonhomme h1=new Bonhomme();
       h1.toString();
       Bonhomme h2= new Bonhomme();
       h2.bapteme("Hattam", "asma");
       for(int i = 0; i < 4; i++) h2.anniversaire();
       h2.toString();
       Bonhomme h3=new Bonhomme();
       h3.bapteme("Kilano", "lili");
       for(int i = 0; i < 20; i++) h3.anniversaire();
       h3.embauche("Ingénieur");
       h3.toString();
       Race r=new Race("Asiatique");
       Bonhomme h4=new Bonhomme(r, 19, 60, 40, "Abassi", "Ahmed", "ingenieur");
       h4.toString();
    }
}
