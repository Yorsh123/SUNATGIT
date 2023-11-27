package com.electronicbulling.bulling.services;

import com.electronicbulling.bulling.entity.DataDni;
import com.electronicbulling.bulling.entity.DataRuc;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class QueryValidation {


    private Model model;

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private ResponseEntity<String> response;

    public QueryValidation(){
        this.restTemplate = new RestTemplate();
        this.objectMapper = new ObjectMapper();
    }

    public ResponseEntity<String> queryByRuc(String ruc, String apiUrl, String token) {
        try {
            return this.response = this.restTemplate.getForEntity(apiUrl + "/ruc/" + ruc + "?token=" + token, String.class);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public ResponseEntity<String> queryByDni(String dni, String apiUrl, String token) {
        try {
            return this.response = this.restTemplate.getForEntity(apiUrl + "/dni/" + dni + "?token=" + token, String.class);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public Model modelByRuc(ResponseEntity<String> response, Model model){

        if (response.getStatusCode().is2xxSuccessful()) {

            String responseBody = response.getBody();

            try {
                // Utiliza TypeReference para manejar la conversión a una lista
                System.out.println("list: " + responseBody);
                //List<DataRuc> participantJsonList = objectMapper.readValue(responseP, new TypeReference<List<DataRuc>>(){});
                DataRuc participantJsonList = this.objectMapper.readValue(responseBody,DataRuc.class);

                System.out.println("list: " + participantJsonList);

                model.addAttribute("responses", participantJsonList);
                model.addAttribute("status", response.getStatusCode().toString());
                return model;
            } catch (IOException e) {
                e.printStackTrace();
                model.addAttribute("status", 1);
                model.addAttribute("responses", null);
                return model;
            }
        } else {
            System.out.println("Error al realizar la petición: " + response.getStatusCode());
            model.addAttribute("status", 1);
            model.addAttribute("responses", null);
            return model;
        }
    }

    public Model modelByDni(ResponseEntity<String> response, Model model) {
        if (response.getStatusCode().is2xxSuccessful()) {
            String responseBody = response.getBody();
            System.out.println("Respuesta de la API: " + responseBody);
            System.out.println("--------------------------------" + response.getStatusCode());
            try {
                // Utiliza TypeReference para manejar la conversión a una lista
                System.out.println("list: " + responseBody);
                //List<DataRuc> participantJsonList = objectMapper.readValue(responseP, new TypeReference<List<DataRuc>>(){});
                DataDni participantJsonList = this.objectMapper.readValue(responseBody, DataDni.class);
                System.out.println("list: " + participantJsonList);
                model.addAttribute("responses", participantJsonList);
                model.addAttribute("status", response.getStatusCode().toString());

                return model;

            } catch (IOException e) {
                e.printStackTrace();
                model.addAttribute("status", 1);
                model.addAttribute("responses", null);
                return model;
            }
        } else {
            System.out.println("Error al realizar la petición: " + response.getStatusCode());
            model.addAttribute("status", 1);
            model.addAttribute("responses", null);
            return model;
        }
    }

}
