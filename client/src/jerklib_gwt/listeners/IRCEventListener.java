
package jerklib_gwt.listeners;

import jerklib_gwt.events.IRCEvent;

/**
 * IRCEventListener - Listener to receive IRCEvents
 *
 * @author mohadib
 */
public interface IRCEventListener
{

    /**
     * recieveEvent() - receive IRCEvents
     *
     * @param e <code>IRCEvent<code> the event
     */
    public void receiveEvent(IRCEvent e);
}
