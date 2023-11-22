import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hopital {
    public Map<Medecin, ListPatients> medecinPatients;

    public Hopital() {
        this.medecinPatients = new HashMap<>();
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatients.put(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatients.containsKey(m)) {
            medecinPatients.get(m).ajouterPatient(p);
        } else {
            System.out.println("Le médecin n'est pas enregistré dans l'hôpital.");
        }
    }

    // Avec l'API Stream
    public void afficherMap() {
        medecinPatients.forEach((medecin, listPatients) ->
                System.out.println("Médecin: " + medecin + "\nPatients: " + listPatients));
    }

    // Afficher les patients d’un médecin dont le nom est "Mohamed"
    public void afficherMedecinPatients(Medecin m) {
        if (medecinPatients.containsKey(m)) {
            ListPatients patients = medecinPatients.get(m);
            patients.afficherPatients(); // Assurez-vous que ListPatients a une méthode afficherPatients()
        } else {
            System.out.println("Le médecin n'est pas enregistré dans l'hôpital.");
        }
    }
}
