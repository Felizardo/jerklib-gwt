
package com.felizardo.jerklib.listeners;

import com.felizardo.jerklib.events.IRCEvent;

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
