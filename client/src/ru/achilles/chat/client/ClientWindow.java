package ru.achilles.chat.client;

import javax.swing.*;

public class ClientWindow extends JFrame {

    private static final String IP_ADDR = "127.0.0.1";
    private static final int PORT = 8182;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClientWindow();
            }
        });
    }

    private ClientWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);

        setVisible(true);
    }
}
