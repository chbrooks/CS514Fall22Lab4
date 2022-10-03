public class ArrayTest {

    public static void main(String[] args) {
        SafeIntArray sa = new SafeIntArray(10);
        for (int i = 0; i < 5; i++) {
            sa.add(i);
        }
      //  for (Integer item : sa) {
       //     System.out.println(item);
      //  }
    }

}
