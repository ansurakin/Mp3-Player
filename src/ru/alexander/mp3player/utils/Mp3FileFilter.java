package ru.alexander.mp3player.utils;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class Mp3FileFilter extends FileFilter{
    
    private String fileExtension;
    
    private String fileDescription;

    public Mp3FileFilter(String fileExtension, String fileDescription) {
        this.fileExtension = fileExtension;
        this.fileDescription = fileDescription;
    }

    @Override
    public boolean accept(File f) {
        return f.isDirectory() || f.getAbsolutePath().endsWith(this.fileExtension);
    }

    @Override
    public String getDescription() {
        return this.fileDescription + "(." + this.fileExtension + ")";
    }

}
