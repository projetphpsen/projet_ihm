import java.sql.*;

public class MainControler {
    private ClientModel c;
    private static View v;
    
    public MainControler() {
       
    }

    public static void setView(View view){
	v = view;
    }
    
    public void setClient(ClientModel c){
	c = this.c;
    }

    public ClientModel getClient(){
	return c;
    }
    
    public void nextCard(){
	v.next();
    }
}
	    
