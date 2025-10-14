package Chess;

import Constants.Constants;

import javax.swing.*;
import java.awt.*;

public class ChessWindow {
    Dimension windowDimension;
    JFrame frame = new JFrame("Chess");
    JPanel rightPanel = new JPanel();

    public ChessWindow() {
        Constants.windowDimension = Toolkit.getDefaultToolkit().getScreenSize();
        windowDimension = Constants.windowDimension;

        initWindow();
    }

    private void initWindow() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Constants.COLOR_BACKGROUND);
        frame.setResizable(false);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setPreferredSize(windowDimension);

        rightPanel.setBackground(Constants.COLOR_BACKGROUND);
        rightPanel.setLayout(new BorderLayout());

        JLabel placeholder = new JLabel("Game History Area", SwingConstants.CENTER);
        placeholder.setForeground(Color.LIGHT_GRAY);
        rightPanel.add(placeholder, BorderLayout.CENTER);

        frame.add(rightPanel, BorderLayout.CENTER);

        frame.add(new ChessBoard(windowDimension), BorderLayout.WEST);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
