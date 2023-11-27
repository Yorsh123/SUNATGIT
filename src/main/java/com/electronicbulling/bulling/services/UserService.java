package com.electronicbulling.bulling.services;

import com.electronicbulling.bulling.dto.ClientDto;
import com.electronicbulling.bulling.dto.UserDto;
import com.electronicbulling.bulling.entity.User;
import com.electronicbulling.bulling.entity.models.Client;
import com.electronicbulling.bulling.repository.ClientRepository;
import com.electronicbulling.bulling.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ClientRepository clientRepository;
    public User login(String email) {

        if(userRepository.existsByEmail(email)){
            return userRepository.findByEmail(email);
        }
        return null;
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User save(UserDto userDto){

        if(userRepository.existsByEmail(userDto.getEmail())){
            return null;
        }

        int id = autoIncrement();
        User user = new User(id,userDto.getEmail(),userDto.getName(), userDto.getPassword(), userDto.getToken());
        return userRepository.save(user);
    }

    public User update(String email, UserDto userDto) {

        User user = userRepository.findByEmail(email);

        user.setToken(userDto.getToken());

        return userRepository.save(user);
    }
    private int autoIncrement(){
        List<User> listUsers = userRepository.findAll();
        return  listUsers.isEmpty()? 1
                : listUsers.stream().max(Comparator.comparing(User::getId)).get().getId()+1;

    }

    public Client saveClient(ClientDto clientDto){

        Client client = new Client("6", clientDto.getNumDoc(), clientDto.getRznSocial());
        return clientRepository.save(client);
    }

    public Client getClient(String tipoDoc) {

        return clientRepository.findByTipoDoc(tipoDoc).get();
    }
    public Client updateClient(ClientDto clientDto){

        Client client = new Client(1,"6", clientDto.getNumDoc(), clientDto.getRznSocial());

        return clientRepository.save(client);
    }
    
}
