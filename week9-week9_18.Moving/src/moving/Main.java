package moving;

import moving.domain.*;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(1000);
        Item item = new Item("Stone", 1001);
        box.addThing(item);
    }
}
