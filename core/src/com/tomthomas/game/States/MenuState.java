package com.tomthomas.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.tomthomas.game.ZooRun;

public class MenuState extends State{
    private Texture background;
    private Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("ZooRunBGMobile.png");
        playBtn = new Texture("StartBtn.png");
    }

    @Override
    public void handleInput() {
        if(Gdx.input.justTouched()) {
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
        sb.draw(playBtn, (ZooRun.WIDTH / 2) - (playBtn.getWidth() / 2), ZooRun.HEIGHT / 2);
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
    }
}
