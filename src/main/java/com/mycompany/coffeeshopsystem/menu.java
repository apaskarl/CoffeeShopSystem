/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.coffeeshopsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.*;


public class menu extends javax.swing.JFrame {
    public menu() {
        initComponents();
        dt();
        time();
    }
    
    
    public void dt() {
        
        Date d = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        
        String dd = sdf.format(d);
        dateLabel.setText(dd);
    }
    Timer t;
    SimpleDateFormat st;
        
    public void time() {
        
        
        t = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("");
                
                Date dt = new Date();
                st = new SimpleDateFormat("hh:mm:ss a");
                
                String tt = st.format(dt);
                
                timeLabel.setText(tt);
            }
        });
        
        t.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        logoHeader = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        menulistPanel = new javax.swing.JPanel();
        menulistText = new javax.swing.JTextField();
        cafelattePic = new javax.swing.JLabel();
        whitemochaPic = new javax.swing.JLabel();
        caramellattePic = new javax.swing.JLabel();
        cafeamericanoPic = new javax.swing.JLabel();
        cafeLatteButton = new com.mycompany.coffeeshopsystem.button();
        whitemochaButton = new com.mycompany.coffeeshopsystem.button();
        caramellatteButton = new com.mycompany.coffeeshopsystem.button();
        cafeamericanoButton = new com.mycompany.coffeeshopsystem.button();
        cappuccinoPic = new javax.swing.JLabel();
        cappuccinoButton = new com.mycompany.coffeeshopsystem.button();
        cafemochaPic = new javax.swing.JLabel();
        cafemochaButton = new com.mycompany.coffeeshopsystem.button();
        cookiesncreamPic = new javax.swing.JLabel();
        artisanalchocoPic = new javax.swing.JLabel();
        artisanalchocoButton = new com.mycompany.coffeeshopsystem.button();
        cookiesncreamButton = new com.mycompany.coffeeshopsystem.button();
        receiptPanel = new javax.swing.JPanel();
        receiptTextField = new javax.swing.JTextField();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        printButton = new com.mycompany.coffeeshopsystem.button2();
        payButton = new com.mycompany.coffeeshopsystem.button2();
        deleteButton = new com.mycompany.coffeeshopsystem.button2();
        clearButton = new com.mycompany.coffeeshopsystem.button2();
        paymentPanel = new javax.swing.JPanel();
        totalText = new javax.swing.JLabel();
        cashText = new javax.swing.JLabel();
        balanceText = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        cash = new javax.swing.JTextField();
        timeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        inventoryButton = new com.mycompany.coffeeshopsystem.button();
        logoutButton = new com.mycompany.coffeeshopsystem.button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        panel1.setBackground(new java.awt.Color(255, 255, 255));

        logoHeader.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 18)); // NOI18N
        logoHeader.setForeground(new java.awt.Color(0, 0, 0));
        logoHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoHeader.setIcon(new javax.swing.ImageIcon("C:\\Users\\Karl\\OneDrive\\Documents\\NetBeansProjects\\CoffeeShopSystem\\icons\\logos\\logo-header-166x50.png")); // NOI18N

        panel2.setBackground(new java.awt.Color(40, 65, 84));

        menuPanel.setBackground(new java.awt.Color(181, 199, 213));

        menulistPanel.setBackground(new java.awt.Color(80, 109, 132));

        menulistText.setEditable(false);
        menulistText.setBackground(new java.awt.Color(80, 109, 132));
        menulistText.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 24)); // NOI18N
        menulistText.setForeground(new java.awt.Color(255, 255, 255));
        menulistText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        menulistText.setText("Menu");
        menulistText.setBorder(null);
        menulistText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menulistTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menulistPanelLayout = new javax.swing.GroupLayout(menulistPanel);
        menulistPanel.setLayout(menulistPanelLayout);
        menulistPanelLayout.setHorizontalGroup(
            menulistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menulistText)
        );
        menulistPanelLayout.setVerticalGroup(
            menulistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menulistPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menulistText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cafelattePic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Karl\\OneDrive\\Documents\\NetBeansProjects\\CoffeeShopSystem\\icons\\coffee\\cafe-latte.png")); // NOI18N
        cafelattePic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cafelattePicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cafelattePicMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cafelattePicMousePressed(evt);
            }
        });

        whitemochaPic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Karl\\OneDrive\\Documents\\NetBeansProjects\\CoffeeShopSystem\\icons\\coffee\\white-mocha.png")); // NOI18N
        whitemochaPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                whitemochaPicMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                whitemochaPicMousePressed(evt);
            }
        });

        caramellattePic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Karl\\OneDrive\\Documents\\NetBeansProjects\\CoffeeShopSystem\\icons\\coffee\\caramel-latte.png")); // NOI18N
        caramellattePic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                caramellattePicMousePressed(evt);
            }
        });

        cafeamericanoPic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Karl\\OneDrive\\Documents\\NetBeansProjects\\CoffeeShopSystem\\icons\\coffee\\cafe-americano.png")); // NOI18N
        cafeamericanoPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cafeamericanoPicMousePressed(evt);
            }
        });

        cafeLatteButton.setText("Cafe Latte");
        cafeLatteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafeLatteButtonActionPerformed(evt);
            }
        });

        whitemochaButton.setText("White Mocha");
        whitemochaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whitemochaButtonActionPerformed(evt);
            }
        });

        caramellatteButton.setText("Caramel Latte");
        caramellatteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caramellatteButtonActionPerformed(evt);
            }
        });

        cafeamericanoButton.setText("Cafe Americano");
        cafeamericanoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafeamericanoButtonActionPerformed(evt);
            }
        });

        cappuccinoPic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Karl\\OneDrive\\Documents\\NetBeansProjects\\CoffeeShopSystem\\icons\\coffee\\cappuccino.png")); // NOI18N
        cappuccinoPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cappuccinoPicMousePressed(evt);
            }
        });

        cappuccinoButton.setText("Cappuccino");
        cappuccinoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cappuccinoButtonActionPerformed(evt);
            }
        });

        cafemochaPic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Karl\\OneDrive\\Documents\\NetBeansProjects\\CoffeeShopSystem\\icons\\coffee\\cafe-mocha.png")); // NOI18N
        cafemochaPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cafemochaPicMousePressed(evt);
            }
        });

        cafemochaButton.setText("Cafe Mocha");
        cafemochaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafemochaButtonActionPerformed(evt);
            }
        });

        cookiesncreamPic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Karl\\OneDrive\\Documents\\NetBeansProjects\\CoffeeShopSystem\\icons\\coffee\\cookies-and-cream.png")); // NOI18N
        cookiesncreamPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cookiesncreamPicMousePressed(evt);
            }
        });

        artisanalchocoPic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Karl\\OneDrive\\Documents\\NetBeansProjects\\CoffeeShopSystem\\icons\\coffee\\artisanal-chocolate.png")); // NOI18N
        artisanalchocoPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                artisanalchocoPicMousePressed(evt);
            }
        });

        artisanalchocoButton.setText("Artisanal Choco");
        artisanalchocoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artisanalchocoButtonActionPerformed(evt);
            }
        });

        cookiesncreamButton.setText("Cookies n Cream");
        cookiesncreamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookiesncreamButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menulistPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cafelattePic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cafeLatteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(whitemochaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caramellatteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cafeamericanoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                                .addComponent(whitemochaPic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caramellattePic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cafeamericanoPic, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(menuPanelLayout.createSequentialGroup()
                            .addComponent(cappuccinoPic)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cafemochaPic)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cookiesncreamPic)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(artisanalchocoPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(menuPanelLayout.createSequentialGroup()
                            .addComponent(cappuccinoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cafemochaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cookiesncreamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(artisanalchocoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(menulistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cafelattePic)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(whitemochaPic)
                            .addComponent(caramellattePic)
                            .addComponent(cafeamericanoPic))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cafeLatteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(whitemochaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caramellatteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cafeamericanoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cappuccinoPic)
                    .addComponent(cafemochaPic)
                    .addComponent(cookiesncreamPic)
                    .addComponent(artisanalchocoPic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cappuccinoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cafemochaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(artisanalchocoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cookiesncreamButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        receiptPanel.setBackground(new java.awt.Color(80, 109, 132));

        receiptTextField.setEditable(false);
        receiptTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptTextField.setForeground(new java.awt.Color(0, 0, 0));
        receiptTextField.setFocusable(false);
        receiptTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptTextFieldActionPerformed(evt);
            }
        });

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 12)); // NOI18N
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item", "Qty", "Price"
            }
        ));
        scrollPane.setViewportView(table);

        printButton.setForeground(new java.awt.Color(0, 0, 0));
        printButton.setText("Print");
        printButton.setColorOver(new java.awt.Color(161, 186, 206));
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        payButton.setForeground(new java.awt.Color(0, 0, 0));
        payButton.setText("Pay");
        payButton.setColorOver(new java.awt.Color(161, 186, 206));
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        deleteButton.setForeground(new java.awt.Color(0, 0, 0));
        deleteButton.setText("Delete");
        deleteButton.setColorOver(new java.awt.Color(161, 186, 206));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setForeground(new java.awt.Color(0, 0, 0));
        clearButton.setText("Clear");
        clearButton.setColorOver(new java.awt.Color(161, 186, 206));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        paymentPanel.setBackground(new java.awt.Color(255, 255, 255));

        totalText.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 18)); // NOI18N
        totalText.setForeground(new java.awt.Color(0, 0, 0));
        totalText.setText("Total       :");

        cashText.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 18)); // NOI18N
        cashText.setForeground(new java.awt.Color(0, 0, 0));
        cashText.setText("Cash       :");

        balanceText.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 18)); // NOI18N
        balanceText.setForeground(new java.awt.Color(0, 0, 0));
        balanceText.setText("Balance :");

        total.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 18)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 0));
        total.setText("P00.00");

        balance.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 18)); // NOI18N
        balance.setForeground(new java.awt.Color(0, 0, 0));
        balance.setText("P00.00");

        cash.setBackground(new java.awt.Color(255, 255, 255));
        cash.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 18)); // NOI18N
        cash.setForeground(new java.awt.Color(0, 0, 0));
        cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paymentPanelLayout = new javax.swing.GroupLayout(paymentPanel);
        paymentPanel.setLayout(paymentPanelLayout);
        paymentPanelLayout.setHorizontalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cashText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balanceText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cash))
                .addContainerGap())
        );
        paymentPanelLayout.setVerticalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalText)
                    .addComponent(total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashText)
                    .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceText)
                    .addComponent(balance))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout receiptPanelLayout = new javax.swing.GroupLayout(receiptPanel);
        receiptPanel.setLayout(receiptPanelLayout);
        receiptPanelLayout.setHorizontalGroup(
            receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, receiptPanelLayout.createSequentialGroup()
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paymentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(receiptPanelLayout.createSequentialGroup()
                                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(receiptTextField))
                .addContainerGap())
        );
        receiptPanelLayout.setVerticalGroup(
            receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, receiptPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addComponent(receiptTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(printButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );

        timeLabel.setBackground(new java.awt.Color(255, 255, 255));
        timeLabel.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 16)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        timeLabel.setText("0");
        timeLabel.setToolTipText("");

        dateLabel.setBackground(new java.awt.Color(255, 255, 255));
        dateLabel.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 16)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dateLabel.setText("0");
        dateLabel.setToolTipText("");

        inventoryButton.setText("Inventory");
        inventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Log out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(receiptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(receiptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inventoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menulistTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menulistTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menulistTextActionPerformed

    private void caramellatteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caramellatteButtonActionPerformed
        // TODO add your handling code here:
        caramellatte caramellatte = new caramellatte();
        
        caramellatte.show();
    }//GEN-LAST:event_caramellatteButtonActionPerformed

    private void artisanalchocoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artisanalchocoButtonActionPerformed
        // TODO add your handling code here:
        artisanalchoco artisanalchoco = new artisanalchoco();
        
        artisanalchoco.show();
    }//GEN-LAST:event_artisanalchocoButtonActionPerformed

    private void cafeLatteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafeLatteButtonActionPerformed
        // TODO add your handling code here:
        cafelatte cafelatte = new cafelatte();
        
        cafelatte.show();
    }//GEN-LAST:event_cafeLatteButtonActionPerformed

    private void whitemochaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whitemochaButtonActionPerformed
        // TODO add your handling code here:
        whitemocha whitemocha = new whitemocha();
        
        whitemocha.show();
    }//GEN-LAST:event_whitemochaButtonActionPerformed

    private void cafeamericanoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafeamericanoButtonActionPerformed
        // TODO add your handling code here:
        cafeamericano cafeamericano = new cafeamericano();
        
        cafeamericano.show();
    }//GEN-LAST:event_cafeamericanoButtonActionPerformed

    private void cappuccinoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cappuccinoButtonActionPerformed
        // TODO add your handling code here:
        cappuccino cappuccino = new cappuccino();
        
        cappuccino.show();
    }//GEN-LAST:event_cappuccinoButtonActionPerformed

    private void cafemochaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafemochaButtonActionPerformed
        // TODO add your handling code here:\
        cafemocha cafemocha = new cafemocha();
        
        cafemocha.show();
    }//GEN-LAST:event_cafemochaButtonActionPerformed

    private void inventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryButtonActionPerformed
        // TODO add your handling code here:
        inventory inventory = new inventory();
        
        inventory.show();
        
        dispose();
    }//GEN-LAST:event_inventoryButtonActionPerformed

    private void cafelattePicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cafelattePicMousePressed
        // TODO add your handling code here:
        cafelatte cafelatte = new cafelatte();
        
        cafelatte.show();
    }//GEN-LAST:event_cafelattePicMousePressed

    private void whitemochaPicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whitemochaPicMousePressed
        // TODO add your handling code here:
        whitemocha whitemocha = new whitemocha();
        
        whitemocha.show();
    }//GEN-LAST:event_whitemochaPicMousePressed

    private void caramellattePicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caramellattePicMousePressed
        // TODO add your handling code here:
        caramellatte caramellatte = new caramellatte();
        
        caramellatte.show();
    }//GEN-LAST:event_caramellattePicMousePressed

    private void cafeamericanoPicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cafeamericanoPicMousePressed
        // TODO add your handling code here:
        cafeamericano cafeamericano = new cafeamericano();
        
        cafeamericano.show();
    }//GEN-LAST:event_cafeamericanoPicMousePressed

    private void cappuccinoPicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cappuccinoPicMousePressed
        // TODO add your handling code here:
        cappuccino cappuccino = new cappuccino();
        
        cappuccino.show();
    }//GEN-LAST:event_cappuccinoPicMousePressed

    private void cafemochaPicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cafemochaPicMousePressed
        // TODO add your handling code here:
        cafemocha cafemocha = new cafemocha();
        
        cafemocha.show();
    }//GEN-LAST:event_cafemochaPicMousePressed

    private void artisanalchocoPicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artisanalchocoPicMousePressed
        // TODO add your handling code here:
        artisanalchoco artisanalchoco = new artisanalchoco();
        
        artisanalchoco.show();
    }//GEN-LAST:event_artisanalchocoPicMousePressed

    private void cookiesncreamPicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cookiesncreamPicMousePressed
        // TODO add your handling code here:
        cookiesncream cookiesncream = new cookiesncream();
        
        cookiesncream.show();
    }//GEN-LAST:event_cookiesncreamPicMousePressed

    private void cafelattePicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cafelattePicMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cafelattePicMouseEntered

    private void cafelattePicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cafelattePicMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cafelattePicMouseExited

    private void whitemochaPicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whitemochaPicMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_whitemochaPicMouseEntered

    private void receiptTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receiptTextFieldActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printButtonActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonActionPerformed

    private void cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashActionPerformed

    private void cookiesncreamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookiesncreamButtonActionPerformed
        // TODO add your handling code here:
        cookiesncream cookiesncream = new cookiesncream();
        
        cookiesncream.show();
    }//GEN-LAST:event_cookiesncreamButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        login login = new login();
        login.show();

        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.coffeeshopsystem.button artisanalchocoButton;
    private javax.swing.JLabel artisanalchocoPic;
    private javax.swing.JLabel balance;
    private javax.swing.JLabel balanceText;
    private com.mycompany.coffeeshopsystem.button cafeLatteButton;
    private com.mycompany.coffeeshopsystem.button cafeamericanoButton;
    private javax.swing.JLabel cafeamericanoPic;
    private javax.swing.JLabel cafelattePic;
    private com.mycompany.coffeeshopsystem.button cafemochaButton;
    private javax.swing.JLabel cafemochaPic;
    private com.mycompany.coffeeshopsystem.button cappuccinoButton;
    private javax.swing.JLabel cappuccinoPic;
    private com.mycompany.coffeeshopsystem.button caramellatteButton;
    private javax.swing.JLabel caramellattePic;
    private javax.swing.JTextField cash;
    private javax.swing.JLabel cashText;
    private com.mycompany.coffeeshopsystem.button2 clearButton;
    private com.mycompany.coffeeshopsystem.button cookiesncreamButton;
    private javax.swing.JLabel cookiesncreamPic;
    private javax.swing.JLabel dateLabel;
    private com.mycompany.coffeeshopsystem.button2 deleteButton;
    private com.mycompany.coffeeshopsystem.button inventoryButton;
    private javax.swing.JLabel logoHeader;
    private com.mycompany.coffeeshopsystem.button logoutButton;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel menulistPanel;
    private javax.swing.JTextField menulistText;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private com.mycompany.coffeeshopsystem.button2 payButton;
    private javax.swing.JPanel paymentPanel;
    private com.mycompany.coffeeshopsystem.button2 printButton;
    private javax.swing.JPanel receiptPanel;
    private javax.swing.JTextField receiptTextField;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable table;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalText;
    private com.mycompany.coffeeshopsystem.button whitemochaButton;
    private javax.swing.JLabel whitemochaPic;
    // End of variables declaration//GEN-END:variables

}
