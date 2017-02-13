package com.legendarius.simpleItemsMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AdminiumBlock extends Block{

	protected AdminiumBlock(Material material) {
		super(material);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setResistance(15.0F);
		this.setStepSound(this.soundTypeMetal);
	}

}
