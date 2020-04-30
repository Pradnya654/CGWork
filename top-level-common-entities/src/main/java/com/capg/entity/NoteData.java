package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class NoteData {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private int noteId;
	private String noteName;
	private String noteInfo;
	private String noteParty;
	private String noteDateTime;
	
	public NoteData() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoteId() {
		return noteId;
	}

	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}

	public String getNoteName() {
		return noteName;
	}

	public void setNoteName(String noteName) {
		this.noteName = noteName;
	}

	public String getNoteInfo() {
		return noteInfo;
	}

	public void setNoteInfo(String noteInfo) {
		this.noteInfo = noteInfo;
	}

	public String getNoteParty() {
		return noteParty;
	}

	public void setNoteParty(String noteParty) {
		this.noteParty = noteParty;
	}

	public String getNoteDateTime() {
		return noteDateTime;
	}

	public void setNoteDateTime(String noteDateTime) {
		this.noteDateTime = noteDateTime;
	}
	
	
	

}
