package com.ibraheemrodrigues.iflowers;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.FlowerBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import org.intellij.lang.annotations.Flow;

import static com.ibraheemrodrigues.iflowers.IFlowersMod.getId;


public class Flowers100 {

    private static final FabricBlockSettings PLANT_SETTINGS = FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS);

    public static final Block Flower00 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower01 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower02 = new SelectivelyPlaceableFlower(StatusEffects.SPEED, 0, PLANT_SETTINGS, (floor, world, pos) -> floor.isOf(Blocks.SAND) || floor.isOf(Blocks.RED_SAND));
    public static final Block Flower03 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower04 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower05 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower06 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower07 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower08 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower09 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower10 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower11 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower12 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower13 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower14 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower15 = new SelectivelyPlaceableFlower(StatusEffects.SPEED, 0, PLANT_SETTINGS, (floor, world, pos) -> floor.isOf(Blocks.END_STONE));
    public static final Block Flower16 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower17 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower18 = new SelectivelyPlaceableFlower(StatusEffects.SPEED, 0, PLANT_SETTINGS, (floor, world, pos) -> floor.isOpaqueFullCube(world, pos));
    public static final Block Flower19 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower20 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower21 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower22 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower23 = new SelectivelyPlaceableFlower(StatusEffects.SPEED, 0, PLANT_SETTINGS, (floor, world, pos) -> floor.isOf(Blocks.SAND) || floor.isOf(Blocks.RED_SAND)|| floor.isOf(Blocks.GRAVEL));
    public static final Block Flower24 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower25 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower26 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower27 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower28 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower29 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower30 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower31 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower32 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower33 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower34 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower35 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower36 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower37 = new OrchidFlower(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower38 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower39 = new OrchidFlower(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower40 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower41 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower42 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower43 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower44 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower45 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower46 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower47 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower48 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower49 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower50 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower51 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower52 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower53 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower54 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower55 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower56 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower57 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower58 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower59 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower60 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower61 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower62 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower63 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower64 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower65 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower66 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower67 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower68 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower69 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower70 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower71 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower72 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower73 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower74 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower75 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower76 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower77 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower78 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower79 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower80 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower81 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower82 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower83 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower84 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower85 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower86 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower87 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower88 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower89 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower90 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower91 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower92 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower93 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower94 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower95 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower96 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower97 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower98 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);
    public static final Block Flower99 = new FlowerBlock(StatusEffects.SPEED, 0, PLANT_SETTINGS);

//    public static final Block[] flowers100 = {Flower00, Flower01, Flower02, Flower03, Flower04, Flower05, Flower06, Flower07, Flower08, Flower09, Flower10, Flower11, Flower12, Flower13, Flower14, Flower15, Flower16, Flower17, Flower18, Flower19, Flower20, Flower21, Flower22, Flower23, Flower24, Flower25, Flower26, Flower27, Flower28, Flower29, Flower30, Flower31, Flower32, Flower33, Flower34, Flower35, Flower36, Flower37, Flower38, Flower39, Flower40, Flower41, Flower42, Flower43, Flower44, Flower45, Flower46, Flower47, Flower48, Flower49, Flower50, Flower51, Flower52, Flower53, Flower54, Flower55, Flower56, Flower57, Flower58, Flower59, Flower60, Flower61, Flower62, Flower63, Flower64, Flower65, Flower66, Flower67, Flower68, Flower69, Flower70, Flower71, Flower72, Flower73, Flower74, Flower75, Flower76, Flower77, Flower78, Flower79, Flower80, Flower81, Flower82, Flower83, Flower84, Flower85, Flower86, Flower87, Flower88, Flower89, Flower90, Flower91, Flower92, Flower93, Flower94, Flower95, Flower96, Flower97, Flower98, Flower99};

    public static void init() {
        Registry.register( Registry.BLOCK, getId( "flower00" ), Flower00);
        Registry.register(Registry.ITEM, getId( "flower00" ), new BlockItem(Flower00, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower01" ), Flower01);
        Registry.register(Registry.ITEM, getId( "flower01" ), new BlockItem(Flower01, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower02" ), Flower02);
        Registry.register(Registry.ITEM, getId( "flower02" ), new BlockItem(Flower02, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower03" ), Flower03);
        Registry.register(Registry.ITEM, getId( "flower03" ), new BlockItem(Flower03, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower04" ), Flower04);
        Registry.register(Registry.ITEM, getId( "flower04" ), new BlockItem(Flower04, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower05" ), Flower05);
        Registry.register(Registry.ITEM, getId( "flower05" ), new BlockItem(Flower05, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower06" ), Flower06);
        Registry.register(Registry.ITEM, getId( "flower06" ), new BlockItem(Flower06, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower07" ), Flower07);
        Registry.register(Registry.ITEM, getId( "flower07" ), new BlockItem(Flower07, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower08" ), Flower08);
        Registry.register(Registry.ITEM, getId( "flower08" ), new BlockItem(Flower08, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower09" ), Flower09);
        Registry.register(Registry.ITEM, getId( "flower09" ), new BlockItem(Flower09, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower10" ), Flower10);
        Registry.register(Registry.ITEM, getId( "flower10" ), new BlockItem(Flower10, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower11" ), Flower11);
        Registry.register(Registry.ITEM, getId( "flower11" ), new BlockItem(Flower11, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower12" ), Flower12);
        Registry.register(Registry.ITEM, getId( "flower12" ), new BlockItem(Flower12, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower13" ), Flower13);
        Registry.register(Registry.ITEM, getId( "flower13" ), new BlockItem(Flower13, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower14" ), Flower14);
        Registry.register(Registry.ITEM, getId( "flower14" ), new BlockItem(Flower14, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower15" ), Flower15);
        Registry.register(Registry.ITEM, getId( "flower15" ), new BlockItem(Flower15, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower16" ), Flower16);
        Registry.register(Registry.ITEM, getId( "flower16" ), new BlockItem(Flower16, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower17" ), Flower17);
        Registry.register(Registry.ITEM, getId( "flower17" ), new BlockItem(Flower17, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower18" ), Flower18);
        Registry.register(Registry.ITEM, getId( "flower18" ), new BlockItem(Flower18, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower19" ), Flower19);
        Registry.register(Registry.ITEM, getId( "flower19" ), new BlockItem(Flower19, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower20" ), Flower20);
        Registry.register(Registry.ITEM, getId( "flower20" ), new BlockItem(Flower20, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower21" ), Flower21);
        Registry.register(Registry.ITEM, getId( "flower21" ), new BlockItem(Flower21, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower22" ), Flower22);
        Registry.register(Registry.ITEM, getId( "flower22" ), new BlockItem(Flower22, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower23" ), Flower23);
        Registry.register(Registry.ITEM, getId( "flower23" ), new BlockItem(Flower23, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower24" ), Flower24);
        Registry.register(Registry.ITEM, getId( "flower24" ), new BlockItem(Flower24, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower25" ), Flower25);
        Registry.register(Registry.ITEM, getId( "flower25" ), new BlockItem(Flower25, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower26" ), Flower26);
        Registry.register(Registry.ITEM, getId( "flower26" ), new BlockItem(Flower26, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower27" ), Flower27);
        Registry.register(Registry.ITEM, getId( "flower27" ), new BlockItem(Flower27, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower28" ), Flower28);
        Registry.register(Registry.ITEM, getId( "flower28" ), new BlockItem(Flower28, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower29" ), Flower29);
        Registry.register(Registry.ITEM, getId( "flower29" ), new BlockItem(Flower29, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower30" ), Flower30);
        Registry.register(Registry.ITEM, getId( "flower30" ), new BlockItem(Flower30, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower31" ), Flower31);
        Registry.register(Registry.ITEM, getId( "flower31" ), new BlockItem(Flower31, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower32" ), Flower32);
        Registry.register(Registry.ITEM, getId( "flower32" ), new BlockItem(Flower32, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower33" ), Flower33);
        Registry.register(Registry.ITEM, getId( "flower33" ), new BlockItem(Flower33, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower34" ), Flower34);
        Registry.register(Registry.ITEM, getId( "flower34" ), new BlockItem(Flower34, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower35" ), Flower35);
        Registry.register(Registry.ITEM, getId( "flower35" ), new BlockItem(Flower35, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower36" ), Flower36);
        Registry.register(Registry.ITEM, getId( "flower36" ), new BlockItem(Flower36, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower37" ), Flower37);
        Registry.register(Registry.ITEM, getId( "flower37" ), new BlockItem(Flower37, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower38" ), Flower38);
        Registry.register(Registry.ITEM, getId( "flower38" ), new BlockItem(Flower38, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower39" ), Flower39);
        Registry.register(Registry.ITEM, getId( "flower39" ), new BlockItem(Flower39, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower40" ), Flower40);
        Registry.register(Registry.ITEM, getId( "flower40" ), new BlockItem(Flower40, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower41" ), Flower41);
        Registry.register(Registry.ITEM, getId( "flower41" ), new BlockItem(Flower41, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower42" ), Flower42);
        Registry.register(Registry.ITEM, getId( "flower42" ), new BlockItem(Flower42, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower43" ), Flower43);
        Registry.register(Registry.ITEM, getId( "flower43" ), new BlockItem(Flower43, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower44" ), Flower44);
        Registry.register(Registry.ITEM, getId( "flower44" ), new BlockItem(Flower44, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower45" ), Flower45);
        Registry.register(Registry.ITEM, getId( "flower45" ), new BlockItem(Flower45, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower46" ), Flower46);
        Registry.register(Registry.ITEM, getId( "flower46" ), new BlockItem(Flower46, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower47" ), Flower47);
        Registry.register(Registry.ITEM, getId( "flower47" ), new BlockItem(Flower47, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower48" ), Flower48);
        Registry.register(Registry.ITEM, getId( "flower48" ), new BlockItem(Flower48, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower49" ), Flower49);
        Registry.register(Registry.ITEM, getId( "flower49" ), new BlockItem(Flower49, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower50" ), Flower50);
        Registry.register(Registry.ITEM, getId( "flower50" ), new BlockItem(Flower50, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower51" ), Flower51);
        Registry.register(Registry.ITEM, getId( "flower51" ), new BlockItem(Flower51, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower52" ), Flower52);
        Registry.register(Registry.ITEM, getId( "flower52" ), new BlockItem(Flower52, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower53" ), Flower53);
        Registry.register(Registry.ITEM, getId( "flower53" ), new BlockItem(Flower53, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower54" ), Flower54);
        Registry.register(Registry.ITEM, getId( "flower54" ), new BlockItem(Flower54, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower55" ), Flower55);
        Registry.register(Registry.ITEM, getId( "flower55" ), new BlockItem(Flower55, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower56" ), Flower56);
        Registry.register(Registry.ITEM, getId( "flower56" ), new BlockItem(Flower56, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower57" ), Flower57);
        Registry.register(Registry.ITEM, getId( "flower57" ), new BlockItem(Flower57, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower58" ), Flower58);
        Registry.register(Registry.ITEM, getId( "flower58" ), new BlockItem(Flower58, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower59" ), Flower59);
        Registry.register(Registry.ITEM, getId( "flower59" ), new BlockItem(Flower59, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower60" ), Flower60);
        Registry.register(Registry.ITEM, getId( "flower60" ), new BlockItem(Flower60, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower61" ), Flower61);
        Registry.register(Registry.ITEM, getId( "flower61" ), new BlockItem(Flower61, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower62" ), Flower62);
        Registry.register(Registry.ITEM, getId( "flower62" ), new BlockItem(Flower62, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower63" ), Flower63);
        Registry.register(Registry.ITEM, getId( "flower63" ), new BlockItem(Flower63, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower64" ), Flower64);
        Registry.register(Registry.ITEM, getId( "flower64" ), new BlockItem(Flower64, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower65" ), Flower65);
        Registry.register(Registry.ITEM, getId( "flower65" ), new BlockItem(Flower65, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower66" ), Flower66);
        Registry.register(Registry.ITEM, getId( "flower66" ), new BlockItem(Flower66, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower67" ), Flower67);
        Registry.register(Registry.ITEM, getId( "flower67" ), new BlockItem(Flower67, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower68" ), Flower68);
        Registry.register(Registry.ITEM, getId( "flower68" ), new BlockItem(Flower68, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower69" ), Flower69);
        Registry.register(Registry.ITEM, getId( "flower69" ), new BlockItem(Flower69, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower70" ), Flower70);
        Registry.register(Registry.ITEM, getId( "flower70" ), new BlockItem(Flower70, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower71" ), Flower71);
        Registry.register(Registry.ITEM, getId( "flower71" ), new BlockItem(Flower71, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower72" ), Flower72);
        Registry.register(Registry.ITEM, getId( "flower72" ), new BlockItem(Flower72, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower73" ), Flower73);
        Registry.register(Registry.ITEM, getId( "flower73" ), new BlockItem(Flower73, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower74" ), Flower74);
        Registry.register(Registry.ITEM, getId( "flower74" ), new BlockItem(Flower74, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower75" ), Flower75);
        Registry.register(Registry.ITEM, getId( "flower75" ), new BlockItem(Flower75, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower76" ), Flower76);
        Registry.register(Registry.ITEM, getId( "flower76" ), new BlockItem(Flower76, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower77" ), Flower77);
        Registry.register(Registry.ITEM, getId( "flower77" ), new BlockItem(Flower77, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower78" ), Flower78);
        Registry.register(Registry.ITEM, getId( "flower78" ), new BlockItem(Flower78, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower79" ), Flower79);
        Registry.register(Registry.ITEM, getId( "flower79" ), new BlockItem(Flower79, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower80" ), Flower80);
        Registry.register(Registry.ITEM, getId( "flower80" ), new BlockItem(Flower80, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower81" ), Flower81);
        Registry.register(Registry.ITEM, getId( "flower81" ), new BlockItem(Flower81, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower82" ), Flower82);
        Registry.register(Registry.ITEM, getId( "flower82" ), new BlockItem(Flower82, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower83" ), Flower83);
        Registry.register(Registry.ITEM, getId( "flower83" ), new BlockItem(Flower83, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower84" ), Flower84);
        Registry.register(Registry.ITEM, getId( "flower84" ), new BlockItem(Flower84, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower85" ), Flower85);
        Registry.register(Registry.ITEM, getId( "flower85" ), new BlockItem(Flower85, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower86" ), Flower86);
        Registry.register(Registry.ITEM, getId( "flower86" ), new BlockItem(Flower86, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower87" ), Flower87);
        Registry.register(Registry.ITEM, getId( "flower87" ), new BlockItem(Flower87, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower88" ), Flower88);
        Registry.register(Registry.ITEM, getId( "flower88" ), new BlockItem(Flower88, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower89" ), Flower89);
        Registry.register(Registry.ITEM, getId( "flower89" ), new BlockItem(Flower89, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower90" ), Flower90);
        Registry.register(Registry.ITEM, getId( "flower90" ), new BlockItem(Flower90, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower91" ), Flower91);
        Registry.register(Registry.ITEM, getId( "flower91" ), new BlockItem(Flower91, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower92" ), Flower92);
        Registry.register(Registry.ITEM, getId( "flower92" ), new BlockItem(Flower92, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower93" ), Flower93);
        Registry.register(Registry.ITEM, getId( "flower93" ), new BlockItem(Flower93, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower94" ), Flower94);
        Registry.register(Registry.ITEM, getId( "flower94" ), new BlockItem(Flower94, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower95" ), Flower95);
        Registry.register(Registry.ITEM, getId( "flower95" ), new BlockItem(Flower95, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower96" ), Flower96);
        Registry.register(Registry.ITEM, getId( "flower96" ), new BlockItem(Flower96, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower97" ), Flower97);
        Registry.register(Registry.ITEM, getId( "flower97" ), new BlockItem(Flower97, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower98" ), Flower98);
        Registry.register(Registry.ITEM, getId( "flower98" ), new BlockItem(Flower98, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));
        Registry.register( Registry.BLOCK, getId( "flower99" ), Flower99);
        Registry.register(Registry.ITEM, getId( "flower99" ), new BlockItem(Flower99, new FabricItemSettings().group(IFlowersMod.FLOWER_GROUP)));

        Flowers100Features.init();
    }

    public static void initClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), Flower00, Flower01, Flower02, Flower03, Flower04, Flower05, Flower06, Flower07, Flower08, Flower09, Flower10, Flower11, Flower12, Flower13, Flower14, Flower15, Flower16, Flower17, Flower18, Flower19, Flower20, Flower21, Flower22, Flower23, Flower24, Flower25, Flower26, Flower27, Flower28, Flower29, Flower30, Flower31, Flower32, Flower33, Flower34, Flower35, Flower36, Flower37, Flower38, Flower39, Flower40, Flower41, Flower42, Flower43, Flower44, Flower45, Flower46, Flower47, Flower48, Flower49, Flower50, Flower51, Flower52, Flower53, Flower54, Flower55, Flower56, Flower57, Flower58, Flower59, Flower60, Flower61, Flower62, Flower63, Flower64, Flower65, Flower66, Flower67, Flower68, Flower69, Flower70, Flower71, Flower72, Flower73, Flower74, Flower75, Flower76, Flower77, Flower78, Flower79, Flower80, Flower81, Flower82, Flower83, Flower84, Flower85, Flower86, Flower87, Flower88, Flower89, Flower90, Flower91, Flower92, Flower93, Flower94, Flower95, Flower96, Flower97, Flower98, Flower99);
    }
}
