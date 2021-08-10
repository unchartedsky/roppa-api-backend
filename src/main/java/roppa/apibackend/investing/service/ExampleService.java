package roppa.apibackend.investing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roppa.apibackend.database.tables.pojos.Watchlist;
import roppa.apibackend.investing.repository.ExampleRepository;

@Service
public class ExampleService {

    private final ExampleRepository exampleRepository;

    @Autowired
    public ExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    public int registNewCompanyToWatchlist(Watchlist company) {
        return exampleRepository.insertNewCompanyData(company);
    }
}
