package structuralPattern;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;



public class Mp3Player implements AdvancedMediaPlayer {
	
	private FileInputStream fis;
	private BufferedInputStream bis;
	private Player playMp3;
	private Thread thread;
	
	public Mp3Player(){
	}
	
	@Override
	public void playMedia(File fileName) {
		try{
            fis = new FileInputStream(fileName);
            bis = new BufferedInputStream(fis);
            playMp3 = new Player(bis);
            
       }  catch(Exception e){
            System.out.println(e);
       }
		// run new thread to play in background
		thread = new Thread(){
			public void run(){
				try{
					 playMp3.play();
					 
				}catch(Exception e){
					System.out.println(e);
				}
			}
		};
		thread.start();

	
	}


	@Override
	public void stopMedia(File fileName) {
		if(playMp3 != null){
			playMp3.close();
		}
		// playMP3 = null;
	}
	

}
