
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
           printWithSmileys("Methodd");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        
        if (characterString.length() % 2 == 0){
            characterString = ":)" + " " + characterString + " " + ":)";
        }
        
        if (characterString.length() % 2 == 1){
            characterString = ":)" + " " + characterString + "  " + ":)";
        }
        
        String smiley = ":)";
        
        for (int i = 0 ; i < characterString.length()/2; i++){
            System.out.print(smiley);
        }
        System.out.println();
        System.out.println(characterString);
        for (int i = 0 ; i < characterString.length()/2; i++){
            System.out.print(smiley);
        }
    }
}
