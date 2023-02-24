/**
 * Main ITECalculator
 * date : Tuesday, 24 July 2022
 * name : Pho SoPhors
 */

import javax.swing.*;

public class Main { // START MAIN
    public static void main(String[] args){
        ITECalculator iteCalculator = new ITECalculator();
        iteCalculator.setSize(770,450);
        iteCalculator.setLocation(0, 0);
        iteCalculator.setResizable(false); //
        iteCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iteCalculator.setVisible(true);
    } // END VOID MAIN
} // END MAIN CLASS