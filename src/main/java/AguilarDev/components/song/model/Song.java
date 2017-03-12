package AguilarDev.components.song.model;

public class Song {
    private String artist;
    private String albumName;
    private String songName;

    public Song(String artist, String albumName, String songName) {
        this.artist = artist;
        this.albumName = albumName;
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getSongName() {
        return songName;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", albumName='" + albumName + '\'' +
                ", songName='" + songName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (artist != null ? !artist.equals(song.artist) : song.artist != null) return false;
        if (albumName != null ? !albumName.equals(song.albumName) : song.albumName != null) return false;
        return songName != null ? songName.equals(song.songName) : song.songName == null;

    }

    @Override
    public int hashCode() {
        int result = artist != null ? artist.hashCode() : 0;
        result = 31 * result + (albumName != null ? albumName.hashCode() : 0);
        result = 31 * result + (songName != null ? songName.hashCode() : 0);
        return result;
    }
}
