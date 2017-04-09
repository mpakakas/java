/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataarray;
// classDataArray.java     
  // data items as class objects    
import java.util.*;
import java.util.concurrent.*;

 
  // to run this program: C>java DataArray       
  ////////////////////////////////////////////////////////////////    

/**
 *
 * @author Sotiris
 */
class Person     
     { 

    /**
     * @param args the command line arguments
     */
     private String lastName;     
     private String firstName;     
     private int age;
     private String personmail;
 
     //---------------------------------------------------------- 
 
     public Person(String last, String first, int a, String email)     
        {                               // constructor     
        lastName = last;     
        firstName = first;     
        age = a;
        personmail = email;
        }     
 
     //----------------------------------------------------------
 
     public void displayPerson()     
        {     
        System.out.print("   Last name: " + lastName);     
        System.out.print(", First name: " + firstName);     
        System.out.print(", Age: " + age);
        System.out.println(",Email:" + personmail);
        
        }     
 
     //---------------------------------------------------------- 
 
     public String getmail()           // get last name     
        { return personmail; }     
     }  // end class Person     
 
  ////////////////////////////////////////////////////////////////    
 
/*  class ClassDataArray     
     {     
     private Person[] a;               // reference to array     
     private int nElems;               // number of data items     
 
     //---------------------------------------------------------- 
 
     public ClassDataArray(int max)    // constructor     
        {     
        a = new Person[max];               // create the array     
        nElems = 0;                        // no items yet     
        }     
 
     //---------------------------------------------------------- 
 
     public Person find(String searchemail)     
        {                              // find specified value     
        int j;     
        for(j=0; j<nElems; j++)            // for each element,     
           if( a[j].getmail().equals(searchemail) )  // found item? 
 
 
              break;                       // exit loop before end 
 
        if(j == nElems)                    // gone to end?     
           return null;                    // yes, can't find it    
        else     
           return a[j];                    // no, found it     
        }  // end find()     
 
     //---------------------------------------------------------- 
                                       // put Person into array     
     public void insert(String last, String first, int age, String email)     
        {     
        a[nElems] = new Person(last, first, age, email);     
        nElems++;                          // increment size     
        }     
 
     //----------------------------------------------------------

     public boolean delete(String searchmail)     
        {                              // delete Person from array 
 
        int j;     
        for(j=0; j<nElems; j++)            // look for it     
           if( a[j].getmail().equals(searchmail) )     
              break;     
        if(j==nElems)                      // can't find it     
           return false;     
        else                               // found it     
           {     
           for(int k=j; k<nElems-1; k++)     // shift down     
              a[k] = a[k+1];     
           nElems--;                       // decrement size     
           return true;     
           }     
        }  // end delete()     
 
     //---------------------------------------------------------- 
 
     public void displayA()            // displays array contents    
        {     
        for(int j=0; j<nElems; j++)    // for each element,     
           a[j].displayPerson();       // display it     
        }     
 
     //---------------------------------------------------------- 
 
     }  // end class ClassDataArray     
 
  ////////////////////////////////////////////////////////////////    
 */
  class DataArray     
     {     
     public static void main(String[] args)     
        {     
        int maxSize = 10;             // array size     
        ClassDataArray arr;            // reference to array     
        arr = new ClassDataArray(maxSize);  // create the array                                            // insert 10 items     
        arr.insert("Papakonstantinou", "Stelios", 35, "stelios@example.com");
        arr.insert("Smith", "Lorraine", 37, "lorra@example.com");
        arr.insert("Yee", "Tom", 43, "tom.yee@example.com");     
        arr.insert("Adams", "Henry", 63, "henr@example.com");     
        arr.insert("Hashimoto", "Sato", 21, "satohashi@example.com");     
        arr.insert("Stimson", "Henry", 29, "henstim@example.com");     
        arr.insert("Velasquez", "Jose", 72, "jvela@example.com");     
        arr.insert("Lamarque", "Henry", 54, "hlam@example.com");     
        arr.insert("Vang", "Minh", 22, "mvan@example.com");     
        arr.insert("Creswell", "Lucinda", 79, "luciwell@example.com");     
        
        arr.displayA();                // display items     
        
        String searchKey = "Stimson";  // search for item 
        String searchkeyScan = ""; 
        Scanner scan = new Scanner(System.in);
        System.out.println("Παρακαλώ εισάγετε email για αναζήτηση και διαγραφή");
        String s = scan.next();
        searchkeyScan = s;
        searchKey = searchkeyScan;
        
        
        Person found;     
        found=arr.find(searchKey);
        
        if(found != null)     
           {     
           //System.out.println("Found !=null ,trexw thn found.displayPerson");     
           found.displayPerson(); 
           System.out.println("time to delete it");
            boolean delete = arr.delete(searchKey);
           }     
        else     
           System.out.println("Can't find email in any user matching: |" + searchKey+ " : email" );     
        
        System.out.println("Now printing what the array looks now" );     
        //arr.delete("Smith");           // delete 3 items     
        //arr.delete(searchKey);     
        //arr.delete("Creswell");     
        
        arr.displayA();                // display items again     
        }  // end main()     
 
     }  // end class DataArray     

