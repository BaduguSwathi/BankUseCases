package com.example.notecrud.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.notecrud.model.NoteEntity;
import com.example.notecrud.repo.NoteRepository;

@Service
public class NoteServiceImpl implements NoteService {
	
	@Autowired
	NoteRepository repo;
	
	@Autowired
	RestTemplate template;

	@Override
	public List<NoteEntity> findAllNotes() {
		// TODO Auto-generated method stub
		return findAllNotes();
	}

	@Override
	public List<NoteEntity> findNotesBynoteid(int noteId) {
		// TODO Auto-generated method stub
		return findNotesBynoteid(noteId);
	}

	@Override
	public String findAuthor(int noteId) {
		// TODO Auto-generated method stub
		return findAuthor(noteId);
	}

      
}
