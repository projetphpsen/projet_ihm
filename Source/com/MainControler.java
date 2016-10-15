import java.sql.*;

public class MainControler {
    private static ClientModel c;
    private static View v;
    
    public MainControler() {
       
    }

    public void setPlace() throws SQLException{
	for(int i = 1; i <=130;i++)
	    v.setPlace(i);
    }

    public static String getPlace (int idPlace) throws SQLException{
	PlaceModel p = new PlaceModel();
	return p.placeDisponible(idPlace,c.getIdVol());
    }

    public static void setView(View view){
	v = view;
    }
    
    public void setClient(ClientModel client){
	c=client;
	
    }

    public static ClientModel getClient(){
	return c;
    }
    
    public void nextCard(int i){
	v.next(i);
    }

    public static void setClasseClient(){
	if(c.getClasseClient()!=1)
	    View.setSup(false);
	else
	    View.setSup(true);
    }
}
	    
