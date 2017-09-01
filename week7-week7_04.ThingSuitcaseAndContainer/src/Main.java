public class Main {
    public static void main(String[] args) {
        Thing brick = new Thing("Brick", 4);
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(book);
        suitcase.addThing(brick);
        suitcase.addThing(mobile);
        

        Thing heaviest = suitcase.heaviestThing();
        System.out.println("The heaviest thing: " + heaviest);
        
        
    }
}
