package com.olebas.book;

import com.olebas.book.drawpanels.MyDrawPanel1;
import com.olebas.book.drawpanels.MyDrawPanel2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGGui3C implements ActionListener {

    JFrame frame;

    public static void main(String[] args) {
        SimpleGGui3C gui = new SimpleGGui3C();
        gui.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change Colors");
        button.addActionListener(this);

        MyDrawPanel1 drawPanel = new MyDrawPanel1();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        frame.repaint();
    }
}
