package absenku;
//@author Ghaisani
public class Form {

    public static void main(String[] args) {
        Absenku absen = new Absenku();
        absen.setVisible(true);
        absen.pack();
        absen.setLocationRelativeTo(null);
        absen.setDefaultCloseOperation(Absenku.EXIT_ON_CLOSE);
    }
    
}
