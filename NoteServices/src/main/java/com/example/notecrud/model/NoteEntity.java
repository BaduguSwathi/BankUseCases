package com.example.notecrud.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="note")
public class NoteEntity 
{
	@Id
   private int noteId;
   private String Author;
   private String descripition;
   private String status;
public NoteEntity(int noteId, String author, String descripition, String status) {
	super();
	this.noteId = noteId;
	Author = author;
	this.descripition = descripition;
	this.status = status;
}
public int getNoteId() {
	return noteId;
}
@Override
public String toString() {
	return "NoteEntity [noteId=" + noteId + ", Author=" + Author + ", descripition=" + descripition + ", status="
			+ status + "]";
}
public void setNoteId(int noteId) {
	this.noteId = noteId;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public String getDescripition() {
	return descripition;
}
public void setDescripition(String descripition) {
	this.descripition = descripition;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
   
}

