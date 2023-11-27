package com.electronicbulling.bulling.controllers;

import com.electronicbulling.bulling.entity.DataRuc;
import com.electronicbulling.bulling.services.QueryValidation;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @Value("${api.url}")
    public String apiUrl;

    @Value("${api.token}")
    public String token;

    @GetMapping
    public String index(){
        return "index";
    }

    @GetMapping("/queries")
    public String queryRuc
            (
                @RequestParam(required = false, defaultValue = "") String number,
                @RequestParam(required = false, defaultValue = "") String type,
                Model model
            )
    {

        QueryValidation queryValidation = new QueryValidation();
        ResponseEntity<String> response;

        if(type.equals("ruc")){

            response = queryValidation.queryByRuc(number, apiUrl, token);

            if (response == null) {
                model.addAttribute("status", 1);
                model.addAttribute("responses", null);
                model.addAttribute("type", "ruc");
                return "index";
            }

            model = queryValidation.modelByRuc(response, model);
            model.addAttribute("number", number);
            model.addAttribute("type", "ruc");
            return "index";

        }else if(type.equals("dni")){

            response = queryValidation.queryByDni(number, apiUrl, token);

            if (response == null) {
                model.addAttribute("status", 1);
                model.addAttribute("responses", null);
                model.addAttribute("type", "dni");
                return "index";
            }

            model = queryValidation.modelByDni(response, model);
            model.addAttribute("number", number);
            model.addAttribute("type", "dni");
            return "index";

        }else{
            model.addAttribute("status", 1);
            model.addAttribute("responses", null);
            model.addAttribute("type", "ruc");
            return "index";
        }
    }

}
