package com.hexaware.persistence;
import com.hexaware.model.Vendor;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
/**
 * WalletMapper class used to fetch Wallet data from database.
 * @author hexware
 */
public class VendorMapper implements ResultSetMapper<Vendor> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Vendor map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Wallet
       */
     
      return new Vendor(rs.getInt("VEN_ID"), 
        rs.getString("VEN_NAME"), rs.getString("VEN_PASSWORD"), 
        rs.getString("VEN_EMAIL"), rs.getString("VEN_MOBILE"),rs.getString("VEN_ADDRESS")
        );
  }
}