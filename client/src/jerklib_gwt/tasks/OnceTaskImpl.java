package jerklib_gwt.tasks;

import jerklib_gwt.Session;
import jerklib_gwt.events.IRCEvent;
import jerklib_gwt.events.IRCEvent.Type;



/**
 * An augmented {@link TaskImpl} that only executes once
 * as it cancels itself out of the task queue once completed,
 * <em>even if it fails (= throws an <code>Exception</code>)</em>.
 * 
 * @see OnceUntilSucceedsTaskImpl
 * @see Session#onEvent(Task)
 * @see Session#onEvent(jerklib.tasks.Task, jerklib_gwt.events.IRCEvent.Type...)
 * @see TaskImpl
 * @see Type
 * 
 * @author pbleser
 *
 */
public abstract class OnceTaskImpl extends TaskImpl
{
    public OnceTaskImpl(String name)
    {
    	super(name);
    }
    
    /**
     * Process the {@link IRCEvent}, once.
     * 
     * @param e the {@link IRCEvent} to process
     */
    public abstract void receiveEventOnce(IRCEvent e);

    /**
     * {@inheritDoc}
     */
	public final void receiveEvent(IRCEvent e)
	{
		try {
			receiveEventOnce(e);
		} finally {
			this.cancel();
		}
	}

}