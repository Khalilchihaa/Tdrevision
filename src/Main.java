
public class Main {
    public static void main(String[] args) {
        // Création de patients
        Patient patient1 = new Patient(123,"mohamed","khalil" ,123456789);
        Patient patient2 = new Patient(456, "mnejja","yassine",456789012);
        Patient patient3 = new Patient(789,"loukil","fares", 789012345);

        // Création de médecins
        Medecin medecin1 = new Medecin(111, "Dupont", "Jean", 001);
        Medecin medecin2 = new Medecin(222, "Martin", "Alice", 002);

        // Création d'une liste de patients
        ListPatients listePatients = new ListPatients();
        listePatients.ajouterPatient(patient1);
        listePatients.ajouterPatient(patient2);
        listePatients.ajouterPatient(patient3);

        // Affichage des patients sans redondance
        listePatients.patientSansRedondance();

        // Création d'un ensemble de médecins
        SetMedecins setMedecins = new SetMedecins();
        setMedecins.ajouterMedecin(medecin1);
        setMedecins.ajouterMedecin(medecin2);

        // Affichage des médecins
        setMedecins.afficherMedecins();

        // Création d'un hôpital
        Hopital hopital = new Hopital();

        // Ajout de médecins à l'hôpital
        hopital.ajouterMedecin(medecin1);
        hopital.ajouterMedecin(medecin2);

        // Ajout de patients à l'hôpital
        hopital.ajouterPatient(medecin1, patient1);
        hopital.ajouterPatient(medecin2, patient2);

        // Affichage de la carte de l'hôpital
        hopital.afficherMap();

        // Affichage des patients d'un médecin spécifique
        hopital.afficherMedecinPatients(medecin1);

    }
}