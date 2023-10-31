//Question-2:-
/*
2)Create a messaging system with a shared message queue. Implement two threads: a
sender thread that adds messages to the queue and a receiver thread that removes
messages from the queue. Use wait() and notifyAll() to ensure that the sender waits if
the queue is full and the receiver waits if the queue is empty.
*/
//Input:-
//Package Name:-
package Thread_Java;
//Linked List Name:-
import java.util.LinkedList;
//Queue Name:-
import java.util.Queue;
//Normal Class Name:-
class MessageQueue {
    private Queue<String> queue = new LinkedList<>();//Private Key queue-Queue Name Object
    private static final int MAX_CAPACITY = 5;

    // Sender thread adds a message to the queue
    public synchronized void sendMessage(String message) {
    	//While Condition check that Queue size and MAX_CAPACITY is equal or not :-
        while (queue.size() == MAX_CAPACITY) {
        	//Try Block:-
            try {
                // Queue is full, wait for the receiver to make space
                wait();
            }
            //Catch Block with Interrupt Exception:-
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //an message is being added to a queue data structure.
        queue.add(message);
        System.out.println("Sent: " + message);
        // Notify the receiver that a message is available
        notifyAll();//Wakes up all threads that are waiting on this object's monitor.A thread waits on an object's monitor by calling one of the wait methods. 
    }

    // Receiver thread retrieves a message from the queue
    public synchronized String receiveMessage() {
    	//While Condition check that Queue is Empty or Not
        while (queue.isEmpty()) {
        	//Try Block:-
            try {
                // Queue is empty, wait for the sender to add a message
                wait();
            }
            //Catch Block with Interrupt Exception:-
            catch (InterruptedException e) {
                e.printStackTrace();//This method prints a stack trace for this Throwable object on the error output stream that isthe value of the field System.err.
            }
        }
        String message = queue.poll();//Queue.poll() means Retrieves and removes the head of this queue,or returns null if this queue is empty.
        System.out.println("Received: " + message);
        // Notify the sender that there is space in the queue
        notifyAll();//Wakes up all threads that are waiting on this object's monitor.A thread waits on an object's monitor by calling one of the wait methods. 
        return message;
    }
}
//Java class named SenderThread that extends the Thread class.
class SenderThread extends Thread {
    private MessageQueue messageQueue;//This line means that it is a declaration of a private instance variable named messageQueue of type MessageQueue.
    //Parameterized Constructor:-
    public SenderThread(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }
    //Override-Method Declaration in a supertype.
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            messageQueue.sendMessage("Message " + i);//The code messageQueue.sendMessage("Message " + i); suggests that there is a method named sendMessage in the messageQueue object, and it is being called with a parameter. 
            //Try Block:-
            try {
                Thread.sleep(1000); // Simulate some processing time
            }
            //Catch Block with Interrupt Exception:-
            catch (InterruptedException e) {
                e.printStackTrace();//This method prints a stack trace for this Throwable object on the error output stream that isthe value of the field System.err.
            }
        }
    }
}
//Java class named ReceiverThread that extends the Thread class.
class ReceiverThread extends Thread {
    private MessageQueue messageQueue;//This line means that it is a declaration of a private instance variable named messageQueue of type MessageQueue.
    //Parameterized Constructor:-
    public ReceiverThread(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }
    //Override-Method Declaration in a supertype.
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            messageQueue.receiveMessage();//The code messageQueue.receiveMessage() suggests that there is a method called receiveMessage being called on the messageQueue object. 
            //Try Block:-
            try {
                Thread.sleep(1000); // Simulate some processing time
            }
          //Catch Block with Interrupt Exception:-
            catch (InterruptedException e) {
                e.printStackTrace();//This method prints a stack trace for this Throwable object on the error output stream that isthe value of the field System.err.
            }
        }
    }
}
//File Name:-
public class MessagingSystem {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue();
        SenderThread senderThread = new SenderThread(messageQueue);
        ReceiverThread receiverThread = new ReceiverThread(messageQueue);
        // Start the threads
        senderThread.start();
        receiverThread.start();
    }
}
//Output:-
/*
Sent: Message 1
Received: Message 1
Sent: Message 2
Received: Message 2
Sent: Message 3
Received: Message 3
Sent: Message 4
Received: Message 4
Sent: Message 5
Received: Message 5
Sent: Message 6
Received: Message 6
Sent: Message 7
Received: Message 7
Sent: Message 8
Received: Message 8
Sent: Message 9
Received: Message 9
Sent: Message 10
Received: Message 10
*/