package com.responsive.pack;

import javafx.scene.Node;

/**
 * @author Rezky Bayusetya & Rifqi Yuner
 * <p>
 *  This module is responsible to create a column in a row of BootstrapPane
 * </p>
 * @param column return a column with the type of BootstrapColumn.
 * @param style a column style that has been defined with the type of ColumnStyle
 */
public class BootstrapCreator {
    public BootstrapColumn createColumn(Node widget, int style) {
        BootstrapColumn column = new BootstrapColumn(widget);
        if (style < 1||style>5) {
            throw new IllegalArgumentException("Column breakpoint error, must be 1,2,3,4, or 5");
        }else {
            switch (style) {
                case 1:
                    column.setBreakpointColumnWidth(Breakpoint.XSMALL, 12);
                    break;
                case 2:
                    column.setBreakpointColumnWidth(Breakpoint.XSMALL, 12);
                    column.setBreakpointColumnWidth(Breakpoint.SMALL, 6);
                    break;
                case 3:
                    column.setBreakpointColumnWidth(Breakpoint.XSMALL, 12);
                    column.setBreakpointColumnWidth(Breakpoint.SMALL, 4);
                    break;
                case 4:
                    column.setBreakpointColumnWidth(Breakpoint.XSMALL, 12);
                    column.setBreakpointColumnWidth(Breakpoint.SMALL, 8);
                    break;
                case 5:
                    column.setBreakpointColumnWidth(Breakpoint.XSMALL, 12);
                    column.setBreakpointColumnWidth(Breakpoint.SMALL, 6);
                    column.setBreakpointColumnWidth(Breakpoint.MEDIUM, 3);
                    break;
            }
        }
        return column;
    }
}
