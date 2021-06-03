
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import java.sql.SQLException;
import java.util.List;

public class AddressBookDBTest {
    @Test

    public void givenAddressBookInDB_WhenRetrived_ShouldMatchEmployeeCount() throws SQLException {
        AddressBookDB addressBookDB = new AddressBookDB();
        List<AddressBookData> addressbookData = addressBookDB.getInstance().readAddressBookData();
        Assertions.assertEquals(2,addressbookData.size());
    }
}
