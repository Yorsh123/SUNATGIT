package com.electronicbulling.bulling.controllers;

import com.electronicbulling.bulling.dto.CompanyDto;
import com.electronicbulling.bulling.entity.Company;
import com.electronicbulling.bulling.services.CompanyService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @Value("${api.url2}")
    public String apiUrl;

    @Value("${api.token}")
    public String token;

    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper objectMapper = new ObjectMapper();
    private ResponseEntity<String> response;


    @GetMapping("/company")
    public String getCompany(Model model) {

        List<Company> list = companyService.getAll();

        int id = 2951;

        for (Company company : list) {
            id = company.getId();
        }

        try {

            HttpHeaders headers = new HttpHeaders();

            headers.set("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpYXQiOjE3MDA3NTI2NTUsImV4cCI6MTcwMDgzOTA1NSwicm9sZXMiOlsiUk9MRV9VU0VSIl0sInVzZXJuYW1lIjoibWFyaWFubyJ9.SmbRshPlgN6bpmZZwsp2g15hVhA5JLpZauL4nBg3taRzlvhrCVszGxp4cfPxuwOEaAzx_WvlPJMxZ_VbJULGFoPwjmy2xIxvpX4ZYwK9luBnVcszu0gmvGDMaW__D-wYBVhjy-giQZrueALR2nYRAz6BdojNPs50e2sTYPK3FBHfjva5aDc6pHxsz7FlUq--a4SX8lQtl0JRKxPT5GcM23RpnBvOIwcEnNMaVQGpF0nkkTI5pg7DaVYeVrncHgh5n86AIEySNQfQ14aYfN7GRgXQuqQ60H4KdiXNGk3B6N6hWZGP2zPVnrpedmsGU5RPB2KRb9rf3GNLybLJpAwb5vY873zlDJdEB_Tu-ZVd3SbPABEU66H54KXEaHa4Cue2itG2-ZzP0IpPZXuolSEkE9abLb1uYKzCDpT44YwhLWjZYWc_MomecD0ahS9qbpD8ZLxwWRfAEMsUMleqyalAoHrYH_ONO_QwZuabT_5ZR7cTLhWhINj-K0q_m_zA0CownG73OlXmzZVFjBctqZAMq1QZMN-h4TW1IKKcYHjUfsKrgVrz7vlNl5SlG4Qe4nrUnppRL24X7eyFfRxSjGiO1Tw-5Jlv0E4d65T8iF7UjUJC21tOzkrp0D7qtkrsoSyeNy9mGmUdHpq2oUviikP3xkBLCSGz70YcKSLlbflhbmI");

            ResponseEntity<Company> responseEntity = restTemplate.exchange(apiUrl + "/companies/"+id, HttpMethod.GET, new HttpEntity<>(headers), Company.class);


            Company company = responseEntity.getBody();

            model.addAttribute("company", company);

            return "company/index";

        }catch (Exception e){
            e.printStackTrace();
            return "company/index";
        }

    }
    @GetMapping("/factura")
    public String createFactura(){
        return "company/factura.html";
    }

    @PostMapping("/company")
    public String getCompany(@RequestBody CompanyDto companyDto, Model model) {

        companyService.save(companyDto);

        return "company/index";

    }
}
