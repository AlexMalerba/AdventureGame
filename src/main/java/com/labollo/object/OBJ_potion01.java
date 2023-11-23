package com.labollo.object;

import java.io.IOException;
import java.util.Objects;

import static javax.imageio.ImageIO.read;

public class OBJ_potion01 extends SuperObject {

    public OBJ_potion01 () {
        name = "heart00";
        try {
            image = read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/potion01.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        collision = true;
    }
}
