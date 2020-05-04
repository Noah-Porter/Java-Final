package Controller;

import java.util.Scanner;


import Model.Model;
import View.Popup;

public class Controller
{

  private Model questions;
  private Popup view;
  private Scanner inputScanner;

  public Controller()
  {
    view = new Popup();
    inputScanner = new Scanner(System.in);
  }

  public void start ()
	{
    System.out.println("Project");
    practiceTwo();

	}
  
  public void practiceTwo ()
  {
    System.out.println("Do want to play a trivia game?");
    String answer = inputScanner.nextLine();
		
		if (answer.equalsIgnoreCase("Yes"))
		{	
		  practice();
		}
		view.displayMessage("goodbye");
		inputScanner.close();
  }
  
  public void practice ()
  {
    System.out.println("Let's begin");

    String [] questions = new String [10];
		
		for (int index = 0; index < questions.length; index ++)
		{
			questions[index] = "This is question# " + index;

      // if (index > 0)
      // {
      //   Scanner(inputScanner);
      //   view.displayMessage("You said: ");
      // }
		}
		
		for (int index = 0; index < questions.length; index ++)
		{
			String currentQuestion = questions[index];
			view.displayMessage(currentQuestion);
		}
		
		for (String question : questions)
		{
			view.displayMessage(question);
		}
  }
}