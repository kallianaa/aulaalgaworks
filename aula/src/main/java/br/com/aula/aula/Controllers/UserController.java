package br.com.aula.aula.Controllers;


import br.com.aula.aula.dto.UserDTO;
import br.com.aula.aula.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    public UserService service;


    @GetMapping(value = "/{id}")
    public UserDTO findyById(@PathVariable Long id) {
        return service.findById(id);
    }


}
