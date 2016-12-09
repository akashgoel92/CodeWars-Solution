public class Accumul {
    
    public static String accum(String s) {
     // your code
       String[] ch = new String[s.length()];
       String result = "";
       
       for(int i=0; i<s.length(); i++){
         ch[i]=String.valueOf(s.charAt(i));
       }
       
       for(int i=0; i<s.length(); i++){
         for(int j=-1; j<i; j++){             
           if(j==-1){
             result+=ch[i].toUpperCase( );
           }
           else{
              result+=ch[i].toLowerCase();
           }
         }
         if(i<(s.length())-1){
           result+="-";
         }
       }
       
       System.out.println(result);
       
       return result;
    }
}
