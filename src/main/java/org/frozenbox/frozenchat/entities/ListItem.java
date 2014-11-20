package org.frozenbox.frozenchat.entities;

import java.util.List;

import org.frozenbox.frozenchat.xmpp.jid.Jid;

public interface ListItem extends Comparable<ListItem> {
	public String getDisplayName();

	public Jid getJid();

	public List<Tag> getTags();

	public final class Tag {
		private String name;
		private int color;

		public Tag(String name, int color) {
			this.name = name;
			this.color = color;
		}

		public int getColor() {
			return this.color;
		}

		public String getName() {
			return this.name;
		}
	}
}
