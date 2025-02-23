import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//import come classes used later

class Conversation implements Chatbot{ 

// Attributes: there needs a transcript and some canned responses
private ArrayList<String> transcript;
private static String[] CannedResponses = {
    "Interesting, tell me more.", 
    "Mmm-hm.",
    "Can you elaborate?",
    "How does that make you feel?"
};

// Constructor
  public Conversation() {
    this.transcript = new ArrayList<>();
}

  /**
   * Starts and runs the conversation with the user
   */

  public void chat() {
//Conduct the chatting process, get round numbers and print out chatbox's lines
    Scanner scanner = new Scanner(System.in);

    System.out.println("How many rounds?");
    int roundNum = scanner.nextInt();
    scanner.nextLine();  // Consume the leftover newline character
    System.out.println(roundNum);

    int counter = 0;
            System.out.println("Hello! What's on your mind?");

    while (counter < roundNum) {

        
        String input = scanner.nextLine(); 
        String response = respond(input);

        transcript.add(input);
        transcript.add(response);

        System.out.println(response);
        counter++; 
    }

    System.out.println("Goodbye! The conversation is over.");
    printTranscript();
    scanner.close();
}

    /**
     * Prints transcript of conversation
     */
    public void printTranscript() { //print out a transcript 
      System.out.println("\n--- TRANSCRIPT ---");
        for (String line : transcript) {
            System.out.println(line);
        }
    }

  /**
   * Gives appropriate response (mirrored or canned) to user input
   * @param inputString the users last line of input
   * @return mirrored or canned response to user input  
   */

  public String respond(String inputString) { // respond using canned responses, and change me to you
// Mirror words mapping
    ArrayList<String> originalWords = new ArrayList<>(Arrays.asList("I", "me", "am", "you", "my", "your"));
    ArrayList<String> mirrorWords = new ArrayList<>(Arrays.asList("you", "you", "are", "I", "your", "my"));

    // Split input string into words
    String[] words = inputString.split(" ");
    boolean mirrored = false;

    // Check and replace mirror words
    for (int i = 0; i < words.length; i++) {
        int index = originalWords.indexOf(words[i]); // Find index of word in originalWords
        if (index != -1) {  // If found, replace it
            words[i] = mirrorWords.get(index);
            mirrored = true;
        }
    }
    // Join words back into sentence
    String response = String.join(" ", words);
      
    if (mirrored) {
      return response;
    } else {
      return CannedResponses[(int) (Math.random() * CannedResponses.length)];
    }
  }


  public static void main(String[] arguments) {//main argument

    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

  }
}
