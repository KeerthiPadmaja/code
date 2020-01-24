package com.hexaware.persistence;
import com.hexaware.model.Vendor;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import com.hexaware.persistence.VendorMapper;
/**
 * EmployDAO class used to fetch data from data base.
 * @author hexware
 */
public interface VendorDAO {
     /**
     * @return the all the Employ record.
     */
    @SqlQuery("SELECT E.VEN_ID, E.VEN_NAME, E.VEN_PASSWORD,"
    + " E.VEN_EMAIL,E.VEN_MOBILE,E.VEN_ADDRESS FROM Vendor E;")
    @Mapper(VendorMapper.class)
    List<Vendor> show();

     /**
     * @return the all the Employ record.
     */
    @SqlQuery("SELECT E.VEN_ID, E.VEN_NAME, E.VEN_PASSWORD,"
    + " E.VEN_EMAIL,E.VEN_MOBILE,E.VEN_ADDRESS FROM Vendor E WHERE E.VEN_ID=:venId;")
    @Mapper(VendorMapper.class)
    Vendor showById(@Bind("venId") int venId);

}

