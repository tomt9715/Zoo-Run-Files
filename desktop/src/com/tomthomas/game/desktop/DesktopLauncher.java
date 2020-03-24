package com.tomthomas.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tomthomas.game.ZooRun;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = ZooRun.WIDTH;
		config.height = ZooRun.HEIGHT;
		config.title = ZooRun.TITLE;
		new LwjglApplication(new ZooRun(), config);
	}
}
