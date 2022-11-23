/*package Exo_1_1;

public class RectangleColore extends Rectangle {

  private String couleur;

  public RectangleColore(double la, double ha, String nom) {
    super(la, ha);
    this.couleur = nom;
  }

  @Override
  public String toString() {
    return super.toString() + "\nCouleur : " + couleur;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || !(obj instanceof RectangleColore))
      return false;
    // Autorisé car transtypage vérifié
    RectangleColore rec = (RectangleColore) obj;
    return Double.compare(rec.haut, haut) == 0 && Double.compare(rec.larg, larg) == 0 && rec.couleur.equals(couleur);
}
}*/