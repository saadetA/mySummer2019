package day62_Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public interface ListInterface {
//List<Integer>list1=new List<>();listten obj uretilmez interface

	 public static void main(String[] args) {
	        
		    //  List<Integer> list1 = new List<>();
		        
		        List<Integer> list2 = new ArrayList<>();
		        List<String> list3 = new LinkedList<>();
		        List<Double> list4 = new Vector<>();
		        
		        ArrayList<Integer> arraylist = new ArrayList<>();
		                arraylist.add(10);
		                arraylist.add(20);
		                arraylist.add(30);
		                arraylist.remove(1);
		                
		        System.out.println(arraylist);
		                
		    
		        LinkedList<Integer> linkedlist = new LinkedList<>();
		                    linkedlist.add(10);
		                    linkedlist.add(20);
		                    linkedlist.add(30);
		                    linkedlist.remove(1);
		                    
		            System.out.println(linkedlist);
		        
		        System.out.println("============================");
		        
		        String[] arr = {"A","B","B"};
		        
		    List<String> NotLinked = new ArrayList<>(Arrays.asList(arr));
		        
		    List<String> linked = new LinkedList<>(Arrays.asList(arr));
		        
		        System.out.println(NotLinked);
		        
		        
		        Vector<Integer> vt = new Vector<Integer>();
		                vt.add(2);
		        System.out.println(vt);
		        
		                
		System.out.println("============================");   
		        Stack<Integer> st =new Stack<Integer>();
		            st.add(1);
		            st.add(2);
		            st.add(3);
		            st.add(4);
		           st.add(5);
		            System.out.println(st);
		            
		            System.out.println( st.pop() );  // LIFO
		        
		            System.out.println(st); 
		            
		           System.out.println( st.pop() ); 
		            System.out.println(st);
		        
		    }
		    
		    
		    // arraylist:
		  //  public void add1(int a) {
		        
		 //   }
		    
		    // vector
		  //  public synchronized void add2() {
		        
		    }
		    



