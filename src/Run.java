
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class Run extends MusicPlayer {
    public void Run()
	{
		
              ta.setEditable(true);
	      ta.setBackground(Color.LIGHT_GRAY);//set lric panels background
	    
	      Font font=new Font("TimesNew Roman",Font.PLAIN,14);
	      ta.setFont(font);//set lyric fond
	choose=new JComboBox(musicList);
        choose.setEditable(false);
        choose.setSelectedIndex(0);//initialize choosing list to first song.
        choose.addActionListener(this);//add actionlistener
	
	
	
	JScrollPane jsp=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	playL=new JLabel("Play");
        playL.setForeground(Color.black);
    
        stopL=new JLabel("Stop");
        stopL.setForeground(Color.black);

        lastL=new JLabel("Last");
        lastL.setForeground(Color.black);

        nextL=new JLabel("Next");
        nextL.setForeground(Color.black);

        loopL=new JLabel("Loop");
        loopL.setForeground(Color.black);
    
        chooseL=new JLabel("ChooseSongs");
        chooseL.setForeground(Color.black);

        lrcL=new JLabel("Lyric:");
        lrcL.setForeground(Color.black);
    
    

        play=new JButton(new ImageIcon(getClass().getResource("Play.jpg")));
        play.addActionListener(this);
        stop=new JButton(new ImageIcon(getClass().getResource("Stop.jpg")));
        stop.addActionListener(this);
        stop.setEnabled(false);    
        last=new JButton(new ImageIcon(getClass().getResource("Previous.jpg")));
        last.addActionListener(this);
        next=new JButton(new ImageIcon(getClass().getResource("Next.jpg")));
        next.addActionListener(this);
        loop=new JButton(new ImageIcon(getClass().getResource("loop2.png")));
        loop.addActionListener(this);
        open=new JButton(new ImageIcon(getClass().getResource("add.gif")));;
        open.addActionListener(this);   
        Container cp= frame.getContentPane();
        cp.setLayout(null);
        cp.setBackground(Color.WHITE);    
	//adding comp. into frame	
        cp.add(play);
        cp.add(playL);
	cp.add(stop);
	cp.add(stopL);	
	cp.add(last);
	cp.add(lastL);
	cp.add(next);
	cp.add(nextL);
	cp.add(loop);
	cp.add(loopL);
	cp.add(choose);	
	cp.add(chooseL);
	cp.add(jsp);
	cp.add(lrcL);
	cp.add(open);
	//setting cordinates and size for each comp.
	play.setBounds(105,400,95,95);
	playL.setBounds(135,495,120,20);
	stop.setBounds(200,400,95,95);
	stopL.setBounds(235,495,120,20);
	last.setBounds(10,400,95,95);
	lastL.setBounds(40,490,120,30);
	next.setBounds(295,400,95,95);
	nextL.setBounds(320,495,120,20);	
	loop.setBounds(310,15,70,40);
	loopL.setBounds(320,55,60,20);
	choose.setBounds(45,40,250,30);
	chooseL.setBounds(115,20,150,20);
	jsp.setBounds(10,90,380,300);
	lrcL.setBounds(10,70,70,20);	
	open.setBounds(0,0,60,20);	
	frame.setSize(405,550);
	frame.setVisible(true);
	frame.setResizable(false);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
	}
}
