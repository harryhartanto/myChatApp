/*
 * @author harry.hartanto
 * Description : Message object, which contains the type, content, target and sender
 * Last Modified : 27-9-2016
 */
package mychatapp;
import java.io.*;
/**
 *
 * @author harry.hartanto
 
 * This class defines the different type of messages that will be exchanged between the
 * Clients and the Server. 
 * When talking from a Java Client to a Java Server a lot easier to pass Java objects, no 
 * need to count bytes or to wait for a line feed at the end of the frame
 */

public class Message implements Serializable{
    protected static final long serialVersionUID = 1112122200L;

	// The different types of message sent by the Client
	// MESSAGE an ordinary message
	// LOGIN to connect from the Server
	// LOGOUT to disconnect from the Server
	static final int MESSAGE = 1, LOGIN = 2,LOGOUT=3;
	private int type;
	private String message, sender, target,listOfParties;
	
	// constructor
	Message(int type, String message, String target, String sender) {
		this.type = type;
		this.message = message;
		this.sender = sender;
		this.target = target;
	}
        
        Message(String listOfParties) {
		this.listOfParties = listOfParties;
	}
	
	// getters
	int getType() {
		return type;
	}
	String getMessage() {
		return message;
	}
	String getSender() {
		return sender;
	}
	String getTarget() {
		return target;
	}
	String getListOfParties() {
		return listOfParties;
	}
}



	
