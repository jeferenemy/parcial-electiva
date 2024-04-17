package com.Biblioteca.Biblioteca.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Biblioteca.Biblioteca.Entity.Libro;
import com.Biblioteca.Biblioteca.IService.ILibroService;

public class LibroController {
    @CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/libro")
public class PersonController extends ABaseController<Libro, ILibroService> {
    public PersonController(ILibroService service) {
        super(service, "Libro");
    }
}
    
}
