package exercises;

public class LogLevels {
    
    public static String message(String logLine) {
    	String word2 = "";
    	if(logLine.contains("INFO")) {
    		word2 = logLine.substring(7, logLine.length()); 
    		return word2.trim();
    	}
    	else if(logLine.contains("WARNING")){
    		word2 = logLine.substring(10, logLine.length()); 
    		return word2.trim();
    	}
    	else{
    		word2 = logLine.substring(8, logLine.length()); 
    		return word2.trim();
    	}
    }
 
    public static String logLevel(String logLine) {
    	if(logLine.contains("INFO")) {
    		return "info";
    	}
    	else if(logLine.contains("WARNING")){
    		return "warning";
    	}
    	else{
    		return "error";
    	}
    
    }

    public static String reformat(String logLine) {
    	String word1 = "";
    	String word2 = "";
    	if(logLevel(logLine) == "info") {
    		word1 = "info";
    		word2 = message(logLine);
    		return   word2 + " (" + word1 + ")";
    	}
    	else if(logLevel(logLine) == "warning") {
    		word1 = "warning";
    		word2 = message(logLine);
    		return   word2 + " (" + word1 + ")";
    	}
    	else {
    		word1 = "error";
    		word2 = message(logLine);
    		return   word2 + " (" + word1 + ")";
    	}
    		
    }
}
