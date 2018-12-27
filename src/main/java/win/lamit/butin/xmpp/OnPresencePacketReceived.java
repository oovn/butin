package win.lamit.butin.xmpp;

import win.lamit.butin.entities.Account;
import win.lamit.butin.xmpp.stanzas.PresencePacket;

public interface OnPresencePacketReceived extends PacketReceived {
	public void onPresencePacketReceived(Account account, PresencePacket packet);
}
