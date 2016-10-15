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


    public boolean placeDisponible(int idPlaceChoisi, int idVol, int idPlaceActuel) throws SQLException {
	Connection con = ConnectionDB.getConnection();
	Statement stmt = con.createStatement();
	String requete = "SELECT idPlace FROM Reservation WHERE idPlace="+idPlaceChoisi+" and idVol="+idVol+""; 
	ResultSet resultat = stmt.executeQuery(requete);
	if(resultat.next() && resultat.getInt("idPlace")!=idPlaceActuel)
	    return false;
	else
	    return true;
    }

    public String placeDisponible(int idPlace, int idVol) throws SQLException {
	Connection con = ConnectionDB.getConnection();
	Statement stmt = con.createStatement();
	String requete = "SELECT Place.reference FROM Reservation JOIN Place ON(Reservation.idPlace=Place.id) WHERE idPlace="+idPlace+" and idVol="+idVol+""; 
	ResultSet resultat = stmt.executeQuery(requete);
	if(resultat.next())
	    return resultat.getString("Place.reference");
	else
	    return null;
	
    }
    
    
}
