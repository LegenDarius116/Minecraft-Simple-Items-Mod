package com.legendarius.simpleItemsMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GlitteringSand extends Block {

	protected GlitteringSand(Material material) {
		super(material);
		this.setHardness(0.5F);
		this.setStepSound(this.soundTypeSand);
	}

}
