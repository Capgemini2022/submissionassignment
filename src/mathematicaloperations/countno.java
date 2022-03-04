package mathematicaloperations;

public class countno {

	public static void main(String[] args) {
		int count=0;  
	      
        char ch[]= new char[String.length()];     
        for(int i=0;i<String.length();i++)  
        {  
            ch[i]= String.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count;  
    }  
  public static void main(String[] args) {  
      String string ="    India Is My Country";  
     System.out.println(wordcount(String) + " words.");   
}  


	}


