package ru.alexander.mp3player.entity;

import java.io.Serializable;
import ru.alexander.mp3player.utils.FileUtils;

public class Mp3 implements Serializable{
    
    private String name;
    
    private String path;

    public Mp3(String name, String path) {
        this.name = name;
        this.path = path;
    }   

    @Override
    public String toString() {
        return FileUtils.getFileNameWithoutExtension(this.name);
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
