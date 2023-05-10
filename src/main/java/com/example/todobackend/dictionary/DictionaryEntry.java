package com.example.todobackend.dictionary;

import javax.persistence.*;

@Entity
@Table
public class DictionaryEntry {

    @Id
    @GeneratedValue
    private Integer id;

    private String word;

    private String translation;

    private String description;

    @ManyToOne
    @JoinColumn
    private Language language;
}
