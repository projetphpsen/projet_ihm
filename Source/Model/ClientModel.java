public class ClientModel {
    int id;
    String nom;

    public ClientModel(int id, String nom)    {
        Connection con = DriverManager.getConnection(...);
        Statement stmt = con.createStatement();
        PreparedStatement prepare = con.prepareStatement("INSERT INTO Client (idClient, nomClient, idRes) VALUES (?,?,?)");
        prepare.setString(1, id);
        prepare.setString(2, nom);
        prepare.executeUpdate();
    }

}