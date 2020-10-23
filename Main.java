class Main {
  public static void main(String[] args) {
    
    Album album = new Album("i Thought They'd Have Flying Cars By Now...");

    Song[] songs = new Song[3];
    
    songs[0] = new Song("Celebration", "Kool and the Gang", "Unknown");
    songs[1] = new Song("YMCA", "N/A", "N/A");
    songs[2] = new Song("Rock Lobster", "N/A", "N/A");

    album.setSongs(songs);
    System.out.println(album);
  }
}

//ALBUM CLASS
class Album {
  String albumTitle;
  Song[] songs;
  
  public Album(String albumTitle) {
    this.albumTitle = albumTitle;
  }

  public void setSongs(Song[] songs) {
    this.songs = songs;
  }

    public String toString() {
    String s = "";
    s += "Album Title: " + albumTitle + "\n";
    for(int i=0; i<songs.length; i++) {
      s += "Track #" + i + ": " + songs[i].songTitle + ", ";
      s += songs[i].artist + ", ";
      s += songs[i].yearReleased;
      s += "\n";
    }
    return s;
  }
}

//SONG CLASS
class Song {
  String songTitle;
  String artist;
  String yearReleased;

  public Song(String songTitle,
              String artist,
              String yearReleased) {
    this.songTitle = songTitle;
    this.artist = artist;
    this.yearReleased = yearReleased;
  }
}
