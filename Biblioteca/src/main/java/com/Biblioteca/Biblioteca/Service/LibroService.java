package com.Biblioteca.Biblioteca.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Biblioteca.Biblioteca.Entity.Libro;
import com.Biblioteca.Biblioteca.IRepository.IBaseRepository;
import com.Biblioteca.Biblioteca.IRepository.ILibroRepository;
import com.Biblioteca.Biblioteca.IService.ILibroService;

@Service
public class LibroService extends ABaseService<Libro> implements ILibroService {
    
    @Override
    protected IBaseRepository<Libro, Long> getRepository() {
        return repository;
    }
    @Autowired
    private ILibroRepository repository;

    
}
