//Michal Kornacki
//ID:22361979
public class PlaylistDriver {
    public static void main(String[] args){

        //create the playlists(the nothing playlist remains empty to test the showList method)
        PlayList favourites = new PlayList("My favourite songs");
        PlayList nothing = new PlayList();

        //add tracks to the playlist using all add constructors to ensure they all work
        Track songOne = new Track("Fly Me to the Moon","Joytastic Sarah");
        Track songTwo = new Track("Chamber Of Reflection","Mac De Marco");
        Track songThree = new Track("Hello?","Clairo",2018,135);
        Track songFour = new Track("Sofia", "Clairo",2019,188);
        Track songFive = new Track("God's plan","Drake",2019,356);
        favourites.add(new Track("Save that Shit","Lil Peep",2017,232));
        favourites.add(new Track("Benz Truck","Lil Peep"));
        favourites.add(songOne);
        favourites.add(songTwo);
        favourites.add(songThree);
        favourites.add(songFour);
        favourites.add(songFive);
        

        //inspect and alter the playlist name to ensure get and set methods are functional
        System.out.println(favourites.getName());
        favourites.setName("Liked songs");
        System.out.println();

        //print the contents of the playlist
        System.out.println(favourites.getName());
        System.out.println(favourites.toString());

        //removes a track from the playlsit and returns true if removed
        System.out.println("removed: "+favourites.remove("hello?"));
        System.out.println();
        
        //prints out the current playlist and also prints out an empty playlist(notice that the current playlist does not contain the previously removed track)
        favourites.showList();
        System.out.println();
        nothing.showList();
        System.out.println();

        //plays the songs in the playlist at first in a sequential order and then plays songs in a shuffled order
        System.out.println("Tracks played in sequential order:");
        favourites.playAll(false);
        System.out.println("Tracks in random order:");
        favourites.playAll(true);
        System.out.println();

        //only plays artist lil Peep
        System.out.println("Only lil peep:");
        favourites.playOnly("LIL PEEP");
        System.out.println();

        //only plays year 2019
        System.out.println("only year 2019:");
        favourites.playOnly(2019);
        System.out.println();


    }
}
