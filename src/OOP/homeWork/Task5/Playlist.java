package OOP.homeWork.Task5;
import java.util.ArrayList;
import java.util.Collections;

    public class Playlist {
        private String name;
        private ArrayList<Song> songs;

        public Playlist(String name) {
            this.name = name;
            this.songs = new ArrayList<>();
        }

        public void add(Song song) {
            songs.add(song);
        }
        public void remove(int index) {
            if (index >= 0 && index < songs.size()) {
                songs.remove(index);
            } else {
                System.out.println("Ошибка: Песни с таким номером нет.");
            }
        }

        public void shuffle() {
            Collections.shuffle(songs);
            System.out.println("Плейлист '" + name + "' перемешан.");
        }

        public int getTotalDuration() {
            int total = 0;
            for (Song song : songs) {
                total += song.getDuration();
            }
            return total;
        }

        public void printPlaylist() {
            System.out.println("Плейлист: " + name);
            for (int i = 0; i < songs.size(); i++) {
                System.out.println((i + 1) + ". " + songs.get(i));
            }
        }
    }
