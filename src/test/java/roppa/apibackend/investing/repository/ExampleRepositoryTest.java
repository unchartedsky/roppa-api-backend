package roppa.apibackend.investing.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jooq.JooqTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static roppa.apibackend.database.tables.Watchlist.WATCHLIST;

@RunWith(SpringRunner.class)
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