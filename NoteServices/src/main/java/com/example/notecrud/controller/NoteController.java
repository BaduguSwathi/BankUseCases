package com.example.notecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.notecrud.model.NoteEntity;
import com.example.notecrud.service.NoteService;

public class NoteController {
     @Autowired
     NoteService service;
     
     @Autowired
 	Environment environment;

 	@GetMapping("/port")
 	public String getPort() {
 		return environment.getProperty("local.server.port");
 	}

 	@GetMapping("/all")
 	public List<NoteEntity> findAllNotes() {
 		return service.findAllNotes();
 	}

 	@GetMapping("/noteid/{noteid}")
 	public List<NoteEntity> findNotesBynoteid(@PathVariable int noteId) {
 		// System.out.println("Inside the comments service");
 		return service.findNotesBynoteid(noteId);
 	}

 	@GetMapping("/post/author/{noteid}")
 	public String findAuthorForPid(@PathVariable int noteId) {
 		return service.findAuthor(noteId);
 	}
}
