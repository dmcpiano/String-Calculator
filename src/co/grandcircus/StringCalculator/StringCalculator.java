// Worked with Sienna

package co.grandcircus.StringCalculator;

import java.lang.reflect.Array;

public class StringCalculator {


public static String add(String number) {

	StringCalculator sum = new  StringCalculator();
	 
	if (number.equals("")) {
		return "0";
	} else if (number.matches("\\d")) {
		return number;

	} else if (number.matches("\\d,\\d")) {

		String[] num = number.split(",");
		int firstNum = (Integer.parseInt(num[0]));
		int secondNum = (Integer.parseInt(num[1]));
		int result1 = firstNum + secondNum;
		String num2 = Integer.toString(result1);
		return num2;
	} else if (number.contains(",")){
        return sum(splitNumbers(number));
	
	}
	return number;
}
private static String[] splitNumbers(String numbers){
  return numbers.split(",");
}
private static int toInt(String number) {
return Integer.parseInt(number);
}

private static String sum(String[] numbers){
  int total = 0;
  for(String number : numbers){
    total += toInt(number);
  }
  return Integer.toString(total);
}


}