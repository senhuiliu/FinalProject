/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;
import java.applet.AudioClip;

public abstract class MusicPlayer implements ActionListener{
	
	JButton play,stop,next,last,loop,open;//Buttons
	JFrame frame=new JFrame("Music Player");//Music JFrame
	JLabel playL,stopL,nextL,lastL,chooseL,loopL,lrcL;//labels	
	JTextArea ta=new JTextArea();//Lyrics will show 	
	JComboBox choose;//allow to choose songs
	String[] musicList={"SeeYouAgain.wav","UptownFunk.wav","OneLastTime.wav"};
    JFileChooser mc=new JFileChooser();
    
    URL music1=getClass().getResource(musicList[0]);//get music
    URL music2=getClass().getResource(musicList[1]);
    URL music3=getClass().getResource(musicList[2]);

   
    //AudioClip sound1,sound2,sound3;
     AudioClip sound1=java.applet.Applet.newAudioClip(music1);    //Make song AUDIOCLIP
     AudioClip sound2=java.applet.Applet.newAudioClip(music2); 
     AudioClip sound3=java.applet.Applet.newAudioClip(music3); 
     AudioClip chooseClip=sound2;
    
    boolean looping=false;//LOOPING OPTION
   
	
	
	
	public void actionPerformed(ActionEvent event)
	{
		Object source=event.getSource();
		if(choose.getSelectedItem()=="SeeYouAgain.wav")
		{
                    ta.setText("It's been a long day without you my friend\n" +
"And I'll tell you all about it when I see you again\n" +
"We've come a long way from where we began\n" +
"Oh I'll tell you all about it when I see you again\n" +
"When I see you again\n" +
"\n" +
"Damn who knew all the planes we flew\n" +
"Good things we've been through\n" +
"That I'll be standing right here\n" +
"Talking to you about another path I\n" +
"Know we loved to hit the road and laugh\n" +
"But something told me that it wouldn't last\n" +
"Had to switch up look at things different see the bigger picture\n" +
"Those were the days hard work forever pays now I see you in a better place\n" +
"\n" +
"How could we not talk about family when family's all that we got?\n" +
"Everything I went through you were standing there by my side\n" +
"And now you gonna be with me for the last ride\n" +
"\n" +
"It's been a long day without you my friend\n" +
"And I'll tell you all about it when I see you again\n" +
"We've come a long way from where we began\n" +
"Oh I'll tell you all about it when I see you again\n" +
"when I see you again\n" +
"\n" +
"First you both go out your way\n" +
"And the vibe is feeling strong and what's\n" +
"Small turn to a friendship, a friendship\n" +
"Turn into a bond and that bond will never\n" +
"Be broken and the love will never get lost\n" +
"And when brotherhood come first then the line\n" +
"Will never be crossed established it on our own\n" +
"When that line had to be drawn and that line is what\n" +
"We reach so remember me when I'm gone\n" +
"\n" +
"How could we not talk about family when family's all that we got?\n" +
"Everything I went through you were standing there by my side\n" +
"And now you gonna be with me for the last ride\n" +
"\n" +
"So let the light guide your way hold every memory\n" +
"As you go and every road you take will always lead you home\n" +
"\n" +
"It's been a long day without you my friend\n" +
"And I'll tell you all about it when I see you again\n" +
"We've come a long way from where we began\n" +
"Oh I'll tell you all about it when I see you again\n" +
"When I see you again");
                        chooseClip=sound1;
			chooseClip.stop();
			loop.setEnabled(true);		    
		}
		
		
		if(choose.getSelectedItem()=="UptownFunk.wav")
		{
                        ta.setText("This hit \n" +
"That ice cold \n" +
"Michelle Pfeiffer\n" +
"That white gold\n" +
"This one, for them hood girls\n" +
"Them good girls\n" +
"Straight masterpieces \n" +
"Stylin', while in\n" +
"Livin’ it up in the city\n" +
"Got Chucks on with Saint Laurent\n" +
"Got kiss myself I’m so pretty\n" +
"\n" +
"I’m too hot (hot damn)\n" +
"Called a police and a fireman\n" +
"I’m too hot (hot damn)\n" +
"Make a dragon wanna retire man\n" +
"I’m too hot (hot damn)\n" +
"Say my name you know who I am\n" +
"I’m too hot (hot damn)\n" +
"Am I bad 'bout that money\n" +
"Break it down\n" +
"\n" +
"Girls hit your hallelujah (whuoo)\n" +
"Girls hit your hallelujah (whuoo)\n" +
"Girls hit your hallelujah (whuoo)\n" +
"‘Cause Uptown Funk gon’ give it to you\n" +
"‘Cause Uptown Funk gon’ give it to you\n" +
"‘Cause Uptown Funk gon’ give it to you\n" +
"Saturday night and we in the spot\n" +
"Don’t believe me just watch (come on)\n" +
"Don’t believe me just watch\n" +
"Don’t believe me just watch\n" +
"Don’t believe me just watch\n" +
"Don’t believe me just watch\n" +
"Don’t believe me just watch\n" +
"Hey, hey, hey, oh!\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"Stop\n" +
"Wait a minute\n" +
"Fill my cup put some liquor in it\n" +
"Take a sip, sign a check\n" +
"Julio! Get the stretch!\n" +
"Ride to Harlem, Hollywood, Jackson, Mississippi\n" +
"If we show up, we gon’ show out\n" +
"Smoother than a fresh jar of skippy\n" +
"\n" +
"I’m too hot (hot damn)\n" +
"Called a police and a fireman\n" +
"I’m too hot (hot damn) \n" +
"Make a dragon wanna retire man\n" +
"I’m too hot (hot damn) (hot damn)\n" +
"Bitch, say my name you know who I am\n" +
"I’m too hot (hot damn)\n" +
"Am I bad 'bout that money\n" +
"Break it down\n" +
"\n" +
"Girls hit your hallelujah (whuoo) \n" +
"Girls hit your hallelujah (whuoo)\n" +
"Girls hit your hallelujah (whuoo)\n" +
"‘Cause Uptown Funk gon’ give it to you\n" +
"‘Cause Uptown Funk gon’ give it to you\n" +
"‘Cause Uptown Funk gon’ give it to you\n" +
"Saturday night and we in the spot\n" +
"Don’t believe me just watch (come on)\n" +
"Don’t believe me just watch\n" +
"Don’t believe me just watch\n" +
"Don’t believe me just watch\n" +
"Don’t believe me just watch\n" +
"Don’t believe me just watch\n" +
"Hey, hey, hey, oh!\n" +
"\n" +
"Before we leave\n" +
"Imma tell y’all a lil’ something\n" +
"Uptown Funk you up, Uptown Funk you up\n" +
"Uptown Funk you up, Uptown Funk you up\n" +
"I said Uptown Funk you up, Uptown Funk you up\n" +
"Uptown Funk you up, Uptown Funk you up\n" +
"\n" +
"Come on, dance\n" +
"Jump on it\n" +
"If you sexy than flaunt it\n" +
"If you freaky than own it\n" +
"Don’t brag about it, come show me\n" +
"Come on, dance\n" +
"Jump on it\n" +
"If you sexy than flaunt it\n" +
"Well it’s Saturday night and we in the spot\n" +
"Don’t believe me just watch \n" +
"Don’t believe me just watch\n" +
"Don’t believe me just watch\n" +
"Don’t believe me just watch\n" +
"Don’t believe me just watch\n" +
"Don’t believe me just watch\n" +
"Hey, hey, hey, oh!\n" +
"\n" +
"Uptown Funk you up, Uptown Funk you up (say whaa?!)\n" +
"Uptown Funk you up, Uptown Funk you up\n" +
"Uptown Funk you up, Uptown Funk you up (say whaa?!)\n" +
"Uptown Funk you up, Uptown Funk you up\n" +
"Uptown Funk you up, Uptown Funk you up (say whaa?!)\n" +
"Uptown Funk you up, Uptown Funk you up\n" +
"Uptown Funk you up, Uptown Funk you up (say whaa?!)\n" +
"Uptown Funk you up");
			chooseClip=sound2;
			chooseClip.stop();
			loop.setEnabled(true);
		}
		
		
		if(choose.getSelectedItem()=="OneLastTime.wav")
		{
                    ta.setText("I was a liar\n" +
"I gave in to the fire\n" +
"I know I should've fought it\n" +
"At least I'm being honest\n" +
"Feel like a failure\n" +
"'Cause I know that I failed you\n" +
"I should've done you better\n" +
"'Cause you don't want a liar (come on)\n" +
"\n" +
"And I know, and I know, and I know\n" +
"She gives you everything\n" +
"But, boy, I couldn't give it to you\n" +
"And I know, and I know, and I know\n" +
"That you got everything\n" +
"But I got nothing here without you\n" +
"\n" +
"So one last time\n" +
"I need to be the one who takes you home\n" +
"One more time\n" +
"I promise, after that I'll let you go\n" +
"Baby, I don't care if you got her in your heart\n" +
"All I really care is you wake up in my arms\n" +
"One last time\n" +
"I need to be the one who takes you home\n" +
"\n" +
"I don't deserve it\n" +
"I know I don't deserve it\n" +
"But stay with me a minute\n" +
"I swear I'll make it worth it\n" +
"Can't you forgive me?\n" +
"At least just temporarily\n" +
"I know that this is my fault\n" +
"I should've been more careful (come on)\n" +
"\n" +
"And I know, and I know, and I know\n" +
"She gives you everything\n" +
"But, boy, I couldn't give it to you\n" +
"And I know, and I know, and I know\n" +
"That you got everything\n" +
"But I got nothing here without you, baby\n" +
"\n" +
"So one last time\n" +
"I need to be the one who takes you home\n" +
"One more time\n" +
"I promise, after that I'll let you go\n" +
"Baby, I don't care if you got her in your heart\n" +
"All I really care is you wake up in my arms\n" +
"One last time\n" +
"I need to be the one who takes you home\n" +
"\n" +
"I know I should've fought it\n" +
"At least I'm being honest\n" +
"But stay with me a minute\n" +
"I swear I'll make it worth it, babe.\n" +
"'Cause I don't want to be without you\n" +
"\n" +
"So one last time\n" +
"I need to be the one who takes you home\n" +
"One more time\n" +
"I promise, after that I'll let you go\n" +
"Baby, I don't care if you got her in your heart\n" +
"All I really care is you wake up in my arms\n" +
"One last time\n" +
"I need to be the one who takes you home (yeah)\n" +
"\n" +
"One last time\n" +
"I need to be the one who takes you home");
			chooseClip=sound3;
			chooseClip.stop();
			loop.setEnabled(true);
		}
		
		
		if(source==play)
		{
			stop.setEnabled(true);
			chooseClip.play();
			chooseL.setText("Now Playing");
		}
		
		if(source==open)
		{
			int select=mc.showOpenDialog(frame);
			if(select==JFileChooser.APPROVE_OPTION)
			{
				File file=mc.getSelectedFile();
				chooseL.setText(file.getName());
				choose.setSelectedItem(file.getName());
			}		
		}
		
		if(source==loop)
		{
			looping=true;
			chooseClip.loop();
			loop.setEnabled(false);
			loop.setEnabled(true);
			chooseL.setText("Looping");		
		}
		
		if(source==next)
		{
			if(choose.getSelectedItem()=="SeeYouAgain.wav")
			{
				choose.setSelectedItem("UptownFunk.wav");
			}
			else if(choose.getSelectedItem()=="UptownFunk.wav")
			{
				choose.setSelectedItem("OneLastTime.wav");
			}
			else if(choose.getSelectedItem()=="OneLastTime.wav")
			{
				choose.setSelectedItem("SeeYouAgain.wav");
			}
			chooseL.setText("Next Selected.Playing");
			chooseClip.play();
			stop.setEnabled(true);
		}
		
		if(source==last)
		{
			if(choose.getSelectedItem()=="SeeYouAgain.wav")
			{
				choose.setSelectedItem("OneLastTime.wav");
			}
			else if(choose.getSelectedItem()=="OneLastTime.wav")
			{
				choose.setSelectedItem("UptownFunk.wav");
			}
			else if(choose.getSelectedItem()=="UptownFunk.wav")
			{
				choose.setSelectedItem("SeeYouAgain.wav");
			}
			chooseClip.play();
			stop.setEnabled(true);
			chooseL.setText("Last Seleceted.Playing");
		}
		
		if(source==stop)
		{
			if(looping)
			{
				looping=false;
				chooseClip.stop();
				loop.setEnabled(true);
			}
			else
			{
				chooseClip.stop();
			}
			stop.setEnabled(false);
			chooseL.setText("Stopped Playing");
                    }
		}

}