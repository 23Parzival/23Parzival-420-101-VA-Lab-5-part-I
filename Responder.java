import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Responder
{
    private HashMap<String, String> responses;
    private ArrayList<String> defaultResponses;
    private Random randomGenerator;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        responses = new HashMap<>();
        defaultResponses = new ArrayList<>();
        randomGenerator = new Random();
        fillResponsesMap();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> sentence)
    {
        for (String word : sentence) {
            String response = responses.get(word);
            if(response != null) {
                return response;
            }
        }
        return pickDefaultResponse();
    }
    
    public void fillResponsesMap()
    {
        responses.put("bug", 
                      "Bugs are common when working with computers, try to figure it out.");
        responses.put("computer",
                      "Computers are awesome.");
        responses.put("installation", 
                        """
                        The installation is really quite straight forward. We have tons of
                        "wizards that do all the work for you. Have you read the installation
                        instructions?
                        """);
        responses.put("memory", 
                        """
                        If you read the system requirements carefully, you will see that the
                        specified memory requirements are 1.5 giga byte. You really should
                        upgrade your memory. Anything else you want to know?
                        """);
    }
    
    public void fillDefaultResponse()
    {
        defaultResponses.add("Sorry, I don't understand.");
    }
    
    public String pickDefaultResponse()
    {
        int index = randomGenerator.nextInt(defaultResponses.size());
        return defaultResponses.get(index);
    }
}

