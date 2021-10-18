package com.responsive.pack;

import com.responsive.pack.math.MathUtils;
import javafx.scene.Node;

/**
 * @author Rezky Bayusetya & Rifqi Yuner
 *  This module contain a method - method that can be accessed for BootstrapColumn
 */
public class BootstrapColumn {
    private final Node content;
    int[] columnWidths = new int[]{
            1,  //XS (default)
            -1, //Sm
            -1, //Md
            -1, //Lg
            -1  //XL
    };

    /**
     *
     * @param content value of node content
     */
    public BootstrapColumn(Node content) {
        this.content = content;
    }

    /**
     *
     * @param breakPoint value of breakpoint that want to be set
     * @param width value of width in int with minimum value 1 and maximum value of it 12
     */
    public void setBreakpointColumnWidth(Breakpoint breakPoint, int width) {
        columnWidths[breakPoint.getValue()] = MathUtils.clamp(width, 1, 12);
    }

    /**
     *
     * @param breakPoint value of breakpoint
     */
    public void unsetBreakPoint(Breakpoint breakPoint) {
        columnWidths[breakPoint.getValue()] = -1;
    }

    public void unsetAllBreakPoints() {
        this.columnWidths = new int[]{
                1,  //XS (default)
                -1, //Sm
                -1, //Md
                -1, //Lg
                -1  //XL
        };
    }

    /**
     * @param breakPoint value of current breakpoint
     * @return value of first valid breakpoint after iterating or returning the default value which is 1
     */
    public int getColumnWidth(Breakpoint breakPoint) {
        //Iterate through breakpoints, beginning at the specified bp, travelling down. Return first valid bp value.
        for (int i = breakPoint.getValue(); i >= 0; i--) {
            if (isValid(columnWidths[i])) return columnWidths[i];
        }
        //If none are valid, return 1
        return 1;
    }

    public Node getContent() {
        return content;
    }

    private boolean isValid(int value) {
        return value > 0 && value <= 12;
    }
}
