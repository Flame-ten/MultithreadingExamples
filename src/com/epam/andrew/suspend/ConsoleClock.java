package suspend;

import java.text.SimpleDateFormat;
import java.util.Date;

class ConsoleClock extends Thread{

    public void run(){
        for (int i=0; i<10; i++){
            System.out.println(i+ " - " + time());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    private String time(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("hh/mm/ss");
        return s.format(d);
    }
}
