package com.example.notecrud.service;

import java.util.List;

import com.example.notecrud.model.NoteEntity;

public interface NoteService {


	List<NoteEntity> findAllNotes();

	List<NoteEntity> findNotesBynoteid(int noteId);

	String findAuthor(int noteId);
    
	
}
