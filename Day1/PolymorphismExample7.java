/*
Music Streaming System: In a music streaming system, there may be a superclass called Song with a method called play() that plays the song's audio. Different types of songs, such as PopSong and JazzSong, may be subclasses of Song and override the play() method to play the song audio in a different way based on their specific genre and style. For example, a PopSong may play the audio with a catchy beat and chorus, while a JazzSong may play the audio with a smooth melody and improvisation.
*/
class Songs {
    public void play(String type) {
        if (type == "PopSong") {
            System.out.println("Playing PopSong");
        } else if (type == "JazzSong") {
            System.out.println("Playing JazzSong");
        }
    }
}

class PopSong extends Songs {
    public void play() {
        super.play("PopSong");
    }
}

class JazzSong extends Songs {
    public void play() {
        super.play("JazzSong");
    }
}

public class PolymorphismExample7 {
    public static void main(String[] args) {
        PopSong popsong = new PopSong();
        popsong.play();
    }
}