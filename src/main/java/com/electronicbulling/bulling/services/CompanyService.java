package com.electronicbulling.bulling.services;

import com.electronicbulling.bulling.dto.CompanyDto;
import com.electronicbulling.bulling.dto.UserDto;
import com.electronicbulling.bulling.entity.Company;
import com.electronicbulling.bulling.entity.User;
import com.electronicbulling.bulling.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    public Company get(int id) {
        return companyRepository.findById(id).get();
    }

    public Company save(CompanyDto companyDto){

        Company company = new Company(companyDto.getId(),companyDto.getSol_user(), companyDto.getSol_pass(), companyDto.getRuc(), companyDto.getRazon_social(), companyDto.getDireccion(), companyDto.getCertificado(), companyDto.getLogo(), companyDto.getToken());

        return companyRepository.save(company);
    }
}
