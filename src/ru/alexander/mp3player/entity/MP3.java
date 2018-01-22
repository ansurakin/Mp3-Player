package ru.alexander.mp3player.entity;

import java.io.Serializable;
import ru.alexander.mp3player.utils.FileUtils;

public class MP3 implements Serializable{

    private String name;
    private String path;

    public MP3(String name, String path) {
        this.name = name;
        this.path = path;
    }

    
    @Override
    // для корректного отображения объекта MP3 при добавлении в плейлист
    public String toString() {
        return FileUtils.getFileNameWithoutExtension(name);
    }
    
   
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPath() {
        return path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
   
}
