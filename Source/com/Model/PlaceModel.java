import java.sql.*;

public class PlaceModel {

    public PlaceModel(){}

    public int getIdDeReferencePlace(String reference) throws SQLException{
	Connection con = ConnectionDB.getConnection();
	Statement stmt = con.createStatement();
	String requete = "SELECT id FROM Place WHERE reference='"+reference+"'"; 
	ResultSet resultat = stmt.executeQuery(requete);
	if(resultat.next())
	    return resultat.getInt("id");
	else
	    return 0;
    }


}
