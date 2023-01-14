public class oop5_1 {
    public static void main(String[] args) {
        Video v = new Video();
        VideoChat vc = new VideoChat();
        saw(vc);
    }
    public static void saw(something obj){
        obj.saveValue();
    }
}
abstract class something{
    public abstract void saveValue();
}
class Video extends something{ // we have defined the abstract values so this class doesn't have to be abstract
    public void saveValue(){ // we have defined the abstract values so this class doesn't have to be abstract
        System.out.println("480p,720p,1080p");
    }
}
class VideoChat extends something{ // we have defined the abstract values so this class doesn't have to be abstract
public void saveValue(){
    System.out.println("WhatsApp,google,zoom");
}
}