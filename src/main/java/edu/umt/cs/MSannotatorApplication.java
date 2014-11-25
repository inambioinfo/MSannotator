package edu.umt.cs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.umt.cs.ui.MSannotatorApplicationJMenuBar;

/**
 * MSannotator is a data visualization application for rendering multivariate plots
 * of data related to mass spectrometry. This is the heavyweight container hosting the
 * application components.
 */
public class MSannotatorApplication extends JFrame implements ActionListener
{

    private static MSannotatorApplicationJMenuBar sSannotatorApplicationJMenuBar;

    /**
     * The application entry point is called at this point, typical of all java applications.
     *
     * @param args A string array of command line arguments.
     */
    public static void main( String[] args )
    {
        EventQueue.invokeLater(new Runnable() {

            public void run() {

                // Create instance of container
                MSannotatorApplication application = new MSannotatorApplication();
                application.setTitle("MSannotator -- Mass Spectrometry Visualization");
                application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Add JMenu to container
                sSannotatorApplicationJMenuBar = new MSannotatorApplicationJMenuBar(application);
                application.setJMenuBar(sSannotatorApplicationJMenuBar);

                // Setup visual elements of frame
                application.setSize(600, 300);
                application.setVisible(true);

            }

        });
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if ( actionEvent.getActionCommand() == "Exit" ) {
            System.exit(0);
        } else if ( actionEvent.getActionCommand() == "Import ..." ) {

            /* TODO: Implement import of mzml data
             *
             * The application would open a dialog allowing a user to specify the mzml file to import.
             * 
             */

        } else {
            System.err.println("Unimplemented action called " + actionEvent.getActionCommand());
        }
    }
}
