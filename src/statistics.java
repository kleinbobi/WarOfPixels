public class statistics {
    private int[] strärken;
    private int[] personen;

    public statistics(){
        strärken = new int[6];
        personen = new int[6];

        for (int i = 0; i < 6; i++) {
            strärken[i]=0;
            personen[i]=0;
        }
    }

    public void neuePerson(int clan){
        personen[clan]++;
    }
    public void neueStärken(int clan,int stärke){
        strärken[clan]+=stärke;
    }

    public int getDStärke(int clan){
        try {
            return strärken[clan] / personen[clan];
        }catch (ArithmeticException e){
            return 0;
        }
    }
    public int getPersonenAnzahl(int clan){
        return personen[clan];
    }

}
