public class ReservationModel {
    String ref;
    Vol vol;
    ClientModel client;
    Boolean superieur;
    String place;
    int menu;
    Boolean tablette;
    int quotidien[];

    public ReservationModel(String ref, Vol vol, ClientModel client, Boolean sup, String place, int menu, Boolean tablette, int quot[])    {
        Connection con = DriverManager.getConnection(...);
        Statement stmt = con.createStatement();
        PreparedStatement prepare = con.prepareStatement("INSERT INTO Reservation (reference, vol, client, superieur) VALUES (?,?,?,?)");
        prepare.setString(1, ref);
        prepare.setString(2, vol.idVol);
        prepare.setString(3, client.idClient);
        prepare.setString(4, sup);
        prepare.executeUpdate();
    }

    public void setPlace(String place)  {
        this.place = place;
        Statement stmt = con.createStatement();
        PreparedStatement prepare = con.prepareStatement("UPDATE Reservation SET place = ? WHERE ref = ?");
        prepare.setString(1, place);
        prepare.setString(2, ref);
        prepare.executeUpdate();
    }

     public void setMenu(int menu)  {
        this.menu = menu;
        Statement stmt = con.createStatement();
        PreparedStatement prepare = con.prepareStatement("UPDATE Reservation SET menu = ? WHERE ref = ?");
        prepare.setString(1, menu);
        prepare.setString(2, ref);
        prepare.executeUpdate();
    }

    public void setTablette(Boolean tab)  {
        this.tablette = tab;
        Statement stmt = con.createStatement();
        PreparedStatement prepare = con.prepareStatement("UPDATE Reservation SET tab = ? WHERE ref = ?");
        prepare.setString(1, tab);
        prepare.setString(2, ref);
        prepare.executeUpdate();
    }
}