public class tamgiac {

    public static String triangleType(int a, int b, int c) {
        if((a + b <= c) && (a + c <= b) && (b + c <= a) &&
        (a <= 0) && (b <= 0) && (c <= 0)){
            return "NotATriangle";
        } else if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isosceles";
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "RightTriangle";
        } else {
            return "Scalene";
        }
    }
}