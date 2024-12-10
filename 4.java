//find out number less then certain value
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class psp
{
public static void main(String args[])
{
List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10,-2);
System.out.println("input numbers : "+ number);
int threshold = 6;
List<Integer> outputNumber = number.stream().filter(n->n<threshold).collect(Collectors.toList());
System.out.println("output number : "+ outputNumber);
}
}