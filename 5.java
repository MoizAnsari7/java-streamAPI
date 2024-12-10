//find all the even number in array and arrange them in ascending order
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class psp
{
public static void main(String args[])
{
List<Integer> number = Arrays.asList(55,34,78,79,23,14,37,-55,34,135,88,-46);
System.out.println("input number : "+ number);

List<Integer> outputNumber = number.stream().filter(n->n%2==0).sorted((a,b)->a-b).collect(Collectors.toList());

System.out.println("output number : "+ outputNumber);
}
}