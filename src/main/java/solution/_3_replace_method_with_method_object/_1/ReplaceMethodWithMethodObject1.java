package solution._3_replace_method_with_method_object._1;

public class ReplaceMethodWithMethodObject1 {
    private int six = 6;

    public void printNumberAndStatistics(int seven) {
        new MethodObject(this, seven).printNumberAndStatistics();
    }

    public int getSix() {
        return six;
    }

}