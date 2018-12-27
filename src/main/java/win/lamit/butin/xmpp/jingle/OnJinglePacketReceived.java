package win.lamit.butin.xmpp.jingle;

import win.lamit.butin.entities.Account;
import win.lamit.butin.xmpp.PacketReceived;
import win.lamit.butin.xmpp.jingle.stanzas.JinglePacket;

public interface OnJinglePacketReceived extends PacketReceived {
	void onJinglePacketReceived(Account account, JinglePacket packet);
}
