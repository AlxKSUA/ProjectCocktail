package com.angelx.builder;

import ControllerForms.Authorization;
import ControllerForms.ProductsForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Barman extends JFrame {
    JButton menu, products, back;
    HandlerMenu handlermenu = new HandlerMenu();
    HandlerProducts handlerproducts = new HandlerProducts();
    HandlerBack handlerback = new HandlerBack();

    public Barman(String s) {
        super(s);
        setLayout(new FlowLayout());
        menu = new JButton("Menu");
        products = new JButton("Products");
        back = new JButton("Back");
        add(menu);
        add(products);
        add(back);
        products.addActionListener(handlerproducts);
        menu.addActionListener(handlermenu);
        back.addActionListener(handlerback);
        //menu.addActionListener(menus);
    }

    public class HandlerMenu implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == menu) {
                setVisible(false);

            }
        }
    }

    public class HandlerBack implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == back) {
                setVisible(false);
                Authorization authorization = new Authorization("Authorization");
                authorization.setVisible(true);
                authorization.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                authorization.setSize(300, 175);
                authorization.setResizable(false);
                authorization.setLocationRelativeTo(null);
            }
        }
    }

    public class HandlerProducts implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == products) {
                setVisible(false);
                ProductsForm form = new ProductsForm("Products");
                form.setVisible(true);
                form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                form.setSize(375, 350);
                form.setLocationRelativeTo(null);
            }
        }
    }
}

