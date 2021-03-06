package Sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

public class Sheep {
//    private static final int GRAVITY = 0;
    private Vector3 position;
    private Vector3 velocity;

    private Texture sheep;

    public Sheep(int x, int y) {
        position = new Vector3(x, y, 0);
        velocity = new Vector3(0,0,0);
        sheep = new Texture("SheepS.png");
    }

    public void update(float dt) {
//        velocity.add(0, GRAVITY, 0);
        velocity.scl(dt);
        position.add(0, velocity.y, 0);

        velocity.scl(1/dt);
    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getTexture() {
        return sheep;
    }

    public void jump() {
        velocity.y = 380;
    }
}
