import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

//Michal Kornacki
//ID:22361979
public class PlayList{

    //playList instance variables
    private String playListName;
    private LinkedList<Track>songCollection;

    //default name playlist
    public PlayList(){
        this.playListName = "My playlist";
        this.songCollection = new LinkedList<Track>();
    }

    //specified name playlist
    public PlayList(String playListName){
        this.playListName = playListName;
        this.songCollection = new LinkedList<Track>();
    }

    //Display the playlist in a readable format
    public String toString(){
        String thePlaylist="";
        int num=0;
        for(num=0;num<songCollection.size();num++){
            thePlaylist += ((num+1)+". "+songCollection.get(num)+"\n");
        }
        return thePlaylist;
    }

    //alter the name of the playlist
    public void setName(String name){
        this.playListName = name;
    }

    //return the curent name of the playlist
    public String getName(){
        return playListName;
    }

    //add Track with only title and artist
    public void add(String title,String artist){
        Track song = new Track(title, artist);
        songCollection.add(song);
    }

    //add Track with all the information
    public void add(String title,String artist,int year,int duration){
        Track song = new Track(title, artist, year, duration);
        songCollection.add(song);
    }

    //add an already existing instance of the Track class
    public void add(Track t){
        songCollection.add(t);
    }

    //returns true if a Track instance with the same title is removed from the playlist, else returns false
    public boolean remove (String title){
        Iterator <Track> checkForRemoval = songCollection.iterator();
        boolean removed = false;
        while(checkForRemoval.hasNext()){
            Track song = checkForRemoval.next();
            if(song.getTitle().equalsIgnoreCase(title)){
                checkForRemoval.remove();
                removed=true;
            }
        }
    return removed;
    }
    

    public void showList(){
        if(songCollection.isEmpty()){
            System.out.println("The list is empty");
        }
        else{
            String showAll = songCollection.toString();
            showAll = showAll.replaceAll(", ", "\n");
            showAll = showAll.replace("[","");
            showAll = showAll.replace("]","");
            System.out.println(showAll);
        }
    }

    //If boolean value random is set true the playList is shuffled and then played,otherwise it is played in the order put into the playlsit
    public void playAll(boolean random){
        if(random==false){
              System.out.println(songCollection.toString());
           }
        else{
            LinkedList<Track> songCollectionShuffled = songCollection;
            Collections.shuffle(songCollectionShuffled);
            System.out.println(songCollectionShuffled);
            }
    }

    //plays only songs made by a specified artist 
    public void playOnly(String artist){
        Iterator<Track> checkForArtist = songCollection.iterator();
        while(checkForArtist.hasNext()){
            Track song = checkForArtist.next();
                if(song.getArtist().equalsIgnoreCase(artist)){
                    System.out.println(song);
                }
        }
    }

    //plays only songs made in the specified year
    public void playOnly(int year){
        Iterator<Track> checkForYear = songCollection.iterator();
            while(checkForYear.hasNext()){
                Track song = checkForYear.next();
                int songYear = song.getYear();
                if(year==songYear){
                    System.out.println(song);
                }
            }

    }
        
}
