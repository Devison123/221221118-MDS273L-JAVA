import java.io.*;
import java.util.*;
public class lab7 {
   public static float maxfun(float[] a) {
        Arrays.sort(a);
        return a[a.length-1];
        }
    
    public static float minfun(float[] a) {
        Arrays.sort(a);
        return a[0];
        }

    public static float meanfun(float[] a){
        float sum =0;
        for (int i = 0; i < a.length; i++){
            sum+=a[i];
        }
        Float mean = sum/a.length;
        return mean;
         }


    public static float modefun(float[] a){
        ;
        
        int co = 0;
        float element =0;
        float elementX;
        
        for (int i = 0; i < a.length; i++){
            elementX =a[i];
            int coX=0;
            for (int j = 0; j < a.length; j++){
                if(a[j]==a[i]){
                    coX++;
                 }
                

            }if(coX>co){
                co=coX;
                element=elementX;
            }

        
            


            
        }
       
        return element;

    }

    public static float medianfun(float[] a){
        Arrays.sort(a);
        
        if(a.length%2==0){
            float median = (a[a.length/2]+a[(a.length/2)+1])/2;
            
            return median;
            
        }else{
            float median = a[(a.length/2)];
            
            return median;
        }
        

    }
    public static void main(String[] args) {
        String txt ="";
        try{
            File file=new File("C:/Users/devis/OneDrive/Documents/java/Iris.csv");
            Scanner sc=new Scanner(file);

            while(sc.hasNextLine()){
             String txt1=sc.nextLine();
             txt+="#";
             txt+=txt1;          
            }
        }catch(Exception e){
            System.out.println((e.getMessage()));

        }
       
        String file = txt;
        String[] line = file.split("[#]+"); 
        String[] lineBY = new String[150];
        int  dcn=0;
        for (int i = 0; i < line.length; i++){
            if(line[i].contains("Iris")){
                lineBY[dcn]=line[i];
                dcn++;

            }
        }
        
        
        String tot ="     TOTAL    ";
        String setosa1 = "     SETOSA   ";
        String versicolour1 = " versicolour ";
        String virginica1 = "    virginica ";
        String[] setosa = new String[50];
        int setosaCnt =0;
        String[] versicolor = new String[50];
        int versicolorCnt =0;
        String[] virginica= new String[50];
        int virginicaCnt =0;
        
        for (int i = 0; i < lineBY.length; i++) {
            if(lineBY[i].contains("Iris-setosa")){
                setosa[setosaCnt]=lineBY[i];
                setosaCnt++;
            }if(lineBY[i].contains("Iris-versicolor")){
                versicolor[versicolorCnt]=lineBY[i];
                versicolorCnt++;

            }if(lineBY[i].contains("Iris-virginica")){
                virginica[virginicaCnt]=lineBY[i];
                virginicaCnt++;
            }

        }
       
        printer(lineBY,tot);
        System.out.println("**********************************************************************");
        printer(setosa,setosa1);
        System.out.println("**********************************************************************");
        printer(versicolor,versicolour1);
         System.out.println("*********************************************************************");
        printer(virginica,virginica1);
        System.out.println("**********************************************************************");
        
    }
    public static void printer(String[] abc, String efg) {
        float[] SepalLengthCm = new float[abc.length];
        float[] SepalWidthCm  = new float[abc.length];
        float[] PetalLengthCm  = new float[abc.length];
        float[] PetalWidthCm  = new float[abc.length];
        int count=0;

        for (int i = 0; i < abc.length; i++) {
            String lineX = abc[i];
            String[] linesplit =lineX.split("[,]+");
            SepalLengthCm[count] = Float.parseFloat(linesplit[1]);
            SepalWidthCm[count]  = Float.parseFloat(linesplit[2]);
            PetalLengthCm[count]  = Float.parseFloat(linesplit[3]);
            PetalWidthCm[count]  = Float.parseFloat(linesplit[4]);
            count++;
        }
        
        String[][] summary = new String[5][6];
        summary[0][0] =efg;
        summary[1][0] ="SepalLengthCm ";
        summary[2][0] ="SepalWidthCm  ";
        summary[3][0] ="PetalLengthCm ";
        summary[4][0] ="PetalWidthCm  ";

        summary[0][1]="max";
        summary[1][1]=Float.toString(maxfun(SepalLengthCm));
        summary[2][1]= Float.toString(maxfun(SepalWidthCm));
        summary[3][1]=Float.toString(maxfun(PetalLengthCm));
        summary[4][1]=Float.toString(maxfun(PetalWidthCm));
        
        summary[0][2]="mean";
        summary[1][2]=Float.toString(meanfun(SepalLengthCm));
        summary[2][2]=Float.toString(meanfun(SepalWidthCm));
        summary[3][2]=Float.toString(meanfun(PetalLengthCm));
        summary[4][2]=Float.toString(meanfun(PetalWidthCm));
        
        summary[0][3]="   median";
        summary[1][3]=Float.toString(medianfun(SepalLengthCm));
        summary[2][3]=Float.toString(medianfun(SepalWidthCm));
        summary[3][3]=Float.toString(medianfun(PetalLengthCm));
        summary[4][3]=Float.toString(medianfun(PetalWidthCm));
        
        summary[0][4]="mode";
        summary[1][4]=Float.toString(modefun(SepalLengthCm));
        summary[2][4]=Float.toString(modefun(SepalWidthCm));
        summary[3][4]=Float.toString(modefun(PetalLengthCm));
        summary[4][4]=Float.toString(modefun(PetalWidthCm));
        
        summary[0][5]="min";
        summary[1][5]=Float.toString(minfun(SepalLengthCm));
        summary[2][5]=Float.toString(minfun(SepalWidthCm));
        summary[3][5] =Float.toString(minfun(PetalLengthCm));
        summary[4][5]=Float.toString(minfun(PetalWidthCm));
        
       
        for(int i = 0; i < summary.length; i++) {
            for(int j = 0; j < summary[i].length; j++) {
              System.out.print(summary[i][j] + "       ");
            }
            System.out.println();
          }
        }
    
}

