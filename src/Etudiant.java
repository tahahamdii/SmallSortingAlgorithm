import java.util.Collection;

public class Etudiant implements Comparable<Etudiant> {
    int id ;
    String nom ;
    String prenom ;


    public Etudiant (){
        this.id=id;
        this.nom=nom ;
        this.prenom=prenom;

    }
    public Etudiant (int id , String nom , String prenom){
        this.id=id;
        this.nom=nom ;
        this.prenom=prenom;

    }

    public void setId (int id) {
        this.id=id;
    }
    public int getId () {
        return id ;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom () {
        return nom ;
    }

    public void setPrenom (String prenom) {
        this.prenom=prenom;
    }
    public String getPrenom () {
        return prenom ;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Etudiant)) {
            return false;
        }
        Etudiant etudiant = (Etudiant) obj;
        return id == etudiant.id;
    }

    @Override
    public String toString() {
        return "identifiant=" + id + ", nom=" + nom + ", prenom=" + prenom ;
    }

    @Override
    public int compareTo(Etudiant o) {
        return this.id-o.getId();
    }
}
