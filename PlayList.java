import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

//Michal Kornacki
//ID:22361979
//group members:
//Karthik Santhosh Madhav ID:22350527
//Filip Kapusciak ID:22343091
//Oscar Zhou ID:22338705
//Stephen McNeill Killeen ID:22359206
public class PlayList{

    //playList instance variables
    private String playListName;
    private LinkedList<Track>songCollection;

    //default name playlist
    public PlayList(){
        this.playListName = "My playlist";
    }

    //specified name playlist
    public PlayList(String playListName){
        this.playListName = playListName;
    }

    

}
