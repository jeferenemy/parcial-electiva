package com.Biblioteca.Biblioteca.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Biblioteca.Biblioteca.Entity.Categoria;
import com.Biblioteca.Biblioteca.IRepository.IBaseRepository;
import com.Biblioteca.Biblioteca.IRepository.ICategoriaRepository;
import com.Biblioteca.Biblioteca.IService.ICategoriaService;

@Service
public class CategoriaService extends ABaseService<Categoria> implements ICategoriaService {

    @Override
    protected IBaseRepository<Categoria, Long> getRepository() {
        return repository;
    }
    @Autowired
    private ICategoriaRepository repository;
}
