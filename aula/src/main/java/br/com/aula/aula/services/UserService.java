package br.com.aula.aula.services;


import br.com.aula.aula.dto.UserDTO;
import br.com.aula.aula.entities.User;
import br.com.aula.aula.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

        @Autowired
        public UserRepository repository;

        @Transactional(readOnly = true)
        public UserDTO findById(Long id) {
                User entity = repository.findById(id).get();
                UserDTO dto = new UserDTO(entity);
                return dto;
        }
}
