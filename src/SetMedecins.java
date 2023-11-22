import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.TreeSet;

public class SetMedecins {
    private Set<Medecin> setM;

    public SetMedecins() {
        this.setM = new HashSet<>();
    }

    public void ajouterMedecin(Medecin m) {
        setM.add(m);
    }


    public boolean rechercherMedecin(int cin) {
        return setM.stream().anyMatch(medecin -> medecin.getCin() == cin);
    }


    public void afficherMedecins() {
        setM.forEach(System.out::println);
    }


    public long nombreMedecins() {
        return setM.stream().count();
    }


    public TreeSet<Medecin> trierMedecins() {
        return setM.stream()
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
