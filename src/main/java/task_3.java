// Дана строка: "0.3 + 1.56 = " подсчитать результат и добавить к строке.
public class task_3 {
        public static void main(String[] args) {
            String str = "0.3 + 1.56 = ";
            String[] str1 = str.split(" ");
            double num1 = Double.parseDouble(str1[0]);
            double num2 = Double.parseDouble(str1[2]);

            System.out.print(num1 + " + " + num2 + " = " + (num1+num2));
        }
}

