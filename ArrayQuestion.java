import java.util.*;
public class ArrayQuestion
{
    public static void main(String[] args)
    {
        String[] l1 = {"x1", "y1", "z1"};
        String[] l2 = {"x2", "y2", "z2"};
        String[] l3 = new String[l1.length + l2.length];
        int i = 0, j = 0;
        for (int k = 0; k < l3.length; k++) {
            l3[k] = k % 2 == 0 ? l1[i++] : l2[j++];
        }
        System.out.println(Arrays.toString(l3)); // Output: [x1, x2, y1, y2, z1, z2]

    }




}
