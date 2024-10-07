//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        playable [] tools = new playable[3];
        tools[0]= new drum();
        tools[1]= new piano();
        tools[2]= new guitar();

        for(playable instrument : tools){
            instrument.play();
        }
    }
}