package com.tomthomas.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.tomthomas.game.ZooRun;

import Sprites.Sheep;

public class PlayState extends State {
    private Texture background;
    private Sheep sheep;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("MainBG.png");
        sheep = new Sheep(50, 249);
    }

    @Override
    protected void handleInput() {
        if (Gdx.input.justTouched()){
            sheep.jump();
        }

    }

    @Override
    public void update(float dt) {
        handleInput();
        sheep.update(dt);

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, ZooRun.WIDTH, ZooRun.HEIGHT);
        sb.draw(sheep.getTexture(), sheep.getPosition().x, sheep.getPosition().y);
        sb.end();


    }

    @Override
    public void dispose() {

    }
}
