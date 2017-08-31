
public class Main {

    public static void main(String[] args) {
        String word = "carrot";
        Change change1 = new Change('a', 'b');
        word = change1.change(word);

        System.out.println(word);
    }
}
