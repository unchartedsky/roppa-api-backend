/*
 * This file is generated by jOOQ.
 */
package roppa.apibackend.database.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import roppa.apibackend.database.tables.Watchlist;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WatchlistRecord extends UpdatableRecordImpl<WatchlistRecord> implements Record2<String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>roppa.watchlist.company_name</code>.
     */
    public WatchlistRecord setCompanyName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>roppa.watchlist.company_name</code>.
     */
    public String getCompanyName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>roppa.watchlist.per</code>.
     */
    public WatchlistRecord setPer(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>roppa.watchlist.per</code>.
     */
    public Integer getPer() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Watchlist.WATCHLIST.COMPANY_NAME;
    }

    @Override
    public Field<Integer> field2() {
        return Watchlist.WATCHLIST.PER;
    }

    @Override
    public String component1() {
        return getCompanyName();
    }

    @Override
    public Integer component2() {
        return getPer();
    }

    @Override
    public String value1() {
        return getCompanyName();
    }

    @Override
    public Integer value2() {
        return getPer();
    }

    @Override
    public WatchlistRecord value1(String value) {
        setCompanyName(value);
        return this;
    }

    @Override
    public WatchlistRecord value2(Integer value) {
        setPer(value);
        return this;
    }

    @Override
    public WatchlistRecord values(String value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WatchlistRecord
     */
    public WatchlistRecord() {
        super(Watchlist.WATCHLIST);
    }

    /**
     * Create a detached, initialised WatchlistRecord
     */
    public WatchlistRecord(String companyName, Integer per) {
        super(Watchlist.WATCHLIST);

        setCompanyName(companyName);
        setPer(per);
    }
}
