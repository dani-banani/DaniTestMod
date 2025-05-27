package com.dani.daniTest.item.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item ;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LightningStrike extends Item {
	public LightningStrike(Settings settings) {
		super(settings);
	}
    @Override
public ActionResult use(World world, PlayerEntity user, Hand hand) {
	if (world.isClient) {
		return ActionResult.PASS;
	}

	BlockPos frontOfPlayer = user.getBlockPos().offset(user.getHorizontalFacing(), 10);

	LightningEntity lightningBolt = new LightningEntity(EntityType.LIGHTNING_BOLT, world);
	lightningBolt.setPosition(frontOfPlayer.toCenterPos());
	world.spawnEntity(lightningBolt);

	return ActionResult.SUCCESS;
}
}