package win.lamit.butin.xmpp;

import win.lamit.butin.entities.Contact;

public interface OnContactStatusChanged {
	public void onContactStatusChanged(final Contact contact, final boolean online);
}
