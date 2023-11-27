package com.electronicbulling.bulling.controllers;

import com.electronicbulling.bulling.dto.ClientDto;
import com.electronicbulling.bulling.dto.UserDto;
import com.electronicbulling.bulling.entity.User;
import com.electronicbulling.bulling.entity.models.Client;
import com.electronicbulling.bulling.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping("/user")
    public String save(@RequestBody UserDto userDto) {

        User user = userService.save(userDto);

        return "index";
    }

    @PutMapping("/user/{email}")
    public String update(@PathVariable("email") String email,@RequestBody UserDto userDto){

        User user = userService.update(email, userDto);

        return "index";
    }

    @GetMapping("/client")
    public String getClient(Model model) {

        Client client = userService.getClient("6");
        System.out.println("usersrr"+ client.getRznSocial());
        model.addAttribute("client", client);
        return "client/index.html";
    }

    @PostMapping("/client")
    public String saveClient(@RequestBody ClientDto clientDto, Model model) {

        Client client = userService.updateClient(clientDto);

        model.addAttribute("client", client);

        return "index";
    }
}
