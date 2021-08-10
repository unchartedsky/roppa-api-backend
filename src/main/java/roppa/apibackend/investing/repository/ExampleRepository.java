package roppa.apibackend.investing.repository;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import roppa.apibackend.database.tables.pojos.Watchlist;
import roppa.apibackend.database.tables.records.WatchlistRecord;

import java.util.List;

import static roppa.apibackend.database.Tables.WATCHLIST;

@Repository
public class ExampleRepository {

    private final DSLContext context;

    @Autowired
    public ExampleRepository(DSLContext context) {
        this.context = context;
    }

    @Transactional(readOnly = true)
    public List<Watchlist> selectAllWatchList() {
        return context.select()
                .from(WATCHLIST).fetchInto(Watchlist.class);
    }

    @Transactional(readOnly = true)
    public WatchlistRecord selectWatchListSingleRecordByCompanyName(String companyName) {
        return context.fetchSingle(WATCHLIST, WATCHLIST.COMPANY_NAME.eq(companyName));
    }

    @Transactional
    public int insertNewCompanyData(String companyName, Integer perValue) {
        WatchlistRecord record = context.newRecord(WATCHLIST);
        record.setCompanyName(companyName);
        record.setPer(perValue);

        return record.store();
    }

    @Transactional
    public int insertNewCompanyData(Watchlist company) {
        return context.newRecord(WATCHLIST, company)
                .store();
    }

    @Transactional
    public int updateCompanyDataByCompanyName(String companyName, Integer perValue) {
        WatchlistRecord record = context.fetchOne(WATCHLIST, WATCHLIST.COMPANY_NAME.eq(companyName));
        record.setPer(perValue);

        return record.store();
    }

    @Transactional
    public int deleteCompanyByName(String companyName) {
        WatchlistRecord record = context.fetchOne(WATCHLIST, WATCHLIST.COMPANY_NAME.eq(companyName));

        return record.delete();
    }

}
