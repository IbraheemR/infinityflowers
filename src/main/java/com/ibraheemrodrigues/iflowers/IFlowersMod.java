package com.ibraheemrodrigues.iflowers;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class IFlowersMod implements ModInitializer {
	public static final ItemGroup FLOWER_GROUP = FabricItemGroupBuilder.build(
			new Identifier("iflowers", "flowers"),
			() -> new ItemStack(Flowers100.Flower00)
	);

	@Override
	public void onInitialize() {
		Flowers100.init();
	}

	public static Identifier getId(String name) {
		return new Identifier("iflowers", name);
	}

}
