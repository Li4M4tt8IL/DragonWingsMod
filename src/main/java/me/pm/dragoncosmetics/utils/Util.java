package me.pm.dragoncosmetics.utils;

import me.pm.dragoncosmetics.Main;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Util {
    public static int rainbow(int delay) {
        double rainbowState = Math.ceil((System.currentTimeMillis() + delay) / 20);
        rainbowState %= 360;
        return Color.getHSBColor((float) (rainbowState / 360.0f), 0.8f, 0.7f).getRGB();
    }

    public static void loadWingUsers() {
        try {
            URL url = new URL("https://raw.githubusercontent.com/Li4M4tt8IL/PMHack_Info/master/players.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = br.readLine()) != null) {
                Main.wing_users.add(line);
            }
            br.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
