import javafx.scene.Group;

import java.util.ArrayList;

public  class Space {
    public Group Create_Space() {
        Group Landscape = new Group();
        ArrayList<StaticThing> Landscape_Array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                Landscape_Array.add(new StaticThing("Ressources/space.png", i * 800, 0));
            } else {
                Landscape_Array.add(new StaticThing("Ressources/space2.png", i * 800, 0));
            }
            Landscape.getChildren().add(Landscape_Array.get(i).getImage());
        }
        return Landscape;
    }
}
