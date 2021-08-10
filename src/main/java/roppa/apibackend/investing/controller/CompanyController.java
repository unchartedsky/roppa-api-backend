package roppa.apibackend.investing.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import roppa.apibackend.investing.model.dto.WatchlistDTO;
import roppa.apibackend.investing.model.mapper.WatchlistMapper;
import roppa.apibackend.investing.service.ExampleService;

@Controller
@RequestMapping(value = "/company")
public class CompanyController {

    private final ExampleService exampleService;
    private final WatchlistMapper mapper;

    @Autowired
    public CompanyController(ExampleService exampleService) {
        this.exampleService = exampleService;
        this.mapper = Mappers.getMapper(WatchlistMapper.class);
    }

    @GetMapping("/form")
    public String companyRegisterForm(WatchlistDTO company, Model model) {
        model.addAttribute("company", company);

        return "company-form";
    }

    @PostMapping("/regist")
    public String addNewCompany(WatchlistDTO company, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "company-form";
        }

        exampleService.registNewCompanyToWatchlist(mapper.watchlistDTOtoWatchlist(company));

        model.addAttribute("company", company);
        return "company-form";
    }

}
