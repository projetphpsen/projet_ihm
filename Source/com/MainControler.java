import java.sql.*;

public class MainControler {
    private static ClientModel c;
    private static View v;
    
    public MainControler() {
       
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
    
    public void nextCard(){
	v.next();
    }
}
	    
