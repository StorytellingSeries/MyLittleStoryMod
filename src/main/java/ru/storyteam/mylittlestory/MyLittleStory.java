package ru.storyteam.mylittlestory;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.zeith.hammerlib.core.adapter.LanguageAdapter;
import ru.storyteam.mylittlestory.init.StoryItems;

@Mod(MyLittleStory.MODID)
public class MyLittleStory {
    public static final String MODID = "mylittlestory";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab("mylittlestory") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return StoryItems.GOLD_TROPHY.getDefaultInstance();
        }
    };

    public MyLittleStory() {
        LanguageAdapter.registerMod(MODID);
    }
}
