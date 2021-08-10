package me.pm.dragoncosmetics;

import me.pm.dragoncosmetics.utils.Util;
import net.fabricmc.api.ModInitializer;

import java.util.ArrayList;
import java.util.List;

public class Main implements ModInitializer {

    public static String MOD_ID = "DRACOSM";

    public static List<String> wing_users = new ArrayList<>();

    @Override
    public void onInitialize() {
        Util.loadWingUsers();
    }
}
