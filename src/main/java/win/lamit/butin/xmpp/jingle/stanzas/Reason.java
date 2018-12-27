package win.lamit.butin.xmpp.jingle.stanzas;

import win.lamit.butin.xml.Element;

public class Reason extends Element {
	private Reason(String name) {
		super(name);
	}

	public Reason() {
		super("reason");
	}
}
