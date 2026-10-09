package tech.thatgravyboat.skyblockapi.api.events.screen

import net.minecraft.network.chat.Component
import net.minecraft.world.item.ItemStack
import tech.thatgravyboat.skyblockapi.api.events.base.SkyBlockEvent

public class ItemTooltipEvent(public val item: ItemStack, public val tooltip: MutableList<Component>) : SkyBlockEvent() {

    public fun add(line: Component): Boolean = tooltip.add(line)

}

public class ItemDebugTooltipEvent(public val item: ItemStack, public val tooltip: MutableList<Component>) : SkyBlockEvent() {

    public fun add(line: Component) = tooltip.add(line)

}

