//Question-1:-
/*
1) Create three threads in Java to simulate a race among them. Each thread should
have a name and display its name and current iteration number. Use Thread.sleep() to
introduce a delay between iterations. Also, set different priorities for the threads.
*/
//Input:-
//Package Name:-
package Thread_Java;
//Java class named RaceThread that extends the Thread class.
class RaceThread extends Thread {
    private static final int NUM_ITERATIONS = 5;
    private static final int DELAY_MS = 100;
    //Parameterized Constructor:-
    public RaceThread(String name, int priority) {
        super(name);//super is a class where the parameter name is allocated in a new Thread Object.
        setPriority(priority);//A method of a Thread class where it is used to set the priority of a thread.
    }
    //Override-Method Declaration in a supertype.
    @Override
    public void run() {
        for (int i = 1; i <= NUM_ITERATIONS; i++) {
            System.out.println(getName() + " - Iteration: " + i);
            //Try Block:-
            try {
                Thread.sleep(DELAY_MS);
            } 
            //Catch Block:-
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " has finished the race!");
    }
}
//File Name:-
public class ThreadRaceSimulation {
    public static void main(String[] args) {
        // Create three threads with different priorities
        RaceThread thread1 = new RaceThread("Thread 1", Thread.MAX_PRIORITY);//Max_Priority:-Maximum Priority of a Thread Class
        RaceThread thread2 = new RaceThread("Thread 2", Thread.NORM_PRIORITY);//Norm_Priority:-Default Priority of a Thread Class
        RaceThread thread3 = new RaceThread("Thread 3", Thread.MIN_PRIORITY);//Min_Priority:-Minimum Priority of a Thread Class

        // Start the threads
        thread1.start();//Start:-Begin Execution
        thread2.start();//Start:-Begin Execution
        thread3.start();//Start:-Begin Execution
    }
}
//Output:-
/*
Thread 2 - Iteration: 1
Thread 1 - Iteration: 1
Thread 3 - Iteration: 1
Thread 3 - Iteration: 2
Thread 2 - Iteration: 2
Thread 1 - Iteration: 2
Thread 2 - Iteration: 3
Thread 3 - Iteration: 3
Thread 1 - Iteration: 3
Thread 2 - Iteration: 4
Thread 3 - Iteration: 4
Thread 1 - Iteration: 4
Thread 2 - Iteration: 5
Thread 3 - Iteration: 5
Thread 1 - Iteration: 5
Thread 2 has finished the race!
Thread 3 has finished the race!
Thread 1 has finished the race!
*/