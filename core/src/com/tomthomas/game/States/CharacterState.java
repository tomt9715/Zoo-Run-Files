package com.tomthomas.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.tomthomas.game.ZooRun;

public class CharacterState extends State {
    private Texture background;
    private Texture sheepBtn;
    private Texture dogBtn;
    private Texture gorillaBtn;

    public CharacterState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("CharacterScreenBG.png");
        sheepBtn = new Texture("SheepS.png");
        dogBtn = new Texture("DogS.png");
        gorillaBtn = new Texture("GorillaS.png");
    }

    @Override
    protected void handleInput() {
        if (Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
            dispose();
        }

    }

    @Override
    public void update(float dt) {
        handleInput();

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0,0, ZooRun.WIDTH, ZooRun.HEIGHT);
        sb.draw(sheepBtn, (ZooRun.WIDTH / 2) - (sheepBtn.getWidth() / 2), ZooRun.HEIGHT / 2);
        sb.draw(dogBtn, (ZooRun.WIDTH / 2) - (dogBtn.getWidth() / 2), ZooRun.HEIGHT / 2);
        sb.draw(gorillaBtn, (ZooRun.WIDTH) / 2 - (gorillaBtn.getWidth() / 2), ZooRun.HEIGHT / 2);
        sb.end();

    }

    @Override
    public void dispose() {
        background.dispose();
        sheepBtn.dispose();
        dogBtn.dispose();
        gorillaBtn.dispose();

    }
}
