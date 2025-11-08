public class Race {
    private String race;
    public Race(String race) {
        if(race.equals("Africain") || race.equals("Caucasien") ||
           race.equals("Asiatique") || race.equals("Indien Américain") || race.equals("Métis")) {
            this.race = race;
        } else {
            this.race = "Non défini"; 
        }
    }

    // Getter pour race
    public String getRace() {
        return race;
    }
  public String toString(){
    return race;
}

}

