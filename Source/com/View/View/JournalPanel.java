import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class JournalPanel extends JPanel implements ActionListener{
    String[] quot = {"l'Equipe", "Le Figaro", "Le Monde", "L'Humanité", "Libération", "Les échos", "Le Parisien"};
    //JComboBox combo = new JComboBox(range);
    JLabel journaux = new JLabel("Choisissez vos quotidiens :");
    JButton clear = new JButton("Reset");
    JButton submit = new JButton("Suivant");
    DefaultListModel listModelOne = new DefaultListModel();
    JList liste = new JList(quot);
    DefaultListModel listModel = new DefaultListModel();
    JList listeChoix = new JList(listModel);

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == clear) {
            listModel.clear();
        }
    }
    

    public JournalPanel() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints contraintes = new GridBagConstraints();
        listeChoix.setVisibleRowCount(7);
        liste.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        liste.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList liste = (JList)evt.getSource();
                    if (evt.getClickCount() == 2) {
                        listModel.addElement(liste.getSelectedValue().toString());
                        liste.clearSelection();
                    } else if (evt.getClickCount() == 3) {
                        listModel.addElement(liste.getSelectedValue().toString());
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
        this.add(journaux,contraintes);

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