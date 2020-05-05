package Controller;

import java.util.Scanner;

import Model.Model;
import View.Popup;

public class Controller
{
  private Model defaultWords;
  private Model questions;
  private Popup view;
  private Scanner inputScanner;

  public Controller()
  {
    view = new Popup();
    inputScanner = new Scanner(System.in);
    defaultWords = new Words();
  }

  public void start ()
	{
    System.out.println("Project");
    practice();

	}
  
  public void practiceTwo ()
  {
    System.out.println("Do want to play a trivia game?");
    String answer = inputScanner.nextLine();
		
		if (answer.equalsIgnoreCase("Yes"))
		{	
		  practice();
		}
		view.displayMessage("Great job! See you next time!");
		inputScanner.close();
  }
  
  public void practice ()
  {
    Words custom = new Words();

    System.out.println("Let's begin");

    String response = "";

    response = view.askQuestion("What is player one's name?");
    custom.setPlayerOne(response);
    view.displayMessage("Player one's name is " + response + ". Is that correct?");
    if (response.equalsIgnoreCase("Yes"))
    {
      view.displayMessage("Great");
    }
    else
    {
      response = view.askQuestion("What is player one's new name?");
      view.displayMessage("Player one's new name is + " + response);
    }

    response = view.askQuestion("What is player two's name?");
    custom.setPlayerTwo(response);
    view.displayMessage("Player two's name is " + response + ". Is that correct?");
    if (response.equalsIgnoreCase("Yes"))
    {
      view.displayMessage("Great");
    }
    else
    {
      response = view.askQuestion("What is player two's new name?");
      view.displayMessage("Player two's new name is + " + response);
    }

    

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