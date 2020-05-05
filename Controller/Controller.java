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
    String answer = "";
    answer = view.askQuestion("Do want to play a trivia game?");
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
    String answer = "";
    String reply = "";

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
    

    String [] questions = new String [5];
		
		for (int index = 0; index < questions.length; index ++)
		{
      response = view.askQuestion("Type a trivia question here");
      answer = view.askQuestion("Type your answer here for question: " + response);

      for (int index2 = 0; index2 <5; index2 ++)
      {
        reply = view.askQuestion("Answer the following question (you have only three tries): "response);
        if (reply.equalsIgnoreCase(answer));
        {
          view.displayMessage("Great Answer. Now the next question");
        }
        else
        {
          for (int i = 0; i < 3; i ++)
          {
            view.displayMessage("Try again");
          }
          view.displayMessage("The answer is: " + answer + ". Next question.");
        }
      }


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