package launcher;
import javax.swing.JFrame;

import entities.Student;
import gui.SimplePresentationScreen;
public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student student = new Student(140332 , "Ross" , "Matias" , "rossmatias8@gmail.com" , "https://github.com/matiasfross" , "/Desafio1/src/images/nerdfacecover.jpg");
            	JFrame app = new SimplePresentationScreen(student);
            }
        });
    }
}