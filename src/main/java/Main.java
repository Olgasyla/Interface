public class Main {
    public static void main(String[] args) {
         MediaController mediaController = new MediaController();

        Playable music = new MusicPlayer(); //Es wurde ein neues Objekt (musik) in (MusicPlayer)Class erstellt
        Playable video = new VideoPlayer(); //Es wurde ein neues Objekt (video) in (VideoPlayer)Class erstellt

        mediaController.playMedia(music);  //
        mediaController.playMedia(video);



    }
}
