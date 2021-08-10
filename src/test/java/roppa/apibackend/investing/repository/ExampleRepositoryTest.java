package roppa.apibackend.investing.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jooq.JooqTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static roppa.apibackend.database.tables.Watchlist.WATCHLIST;

@JooqTest
public class ExampleRepositoryTest {

    @Autowired
    private ExampleRepository repository;

    @Test
    public void givenValidDataWhenCRUDThenSucceed() {
        assertEquals(1, repository.insertNewCompanyData("Test", 10));
        assertEquals("Test", repository.selectWatchListSingleRecordByCompanyName("Test").get(WATCHLIST.COMPANY_NAME));
        assertEquals(1, repository.updateCompanyDataByCompanyName("Test", 7));
        assertEquals(Integer.valueOf(7), repository.selectWatchListSingleRecordByCompanyName("Test").get(WATCHLIST.PER));
        assertEquals(1, repository.deleteCompanyByName("Test"));
        assertEquals(0, repository.selectAllWatchList().size());
    }
}