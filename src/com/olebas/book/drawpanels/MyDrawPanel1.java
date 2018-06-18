package com.olebas.book.drawpanels;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel1 extends JPanel {

    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }
}