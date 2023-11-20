package com.labollo.main;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Objects;

public class MenuPanel extends JPanel {

    public MenuPanel(GamePanel gamePanel) {
        setLayout(null);

        // Add a background like JLabel
        ImageIcon backgroundImage = new ImageIcon(Objects.requireNonNull(MenuPanel.class.getResource("/menu/menu00.png")));
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 768, 576); // Set the dimension of the background
        add(backgroundLabel);

        // Create the "New Game" button and move it to the center of the screen
        JButton newGame = new JButton("New Game");

        // Load the custom font
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(MenuPanel.class.getResourceAsStream("/fonts/04B_03__.TTF")));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);

            // Set the custom font for the button
            newGame.setFont(new Font(customFont.getName(), Font.PLAIN, 30));
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception (e.g., fall back to a default font)
        }

        newGame.setBackground(new Color(0, 0, 0, 0)); // Set the fill color to transparent
        newGame.setForeground(Color.WHITE);
        
        newGame.setBorderPainted(false);
        newGame.setFocusPainted(false);
        newGame.setContentAreaFilled(true);

        int buttonWidth = 250;
        int buttonHeight = 100;
        int buttonX = (gamePanel.screenWidth - buttonWidth) / 2;
        int buttonY = (gamePanel.screenHeight - buttonHeight) / 2;
        newGame.setBounds(buttonX, buttonY, buttonWidth, buttonHeight);
        add(newGame);

        // Add the event's button
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gamePanel.setVisible(true);
                setVisible(false);
            }
        });
    }
}
