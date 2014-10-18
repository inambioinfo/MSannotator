package edu.umt.cs;

import javax.swing.*;
import java.awt.*;

/**
 * Hello world!
 *
 */
public class MSannotatorApplication extends JFrame
{
    public static void main( String[] args )
    {
        EventQueue.invokeLater(new Runnable() {

            public void run() {

                // Create instance of container
                MSannotatorApplication application = new MSannotatorApplication();
                application.setTitle("MSannotator -- Mass Spectrometry Visualization");
                application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                // Setup visual elements of frame
                application.setSize(600, 300);
                application.setVisible(true);

            }

        });
    }
}
