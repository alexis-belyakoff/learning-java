/**
 * Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
 *               byte	short	char	int 	long	float	double	boolean
 *      byte
 *      short
 *      char
 *      int
 *      long
 *      float
 *      double
 *      boolean
 *
 *      На пересечении напишите следующие фразы:
 *      ня (неявное) – если преобразование происходит автоматически,
 *      я (явное) – если нужно использовать явное преобразование,
 *      х – если преобразование невозможно,
 *      т  - если преобразование тождественно.
 *      Внимание! используйте System.out.printLn
 */


public class Task5 {
    public static void main(String[] args) {
        System.out.println("          byte short char int long float double boolean");
        System.out.println("byte      т    ня    я   ня   ня   ня    ня      х");
        System.out.println("short     я    т     я   ня   ня   ня    ня      х");
        System.out.println("char      я    я     т   ня   ня   ня    ня      х");
        System.out.println("int       я    я     я   т    ня   ня    ня      х");
        System.out.println("long      я    я     я   я    т    ня    ня      х");
        System.out.println("float     я    я     я   я    я    т     ня      х");
        System.out.println("double    я    я     я   я    я    я     т       х");
        System.out.println("boolean   х    х     х   х    х    х     х       т");
    }
}
