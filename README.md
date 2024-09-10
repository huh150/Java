<h1 align="center">Домашняя работа</h1>
<p align="center" > Объявление переменных , ввод и вывод данных Java </p>
<p>Переменная в программировании – это именованная область памяти, предназначенная 
            для хранения данных. По сути, это абстрактный контейнер, 
            в который мы можем поместить различные значения: числа, 
            тексты, логические выражения и многое другое. 
            Эти значения могут изменяться в процессе выполнения 
            программы, отсюда и название "переменная".</p>

**Объявление переменных в Java:** `Тип данных название переменной = значение;`  
  
**Пример** `int A = 10;`

 **Типы данных в Java**
   * целые числа (byte, short, int, long);</p>
   * числа с плавающей точкой (float, double);</p>
   * логический (boolean);</p>
   * символьный (char).</p>



**ввод и вывод данных в Java:**

*вывод данных в Java:*

```java
  public class Main {

    public static void main(String[] args) {

        System.out.println("Привет, мир!");
        System.out.println("Пока, мир...");
    }
}
```
*Ввод данных в Java:*

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите любой номер: ");
        int num = in.nextInt();

        System.out.printf("Ваш номер: %d \n", num);
        in.close();
    }
}
```
