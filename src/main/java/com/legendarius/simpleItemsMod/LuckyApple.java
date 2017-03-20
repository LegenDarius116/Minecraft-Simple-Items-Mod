package com.legendarius.simpleItemsMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

// incomplete imports

import java.util.Random;

public class LuckyApple extends ItemFood {

  public LuckyApple(int hunger, float saturtion, bool doge) {
    super(hunger, saturation, doge);
    setUnlocalizedName("LuckyApple");
    setTextureName("sim:luckyApple"); // make it later
    setCretiveTab(CreativeTabs.tabFood);
    setAlwaysEdible();
  }

  // gives 1-3 random potion effects
  protected void onFoodEaten(ItemStack is, World w, EntityPlayer p1) {
    Random r = new Random();
	
	int num = r.nextInt(20); // 0-19
  }
}
