import javax.swing.*;

class Example {
  public static void main(String[] args) {

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

    //creatig menu items for edit
    JMenuItem cut = new JMenuItem("Cut");
    JMenuItem copy = new JMenuItem("Copy");
    JMenuItem paste = new JMenuItem("Paste");

    //creating menu zoom 
    JMenu zoom new JMenu("Zoom");

    //creating menu items for zoom menu
    JMenuItem zoomin = new JMenuItem("Zoom In");
    JMenuItem zoomout = mnew JMenuItem("Zoom Out");

    //adding menu item to zoom menu
    zoom.add(zoomin);
    zoom.add(zoomout);
    
    //adding menu for edit menu

    edit.add(cut);
    edit.add(copy);
    edit.add(paste);


    //adding menu for file 
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
    f.setVisible(true);
  }
}
