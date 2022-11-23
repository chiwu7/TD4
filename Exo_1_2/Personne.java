package Exo_1_2;

public class Personne {

  private String nom;
  private String prenom;
  private String numSecu;

  public Personne(String nom, String prenom, String numSec) {
    this.nom = nom;
    this.prenom = prenom;
    this.numSecu = numSec;
  }

  public String getNom() {
    return this.nom;
  }

  public String getPrenom() {
    return this.prenom;
  }

  public String getNumSecu(){
    return this.numSecu;
  }

  public boolean estHomme(){
    boolean result;
    char premierCarac = numSecu.charAt(0);
    if (premierCarac == '0'){
      result = true;
    } else {
      result = false;
    }
    return result;
  }

  @Override
  public String toString(){

    return nom.toUpperCase()+" "+prenom+" : " + numSecu;
  }
  public boolean equals(Personne obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Personne))
          return false;
        Personne personne = (Personne) obj;
        return personne.nom.equals(nom) && personne.prenom.equals(prenom) && personne.numSecu.equals(numSecu);
    }
}