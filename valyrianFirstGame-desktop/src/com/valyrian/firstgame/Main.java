package com.valyrian.firstgame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "valyrianFirstGame";
		cfg.useGL20 = true;
		cfg.width = 640;
		cfg.height = 480;
		
		new LwjglApplication(new PrimerJuego(), cfg);
	}
}
