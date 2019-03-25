import javax.swing.*;
import java.awt.*;

public class CustomPannel extends JPanel {

    private MyField[][] feld;

    public CustomPannel(){
        feld = new MyField[main.w/main.a][main.h/main.a];
    }

    public CustomPannel(MyField[][] feld){
       this.feld = feld;
    }

    @Override
    public void paint(Graphics graphics) {

        super.paintComponent(graphics);
        int a = main.a;
        try {
            for (int i = 0; i < feld.length; i++) {
                for (int j = 0; j < feld[0].length; j++) {
                    graphics.setColor(feld[i][j].getColor());

                    graphics.fillRect(a * i, a * j, a, a);
                }
            }
        }catch (NullPointerException e){
            return;
        }


    }
    public <reverenz> int getAnzahlMyFeldType(int w, int h, MyField reverenz){

        int ret = 0;
        try {
            if (feld[w - 1][h - 1] != null && feld[w - 1][h - 1].getColor().equals(reverenz.getColor())) {
                ret++;
                ret++;
            }
        }catch (ArrayIndexOutOfBoundsException e){}
        try{
            if(feld[w][h-1] != null&&feld[w][h-1].getColor().equals(reverenz.getColor()) ){
               ret++;
                ret++;
            }
        }catch (ArrayIndexOutOfBoundsException e){}
        try {
            if(feld[w-1][h] != null&&feld[w-1][h].getColor().equals(reverenz.getColor()) ){
                ret++;
                ret++;
            }
        }catch (ArrayIndexOutOfBoundsException e){}
        try {
            if (feld[w - 1][h + 1] != null && feld[w - 1][h + 1].getColor().equals(reverenz.getColor())) {
                ret++;
                ret++;
            }
        }catch (ArrayIndexOutOfBoundsException e){}

        return ret;
    }

    public void setField(int w, int h, MyField myField){
        feld[w][h] = myField;
    }
    public MyField getField(int w,int h) throws ArrayIndexOutOfBoundsException{
        return feld[w][h];
    }
    public int feldlenght(){
        return feld.length;
    }
    public int feldhight(){
        return feld[0].length;
    }
    public int getAnzahlPerson(int w, int h){

        int ret = 0;
        try {
            if (feld[w - 1][h - 1] != null && feld[w - 1][h - 1] instanceof Person) {
                ret++;
                ret++;
            }
        }catch (ArrayIndexOutOfBoundsException e){}
        try{
            if(feld[w][h-1] != null&&feld[w][h-1] instanceof Person ){
                ret++;
                ret++;
            }
        }catch (ArrayIndexOutOfBoundsException e){}
        try {
            if(feld[w-1][h] != null&&feld[w-1][h] instanceof Person ){
                ret++;
                ret++;
            }
        }catch (ArrayIndexOutOfBoundsException e){}
        try {
            if (feld[w - 1][h + 1] != null && feld[w - 1][h + 1] instanceof Person) {
                ret++;
                ret++;
            }
        }catch (ArrayIndexOutOfBoundsException e){}

        return ret;
    }

}
