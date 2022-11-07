import javax.swing.JOptionPane; // program menggunakan JOptionPane
public class Addition
{
    public static void main( String args[] )
    {
// input dari JOptionPane
        String firstNumber =
                JOptionPane.showInputDialog( "Masukkan bilangan bulat pertama" );
        String secondNumber =
                JOptionPane.showInputDialog( "Masukkan bilangan bulat kedua" );
// convert String ke Numerik
        int number1 = Integer.parseInt( firstNumber );
        int number2 = Integer.parseInt( secondNumber );
        int sum = number1 + number2; // add numbers
// display result
        JOptionPane.showMessageDialog( null, "Jumlah " + sum,
                "Jumlah Dua Bilangan Bulat", JOptionPane.PLAIN_MESSAGE );
    }
}