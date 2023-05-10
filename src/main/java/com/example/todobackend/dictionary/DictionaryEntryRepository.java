package com.example.todobackend.dictionary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictionaryEntryRepository extends JpaRepository<DictionaryEntry, Integer> {
}