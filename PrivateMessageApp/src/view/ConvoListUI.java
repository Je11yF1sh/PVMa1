/*
    The actual GUI that will be in use
 */
package view;

import controller.ConvoCntl;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Sam
 */
public class ConvoListUI extends JFrame{
    private JPanel tablePanel, buttonPanel;
    private JTable convoTable;
    public JButton doneButton, detailsButton, newButton;
    private JScrollPane tableScroller;
    private ConvoCntl convoCntl;
    public ConvoListUI(ConvoCntl convoCntl){
        this.convoCntl = convoCntl;
        initComponents();   
    }
    public void initComponents(){
        tablePanel = new JPanel();
        buttonPanel = new JPanel(new GridLayout(1,4));
        convoTable = new JTable(convoCntl.getConvoTableModel());
        doneButton = new JButton("Done");
        detailsButton = new JButton("Details");;
        newButton = new JButton("New Convo");
        buttonPanel.add(newButton);
        buttonPanel.add(detailsButton);
        buttonPanel.add(doneButton);
        tableScroller = new JScrollPane(convoTable);
        convoTable.setFillsViewportHeight(true);
        tableScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tableScroller.setPreferredSize(new Dimension(350,300));
        tablePanel.add(tableScroller);
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(tablePanel, BorderLayout.CENTER);
    }
    public class DetailsButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedTableRow = convoTable.getSelectedRow();
            int selectedModelRow = convoTable.convertRowIndexToModel(selectedTableRow);
            ConvoListUI.this.convoCntl.getConvoUI(selectedModelRow);
        }
    }
}
