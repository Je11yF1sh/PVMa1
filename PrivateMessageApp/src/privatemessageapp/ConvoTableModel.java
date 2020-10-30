package privatemessageapp;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sam
 */

public class ConvoTableModel extends AbstractTableModel{
    private String[] columnNames = {"Convos: ", "New Messages"};
    private ArrayList<Conversations> convoList;

    public ConvoTableModel(ArrayList<Conversations> convoList) {
        this.convoList = convoList;
    }

    @Override
    public int getRowCount() {
        return convoList.size();
        
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;

    }
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }
    @Override
    public Object getValueAt(int rowIndex, int col) {
        switch(col){
            case 0: return (Object) convoList.get(rowIndex).getConvoName();
            case 1: return (Object) convoList.get(rowIndex).getNewMessages();
            default: return null;
        }
    }


    
            
}