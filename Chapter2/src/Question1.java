/*
 * Given the following my.school.ClassRoom and my.city.School class definitions, which
line numbers in main() generate a compiler error? (Choose all that apply)
1: package my.school;
2: public class Classroom {
3: private int roomNumber;
4: protected String teacherName;
5: static int globalKey = 54321;
6: public int floor = 3;
7: Classroom(int r, String t) {
8: roomNumber = r;
9: teacherName = t; } }
1: package my.city;
2: import my.school.*;
3: public class School {
4: public static void main(String[] args) {
5: System.out.println(Classroom.globalKey);
6: Classroom room = new Classroom(101, ""Mrs. Anderson")
 */
public class Question1 {

}
