package org.frozenbox.frozenchat.xmpp.stanzas;

import org.frozenbox.frozenchat.xml.Element;
import org.frozenbox.frozenchat.xmpp.jid.InvalidJidException;
import org.frozenbox.frozenchat.xmpp.jid.Jid;

public class AbstractStanza extends Element {

	protected AbstractStanza(String name) {
		super(name);
	}

	public Jid getTo() {
		try {
			return Jid.fromString(getAttribute("to"));
		} catch (final InvalidJidException e) {
			return null;
		}
	}

	public Jid getFrom() {
		String from = getAttribute("from");
		if (from == null) {
			return null;
		} else {
			try {
				return Jid.fromString(from);
			} catch (final InvalidJidException e) {
				return null;
			}
		}
	}

	public String getId() {
		return this.getAttribute("id");
	}

	public void setTo(final Jid to) {
		if (to != null) {
			setAttribute("to", to.toString());
		}
	}

	public void setFrom(final Jid from) {
		if (from != null) {
			setAttribute("from", from.toString());
		}
	}

	public void setId(final String id) {
		setAttribute("id", id);
	}
}
