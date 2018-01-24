package pw.cinque.packetapi;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class WrappedPacket {

    private final String type;
    private final Object packet;
    private final PacketValues values;

    public WrappedPacket(String type, Object packet, PacketValues values) {
		this.type = type;
		this.packet = packet;
		this.values = values;
	}

	/**
     * Gets the packet type
     *
     * @return The name of the packet's class, such as 'PacketPlayInFlying'
     */
    public String getType() {
        return type;
    }

    /**
     * Gets the packet object
     *
     * @return The raw packet object
     */
    public Object getPacket() {
        return packet;
    }

    /**
     * Gets the packet's values
     *
     * @return A {@link List} containing the values of the fields in the packet's class, these values can be null.
     */
    public PacketValues getValues() {
        return values;
    }

}
