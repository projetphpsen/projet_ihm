import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class SiegePanel extends JPanel {
    private boolean superieur;
    private boolean[] rangeAsup = new boolean[10];
    private boolean[] rangeCsup = new boolean[10];
    private boolean[] rangeEsup = new boolean[10];
    private boolean[] rangeA = new boolean[20];
    private boolean[] rangeB = new boolean[20];
    private boolean[] rangeC = new boolean[20];
    private boolean[] rangeD = new boolean[20];
    private boolean[] rangeE = new boolean[20];

    public SiegePanel() {
	superieur = View.getSup();
        setPreferredSize(new Dimension(900,500));
      }

    public void paintComponent(Graphics g) {
	PlaceModel p = new PlaceModel();
	g.drawRect(0,0,600,200);
	int debut = 0;
	int fin = 0;
	char[] tabChar;
	if(superieur==true){
	    debut=1;
	    fin=30;
	}
	else {
	    debut=31;
	    fin=130;
	}
	    
	for(int i = debut; i <=fin; i++){
	    tabChar=null;
	    try{
		tabChar = View.getPlace(i).toCharArray();
	    }
	    catch(Exception err){}
	    if(tabChar!=null){
		
		char rangee = tabChar[0];
		int chiffre1 = Character.getNumericValue(tabChar[1]);
		int num = chiffre1;
		if(tabChar.length==3){
		int chiffre2 = Character.getNumericValue(tabChar[2]);
		num = chiffre1*10+chiffre2;
		}
		if(superieur == true){
		    if(rangee=='A'){
			rangeAsup[num]=true;
		    }
		    if(rangee=='C'){
			rangeCsup[num]=true;
		    }
		    if(rangee=='E'){
			rangeEsup[num]=true;
		    }
		}
		if(superieur == false){
		    if(rangee=='B'){
			rangeA[num]=true;
		    }
		    if(rangee=='A'){
			rangeB[num]=true;
		    }
		    if(rangee=='E'){
			rangeC[num]=true;
		    }
		    if(rangee=='D'){
			rangeE[num]=true;
		    }
		    if(rangee=='C'){
			rangeE[num]=true;
		    }
		}
	    }
	}
	    //
	if(superieur == true) {
            for(int i = 0; i < 10; i++) {
                if(rangeCsup[i] == false) {
                    g.setColor(Color.RED);
                    g.fillRect(10+i*60,10,38,38);
                }
                else {
                    g.setColor(Color.GREEN);
                    g.fillRect(10+i*60,10,38,38);
                }
		
                if(rangeEsup[i] == false) {
                    g.setColor(Color.RED);
                    g.fillRect(10+i*60,50,38,38);
                }
                else {
                    g.setColor(Color.GREEN);
                    g.fillRect(10+i*60,50,38,38);
                }

                if(rangeAsup[i] == false) {
                    g.setColor(Color.RED);
                    g.fillRect(10+i*60,152,38,38);
                }
                else {
                    g.setColor(Color.GREEN);
                    g.fillRect(10+i*60,152,38,38);
                }
            }
        }

        if(superieur == false) {
            for(int i = 0; i < 20; i++) {
                if(rangeC[i] == false) {
                    g.setColor(Color.RED);
                    g.fillRect(8+i*30,10,20,20);
                }
                else {
                    g.setColor(Color.GREEN);
                    g.fillRect(8+i*30,10,20,20);
                }

                if(rangeD[i] == false) {
                    g.setColor(Color.RED);
                    g.fillRect(8+i*30,35,20,20);
                }
                else {
                    g.setColor(Color.GREEN);
                    g.fillRect(8+i*30,35,20,20);
                }

                if(rangeE[i] == false) {
                    g.setColor(Color.RED);
                    g.fillRect(8+i*30,60,20,20);
                }

                else {
                    g.setColor(Color.GREEN);
                    g.fillRect(8+i*30,60,20,20);
                }

                if(rangeA[i] == false) {
                    g.setColor(Color.RED);
                    g.fillRect(8+i*30,170,20,20);
                }
                else {
                    g.setColor(Color.GREEN);
                    g.fillRect(8+i*30,170,20,20);
                }

                if(rangeB[i] == false) {
                    g.setColor(Color.RED);
                    g.fillRect(8+i*30,145,20,20);
                }
                else {
                    g.setColor(Color.GREEN);
                    g.fillRect(8+i*30,145,20,20);
                }
            }
        }
    }
}
