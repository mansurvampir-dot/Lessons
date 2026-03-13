package OOP.homeWork.Task5;

public class Main {
    public static void main(String[] args) {
        Playlist myHits = new Playlist("Избранное");

        myHits.add(new Song("Муцараев", 5));
        myHits.add(new Song("End", 211));
        myHits.add(new Song("Shape", 200));

        myHits.printPlaylist();
        System.out.println("Общее время: " + myHits.getTotalDuration() + " сек.");

        myHits.shuffle();
        myHits.printPlaylist();

        myHits.remove(1); // Удаляем вторую песню
        System.out.println("После удаления:");
        myHits.printPlaylist();
    }
}