//problem-2 :filter odd number from an array with streams api
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class psp
{
public static void main(String args[])
{
//Convert array to list
List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
System.out.println("Input numbers : " + number);

//stream opration with result as list of odd numbers 
//use of filter method
List<Integer> oddNumber = number.stream().filter( (n)->n%2!= 0).collect(Collectors.toList());

//print output
System.out.println("odd numbers : " + oddNumber);
}
}