/*package Exo_1_1;

public class Rectangle {

  private double largeur;
  private double hauteur;

  public Rectangle (double la, double ha) {
    this.largeur = la;
    this.hauteur = ha;
  }

  public double getLargeur(){
    return largeur;
  }

  public double getHauteur(){
    return hauteur;
  }

  public String toString() {
    return "Rectangle : \nLargeur : " + largeur + "\n" + "Hauteur : " + hauteur;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || !(obj instanceof Rectangle))
      return false;
    // Autorisé car transtypage vérifié
    Rectangle rectangle = (Rectangle) obj;
    return Double.compare(rectangle.hauteur, hauteur) == 0 && Double.compare(rectangle.largeur, largeur) == 0;
}
    
  }*/
