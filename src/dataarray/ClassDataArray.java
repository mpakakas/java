/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataarray;

/**
 *
 * @author razor
 */
public class ClassDataArray {
        
          
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
        
        {System.out.println("Search Complete in " +j+ " entries ");}
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
           if( a[j].getmail().equals(searchmail)  )
             break;
            {System.out.println("found the entry");}
        if(j==nElems)                      // can't find it     
             return false;     
        else                               // found it     
           {     
           for(int k=j; k<nElems-1; k++)     // shift down     
              a[k] = a[k+1];     
           nElems--;                       // decrement size     
           System.out.println("Delete the entry in array");
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
 
     }

