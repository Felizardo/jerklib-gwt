
package jerklib_gwt.events;

import jerklib_gwt.Session;


/**
 * The base class for all JerkLib events.
 *
 * @author mohadib
 */

public class IRCEvent extends EventToken
{
	
    /**
     * Type enum is used to determine type. It is returned from getType()
     */
    public enum Type
    {
        /**
         * Topic event - channel topic event
         */
        TOPIC,

        /**
         * Private message event - msg not sent to channel
         */
        PRIVATE_MESSAGE,

        /**
         * Channel message event - msg sent to a channel
         */
        CHANNEL_MESSAGE,

        /**
         * Server notice event
         */
        NOTICE,

        /**
         * Message of the day event
         */
        MOTD,

        /**
         * Default event - unreconized or ignored by JerkLib
         */
        DEFAULT,

        /**
         * Quit Event - when someone quits from a server
         */
        QUIT,

        /**
         * Part event - someone parts a channel
         */
        PART,

        /**
         * Join event - someone joins a channel
         */
        JOIN,

        /**
         * Nick change event - someones nick changed
         */
        NICK_CHANGE,

        /**
         * Nick in use event - The nick JerkLib is tring to use is in use
         */
        NICK_IN_USE,

        /**
         * unused
         */
        EXCEPTION,

        /**
         * Event spawned from irc numeric 005
         */
        SERVER_INFORMATION,
        CONNECT_COMPLETE,
        UPDATE_HOST_NAME,
        JOIN_COMPLETE,
        MODE_EVENT,
        KICK_EVENT,
        NICK_LIST_EVENT,
        WHO_EVENT,
        WHOIS_EVENT,
        WHOWAS_EVENT,
        CHANNEL_LIST_EVENT,
        INVITE_EVENT,
        SERVER_VERSION_EVENT,
        AWAY_EVENT,
        ERROR,
        CTCP_EVENT,
        CONNECTION_LOST,
    }

    
    private final Type type;
    private final String data;
    private final Session session;
    
    
    public IRCEvent(String data , Session session , Type type)
    {
    	super(data);
    	this.type = type;
    	this.session = session;
    	this.data = data;
    }
    
    
    /**
     * Used to find out the exact type of event the IRCEvent object
     * is. The IRCEvent object can be cast into a more specific event object to
     * get access to convience methods for the specific event types.
     *
     * @return Type of event
     */
    public Type getType()
    {
    	return type;
    }


    /**
     * Returns the raw IRC data that makes up this event
     *
     * @return Raw IRC event text.
     */
    public String getRawEventData()
    {
    	return data;
    }


    /**
     * Gets session for connection
     *
     * @return Session
     */
    public Session getSession()
    {
    	return session;
    }

    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
    	return data;
    }

}