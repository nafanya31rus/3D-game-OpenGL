package test;

import com.game.core.EngineManager;
import com.game.core.WindowManager;
import com.game.core.utils.Consts;
import org.lwjgl.Version;

public class Launcher {

    private static WindowManager window;
    private static EngineManager engine;

    public static void main(String[] args) {
        window = new WindowManager(Consts.TITLE, 1600, 900, false);
        engine = new EngineManager();
        try {
            engine.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WindowManager getWindow() {
        return window;
    }
}
