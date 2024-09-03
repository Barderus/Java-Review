import java.util.ArrayList;

public class enhancedLoop {
    public static void main(String[] args) {

        String[] animals = {"cat", "dog", "rat", "bird", "tarantula"};

        // For each index in the list animals, display i
        for(String i : animals){
            System.out.println(i);
        }
        System.out.println();
        ArrayList<String> countries = new ArrayList<>();

        countries.add("Brazil");
        countries.add("Canada");
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Germany");

        for(String i : countries){
            System.out.println(i);
        }

    }
}
