import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EspritArrayList implements University {
    private ArrayList<Etudiant> etudiants = new ArrayList<>();

    @Override
    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant etudiant) {
        return etudiants.contains(etudiant);
    }

    @Override
    public boolean rechercherEtudiantParNom(String nom) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant etudiant) {
        etudiants.remove(etudiant);
    }

    @Override
    public void afficherEtudiants() {
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(this.etudiants);
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(etudiants, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant o1, Etudiant o2) {
                return o1.getNom().compareTo(o2.getNom());
            }
        });
    }
}
