import java.util.Objects;
public class Employe {
    int  identifiant,grade;
    String nom,prénom,nom_de_département;

    public Employe() {
    }

    public Employe(int identifiant, int grade, String nom, String prénom, String nom_de_département) {
        this.identifiant = identifiant;
        this.grade = grade;
        this.nom = nom;
        this.prénom = prénom;
        this.nom_de_département = nom_de_département;
    }


    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getNom_de_département() {
        return nom_de_département;
    }

    public void setNom_de_département(String nom_de_département) {
        this.nom_de_département = nom_de_département;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return identifiant == employe.identifiant && Objects.equals(nom, employe.nom);
    }


    @Override
    public String toString() {
        return "Employe{" +
                "identifiant=" + identifiant +
                ", grade=" + grade +
                ", nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", nom_de_département='" + nom_de_département + '\'' +
                '}';
    }
}
