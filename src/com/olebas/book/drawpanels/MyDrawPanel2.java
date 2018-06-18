package com.olebas.book.drawpanels;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel2 extends JFrame {

    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("bart.png").getImage();
        g.drawImage(image, 3, 4, this);
    }
}
