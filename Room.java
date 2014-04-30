/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class Room 
{
    public String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;
    private Room southwestExit;
    private Room northwestExit;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west, Room southwest, Room northwest) 
    {
        if(north != null){
            northExit = north;
        }
        
        if(east != null){
            eastExit = east;
        }
        
        if(south != null){
            southExit = south;
        }
        
        if(west != null){
            westExit = west;
        }
        
        if(southwest != null){
            southwestExit = southwest;
        }
        
        if(northwest != null){
            northwestExit = northwest;
        }
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    
    public Room getExit(String direction){
        Room sala = null;
        
        if (direction.equals("north")){
            sala = northExit;
        }
        
        if (direction.equals("south")){
            sala = southExit;
        }
        
        if (direction.equals("east")){
            sala = eastExit;
        }
        
        if (direction.equals("west")){
            sala = westExit;
        }
        
        if (direction.equals("southwest")){
            sala = southwestExit;
        }
        
        if (direction.equals("northwest")){
            sala = northwestExit;
        }
        
        
        return sala;
    }
    
    /**
     * Return a description of the room's exits.
     * For example: "Exits: north east west"
     *
     * @ return A description of the available exits.
     */
    public String getExitString(){
        String exitsDescription = "Exits ";
        
        if(northExit != null){
            exitsDescription = "north ";
        }
        
        if(southExit != null){
            exitsDescription = "south ";
        }
        
        if(eastExit != null){
            exitsDescription = "east ";
        }
        
        if(westExit != null){
            exitsDescription = "west ";
        }
        
        if(southwestExit != null){
            exitsDescription = "southwest ";
        }
        
        if(northwestExit != null){
            exitsDescription = "northwest ";
        }
        
        return exitsDescription;
    }
}
