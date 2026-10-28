package com.example.adminmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdminMod implements ModInitializer {
    public static final String MOD_ID = "adminmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Fabric Admin Suite 26.3 伺服器管理員 Mod 已經成功載入！");
    }
}
