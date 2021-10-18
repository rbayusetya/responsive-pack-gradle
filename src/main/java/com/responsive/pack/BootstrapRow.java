package com.responsive.pack;

import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BootstrapRow {
    public int calculateRowPositions(int lastGridPaneRow, com.responsive.pack.Breakpoint currentWindowSize) {
        int inputRow = lastGridPaneRow;

        if (this.getColumns().isEmpty()) return 0;
        int currentGridPaneColumn = 0; //start in the first column
        for (com.responsive.pack.BootstrapColumn column : this.getColumns()) {
            int contentWidth = column.getColumnWidth(currentWindowSize);
            if (currentGridPaneColumn + contentWidth > 12) {
                lastGridPaneRow++;
                currentGridPaneColumn = 0;
            }
            GridPane.setConstraints(
                    column.getContent(),
                    currentGridPaneColumn,
                    lastGridPaneRow,
                    contentWidth,
                    1
            );
            currentGridPaneColumn += contentWidth;
        }
        return lastGridPaneRow - inputRow + 1;
    }

    public List<com.responsive.pack.BootstrapColumn> getColumns(){
        return Collections.unmodifiableList(columns);
    }

    private final List<com.responsive.pack.BootstrapColumn> columns = new ArrayList<>();

    public void addColumn(com.responsive.pack.BootstrapColumn column){
        if(column == null) return;
        columns.add(column);
    }
    public void removeColumn(com.responsive.pack.BootstrapColumn column){
        columns.remove(column);
    }
    public void clear(){
        columns.clear();  //remove all columns
    }
}

