import java.util.Scanner;
public class Problem2 
{
    public void moveZeroes(int[] nums) 
    {
        int left = 0;
        for (int right = 0; right < nums.length; right++) 
        {
            if (nums[right] != 0) 
            {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");// Input array size
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");// Input array elements
        for (int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        Problem2 solution = new Problem2();// Create object and call method
        solution.moveZeroes(nums);

        System.out.println("After moving zeroes to the end:");// Output
        for (int num : nums) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


/*This Java code moves all zeroes in an array to the end while preserving the order of the non-zero elements. It uses a two-pointer technique with left and right indices. As the right pointer scans each 
element of the array, whenever it finds a non-zero value, it swaps it with the element at the left index and increments left. This way, non-zero elements are brought to the front in order, and zeroes are 
automatically pushed to the end. Importantly, this operation is performed in-place, meaning no new copy of the array is created, which makes the solution memory efficient. Instead of using a secondary 
array to rearrange the elements, the original array is modified directly using index-based swapping.
このJavaコードは、配列内のすべてのゼロを末尾に移動しながら、ゼロ以外の要素の順序を保持します。
この処理では、left と right の2つのインデックスを使ったツーポインタ手法を使用しています。
right ポインタが配列の各要素をスキャンし、ゼロ以外の値を見つけるたびに、それを left インデックスの要素と交換し、left をインクリメントします。
このようにして、ゼロ以外の要素は順序通りに前方に移動し、ゼロは自動的に配列の末尾に押し出されます。
重要なのは、この操作がインプレースで行われているという点です。つまり、新しい配列のコピーは作成されておらず、メモリ効率の良い解決法となっています。
要素の並べ替えに新しい配列を使う代わりに、元の配列をインデックスベースのスワップによって直接変更しています。*/
