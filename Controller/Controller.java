package Controller;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;

import Model.Words;
import View.Popup;

public class Controller
{
  private Words playerOneName;
  private Words defaultWords;
  private Words questions;
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
    practiceTwo();

	}
  
  public void practiceTwo ()
  {
    view.askQuestion("Do want to play a trivia game?");
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
    view.displayMessage("Let's begin");

    Words custom = new Words();
    String response = "";

    response = view.askQuestion("What is player one's name?");
    response = view.askQuestion("Player one's name is " + response + ". Is that correct?");
    if (response.equalsIgnoreCase("Yes"))
    {
      view.displayMessage("Great");
      custom.setPlayerOneName(response);
    }
    else
    {
      response = view.askQuestion("What is player one's new name?");
      view.displayMessage("Player one's new name is " + response);
      custom.setPlayerOneName(response);
    }

    response = view.askQuestion("What is player two's name?");
    response = view.askQuestion("Player two's name is " + response + ". Is that correct?");
    if (response.equalsIgnoreCase("Yes"))
    {
      view.displayMessage("Great");
      custom.setPlayerTwoName(response);
    }
    else
    {
      response = view.askQuestion("What is player two's new name?");
      view.displayMessage("Player two's new name is " + response);
      custom.setPlayerTwoName(response);
    }

    view.displayMessage("Let's move on");
    

    String [] questions = new String [10];
		
		for (int index = 0; index < questions.length; index ++)
		{
      
      response = view.askQuestion("Type a trivia question here, " + playerOneName);
      
      // for (int i = 0; i <questions.length; i ++)
      // {
      //   response = view.askQuestion(getPlayerOneName + "Type your answer here");

      // }

			questions[index] = "This is question# " + response;

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