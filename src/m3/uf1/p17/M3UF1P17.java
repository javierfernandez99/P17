package m3.uf1.p17;
import java.util.Scanner;
/**
 *
 * @author JavierFerRom
 */
public class M3UF1P17 {

    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int euro, num = 0;
        String euro1;
        float euro2;
        char letter;
        System.out.println("Author:Javier");
        int option = -1;
        keyboard.useDelimiter("\n");
        do {  
            
       userMenu();
          option=keyboard.nextInt();
          switch (option) {//init of switch
                 case 1:
                    System.out.println("Insert value €:");
                    euro=keyboard.nextInt();
                    functionIntFloat(euro);
                    break;
                case 2:
                    System.out.println("Insert value €:");
                    euro=keyboard.nextInt();
                    functionIntDouble(euro);
                    break;
                case 3:
                    System.out.println("Insert value €:");
                    euro=keyboard.nextInt();
                    functionIntString(euro);
                    break;
                case 4:
                    System.out.println("Insert value €:");
                    euro1=keyboard.next();
                    functionStringInt(euro1);
                    break;
                case 5:
                    System.out.println("Insert value €:");
                    euro2=keyboard.nextFloat();
                    functionFloatInt(euro2);
                    break;
                case 6:
                    System.out.println("Insert value €:");
                    euro2=keyboard.nextFloat();
                    functionFloatString(euro2);
                    break;
                case 7:
                    System.out.println("Letter ?:");
                    char letter = (keyboard.next().charAt);
                    chartoBinary(letter);
                break;
                case 8:
                    System.out.println("word ?:");
                    String str=keyboard.next();
                    String strResult=StringtoBinary(str);
                    System.out.println();
                    break;
                case 9:
                     int numChar;
                    do {
                        System.out.print("Give a number between 0 and 255: ");
                        numChar = keyboard.nextInt();
                    } while (numChar > 255 || 0 > numChar);
                    String numconv = Case9 (numChar);
                    System.out.println(numconv);
                    System.out.println()
                case 10:
                    break;
          }//end of switch  
        }while(option!=0);
    }
    
    private static void userMenu() {
        System.out.println("Option1: ():");
        System.out.println("Option2: ():");
        System.out.println("Option3: ():");
        System.out.println("Option4: ():");
        System.out.println("Option5: ():");
        System.out.println("Option6: ():");
        System.out.println("Option7: ():");
        System.out.println("Option8: ():");
        System.out.println("Option9: ():");
        System.out.println("Option0: (exit):");

        System.out.print("\n\noption ?");
    }
    
    private static float Case1(int euro){
        float res = 0;
        res = euro / 0.91f; //cast          
        return res;
    }
    private static double Case2(int euro){
        double res2 = 0;
        res2 = euro / (double) 0.91;
        return res2;
    }
    
    private static String Case3(int euro){
        String res3 = Integer.toString(euro);
        System.out.println(euro + " € " + " = " + res3 + " $");
        return res3;
    }
    
    private static int Case4(String euro1){
        int res4;
        res4 = Integer.parseInt(euro1);
        return res4;
    }

    private static int Case5(float euro2){
        int res5 = 0;
        res5 = (int) (euro2 / 0.91); //cast       
        return res5;
    }

    private static String Case6(float euro2){
        String res6 = Float.toString(euro2);
        System.out.println(euro2 + " € " + " = " + res6 + " $");
        return res6;
    }
    
    private static void Case7(){
        System.out.println("Letter ?:");
        char letter = (keyboard.next()).charAt(0);
        String letterBinary=Integer.toBinaryString(letter);
        System.out.println(letter +"="+ letterBinary);
        
    }
    
    private static String Case8(String str){
        String result="";
        char ch= ' ';
        for(int i=0; i<str.length(); i++){
            ch=str.charAt(i);
            result += Integer.toBinaryString(ch)+" ";
        }
        Integer.toBinaryString(ch);
        
        return result;
        
    }
    private static String Case9(String str){
         String aChar = new Character((char) numintchar).toString();
        return aChar;
    }
    
    private static void Case10(){
        System.out.println("--------");
        for(int i=0; i<255; i++){
            System.out.println(i +"\t" + Integer.toString(i, 16)
                    + "=" + (char)i );
        }
    }  
    
    private static void functionIntFloat(int euro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static void functionIntString(int euro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static void functionIntDouble(int euro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static void functionStringInt(String euro1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static void functionFloatInt(float euro2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static void functionFloatString(float euro2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static void chartoBinary(char letter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static String StringtoBinary(String str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
