package me.pm.dragoncosmetics;

import me.pm.dragoncosmetics.utils.Util;
import net.fabricmc.api.ModInitializer;

import java.util.ArrayList;
import java.util.List;

public class Main implements ModInitializer {

    /*
    * Author: ThatsNotLiam1337
    * */

    public static String MOD_ID = "dracosm";

    public static List<String> wing_users = new ArrayList<>();

    @Override
    public void onInitialize() {
        Util.loadWingUsers();
    }
}
