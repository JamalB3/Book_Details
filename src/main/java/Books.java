import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Books {
    public void displayTable() throws SQLException
    {

        String select = "Select ID, Title, Author, Cost, Publisher, YearOfPublishing from Bookshelf";

        PreparedStatement statement = null;
        assert statement != null;
        ResultSet results = statement.executeQuery(select);

        while (results.next())
        {
            System.out.println("Book ISBN:    " + results.getInt("ID"));
            System.out.println("Book Title:    " + results.getString("Title"));
            System.out.println("Book Author: " + results.getString("Author"));
            System.out.println("Publisher: " + results.getString("Publisher") + " " + results.getInt("YearOfPublishing"));
            System.out.println("Cost       " + results.getInt("Cost"));
            System.out.println();
        }
    }
}
