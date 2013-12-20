package fr.esiag.commun.tools;

public class Lock
{
    private boolean locked;

    public Lock()
    {
	locked = false;
    }

    public synchronized void lock()
    {
	while(locked)
	{
	    try
	    {
		wait();
	    }
	    catch(InterruptedException ie)
	    {}
	}
	locked = true;
    }

    public synchronized void unlock()
    {
    System.out.println("Resource is unlocked");
	locked = false;
	notifyAll();
    }
}
