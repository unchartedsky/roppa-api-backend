/*
 * This file is generated by jOOQ.
 */
package roppa.apibackend.database;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import roppa.apibackend.database.tables.Watchlist;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Roppa extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>roppa</code>
     */
    public static final Roppa ROPPA = new Roppa();

    /**
     * The table <code>roppa.watchlist</code>.
     */
    public final Watchlist WATCHLIST = Watchlist.WATCHLIST;

    /**
     * No further instances allowed
     */
    private Roppa() {
        super("roppa", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Watchlist.WATCHLIST);
    }
}
