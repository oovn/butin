package win.lamit.butin.xmpp;

import win.lamit.butin.entities.Account;
import win.lamit.butin.xmpp.stanzas.IqPacket;

public interface OnIqPacketReceived extends PacketReceived {
	void onIqPacketReceived(Account account, IqPacket packet);
}
