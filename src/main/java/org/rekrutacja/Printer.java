package org.rekrutacja;

import lombok.Data;

@Data
public class Printer {

    private StringBuilder firstRow = new StringBuilder("*");
    private StringBuilder secondRow = new StringBuilder("***");

    public void printStars(int maxRowsIteration){

        for(int i = 0; i < maxRowsIteration; i++) {

            System.out.println(firstRow);
            System.out.println(secondRow);

            appendRows("*");

        }
    }

    private void appendRows(String added){
        firstRow.append(added);
        secondRow.append(added);
    }
}
