public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(1, "taha", "hamdi");
        Etudiant e2 = new Etudiant(2, "h", "a");
        Etudiant e3 = new Etudiant(3, "za", "ra");

        EspritVector universite = new EspritVector();

        universite.ajouterEtudiant(e1);
        universite.ajouterEtudiant(e2);
        universite.ajouterEtudiant(e3);

        System.out.println("Recherche d'un étudiant par nom : " + universite.rechercherEtudiantParNom("Martin"));
        System.out.println("Recherche d'un étudiant : " + universite.rechercherEtudiant(e1));
        System.out.println("Liste des étudiants :");
        universite.afficherEtudiants();

        universite.trierEtudiantsParId();
        System.out.println("Liste des étudiants triée par id :");
        universite.afficherEtudiants();
    }
}
