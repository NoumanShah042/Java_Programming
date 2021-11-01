package DataTypes;

 
/*
  wrapper class =  provides a way to use primitive data types as reference data types
                    reference data types contain useful methods
                    can be used with collections (ex.ArrayList)


        primitive  //wrapper
        ---------  //-------
         boolean  Boolean
         char     Character
         int      Integer
         double    Double

        *******************************************************
        
         boxing =  the convertion of primitive datatype to wrapper class (reference data types)
         autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        
         unboxing =  Conversion of wrapper class to primitive. (the reverse of  boxing)
         unboxing = Aumatic  Conversion of wrapper class to primitive   (the reverse of autoboxing)


*/
public class WrapperClass {
     public static void main(String[] args) {
  
       
        Boolean a = true;  // that is autoboxing
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
  
        if(a==true)         //  unboxing i.e we can treat as if they are primitive
        {
            System.out.println("this is true");
        
        }
        
 }
}

 class WrapperDemo 
{
	public static void main(String[] args)
	{
		 
		 
		int i=5; // Primitive datatype
		Integer ii = new Integer(i); // Boxing - Wrapping
		         
                        
		int j = ii.intValue(); // unboxing - unwrapping
		
		Integer value = i; // AutoBoxing
		
		int k = value; // autounboxing
		
		 
		
		String str = "123";
		
		int n = Integer.parseInt(str);
                  
		System.out.println(n);
		
 
	}
}

