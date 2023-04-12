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
        String versicolour1 = " VERSICOLOUR ";
        String virginica1 = "  VIRGINICA   ";
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
        System.out.println("*****************************************************************************************");
        printer(setosa,setosa1);
        System.out.println("*****************************************************************************************");
        printer(versicolor,versicolour1);
        System.out.println("*****************************************************************************************");
        printer(virginica,virginica1);
        
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
        int fix = 9;
        summary[0][0] =String.format("%-" + fix + "s",efg);
        summary[1][0] =String.format("%-" + fix + "s","SepalLengthCm");
        summary[2][0] =String.format("%-" +fix + "s","SepalWidthCm ");
        summary[3][0] =String.format("%-" +fix + "s","PetalLengthCm");
        summary[4][0] =String.format("%-" + fix + "s","PetalWidthCm ");
        summary[0][1]=String.format("%-" + fix + "s","max");
        summary[1][1]=String.format("%-" + fix + "s",Float.toString(maxfun(SepalLengthCm)));
        summary[2][1]= String.format("%-" + fix + "s",Float.toString(maxfun(SepalWidthCm)));
        summary[3][1]=String.format("%-" + fix + "s",Float.toString(maxfun(PetalLengthCm)));
        summary[4][1]=String.format("%-" + fix + "s",Float.toString(maxfun(PetalWidthCm)));
        summary[0][2]=String.format("%-" + fix + "s","mean");
        summary[1][2]=String.format("%-" + fix + "s",Float.toString(meanfun(SepalLengthCm)));
        summary[2][2]=String.format("%-" + fix + "s",Float.toString(meanfun(SepalWidthCm)));
        summary[3][2]=String.format("%-" + fix + "s",Float.toString(meanfun(PetalLengthCm)));
        summary[4][2]=String.format("%-" + fix + "s",Float.toString(meanfun(PetalWidthCm)));
        summary[0][3]=String.format("%-" + fix + "s","median");
        summary[1][3]=String.format("%-" + fix + "s",Float.toString(medianfun(SepalLengthCm)));
        summary[2][3]=String.format("%-" + fix + "s",Float.toString(medianfun(SepalWidthCm)));
        summary[3][3]=String.format("%-" + fix + "s",Float.toString(medianfun(PetalLengthCm)));
        summary[4][3]=String.format("%-" + fix + "s",Float.toString(medianfun(PetalWidthCm)));
        summary[0][4]=String.format("%-" + fix + "s","mode");
        summary[1][4]=String.format("%-" + fix + "s",Float.toString(modefun(SepalLengthCm)));
        summary[2][4]=String.format("%-" + fix + "s",Float.toString(modefun(SepalWidthCm)));
        summary[3][4]=String.format("%-" + fix + "s",Float.toString(modefun(PetalLengthCm)));
        summary[4][4]=String.format("%-" + fix + "s",Float.toString(modefun(PetalWidthCm)));
        summary[0][5]=String.format("%-" + fix + "s","min");
        summary[1][5]=String.format("%-" + fix + "s",Float.toString(minfun(SepalLengthCm)));
        summary[2][5]=String.format("%-" + fix + "s",Float.toString(minfun(SepalWidthCm)));
        summary[3][5] =String.format("%-" + fix + "s",Float.toString(minfun(PetalLengthCm)));
        summary[4][5]=String.format("%-" + fix + "s",Float.toString(minfun(PetalWidthCm)));
        
        String content = "";
        for(int i = 0; i < summary.length; i++) {
         for(int j = 0; j < summary[i].length; j++) {
            System.out.print(summary[i][j] + "       ");
            content += summary[i][j] + "\t"; 
        }
        System.out.println();
        content += "\n";
    }
    String fileName = "output.txt";
    
    try {
        FileWriter writer = new FileWriter(fileName, true);
        writer.write(content);
        writer.close();
    } catch (IOException e) {
        System.out.println("An error occurred while writing the file.");
        e.printStackTrace();
    }
     }
    
}



                                              //OUTPUT

                         //    TOTAL    	   max      	 mean     	median   	mode     	min      	
                        //   SepalLengthCm	7.9      	5.8433356	5.8      	5.0      	4.3      	
                        //   SepalWidthCm 	4.4      	3.0540001	3.0      	3.0      	2.0      	
                        //   PetalLengthCm	6.9      	3.7586665	4.4      	1.5      	1.0      	
                        //   PetalWidthCm 	2.5      	1.198667 	1.3      	0.2      	0.1      	
                           
                        //        SETOSA   	max      	mean     	median   	mode     	min      	
                        //   SepalLengthCm	5.8      	5.0060005	5.0      	5.0      	4.3      	
                        //   SepalWidthCm 	4.4      	3.418    	3.4      	3.4      	2.3      	
                        //   PetalLengthCm	1.9      	1.4639996	1.5      	1.5      	1.0      	
                        //   PetalWidthCm 	0.6      	0.243999    0.2         0.2         0.1      	
                           
                        //    VERSICOLOUR 	max      	mean     	median   	mode     	min      	
                        //   SepalLengthCm	7.0      	5.9360003	5.95     	5.5      	4.9      	
                        //   SepalWidthCm 	3.4      	2.77     	2.8      	3.0      	2.0      	
                        //   PetalLengthCm	5.1      	4.26     	4.4      	4.5      	3.0      	
                        //   PetalWidthCm 	1.8      	1.3260001	1.3      	1.3      	1.0      	
                          
                        //     VIRGINICA   	max      	mean     	median   	mode     	min      	
                        //   SepalLengthCm	7.9      	6.5880003	6.5      	6.3      	4.9      	
                        //   SepalWidthCm 	3.8      	2.9739997	3.0      	3.0      	2.2      	
                        //   PetalLengthCm	6.9      	5.5520005	5.6      	5.1      	4.5      	
                        //   PetalWidthCm 	2.5      	2.0260003	2.0      	1.8      	1.4      	
                               

