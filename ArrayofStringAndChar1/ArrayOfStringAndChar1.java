import javax.swing.JOptionPane;
import java.util.Arrays;
public class ArrayOfStringAndChar1{ 
    public static void main(String[] args){ 
String[] names = new String[6];
int i;
int k;
k=0;
int vowelCount;
vowelCount=0;
char ch;
names[0] = JOptionPane.showInputDialog("Please enter a name");
names[1] = JOptionPane.showInputDialog("Please enter a name");
names[2] = JOptionPane.showInputDialog("Please enter a name");
names[3] = JOptionPane.showInputDialog("Please enter a name");
names[4] = JOptionPane.showInputDialog("Please enter a name");
names[5] = JOptionPane.showInputDialog("Please enter a name");



Arrays.sort(names);

System.out.println("Name" + " " + "Characters" + "         " + "Vowels");
        
    for (i=0; i<12; i++)
        
       {
        for(k=0; k<names[i].length(); k++)
        {
          ch=names[i].charAt(k);
        
          if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
             ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
              vowelCount++;
           
            }
        System.out.println(names[i] + "  " +names[i].length() + "         " + vowelCount);
       
    }
}
}
