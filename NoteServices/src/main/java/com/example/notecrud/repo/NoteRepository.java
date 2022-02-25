package com.example.notecrud.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.notecrud.model.*;

@Repository
public interface NoteRepository extends JpaRepository<NoteEntity,Integer>{
    @Query("select u from NoteEntity u where u.noteid=?1 ")
    public List<NoteEntity>  findNotesBynoteid(int noteid);
    
}

 
