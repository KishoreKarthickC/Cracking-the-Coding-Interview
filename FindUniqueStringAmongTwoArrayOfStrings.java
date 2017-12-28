import java.util.*;
import java.lang.*;
import java.io.*;

class FindDuplicateinStringArray
{
     public static String unique(String[] x, String[] y)	{
        TreeMap<String, Integer> hm = new TreeMap<>();
         for(int i=0;  i < x.length; i++)
          {
         	hm.put(x[i], (!hm.containsKey(x[i]))?1:hm.get(x[i])+1);
          }
        for(int j=0; j < y.length; j++)
        {
           hm.put(y[j], (!hm.containsKey(y[j]))?1:hm.get(y[j])+1);	
        }
        String ans = "";
        for(Map.Entry<String, Integer> map : hm.entrySet())
        {
        	if(map.getValue() == 1)
        	{
        		ans += map.getKey() + " ";
        	}
        	
        }
        return ans;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		String x[] = {"ABC", "DEF", "MNO", "ABC"};
		String y[] = {"ABC", "DEF"};
		System.out.println("The unique string is " + unique(x,y));
	}
}