package exercises;


public class Blackjack {
	//In this exercise we will simulate the first turn of a Blackjack game.
	
    public int parseCard(String card) {
    	//Implement a function to calculate the numerical value of a card given its name using conditionals.
    	int carta;
    	switch(card) {
    	case "ace":
    		carta = 11;
    		break;
    	case "two":
    		carta = 2;
    		break;
    	case "three":
    		carta = 3;
    		break;
    	case "four":
    		carta = 4;
    		break;
    	case "five":
    		carta = 5;
    		break;
    	case "six":
    		carta = 6;
    		break;
    	case "seven":
    		carta = 7;
    		break;
    	case "eight":
    		carta = 8;
    		break;
    	case "nine":
    		carta = 9;
    		break;
    	case "ten":
    		carta = 10;
    		break;
    	case "jack":
    		carta = 10;
    		break;
    	case "queen":
    		carta = 10;
    		break;
    	case "king":
    		carta = 10;
    		break;
    	default:
    		carta = 0;
    		break;
    	}
    	return carta;	
    }

    public boolean isBlackjack(String card1, String card2) {
    	//Implement a function that returns true if two cards form a Blackjack, false otherwise.
    	if(this.parseCard(card1) + this.parseCard(card2) == 21) {
    		return true;
    	}
    	return false;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
    	//It should implement the bulletpoints in the category "Large Hand" 
    	if(isBlackjack && dealerScore < 10) {
    		return "W";
    	}
    	else if(isBlackjack && dealerScore >= 10)
    	{
    		return "S";
    	}
    	return "P";
    	
    }

    public String smallHand(int handScore, int dealerScore) {
    	if(handScore <= 11) {
    		return "H";
    	}
    	else if(handScore >= 12 && handScore <=16) {
    		if(dealerScore >= 7) {
    			return "H";
    		}
    		return "S";
    	}
    	return "S";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
