public class Bonhomme {
  private static int  num=0;
  private Race race ;
  private int age,poids,taille,ID;
  private String nom,prenom,profession;

  public Bonhomme(){
      num++;               
        this.ID = num;        
        this.age = 0;
        this.poids = 3;
        this.taille = 50;
        this.race = new Race("Non défini"); // valeur par défaut
        this.nom = "";
        this.prenom = "";
        this.profession = "";
  }

  public Bonhomme(Race race,int age , int poids , int taille,String nom,String prenom,String profession){
   num++;
   this.ID = num;
   this.race=race;
   this.age=age;
   this.poids=poids;
   this.taille=taille;
   this.nom=nom;
   this.prenom=prenom;
   this.profession=profession;
  }

  public void  bapteme(String nom,String prenom ){
     this.nom=nom;
     this.prenom=prenom;

  }

  public void anniversaire(){
    this.age++;
  }

  public void embauche(String profession){
    this.profession=profession;

  }

  public String toString(){
    System.out.println("=========Informatiosn========");
      System.out.println("Identification :"+ID);
      System.out.println("Nom :"+prenom+""+nom.toUpperCase());
      System.out.println("Race :"+race);
      System.out.println("Age : " + age);
      System.out.println("Poids : " + poids);
      System.out.println("Taille : " + taille);
      System.out.println("Profession : " + profession);
      return "";
  }

}
