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
    int total = 1;

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
    

    String [] questions = new String [4];
		
		for (int index = 0; index < questions.length; index ++)
		{
      response = view.askQuestion("Type a trivia question here");
      answer = view.askQuestion("Type your answer here for question: " + response);

      for (int index2 = 0; index2 < 1; index2 ++)
      {
        reply = view.askQuestion("Answer the following question (you have only two tries): " + response);

        if (reply.equalsIgnoreCase(answer))
        {
          view.displayMessage("Nice job! Now it's  your turn to ask the question.");
          total = total++;
        }
        else
        {
          reply = view.askQuestion("Try again");
          if (reply.equalsIgnoreCase(answer))
          {
            view.displayMessage("Great! Now it's your turn to ask the question.");
            total = total++;
          }
          else
          {
            view.displayMessage("The answer is: " + answer + ". Now it's your turn to ask the question.");
          }
        }
      }
    }

      ArrayList<String> userInput = new ArrayList<String>();
		  String input = view.askQuestion("Write the correct answers to all of the questions (one at a time)");
		
		  while(!input.equalsIgnoreCase("done") || userInput.size() > 10)
	  	{
			  userInput.add(input);
		  	input = view.askQuestion("Add the rest of the answers. Type done when finished");
		  }
		
		  view.displayMessage("Cool, you have: " + userInput.size() 
		  + " correct answers. " + );
		




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