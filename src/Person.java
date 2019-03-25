import java.awt.*;

public class Person extends MyField{
    private int clan;
    private int strngt;
    private int alter;
    private static Color[] colors = {Color.white,Color.RED,Color.yellow,Color.MAGENTA,Color.BLACK,Color.ORANGE};

    public Person(int clan,int strngt) {
        this.color = colors[clan];
        this.clan = clan;
        this.strngt = strngt;
        alter = 0;
    }

    public int getClan() {
        return clan;
    }

    public int getStrngt() {
        return strngt;
    }
    public boolean alteruop(){
        alter = alter+1;
        return alter >strngt;
    }
}
