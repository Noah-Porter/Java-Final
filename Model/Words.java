package Model;

import java.util.*;

public class Words
{
  private String playerOneName;
  private String playerTwoName;
  private String playerOneQuestionOne;
  private String playerTwoQuestionOne;
  private String playerOneQuestionTwo;
  private String playerTwoQuestionTwo;
  private String playerOneQuestionThree;
  private String playerTwoQuestionThree;

  private String [] questionsArray;


  public Words()
  {
    this.playerOneName = "Adolph";
    this.playerTwoName = "Hitler";
    this.playerOneQuestionOne = "My age";
    this.playerTwoQuestionOne = "My age";
    this.playerOneQuestionTwo = "Your age";
    this.playerTwoQuestionTwo = "Your age";
    this.playerOneQuestionThree = "Hello";
    this.playerTwoQuestionThree = "Hello";
  }

  public Words(String playerOneName, 
  String playerTwoName, String playerOneQuestionOne, 
  String playerTwoQuestionOne, String playerOneQuestionTwo, 
  String playerTwoQuestionTwo, String playerOneQuestionThree, 
  String playerTwoQuestionThree) 
  {
    this.playerOneName = playerOneName;
    this.playerTwoName = playerTwoName;
    this.playerOneQuestionOne = playerOneQuestionOne;
    this.playerTwoQuestionOne = playerOneQuestionOne;
    this.playerOneQuestionTwo = playerOneQuestionTwo;
    this.playerTwoQuestionTwo = playerTwoQuestionTwo;
    this.playerOneQuestionThree = playerOneQuestionThree;
    this.playerTwoQuestionThree = playerTwoQuestionThree;
  }

	private void questions()
	{
		this.questionsArray[0] = "What country is Utah in?";
		this.questionsArray[1] = "What is the largest city in Utah?";
		this.questionsArray[2] = "What is your age?";
		this.questionsArray[3] = "Do you play an instrument? (If so, type out what that instrument is?)";
		this.questionsArray[4] = "Do you enjoy art?";
		this.questionsArray[5] = "Do you know how to code?";
		this.questionsArray[6] = "How many times have you made a picture?";
		this.questionsArray[7] = "What kind of movie do you want to make?";
		this.questionsArray[8] = "What do you like to paint?";
		this.questionsArray[9] = "Would you like to make a play/movie?";

	}
  
}