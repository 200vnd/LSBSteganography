package lsbstega;

public class MainClass  {

    public static void main(String[] args){
//        MainClass mainClass = new MainClass();
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SteganoMain page = new SteganoMain();
                page.setVisible(true);            }
        });
    }

//    @Override
//    public void run() {
//        SteganoMain page = new SteganoMain();
//        page.setVisible(true);
//    }
}
