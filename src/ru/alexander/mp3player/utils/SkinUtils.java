package ru.alexander.mp3player.utils;

import ru.alexander.mp3player.gui.MainJFrame;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class SkinUtils {

    public static void changeSkin(Component comp, LookAndFeel laf) {
        try {
            UIManager.setLookAndFeel(laf);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        SwingUtilities.updateComponentTreeUI(comp);
        
    }
    
    public static void changeSkin(Component comp, String laf) {
        try {
            try {
                UIManager.setLookAndFeel(laf);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(SkinUtils.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        SwingUtilities.updateComponentTreeUI(comp);
        
    }
}
