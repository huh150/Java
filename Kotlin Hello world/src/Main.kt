fun main()
{
   // Переменные с динамической типизацией //
   val A1 = 1;
   val B1 = "Hello world";
   val C1 = 'a';
   val G1 = 1.43;
   val AA1 = true;
   val mas1 = arrayOf(1,2,3,4,5,6);

   // Переменные без динамической типизацией //
    val A2: Int = 21;
    val B2: String = "Привет мир";
    val C2: Char = '1';
    val G2: Double = 1.234;
    val AA2: Boolean = true;
    val mas2: Array<Int> = arrayOf(1,3,4,2,5);

   println(B1 + " ," + B2);
}