/*
 * This file is generated by jOOQ.
 */
package roppa.apibackend.database.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Watchlist implements Serializable {

    private static final long serialVersionUID = 1L;

    private String  companyName;
    private Integer per;

    public Watchlist() {}

    public Watchlist(Watchlist value) {
        this.companyName = value.companyName;
        this.per = value.per;
    }

    public Watchlist(
        String  companyName,
        Integer per
    ) {
        this.companyName = companyName;
        this.per = per;
    }

    /**
     * Getter for <code>roppa.watchlist.company_name</code>.
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * Setter for <code>roppa.watchlist.company_name</code>.
     */
    public Watchlist setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * Getter for <code>roppa.watchlist.per</code>.
     */
    public Integer getPer() {
        return this.per;
    }

    /**
     * Setter for <code>roppa.watchlist.per</code>.
     */
    public Watchlist setPer(Integer per) {
        this.per = per;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Watchlist (");

        sb.append(companyName);
        sb.append(", ").append(per);

        sb.append(")");
        return sb.toString();
    }
}
