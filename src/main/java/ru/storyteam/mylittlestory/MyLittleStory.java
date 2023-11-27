package ru.storyteam.mylittlestory;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import org.zeith.hammerlib.core.adapter.LanguageAdapter;

@Mod(MyLittleStory.MODID)
public class MyLittleStory {
    public static final String MODID = "mylittlestory";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MyLittleStory() {
        LanguageAdapter.registerMod(MODID);
    }
}
