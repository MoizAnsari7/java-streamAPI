//find out number greater then certain value
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
class psp
{
public static void main(String args[])
{
//number array for input
List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
System.out.println("Input numbers : " + number);
int threshold = 5;


//output processing with stream() and filter() function
List<Integer> outputNumber = number.stream().filter( n-> n > threshold).collect(Collectors.toList());

System.out.println("Output numbers : "+ outputNumber);
}
}