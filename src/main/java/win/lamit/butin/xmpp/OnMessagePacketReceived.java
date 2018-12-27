package win.lamit.butin.xmpp;

import win.lamit.butin.entities.Account;
import win.lamit.butin.xmpp.stanzas.MessagePacket;

public interface OnMessagePacketReceived extends PacketReceived {
	public void onMessagePacketReceived(Account account, MessagePacket packet);
}
