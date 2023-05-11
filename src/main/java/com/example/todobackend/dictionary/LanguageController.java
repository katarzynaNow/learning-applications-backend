package com.example.todobackend.dictionary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dictionary/language")
public class LanguageController {

    @Autowired
    private LanguageRepository repository;

    @GetMapping
    public List<Language> list(){
        return repository.findAll();
    }

    @GetMapping("/property/count")
    public long count(){
        return repository.count();
    }

    @GetMapping("/{id}")
    public Language get(@PathVariable Integer id){
        return repository.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        repository.deleteById(id);
    }

    @PostMapping
    public Language create(@RequestBody Language language){
        language.setId(null);
        return repository.save(language);
    }

    @PutMapping
    public Language update(@RequestBody Language request){
        Language existing = get(request.getId());
        existing.setName(request.getName());
        existing.setCode(request.getCode());
        return repository.save(existing);
    }
}
