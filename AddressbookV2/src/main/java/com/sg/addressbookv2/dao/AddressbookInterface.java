
package com.sg.addressbookv2.dao;

import com.sg.addressbookv2.dto.Address;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author Paul Peterson
 */
public interface AddressbookInterface {
    
    public void createAddress();
    public ArrayList< Address> searchAddress(Predicate predicate);
    public Address displaySearchResults(ArrayList<Address> results, String displayType);
    public Address editAddress(Address address);
    public void deleteAddress(Address address);
    public int countEntries();
    public void saveAddressBook();
    public void loadAddressBook();
    
}
