/**
 * A huge thanks to TelepathicGrunt for much of the source code, partially from:
 * https://github.com/TelepathicGrunt/RepurposedStructures and
 * https://github.com/TelepathicGrunt/StructureTutorialMod*/
package com.finndog.mvs;

import com.finndog.mvs.world.structures.*;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MVSStructures {
    //public static final DeferredRegister<StructureFeature<?>> DEFERRED_REGISTRY_STRUCTURE = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, MVSMain.MODID);
    //public static final RegistryObject<StructureFeature<?>> SKY_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("sky_structures", SkyStructures::new);
    /**
     * We are using the Deferred Registry system to register our structure as this is the preferred way on Forge.
     * This will handle registering the base structure for us at the correct time so we don't have to handle it ourselves.
     */
    public static final DeferredRegister<StructureType<?>> DEFERRED_REGISTRY_STRUCTURE = DeferredRegister.create(Registry.STRUCTURE_TYPE_REGISTRY, MVSMain.MODID);


    /**
     * Registers the base structure itself and sets what its path is. In this case,
     * this base structure will have the resourcelocation of structure_tutorial:sky_structures.
     */

    public static final RegistryObject<StructureType<MVSGenericNetherJigsawStructure>> SKY_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("sky_structures", () -> () -> MVSGenericNetherJigsawStructure.CODEC);
    public static final RegistryObject<StructureType<MVSYLevelDownOne>> MVS_YLEVEL_DOWN_ONE = DEFERRED_REGISTRY_STRUCTURE.register("mvs_ylevel_down_one", () -> () -> MVSYLevelDownOne.CODEC);
    public static final RegistryObject<StructureType<MVSGenericNetherJigsawStructure>> MVS_GENERIC_JIGSAW_STRUCTURE = DEFERRED_REGISTRY_STRUCTURE.register("mvs_generic_jigsaw_structure", () -> () -> MVSGenericNetherJigsawStructure.CODEC);
    public static final RegistryObject<StructureType<MVSGenericSmallJigsawStructure>> MVS_GENERIC_SMALL_JIGSAW_STRUCTURE = DEFERRED_REGISTRY_STRUCTURE.register("mvs_generic_small_jigsaw_structure", () -> () -> MVSGenericSmallJigsawStructure.CODEC);
    public static final RegistryObject<StructureType<MVSGenericNetherJigsawStructure>> MVS_GENERIC_NETHER_JIGSAW_STRUCTURE = DEFERRED_REGISTRY_STRUCTURE.register("mvs_generic_nether_jigsaw_structure", () -> () -> MVSGenericNetherJigsawStructure.CODEC);
    public static final RegistryObject<StructureType<MVSGenericOceanJigsawStructure>> MVS_GENERIC_OCEAN_JIGSAW_STRUCTURE = DEFERRED_REGISTRY_STRUCTURE.register("mvs_generic_ocean_jigsaw_structure", () -> () -> MVSGenericOceanJigsawStructure.CODEC);

}
