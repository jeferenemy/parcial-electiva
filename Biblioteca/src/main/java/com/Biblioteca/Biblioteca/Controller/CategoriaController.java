package com.Biblioteca.Biblioteca.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Biblioteca.Biblioteca.Entity.Categoria;
import com.Biblioteca.Biblioteca.IService.ICategoriaService;

 @CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/categoria")
public class CategoriaController extends ABaseController<Categoria, ICategoriaService> {
    public CategoriaController(ICategoriaService service) {
        super(service, "Categoria");
    }
}
    

