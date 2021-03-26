package fr.ul.rollingball.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import fr.ul.rollingball.RollingBall;


public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.a = 8;
		config.height = 720;
		config.width = 1024;
		config.title = "RollingBall";
		new LwjglApplication(new RollingBall(), config);
	}
}