package com.hexaware.persistence;
import com.hexaware.model.Customer;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import com.hexaware.persistence.CustomerMapper;
/**
 * EmployDAO class used to fetch data from data base.
 * @author hexware
 */
public interface CustomerDAO {
     /**
     * @return the all the Customer record.
     */
    @SqlQuery("SELECT C.CUS_ID, C.CUS_Name, C.CUS_PASSWORD,"
    + " C.CUS_EMAIL, C.CUS_MOBILE,C.CUS_DOB,C.CUS_ADDRESS FROM Customer C;")
    @Mapper(CustomerMapper.class)
    List<Customer> show();
    /**
     * @return specific  Customer record.
     */
    @SqlQuery("SELECT C.CUS_ID, C.CUS_Name, C.CUS_PASSWORD,C.CUS_EMAIL,"
    + "  C.CUS_MOBILE,C.CUS_DOB,C.CUS_ADDRESS FROM Customer C WHERE C.CUS_ID=:cusId;")
    @Mapper(CustomerMapper.class)
    Customer showById(@Bind("cusId") int cusId);

     /**
     * @return insert  Customer record.
     */
    //@SqlUpdate("Insert INTO CUSTOMER(CusId,CusName,CusPassword,"+"CusMail,CusMobile,CusDob,CusAddress) VALUES(:CusId,:CusName,:CusPassword,"+":CusMail,:CusMobile,:CusDob,:CusAddress)")
    //int addCustomer(@BindBean Customer customer);

}
