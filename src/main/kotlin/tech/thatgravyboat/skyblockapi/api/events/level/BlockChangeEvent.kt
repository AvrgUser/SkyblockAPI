package tech.thatgravyboat.skyblockapi.api.events.level

import net.minecraft.core.BlockPos
import net.minecraft.world.level.block.state.BlockState
import tech.thatgravyboat.skyblockapi.api.area.mining.MiningBlock
import tech.thatgravyboat.skyblockapi.api.events.base.SkyBlockEvent

/** Posted when the server changes a block. */
public class BlockChangeEvent(public val pos: BlockPos, public val state: BlockState) : SkyBlockEvent()

/** Posted when the player mines a block. */
public class BlockMinedEvent(public val pos: BlockPos, public val state: BlockState, public val byMiningSpread: Boolean = false) : SkyBlockEvent()

/** Posted when the player mines an ore block. */
public class MiningBlockMinedEvent(public val pos: BlockPos, public val block: MiningBlock, public val byMiningSpread: Boolean = false) : SkyBlockEvent()
