package Controller;

import Model.Model;

import View.Popup;

public class Controller
{
  private Popup view;

  public Controller()
  {
    view = new Popup();
  }

  public void start ()
	{
    System.out.println("Project");
    practice();
	}
  
  public void practice ()
  {
    String [] questions = new String [10];
		
		for (int index = 0; index < questions.length; index ++)
		{
			questions[index] = "This is question# " + index;
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