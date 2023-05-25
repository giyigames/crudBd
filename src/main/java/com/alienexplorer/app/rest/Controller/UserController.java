package com.alienexplorer.app.rest.Controller;

import com.alienexplorer.app.rest.Model.User;
import com.alienexplorer.app.rest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping(value = "/")
    public String holaMundo(){
        return "Bienvenido a mi API :D!";
    }

    @GetMapping(value = "/users")
    public List <User> getUsers(){
        return userRepository.findAll();
    }

    @PostMapping(value = "/saveuser")
    public String saveUser(@RequestBody User user){
        userRepository.save(user);
        return "Saved user";
    }

    @PutMapping(value = "/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user){
        User updatedUser = userRepository.findById(id).get();
        updatedUser.setIdentificacion(user.getIdentificacion());
        updatedUser.setNombre(user.getNombre());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setTelefono(user.getTelefono());
        userRepository.save(updatedUser);
        return "Updated User";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable long id){
        User deletedUser = userRepository.findById(id).get();
        userRepository.delete(deletedUser);
        return "Deleted User";
    }
}
