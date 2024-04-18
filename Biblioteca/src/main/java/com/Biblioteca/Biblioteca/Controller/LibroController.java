package com.Biblioteca.Biblioteca.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Biblioteca.Biblioteca.Entity.Libro;
import com.Biblioteca.Biblioteca.IService.ILibroService;


    @CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/libro")
public class LibroController extends ABaseController<Libro, ILibroService> {
    public LibroController(ILibroService service) {
        super(service, "Libro");
    }
}
    

