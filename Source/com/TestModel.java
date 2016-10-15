import java.sql.*;
    
public class TestModel {

    public static void main(String[] args){
	//Variable pour l'authentification
	int attempt = 1;
	//Variables pour le test :
	//Cas 1 : info d'un Client en fonction de la place et du nom du vol
	PlaceModel place = new PlaceModel();
	String nomVol=null;
	int idPlace=0;
	//String nomVol="CA2182";
	//String nomClient = null;
	//String refClient = null;
	//Cas 2 : client se connecte
	String nomClient="humbert";
	String refClient="P7A3O4Q0SYY8";
	
	String commentaire="Vol épouvantable!";
	boolean tablette = true;//false = pas de tablette
	String menu = "végétarien";//on doit mettre soit "végétarien","normal",ou"sans gluten"
	int choixQuotidien = 2;
	
	while(attempt <= 3) {
	    try {
		if(attempt > 1 )
		    System.out.println("Login or password failed, please try again.("+attempt+"/3)");
		new ConnectionDB();
		if(attempt == 3)
		    System.out.println("Authentification failed.");
		Connection con = ConnectionDB.getConnection();
		if(con != null) {
		    ClientModel c = new ClientModel();
		    System.out.println("---MODELE : ConnexionDB.java---");
		    System.out.println("- ConnectionDB.getConnection(1) : "+ConnectionDB.getConnection());
		    System.out.println("---MODELE : ClientModel.java---");
		    System.out.println("- findClient : "+c.find(idPlace,nomVol,nomClient,refClient));
		    System.out.println("- getnom : "+c.getNom());
		    System.out.println("- getprenom : "+c.getPrenom()); 
		    System.out.println("- getrefClient : "+c.getRefClient());
		    System.out.println("- getnomVol : "+c.getNomVol());
		    System.out.println("- getclasseClient : "+c.getClasseClient());
		    
		    System.out.println("- getid : "+c.getId());
		    System.out.println("- getdepart : "+c.getDepart());
		    System.out.println("- getmenu(1) : "+c.getMenu());
		    System.out.println("- setmenu : "+menu);
		    c.setMenu(menu);   
		    System.out.println("- getmenu(2) :"+c.getMenu());
		    System.out.println("- getchoixtablette(1) : "+c.getChoixTablette());
		    System.out.println("- setchoixtablette : "+tablette);
		    c.setChoixTablette(tablette);
		    System.out.println("- getchoixtablette(2) : "+c.getChoixTablette());
		    System.out.println("- getcommentaire(1) : "+c.getCommentaire(c.getNomVol()));
		    System.out.println("- setcommentaire : "+commentaire);
		    c.setCommentaire(commentaire,c.getCommentaire(c.getNomVol()));
		    System.out.println("- getcommentaire(2) : "+c.getCommentaire(c.getNomVol()));
		    System.out.println("- getidPlace(1) : "+c.getIdPlace());
		    System.out.println("- getReferencePlace(1) : "+c.getReferencePlace());
		    System.out.println("- setPlace : "+idPlace);
		    idPlace = place.getIdDeReferencePlace("A1");
		    c.setPlace(idPlace);

		    System.out.println("- getidPlace(2) : "+c.getIdPlace());
		    System.out.println("- getReferencePlace : "+c.getReferencePlace());
		    System.out.println("- setChoixQuotidien : "+choixQuotidien);
		    c.setChoixQuotidien(choixQuotidien);
		    System.out.print("- getListeQuotidien : ");
		    String[] tab = c.getListeQuotidien();
		    for(int i = 0; i < tab.length; i++)
			System.out.print(tab[i]+" - ");
		    System.out.println(" ");
		    System.out.println("- reference des places :");
		    String a = "C";
		    PersonnelsModel p = new PersonnelsModel();
		    for(int i=1;i <=10;i++){
			if(i!=13){
			    for(int j = 0; j<3; j++){
				if(a=="C")
				    a="A";
				else if(a=="A")
				    a="E";
				else if(a=="E")
				    a="C";
				String rangee=String.valueOf(i);
				String refPlace=a+rangee;
				System.out.print(refPlace);
			    }
			    System.out.println(" ");
			}
		    }
		    a="C";
		    for(int i=11;i <=31;i++){
			if(i!=13){
			    for(int j = 0; j<5; j++){
				if(a=="C")
				    a="B";
				else if(a=="B")
				    a="A";
				else if(a=="A")
				    a="E";
				else if(a=="E")
				    a="D";
				else if(a=="D")
				    a="C";
				String rangee=String.valueOf(i);
				String refPlace=a+rangee;
				System.out.print(refPlace);
			    }
			    System.out.println(" ");
			}
		    }



		    attempt = 3;
		}
		System.out.println("---MODELE : ConnectionDB.java---"); 
		System.out.println("- ConnectionDB.disconnect");
		ConnectionDB.disconnect();
		System.out.println("- ConnectionDB.getConnection(2) : "+ConnectionDB.getConnection());
	    }
	    catch (SQLException err){
		err.printStackTrace();
	    }	
	    attempt++;
	}
    }
    

}
