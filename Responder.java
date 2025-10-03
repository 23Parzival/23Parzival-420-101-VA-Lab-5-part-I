import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;

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
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        responses = new HashMap<>();
        defaultResponses = new ArrayList<>();
        
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
    }
    
    public void fillDefaultResponse()
    {
        defaultResponses.add("Sorry, I don't understand.");
    }
    
    public String pickDefaultResponse()
    {
        int size = defaultResponses.size();
        return defaultResponses.get(size);
    }
}

