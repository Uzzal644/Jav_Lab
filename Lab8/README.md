# Menu 

A ```menu``` is a way to arrange buttons. The object of MenuItem class adds a simple labeled menu item on menu. The items used in a menu must belong to the MenuItem or any of its subclass.

The object of Menu class is a pull down menu component which is displayed on the menu bar. It inherits the MenuItem class.

## Types of menus

There are several types of menus:

- ```Traditional dropdown menus``` are positioned across the top of a window in a menu bar, and display below the menu name.

- ```Popup menus``` appear when the user clicks, eg with the right mouse button, on a component that can handle a popup request.

## Dropdown menus: JMenuBar, JMenu, and JMenuItem

A menu bar can be added to the top of a top-level container, eg, JFrame, JApplet, or JDialog. Note that a menu bar can not be added to JPanel.
Dropdown menus have three parts:

1. ```JMenuBar``` is positioned across the top of a container (eg a JFrame, JPanel, or JApplet). It's placed above the content pane, so does not use the container's layout. Add menus to the menubar.

2. ```JMenu``` has a name and contains a number of menu itemsl which are displayed is a vertical list of menu items.

3. ```JMenuItems``` and Separators are added to each menu. Menu items are usually text "buttons", but can also have icons, checkboxes, radio buttons, or be hierarchical submenus.


