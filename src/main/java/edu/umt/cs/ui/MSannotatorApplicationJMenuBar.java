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

    public MSannotatorApplicationJMenuBar(final ActionListener container) {

        // Build File Menu
        mFileMenu = new JMenu("File");
        mFileMenu.setMnemonic(KeyEvent.VK_F);

        mFileMenuExitItem = new JMenuItem("Exit", KeyEvent.VK_X);

        mFileMenuExitItem.addActionListener(container);

        // Add Items to menu
        mFileMenu.add(mFileMenuExitItem);

        this.add(mFileMenu);
    }

}
