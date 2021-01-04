package me.zeroeightsix.kami.module.modules.player

import me.zeroeightsix.kami.event.events.PacketEvent
import me.zeroeightsix.kami.module.Module
import net.minecraft.network.play.client.CPacketCloseWindow
import org.kamiblue.event.listener.listener

@Module.Info(
        name = "XCarry",
        category = Module.Category.PLAYER,
        description = "Store items in crafting slots"
)
object XCarry : Module() {
    init {
        listener<PacketEvent.Send> {
            if (it.packet is CPacketCloseWindow) it.cancel()
        }
    }
}