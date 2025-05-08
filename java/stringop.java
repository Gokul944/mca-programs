import java.util.*;
class stringop
{
public static void main(String args[])
{
ArrayList<String>st=new ArrayList<>();
Scanner sc=new Scanner(System.in);
st.add("Apple");
st.add("Pineapple");
st.add("Orange");
System.out.println("Initial list:"+st);
System.out.println("Enter a string to add:");
String input=sc.nextLine();
st.add(input);
System.out.println("List after adding the string:"+st);
st.remove("Pineapple");
System.out.println("List after removing 'Pineapple':"+st);
Collections.sort(st);
System.out.println("Initial list:"+st);
System.out.println("Enter a string to search:");
String search=sc.nextLine();
if(st.contains(search))
{
System.out.println(search+ " is in the list");
}
else
{
System.out.println(search+ " is not in the list");
}
System.out.println("Total number of elements is:"+st.size());
}
}
