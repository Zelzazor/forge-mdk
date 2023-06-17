package com.zelzazor.zelzazor.item;

import com.zelzazor.zelzazor.ZelzazorMod;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ZelzazorMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
  public static CreativeModeTab ZELZAZOR_TAB;

  @SubscribeEvent
  public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
    ZELZAZOR_TAB = event.registerCreativeModeTab(new ResourceLocation(ZelzazorMod.MOD_ID, "zelzazor_tab"),
      builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_OPAL.get()))
      .title(Component.translatable("itemGroup.zelzazor_tab")));
  }
}
