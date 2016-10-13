import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class JournalPanel extends JPanel implements ActionListener{
    JLabel label = new JLabel("Veuillez choisir vos quotidiens favoris :");
    JButton clear = new JButton("Reset");
    JButton submit = new JButton("Suivant");
    DefaultListModel listModelOne = new DefaultListModel();
    JList liste = new JList(listModelOne);
    DefaultListModel listModel = new DefaultListModel();
    JList listeChoix = new JList(listModel);
    ArrayList<String> journauxChoisis = new ArrayList<String>();

    public JournalPanel() {
            submit.addActionListener(this);
            resetElements();
            addComponents();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit) {
            ListModel listeFinale = listeChoix.getModel();

            for(int i=0; i < listeFinale.getSize(); i++){
                 journauxChoisis.add(listeFinale.getElementAt(i).toString());  
                 System.out.println(journauxChoisis.get(i));
            }
        }
        if(e.getSource() == clear) {
            resetElements();
        }
    }
    
    public void resetElements() {
        listModel.clear();
        listModelOne.clear();
        listModelOne.addElement("L'Equipe");
        listModelOne.addElement("Le Figaro");
        listModelOne.addElement("L'Humanité'");
        listModelOne.addElement("Libération");
        listModelOne.addElement("Les échos");
        listModelOne.addElement("Le Parisien");
    }

    public void addComponents() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints contraintes = new GridBagConstraints();
        listeChoix.setVisibleRowCount(7);
        liste.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        liste.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList liste = (JList)evt.getSource();
                    if (evt.getClickCount() == 2) {
                        listModel.addElement(liste.getSelectedValue().toString());
                        listModelOne.removeElement(liste.getSelectedValue());
                        liste.clearSelection();
                    } else if (evt.getClickCount() == 3) {
                        listModel.addElement(liste.getSelectedValue().toString());
                        listModelOne.removeElement(liste.getSelectedValue());
                        liste.clearSelection();
                    }
            }
            });

        listeChoix.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList liste = (JList)evt.getSource();
                    if (evt.getClickCount() == 2) {
                        listModelOne.addElement(listeChoix.getSelectedValue().toString());
                        listModel.removeElement(listeChoix.getSelectedValue());
                        liste.clearSelection();
                    } else if (evt.getClickCount() == 3) {
                        listModelOne.addElement(listeChoix.getSelectedValue().toString());
                        listModel.removeElement(listeChoix.getSelectedValue());
                        liste.clearSelection();
                    }
            }
            });    

        clear.addActionListener(this);

        contraintes.gridx = 1;
        contraintes.gridy = 1;
        contraintes.gridheight = 1;
        contraintes.gridwidth = 1;
        contraintes.fill = GridBagConstraints.HORIZONTAL;
        contraintes.insets = new Insets(5,5,5,5);
        this.add(label,contraintes);

        contraintes.gridx = 2;
        contraintes.gridy = 1;
        this.add(liste,contraintes);

        contraintes.gridx = 3;
        contraintes.gridy = 1;
        this.add(listeChoix,contraintes);

        contraintes.gridx = 3;
        contraintes.gridy = 2;
        this.add(clear,contraintes);

        contraintes.gridx = 4;
        contraintes.gridy = 1;
        this.add(submit,contraintes);
    }

    
}