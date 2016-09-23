
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

import java.awt.Color;

import javax.swing.JSeparator;

import javax.swing.border.*;

import java.lang.NullPointerException;
import java.lang.NumberFormatException;
import java.lang.ArithmeticException;
import java.lang.RuntimeException;
import java.io.IOException;

import java.lang.Exception;

import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;

import java.awt.Font;

import javax.swing.border.*;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;

import javax.swing.JOptionPane;

 import java.awt.Desktop;
 
 import java.util.StringTokenizer;
 
 import java.io.File;
 import java.io.BufferedReader;
 import java.io.FileReader;

public class loginPage extends JFrame
{
	
	
	private  Font f = new Font("Serif", Font.BOLD, 14);
	
 private String [] usernames;
	private String [] passwords;
	
	
	private String userIN="";
	private String passIN="";
	
	
	public static void main(String [] args)
	{
		
		new loginPage();
		
	}
	
	
	public loginPage()
	{
		
		//=========================================================================================
		
		
		
		
		
		//initialize JPanels
		//
		
		
		JPanel header= new JPanel(); 
		
		JPanel title=new JPanel(); 
		
		JPanel loginGRscreen=new JPanel(); 
		
		JPanel userpass = new JPanel();
		
        JPanel logres = new JPanel();
		
		JPanel box=new JPanel(); // carries all the jpanels
	
	//=========================================================================================

				 header.setLayout(new FlowLayout(FlowLayout.LEFT));    
			header.setBackground(Color.GRAY); 
			header.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			
							 title.setLayout(new FlowLayout(FlowLayout.CENTER));    
			title.setBackground(Color.GRAY); 
			title.setBorder(BorderFactory.createLineBorder(Color.RED));
			
							 loginGRscreen.setLayout(new FlowLayout(FlowLayout.CENTER));    
			loginGRscreen.setBackground(Color.WHITE); 
			loginGRscreen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		 		 userpass.setLayout(new GridLayout(2,2,5,5)); 
		userpass.setBackground(Color.DARK_GRAY); 
		userpass.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		 
		 logres.setLayout(new FlowLayout(FlowLayout.CENTER)); 
		logres.setBackground(Color.LIGHT_GRAY); 
		logres.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		 
		box.setLayout((new BoxLayout( box, BoxLayout.Y_AXIS)));  
			box.setBackground(Color.WHITE); 
			box.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			
		//=========================================================================================
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////			
		//
		// Program Menu  
		//    Create the menu bar   
		
       JMenuBar KBMenuBar = new JMenuBar();
        
        // initialize the main menu 
        
      JMenu  MENU = new JMenu("MENU");
		MENU.setForeground(Color.BLACK);
		MENU.setBackground(Color.WHITE);
		
	JMenu ABOUT = new JMenu("HELP");
	ABOUT.setForeground(Color.BLACK);
	ABOUT.setBackground(Color.WHITE); 
			
		 KBMenuBar.add(MENU);
		 KBMenuBar.add(ABOUT);
				
				 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
				
	JLabel EXIT=new JLabel("EXIT PROGRAM");
	  EXIT.setBackground(Color.WHITE);
	   EXIT.setForeground(Color.BLACK);
	 EXIT.setEnabled(true);
    EXIT.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =EXIT.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           EXIT.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          EXIT.setForeground(oldcolor);
         }
      }
      );
	EXIT.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
				try
				{
					
	JOptionPane.showMessageDialog(null," \n Press the OK button, \n in order for the program to be terminated ...... \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 	System.exit(0);
					
		 		    } 
    	catch (Exception ex) 
    	{
    		
		JOptionPane.showMessageDialog(null," \n Press the OK button, \n in order for the program to be terminated ...... \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 	System.exit(0);
		
    }
        }
		
      }
      );
	 MENU.add(EXIT);		
				
				 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
		
		JLabel programAuthor=new JLabel("CREDITS !!!");
	  programAuthor.setBackground(Color.WHITE);
	  programAuthor.setForeground(Color.BLACK);
	 programAuthor.setEnabled(true);
   programAuthor.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =programAuthor.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           programAuthor.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         programAuthor.setForeground(oldcolor);
         }
      }
      );
	programAuthor.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	JOptionPane.showMessageDialog(null," \n Game created by: \n Constantinos < tinoC23 /> Constantinou \n @ 09/01/2016 \n email : c.constantinou.24@gmail.com \n </[-_-]/> \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
      ABOUT.add(programAuthor);
      
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
      		header.add(KBMenuBar);

      
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
				
			JLabel programLoginPageMessage=new JLabel("ABCD program user authentication(login) window");
	  programLoginPageMessage.setBackground(Color.WHITE);
	  programLoginPageMessage.setForeground(Color.BLACK);			
	programLoginPageMessage.setFont(f);
      title.add(programLoginPageMessage);
      
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
      	JLabel UserLoginSuccessFailureMessage=new JLabel("No Login Attempt Yet !!! ||:-)|");
	  UserLoginSuccessFailureMessage.setBackground(Color.WHITE);
	  UserLoginSuccessFailureMessage.setForeground(Color.BLACK);			
		UserLoginSuccessFailureMessage.setFont(f);
      loginGRscreen.add(UserLoginSuccessFailureMessage);
      
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
      	JLabel UsernameLabel=new JLabel(" USERNAME : ");
	UsernameLabel.setHorizontalAlignment(JLabel.CENTER);
	  UsernameLabel.setBackground(Color.WHITE);
	  UsernameLabel.setForeground(Color.BLACK);			
		UsernameLabel.setFont(f);
		
		JTextField TF=new JTextField("**********",20);
	  TF.setBackground(Color.WHITE);
	  TF.setForeground(Color.BLACK);			
		TF.setFont(f);
      
		
			JLabel PasswordLabel=new JLabel(" PASSWORD : ");
			PasswordLabel.setHorizontalAlignment(JLabel.CENTER);
	  PasswordLabel.setBackground(Color.WHITE);
	  PasswordLabel.setForeground(Color.BLACK);			
		PasswordLabel.setFont(f);
      
      	JPasswordField PF=new JPasswordField("**********",20);
	  PF.setBackground(Color.WHITE);
	  PF.setForeground(Color.BLACK);			
		PF.setFont(f);
      
      
      userpass.add(UsernameLabel);
      userpass.add(TF);
      userpass.add(PasswordLabel);
      userpass.add(PF);
      
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
      
       JButton login=new JButton("LOGIN");
	login.setBackground(Color.WHITE);
	login.setForeground(Color.BLACK);			
	login.setFont(f);
	login.setEnabled(true);
	login.setToolTipText("application ::: login button");
		login.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				String [] array=new String[1];
				
				
				// get the jtextfield value
				
				  userIN = TF.getText();
				
				
				//get the jpasswordfield value
				
				passIN = new String(PF.getPassword());
				
				
				//load the users database
				//
	//
 // Open and read a file, and return the lines in the file as a list
 
 int fileTotalLines=0; int maxLineTokkens=0;
 
 // check file total lines

  try
  {
    BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
    String line="";
    while ((line = reader.readLine()) != null)
    {
      fileTotalLines++;
    }
    reader.close();
  }
  catch (Exception exc)
  {
    exc.printStackTrace();
  }
  
  // create the arrays
  
    	usernames=new String [fileTotalLines]; 
	passwords=new String [fileTotalLines];
	
	array= new String [fileTotalLines];
  
  for(int i=0;i<fileTotalLines;i++)
  {
	  
	      	usernames[i]=null; 
	passwords[i]=null;
	
	array[i]=null;
	  
  }
  
  // receive the usernames and passwords from the database
  
   int count=0; int t=0;
  
    try
  {
	  
    BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
	  
    String line3="";
	  
	 
	  
    while ((line3 = reader.readLine()) != null)
    {
	    
	if(t>0)
	{
	    array[t-1]=line3;
	}
	
	     t++;
     
	
     }
     

     reader.close();
    
  }
  catch (Exception exc2)
  {
    exc2.printStackTrace();
  }
  
  ///////////////////////////////////////////////////////////////////////////////
  
  count=0; // reset  
  t=0; // reset
  
  
  // add usernames and passwords to the arrays
  
  String [][] arrayOFtokkens=new String[fileTotalLines][fileTotalLines];
  
  for(int i=0;i<fileTotalLines;i++)
  {
for(int ii=0;ii<fileTotalLines;ii++)
  {
	  arrayOFtokkens[i][ii]=null;
  }
  }
  
    StringTokenizer st;
  
  int bit=0;
  
  try
  {
  
  for(int i=0;i<array.length;i++)
  {
	  
	  if(array[i]!=null)
	  {
	  
st = new StringTokenizer(array[i]);
	  
     while (st.hasMoreTokens()) 
	{
		
		 arrayOFtokkens[count][bit]=st.nextToken();
		
		bit++;
		
     }
     
     bit=0;
     count++;
     
  }
  }
  
   }
  catch(Exception e1)
  {
	  e1.printStackTrace();
  }
  

  
  // final password and username comparement ..... 
  
  
  int pswords=0; int urnames=0;
  
  // compare given username with db usernames
   for(int i=0;i<fileTotalLines;i++)
  {
	  
	    if( arrayOFtokkens[i][0]!=null)
	  {
if((arrayOFtokkens[i][0]).equals(userIN))
	  {
		  urnames=1;
		  i=10000;
	  }
	  else
	  {
		   urnames=0;
	  }
  }
	  
  }
  
  //compare given password with db passwords
    for(int i=0;i<fileTotalLines;i++)
  {
	  
	if( arrayOFtokkens[i][0]!=null)
	  {
if((arrayOFtokkens[i][1]).equals(passIN))
	  {
		  pswords=1;
		  i=10000;
	  }
	  else
	  {
		   pswords=0;
	  }
  }
	  
  }
  
  //return the result to the user 
  
  
  if( urnames==0 &&  pswords==0  )
  {
 UserLoginSuccessFailureMessage.setText("Wrong Username and Password !!!");
	     UserLoginSuccessFailureMessage.setForeground(Color.RED);
}
  else  if( urnames==1 &&  pswords==0  )
  {
	 UserLoginSuccessFailureMessage.setText("Wrong Password !!!");
	     UserLoginSuccessFailureMessage.setForeground(Color.RED);
  }
    else if( urnames==0 &&  pswords==1  )
  {
	  UserLoginSuccessFailureMessage.setText("Wrong Username !!!");
	   UserLoginSuccessFailureMessage.setForeground(Color.RED);
  }
    else  if( urnames==1 &&  pswords==1  )
  {
	   UserLoginSuccessFailureMessage.setText("Correct Username and Password !!!");
	  UserLoginSuccessFailureMessage.setForeground(Color.GREEN);
	  
JOptionPane.showMessageDialog(null,"Correct Login Information !!! \n The present window will close !!!","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
	  System.exit(0);
  }
  
  
  
  // end of code .....
  
  }});


		
		
       JButton reset=new JButton("RESET");
	reset.setBackground(Color.WHITE);
	reset.setForeground(Color.BLACK);			
	reset.setFont(f);
	reset.setEnabled(true);
	reset.setToolTipText("application ::: reset button");
	reset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				TF.setText("username area");
				
			PF.setText("password area");
				
			}
		});
      
      
      logres.add(login);
      logres.add(reset);
      
      
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
      
      // additional code goes here .... [jpanels] 
		
		box.add(header);
		   box.add(title);
		   box.add(loginGRscreen);
		   box.add(userpass);
		   box.add(logres);
		
		JFrame frame=new JFrame("ABCD program ::: user login screen");
		frame.add(box);
		
		// 
		
		frame.setDefaultLookAndFeelDecorated(true);
		
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		frame.setVisible(true);
		
		frame.setResizable(false);
		
		frame.setLocationRelativeTo(null);
		
	        frame.pack();
		
		//
      
      
      
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
      
		
	}
	
}

