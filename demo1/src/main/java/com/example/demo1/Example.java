package com.example.demo1;

import javax.swing.*;
import java.awt.event.*;

class Example {
    public static void main(String[] args) {
        // Creating the frame
        JFrame f = new JFrame("Menu Example");
+
        // Creating the menu bar
        JMenuBar mb = new JMenuBar();

        // Creating new menus
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu view = new JMenu("View");

        // Adding menu items to the file menu
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        // Creating menu items for edit
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        // Creating menu zoom
        JMenu zoom = new JMenu("Zoom");

        // Creating menu items for zoom menu
        JMenuItem zoomin = new JMenuItem("Zoom In");
        JMenuItem zoomout = new JMenuItem("Zoom Out");

        // Set shortcut for exit menu item
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));

        // Add action listener to the exit menu item
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Adding menu items to zoom menu
        zoom.add(zoomin);
        zoom.add(zoomout);

        // Adding menu items to edit menu
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        // Adding zoom menu to view menu
        view.add(zoom);

        // Adding menu items to file menu
        file.add(open);
        file.add(save);
        file.add(exit);

        // Adding the menus to the menu bar
        mb.add(file);
        mb.add(edit);
        mb.add(view);

        // Setting the menu bar on the frame
        f.setJMenuBar(mb);

        // Setting the frame layout and size
        f.setLayout(null);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
