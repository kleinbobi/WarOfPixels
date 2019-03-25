import javax.swing.*;
import java.util.Random;

public class main {
    public static final int w = 1700;
    public static final int h = 1000;
    public static final int a = 10;

    public static void main(String[] args) {
        CustomPannel pannel = new CustomPannel();

        new PanlesShowforConsol(pannel);
        StatsPannel yeet = new StatsPannel();
        for (int i = 0; i < pannel.feldlenght(); i++) {
            for (int j = 0; j < pannel.feldhight(); j++) {
                Random random = new Random();
                int a = random.nextInt(110);
                if(a == 50 || a == 70) {
                    pannel.setField(i, j, new Person(random.nextInt(6),random.nextInt(400)));
                } else  {
                    int b = pannel.getAnzahlMyFeldType(i, j, new Wasser()) * 10;
                    int c = pannel.getAnzahlMyFeldType(i, j, new Berg()) * 10;
                    if (a < 2 + b) {
                        pannel.setField(i, j, new Wasser());
                    } else {
                        if (a > 98 - c) {
                            pannel.setField(i, j, new Berg());
                        } else {
                            pannel.setField(i, j, new Grass());
                        }
                    }
                }
                pannel.repaint();
                try {
                   Thread.sleep(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        leben(pannel,yeet);


    }

    private static void leben(CustomPannel pannel,StatsPannel statshow){
        int oof=0;
        while (true) {
            oof++;
            statistics stats = new statistics();
            for (int i = 0; i < pannel.feldlenght(); i++) {
                for (int j = 0; j < pannel.feldhight(); j++) {
                    MyField person = pannel.getField(i, j);
                    if (person instanceof Person) {
                        if (!((Person) person).alteruop()){

                            stats.neuePerson(((Person) person).getClan());
                            stats.neueStärken(((Person) person).getClan(),((Person) person).getStrngt());

                            if (pannel.getAnzahlPerson(i, j) > 3) {
                                pannel.setField(i, j, new Grass());
                            } else {
                                Random random = new Random();
                                try {
                                    switch (random.nextInt(12)) {
                                        case 0: {
                                            if (pannel.getField(i - 1, j - 1) instanceof Grass) {
                                                pannel.setField(i - 1, j - 1, new Person(((Person) person).getClan(), ((Person) person).getStrngt()));
                                            } else {
                                                if (pannel.getField(i - 1, j - 1) instanceof Person) {
                                                    if (((Person) pannel.getField(i - 1, j - 1)).getStrngt() > ((Person) person).getStrngt()) {
                                                        pannel.setField(i, j, new Grass());
                                                    } else {
                                                        pannel.setField(i - 1, j - 1, new Person(((Person) person).getClan(), ((Person) person).getStrngt()));
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        case 1: {
                                            if (pannel.getField(i - 1, j) instanceof Grass) {
                                                pannel.setField(i - 1, j, new Person(((Person) person).getClan(), ((Person) person).getStrngt()));
                                            } else {
                                                if (pannel.getField(i - 1, j) instanceof Person) {
                                                    if (((Person) pannel.getField(i - 1, j)).getStrngt() > ((Person) person).getStrngt()) {
                                                        pannel.setField(i, j, new Grass());
                                                    } else {
                                                        pannel.setField(i - 1, j, new Person(((Person) person).getClan(), ((Person) person).getStrngt()));
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        case 2: {
                                            if (pannel.getField(i, j - 1) instanceof Grass) {
                                                pannel.setField(i, j - 1, new Person(((Person) person).getClan(), ((Person) person).getStrngt()));
                                            } else {
                                                if (pannel.getField(i, j - 1) instanceof Person) {
                                                    if (((Person) pannel.getField(i, j - 1)).getStrngt() > ((Person) person).getStrngt()) {
                                                        pannel.setField(i, j, new Grass());
                                                    } else {
                                                        pannel.setField(i, j - 1, new Person(((Person) person).getClan(), ((Person) person).getStrngt()));
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        case 3: {
                                            if (pannel.getField(i + 1, j + 1) instanceof Grass) {
                                                pannel.setField(i + 1, j + 1, new Person(((Person) person).getClan(), ((Person) person).getStrngt()));
                                            } else {
                                                if (pannel.getField(i + 1, j + 1) instanceof Person) {
                                                    if (((Person) pannel.getField(i + 1, j + 1)).getStrngt() > ((Person) person).getStrngt()) {
                                                        pannel.setField(i, j, new Grass());
                                                    } else {
                                                        pannel.setField(i + 1, j + 1, new Person(((Person) person).getClan(), ((Person) person).getStrngt()));
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        case 4: {
                                            if (pannel.getField(i + 1, j) instanceof Grass) {
                                                pannel.setField(i + 1, j, new Person(((Person) person).getClan(), ((Person) person).getStrngt()));
                                            } else {
                                                if (pannel.getField(i + 1, j) instanceof Person) {
                                                    if (((Person) pannel.getField(i + 1, j)).getStrngt() > ((Person) person).getStrngt()) {
                                                        pannel.setField(i, j, new Grass());
                                                    } else {
                                                        pannel.setField(i + 1, j, new Person(((Person) person).getClan(), ((Person) person).getStrngt()));
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        case 5: {
                                            if (pannel.getField(i, j + 1) instanceof Grass) {
                                                pannel.setField(i, j + 1, new Person(((Person) person).getClan(), ((Person) person).getStrngt()));
                                            } else {
                                                if (pannel.getField(i, j + 1) instanceof Person) {
                                                    if (((Person) pannel.getField(i, j + 1)).getStrngt() > ((Person) person).getStrngt()) {
                                                        pannel.setField(i, j, new Grass());
                                                    } else {
                                                        pannel.setField(i, j + 1, new Person(((Person) person).getClan(), ((Person) person).getStrngt()));
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        case 6: {
                                            if (pannel.getField(i + 1, j - 1) instanceof Grass) {
                                                pannel.setField(i + 1, j - 1, new Person(((Person) person).getClan(), ((Person) person).getStrngt()));
                                            } else {
                                                if (pannel.getField(i + 1, j - 1) instanceof Person) {
                                                    if (((Person) pannel.getField(i + 1, j - 1)).getStrngt() > ((Person) person).getStrngt()) {
                                                        pannel.setField(i, j, new Grass());
                                                    } else {
                                                        pannel.setField(i + 1, j - 1, new Person(((Person) person).getClan(), ((Person) person).getStrngt()));
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        case 7: {
                                            if (pannel.getField(i - 1, j + 1) instanceof Grass) {
                                                pannel.setField(i - 1, j + 1, new Person(((Person) person).getClan(), ((Person) person).getStrngt()));
                                            } else {
                                                if (pannel.getField(i - 1, j + 1) instanceof Person) {
                                                    if (((Person) pannel.getField(i - 1, j + 1)).getStrngt() > ((Person) person).getStrngt()) {
                                                        pannel.setField(i, j, new Grass());
                                                    } else {
                                                        pannel.setField(i - 1, j + 1, new Person(((Person) person).getClan(), ((Person) person).getStrngt()));
                                                    }
                                                }
                                            }
                                            break;
                                        }


                                    }
                                } catch (ArrayIndexOutOfBoundsException e) {

                                }
                            }


                    }else {
                            pannel.setField(i,j,new Grass());
                        }
                }
                }
            }

            try {
                Thread.sleep(statshow.getSlider());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            statshow.setStats(stats);
            pannel.repaint();
            if(oof==20) {
                statshow.sortiare();
                oof=0;
            }
            statshow.showStats();
            statshow.repaint();
        }

    }


}
