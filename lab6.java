import java.io.*;
import java.util.*;
public class lab6{
     public static void wovelcounter(String filecontent) {
        String str = filecontent.toUpperCase();
        char[] alphabets = {'A','E','I','O','U','1','2','3','4','5','6','7','8','9','0'};
        int[] count = new int[15];
        for(int i=0 ; i<str.length() ; i++){
         char X = str.charAt(i);

             for(int j =0; j<15;j++){
                if(X==alphabets[j]){
                    count[j]++;
                }
             }
            
        }
        for(int i=0 ; i<15 ; i++){
            System.out.println("Count of " + alphabets[i]+ " is " + count[i]);
            }   
    }
    
    public static void mostword(String filecontent , String[] words) {
        String[] mostFrequent = new String[5]; 
        int[] maxCount= new int[5];
        Arrays.fill(maxCount,0);
        Arrays.fill(mostFrequent,"o");
        String elementX;
    
        for (int i = 0; i < words.length; i++) {
            elementX = words[i];
            int coX = 0;
            
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(words[i])) { 
                    coX++;
                }
            }
    
            if (coX >= maxCount[0]) {
                if(mostFrequent[0]!=elementX){
                maxCount[0]=coX; 
                mostFrequent[0]=elementX;}
                
            }else{
                if(coX >= maxCount[1]){
                    if(mostFrequent[0]!=elementX){
                    maxCount[1]=coX; 
                mostFrequent[1]=elementX;}

                }else{
                    if(coX >= maxCount[2]){
                        if(mostFrequent[0]!=elementX){
                        maxCount[2]=coX; 
                        mostFrequent[2]=elementX;}

                    }else{
                        if(coX >= maxCount[3]){
                            if(mostFrequent[0]!=elementX){
                            maxCount[3]=coX; 
                            mostFrequent[3]=elementX;}
    
                        }else{
                            if(coX >= maxCount[4]){
                                if(mostFrequent[0]!=elementX){
                                maxCount[4]=coX; 
                                mostFrequent[4]=elementX;}

                        }
                    
                    }
                }


            }
        }
        }
        System.out.println("5 most frequent words: " + Arrays.toString(mostFrequent));
    }
   
    public static void leastword(String filecontent , String[] words) {
        
        String[] mostFrequent = new String[5]; 
        int[] maxCount= new int[5];
        Arrays.fill(maxCount,Integer.MAX_VALUE);
        Arrays.fill(mostFrequent,"o");
        String elementX;
    
        for (int i = 0; i < words.length; i++) {
            elementX = words[i];
            int coX = 0;
    
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(words[i])) { 
                    coX++;
                }
            }
    
            if (coX < maxCount[0]) {
                if(mostFrequent[0]!=elementX){
                maxCount[0]=coX; 
                mostFrequent[0]=elementX;}
                
            }else{
                if(coX < maxCount[1]){
                    if(mostFrequent[0]!=elementX){
                    maxCount[1]=coX; 
                mostFrequent[1]=elementX;}
    
                }else{
                    if(coX < maxCount[2]){
                        if(mostFrequent[0]!=elementX){
                        maxCount[2]=coX; 
                        mostFrequent[2]=elementX;}
    
                    }else{
                        if(coX < maxCount[3]){
                            if(mostFrequent[0]!=elementX){
                            maxCount[3]=coX; 
                            mostFrequent[3]=elementX;}
    
                        }else{
                            if(coX < maxCount[4]){
                                if(mostFrequent[0]!=elementX){
                                maxCount[4]=coX; 
                                mostFrequent[4]=elementX;}
    
                        }
                    
                    }
                }
    
    
            }
        }
        }
        System.out.println("5 least frequent words: " + Arrays.toString(mostFrequent));
    }

    public static void mostChar(String filecontent) {
        String filecontentspaceremoved = filecontent.replaceAll("\\s", "");
        char[] words1 = filecontentspaceremoved.toCharArray();
        char[] mostFrequent = new char[5]; 
        int[] maxCount= new int[5];
        Arrays.fill(maxCount,0);
        Arrays.fill(mostFrequent,'o');
        char elementX;
    
        for (int i = 0; i < words1.length; i++) {
            elementX = words1[i];
            int coX = 0;
    
            for (int j = 0; j < words1.length; j++) {
                if (words1[j]==words1[i]) { 
                    coX++;
                }
            }
    
            if (coX >= maxCount[0]) {
                if(mostFrequent[0]!=elementX){
                maxCount[0]=coX; 
                mostFrequent[0]=elementX;}
                
            }else{
                if(coX >= maxCount[1]){
                    if(mostFrequent[0]!=elementX){
                    maxCount[1]=coX; 
                mostFrequent[1]=elementX;}
    
                }else{
                    if(coX >= maxCount[2]){
                        if(mostFrequent[0]!=elementX){
                        maxCount[2]=coX; 
                        mostFrequent[2]=elementX;}
    
                    }else{
                        if(coX >= maxCount[3]){
                            if(mostFrequent[0]!=elementX){
                            maxCount[3]=coX; 
                            mostFrequent[3]=elementX;}
    
                        }else{
                            if(coX >= maxCount[4]){
                                if(mostFrequent[0]!=elementX){
                                maxCount[4]=coX; 
                                mostFrequent[4]=elementX;}
    
                        }
                    
                    }
                }
    
    
            }
        }
        }
        System.out.println("5 most frequent characters: " + Arrays.toString(mostFrequent));
    }
    
    public static void leastChar(String filecontent) {
        String filecontentspaceremoved = filecontent.replaceAll("\\s", "");
        char[] words1 = filecontentspaceremoved.toCharArray();
        char[] mostFrequent = new char[5]; 
        int[] maxCount= new int[5];
        Arrays.fill(maxCount,Integer.MAX_VALUE);
        Arrays.fill(mostFrequent,'o');
        char elementX;
       
    
        for (int i = 0; i < words1.length; i++) {
            elementX = words1[i];
            int coX = 0;
    
            for (int j = 0; j < words1.length; j++) {
                if (words1[j]==words1[i]) { 
                    coX++;
                }
            }
    
            if (coX < maxCount[0]) {
                if(mostFrequent[0]!=elementX){
                maxCount[0]=coX; 
                mostFrequent[0]=elementX;}
                
            }else{
                if(coX < maxCount[1]){
                    if(mostFrequent[0]!=elementX){
                    maxCount[1]=coX; 
                mostFrequent[1]=elementX;}
    
                }else{
                    if(coX < maxCount[2]){
                        if(mostFrequent[0]!=elementX){
                        maxCount[2]=coX; 
                        mostFrequent[2]=elementX;}
    
                    }else{
                        if(coX < maxCount[3]){
                            if(mostFrequent[0]!=elementX){
                            maxCount[3]=coX; 
                            mostFrequent[3]=elementX;}
    
                        }else{
                            if(coX < maxCount[4]){
                                if(mostFrequent[0]!=elementX){
                                maxCount[4]=coX; 
                                mostFrequent[4]=elementX;}
    
                        }
                    
                    }
                }
    
    
            }
        }
        }

        System.out.println("5 least frequent characters: " + Arrays.toString(mostFrequent));
    }
    

   
        
    
    public static void main(String[] args){
        String txt ="";
        try{
            File file=new File("C:/1/2/3/text.txt");
            Scanner sc=new Scanner(file);

            while(sc.hasNextLine()){
             String txt1=sc.nextLine();
             txt+=txt1;          
            }
        }catch(Exception e){
            System.out.println((e.getMessage()));

        }
          String file = txt;
          String filecontent =file.replaceAll("[,.]", "").toLowerCase();
          String[] words = filecontent.split("[\\s]+"); 


        wovelcounter(filecontent);
        mostword(filecontent,words);
        leastword(filecontent,words);
        mostChar(filecontent);
        leastChar(filecontent);

        
        



    }
}


