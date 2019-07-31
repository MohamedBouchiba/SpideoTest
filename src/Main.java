import java.util.*;

public class Main {

    private static  Map<Integer, Integer> t = new HashMap<Integer, Integer>();

// Fonction récursive qui maximise et return le nombre de Cake que
// l'on peut prendre (voler) selon la capacité de son sac et le poids du Cake
    public static int maxDuffelBagValue(List<CakeType> listeCake, int capacity){
        // On vérifie que la clef "capacity" n'est pas dans le dictionnaire T
        // True : On fait une insertion dans le dictionnaire
        // False : On return la valeur de la clef "capacity"
        if (!t.containsKey(capacity)) {
            // On initialise à zéro la valeur de la clef capacity
            t.put(capacity,0);
            // On parcourt chaque élément de la liste de Cake
            for (CakeType i: listeCake) {
                // On vérifie que le poids du cake actuel est bien inférieur à la capacity restante du sac
                if (i.getWeight()<= capacity) {
                    // On prend la maximum de la valeur entre celle-ci retourné par la récursivité et la
                    // valeur de la clef capacity du tableau T
                    t.put(capacity,Math.max(t.get(capacity),
                            maxDuffelBagValue(listeCake,capacity - i.getWeight()) + i.getValue()));
                }
            }
        }
        return t.get(capacity);


    }

    public static void main(String[] args) {
        List<CakeType> cakeTypes = Arrays.asList(
                new CakeType(7, 160),
                new CakeType(3, 90),
                new CakeType(2, 15));

        int capacity = 20;

        System.out.println(maxDuffelBagValue(cakeTypes, capacity));

    }
}
