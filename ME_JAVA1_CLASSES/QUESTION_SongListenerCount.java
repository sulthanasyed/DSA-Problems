import java.util.*;

class Solution {
  String title;
  String artist;
  int songListenerCount=0;
  public Solution(String title,String artist){
      this.artist=artist;
      this.title=title;
  }
  public String getArtist(){
      return artist;
  }
  public String getTitle(){
      return title;
  }
  public int howMany(int x)
  {
      songListenerCount+=x;
      return songListenerCount;
  }

    public static void main(String args[]) {
        Solution hikaruNara = new Solution("Hikaru Nara", "Goose House");
        assert hikaruNara.getArtist().equals("Goose House") : "Expect \"Goose House\" for getArtist() when Solution = [\"Hikaru Nara\", \"Goose House\"]";
        assert hikaruNara.getTitle().equals("Hikaru Nara") : "Expect \"Hikaru Nara\" for getTitle() when Solution = [\"Hikaru Nara\", \"Goose House\"]";
        assert hikaruNara.howMany(5) == 5 : "howMany for Hikaru Naru => 3";
        assert hikaruNara.howMany(22) == 27 : "howMany for Hikaru Naru => 27";

        System.out.println("All test cases in main function passed");

    }
}

