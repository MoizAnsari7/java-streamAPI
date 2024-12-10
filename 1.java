//problem-1 :filter even number from an array with streams api
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class psp
{
public static void main(String args[])
{
//convert array to list
List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
System.out.println("Input numbers : " + number);

//stream opration with result as list of even numbers 
//use of filter method
List<Integer> evenNumber = number.stream().filter(n->n%2==0).collect(Collectors.toList()); 

//print output
System.out.println("filtered even numbers : " + evenNumber);
}
}