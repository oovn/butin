package win.lamit.butin.xmpp;

import win.lamit.butin.entities.Account;

public interface OnMessageAcknowledged {
	boolean onMessageAcknowledged(Account account, String id);
}
