public interface University {
    void ajouterEtudiant(Etudiant etudiant);
    boolean rechercherEtudiant(Etudiant etudiant);
    boolean rechercherEtudiantParNom(String nom);
    void supprimerEtudiant(Etudiant etudiant);
    void afficherEtudiants();
    void trierEtudiantsParId();
    void trierEtudiantsParNom();
}
