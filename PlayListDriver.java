//Michal Kornacki
//ID:22361979
//group members:
//Karthik Santhosh Madhav ID:22350527
//Filip Kapusciak ID:22343091
//Oscar Zhou ID:22338705
//Stephen McNeill Killeen ID:22359206
public class PlayListDriver {
    public static void main(String[] args) {
        PlayList favourites = new PlayList(1);
        favourites.add(new Track("Bob Dylan","The Times They Are A-Changin'",1964,192/*3:12*/));
        favourites.add(new Track("Eagles","Desperado",1973,214/*3:34*/));
        favourites.add(new Track("The Beatles","Let It Be",1970,230/*3:50*/));
        favourites.add(new Track("U2","Acrobat",1980,270/*4:30*/));
        favourites.add(new Track("Genesis","Turn It On Again",1980,231/*3:51*/));
        favourites.add(new Track("Miley Cyrus","The Climb",2009,241/*4:01*/));
        favourites.add(new Track("Billy Joel","Leningrad",2004,243/*4:03*/));
        favourites.add(new Track("Marilyn Martin & Phil Collins","Separate Lives",1984,375/*6:15*/));
        favourites.add(new Track("Harry Chapin","Flowers Are Red",1979,305/*5:05*/));

        favourites.sort();
        favourites.display();

        System.out.println("Play NOT shuffled...");
        favourites.play(false);
        System.out.println();
//        System.out.println("Play shuffled...");
//        favourites.play(true);
//        System.out.println();
//        System.out.println("Play NOT shuffled (but notice the sequence)...");
//        favourites.play(false);
        
        
        favourites.remove("joel"); // Remove Billy Joel
        favourites.remove("U6"); // Nothing removed - U6 not found
        favourites.remove("chap"); // Remove Harry Chapin
        favourites.play(false);
        

    }
}
