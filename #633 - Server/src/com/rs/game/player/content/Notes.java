package com.rs.game.player.content;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.rs.game.player.Player;

public final class Notes implements Serializable {

	private static final long serialVersionUID = 5564620907978487391L;

	private List<Note> notes;
	private transient Player player;

	public Notes() {
		notes = new ArrayList<Note>(30);
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void init() {
		player.getPackets().sendIComponentSettings(34, 9, 0, 30, 2621470);
		player.getPackets().sendHideIComponent(34, 3, false);
		player.getPackets().sendHideIComponent(34, 44, false);
		player.getVarsManager().sendVar(1437, 1); // unlocks add notes
		player.getVarsManager().sendVar(1439, -1);
		refresh();
	}

	private void refresh() {
		for (int i = 0; i < 30; i++)
			player.getPackets().sendGlobalString(149 + i,
					notes.size() <= i ? "" : notes.get(i).text);
		player.getVarsManager().sendVar(1440, getPrimaryColour(this));
		player.getVarsManager().sendVar(1441, getSecondaryColour(this));
	}

	public int getCurrentNote() {
		Integer note = (Integer) player.getTemporaryAttributtes().get(
				"CURRENT_NOTE");
		if (note == null)
			return -1;
		return note;
	}

	public void setCurrentNote(int id) {
		if (id >= 30)
			return;
		player.getTemporaryAttributtes().put("CURRENT_NOTE", id);
		player.getVarsManager().sendVar(1439, id);
	}

	public void removeCurrentNote() {
		player.getTemporaryAttributtes().remove("CURRENT_NOTE");
		player.getVarsManager().sendVar(1439, -1);
	}

	public boolean add(String text) {
		if (notes.size() >= 30) {
			player.getPackets().sendGameMessage("You may only have 30 notes!");
			return false;
		}
		if (text.length() > 50) {
			player.getPackets().sendGameMessage(
					"You can only enter notes up to 50 characters!");
			return false;
		}
		player.getPackets().sendGlobalString(149 + notes.size(), text);
		setCurrentNote(notes.size());
		return notes.add(new Note(text));
	}

	public boolean edit(String text) {
		if (text.length() > 50) {
			player.getPackets().sendGameMessage(
					"You can only enter notes up to 50 characters!");
			return false;
		}
		int id = getCurrentNote();
		if (id == -1 || notes.size() <= id)
			return false;
		notes.get(id).setText(text);
		player.getPackets().sendGlobalString(149 + id, text);
		return true;
	}

	public boolean colour(int colour) {
		int id = getCurrentNote();
		if (id == -1 || notes.size() <= id)
			return false;
		notes.get(id).setColour(colour);
		if (id < 16)
			player.getVarsManager().sendVar(1440, getPrimaryColour(this));
		else
			player.getVarsManager().sendVar(1441, getSecondaryColour(this));
		return true;
	}

	public void switchNotes(int from, int to) {
		if (notes.size() <= from || notes.size() <= to)
			return;
		notes.set(to, notes.set(from, notes.get(to)));
		refresh();
	}

	public void delete() {
		delete(getCurrentNote());
	}

	public void delete(int id) {
		if (id == -1 || notes.size() <= id)
			return;
		notes.remove(id);
		removeCurrentNote();
		refresh();
	}

	public void deleteAll() {
		notes.clear();
		removeCurrentNote();
		refresh();
	}

	/**
	 * Gets the primary colour of the notes.
	 * 
	 * @param notes
	 *            The notes.
	 * @return
	 */
	public static int getPrimaryColour(Notes notes) {
		int color = 0;
		for (int i = 0; i < 16; i++) {
			if (notes.notes.size() <= i)
				break;
			color += colourize(notes.notes.get(i).colour, i);
		}
		return color;
	}

	/**
	 * Gets the secondary colour of the notes.
	 * 
	 * @param notes
	 *            The notes.
	 * @return
	 */
	public static int getSecondaryColour(Notes notes) {
		int color = 0;
		for (int i = 0; i < 14; i++) {
			if (notes.notes.size() - 16 <= i)
				break;
			color += colourize(notes.notes.get(i + 16).colour, i);
		}
		return color;
	}

	public static int colourize(int colour, int noteId) {
		return (int) (Math.pow(4, noteId) * colour);
	}

	public List<Note> getNotes() {
		return notes;
	}

	public static final class Note implements Serializable {

		private static final long serialVersionUID = -3867862135920019512L;

		private String text;
		private int colour;

		public Note(String text) {
			this.text = text;
		}

		public String getText() {
			return text;
		}

		public int getColour() {
			return colour;
		}

		public void setText(String text) {
			this.text = text;
		}

		public void setColour(int colour) {
			this.colour = colour;
		}
	}
}
