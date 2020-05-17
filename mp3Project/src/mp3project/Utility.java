/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3project;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 

/**
 *
 * @author atabe
 */
public class Utility {
    long currentFrame; 
    Clip clip; 
    boolean playResume=false;
    
    String status; 
    File file;
    AudioInputStream audioInputStream; 
    String filePath, name; 

    public Utility()
    {
    }    
    
    
    
    public void setStruct() throws Exception
    {
        file = new File(filePath);
        name = getFile().getName();
        
        audioInputStream = AudioSystem.getAudioInputStream(file.getAbsoluteFile()); 
        
        clip = AudioSystem.getClip(); 
        
        clip.open(audioInputStream); 
          
        clip.loop(Clip.LOOP_CONTINUOUSLY); 
    }

    public String getName() {
        return name;
    }

    public File getFile() {
        return file;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
 
    public void play() throws Exception  
    {  
        clip.start(); 
        status = "play"; 
    } 
      

    public void pause()  
    { 
        this.currentFrame =  this.clip.getMicrosecondPosition(); 
        clip.stop(); 
        status = "paused"; 
    } 

    public String getStatus() {
        return status;
    }
      

    public void resume() throws Exception  
    { 
        clip.setMicrosecondPosition(currentFrame); 
        play(); 
    } 
      
    public void restart() throws Exception  
    { 
        clip.stop(); 
        clip.close(); 
        resetAudioStream(); 
        currentFrame = 0L; 
        clip.setMicrosecondPosition(0); 
        this.play(); 
    } 
    
    public void stop() throws Exception
    { 
        currentFrame = 0L; 
        clip.setMicrosecondPosition(currentFrame);
        clip.stop(); 
    }
      

    public void resetAudioStream() throws Exception  
    { 
        audioInputStream = AudioSystem.getAudioInputStream(file.getAbsoluteFile()); 
        clip.open(audioInputStream); 
        clip.loop(Clip.LOOP_CONTINUOUSLY); 
    } 
}
