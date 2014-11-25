package edu.umt.cs.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * RE
 */
public class MSannotatorApplicationJMenuBar extends JMenuBar {

    private JMenu mFileMenu;

    private JMenuItem mFileMenuExitItem;
    private JMenuItem mFileMenuImportItem;

    public MSannotatorApplicationJMenuBar(final ActionListener container) {

        // Build File Menu
        mFileMenu = new JMenu("File");
        mFileMenu.setMnemonic(KeyEvent.VK_F);

        mFileMenuExitItem = new JMenuItem("Exit", KeyEvent.VK_X);
        mFileMenuImportItem = new JMenuItem("Import ...", KeyEvent.VK_I);

        mFileMenuExitItem.addActionListener(container);
        mFileMenuImportItem.addActionListener(container);

        // Add Items to menu
        mFileMenu.add(mFileMenuExitItem);
        mFileMenu.add(mFileMenuImportItem);

        this.add(mFileMenu);
    }

}
