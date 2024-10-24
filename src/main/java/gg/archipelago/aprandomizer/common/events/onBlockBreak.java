package gg.archipelago.aprandomizer.common.events;

import gg.archipelago.aprandomizer.APRandomizer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod.EventBusSubscriber
public class onBlockBreak {

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    
    @SubscribeEvent
    static void onPlayerBlockInteract(BlockEvent.BreakEvent event) {
        
        
        if(APRandomizer.isJailPlayers())
        {
            event.setCanceled(true);
            event.getPlayer().sendSystemMessage(Component.literal("No!"));
        }
        else
        {            
            //Good Place to beeeeee

            event.getPlayer().sendSystemMessage(Component.literal("Good Jorb!"));

            ItemStack stack = new ItemStack(Item.byId(424).asItem());
            event.getPlayer().addItem(stack);
        }
    }
}
