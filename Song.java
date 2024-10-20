public class Main {
    
    public static class Song {
        private String title;
        private Song next;

        public Song(String title) {
            this.title = title;
            this.next = null;
        }

        public String getTitle() {
            return title;
        }

        public void setNext(Song next) {
            this.next = next;
        }

        public Song getNext() {
            return next;
        }
    }

    public static class Playlist {
        private Song head;
        private Song tail;

        public Playlist() {
            this.head = null;
            this.tail = null;
        }

        public void addSong(String title) {
            Song newSong = new Song(title);
            if (head == null) {
                head = newSong;
                tail = newSong;
            } else {
                tail.setNext(newSong);
                tail = newSong;
            }
        }

        public void displayPlaylist() {
            Song current = head;
            while (current != null) {
                System.out.println(current.getTitle());
                current = current.getNext();
            }
        }
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        String[] lagu = {"Sky", "Magnolia", "The Way Life Goes", "Highest in the Room", 
                         "Bank Account", "Praise the Lord", "Ransom", 
                         "Black Beatles", "God's Plan", "Roxxane", "One Dance"};

        for (String title : lagu) {
            playlist.addSong(title);
        }

        System.out.println("Daftar Lagu:");
        playlist.displayPlaylist();
    }
}