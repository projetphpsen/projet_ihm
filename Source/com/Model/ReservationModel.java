import java.sql.*;

public class ReservationModel {
    private String ref;
    private VolModel vol;
    private ClientModel client;
    private String reference;
    private String superieur;
    private String place;
    private String menu;
    private Boolean tablette;
    private int quotidien[];

    public ReservationModel(String ref, ClientModel client, Boolean sup, String place, int menu, Boolean tablette, int quot[], VolModel vol)  throws SQLException{
        Connection con = ConnectionDB.getConnection();
        Statement stmt = con.createStatement();
        /*PreparedStatement prepare = con.prepareStatement("INSERT INTO Reservation (reference, vol, client, superieur) VALUES (?,?,?,?)");
	  prepare.setString(1, ref);
	  prepare.setString(2, VolModel.idVol);
	  prepare.setString(3, ClientModel.idClient);
	  prepare.setString(4, sup);
	  prepare.executeUpdate();
	*/
    }

    public void setPlace(String place) throws SQLException {
        this.place = place;
	Connection con = ConnectionDB.getConnection();
        Statement stmt = con.createStatement();
        PreparedStatement prepare = con.prepareStatement("UPDATE Reservation SET place = ? WHERE ref = ?");
        prepare.setString(1, place);
        prepare.setString(2, ref);
        prepare.executeUpdate();
    }

    public static String setMenu(String menu, ClientModel client) {
	String refClient = client.getrefClient();
        Statement stmt = con.createStatement();
        String requete = "UPDATE Reservation SET menu ='"+menu+"' WHERE ref ='"+refClient+"'";
        Resultset resultat = stmt.executeQuery(requete);
	
    }

    /*public void setTablette(Boolean tab)  {
        this.tablette = tab;
	Connection con = ConnectionDB.getConnection();
        Statement stmt = con.createStatement();
        PreparedStatement prepare = con.prepareStatement("UPDATE Reservation SET tab = ? WHERE ref = ?");
        prepare.setString(1, tab);
        prepare.setString(2, ref);
        prepare.executeUpdate();
	}*/
}
