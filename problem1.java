import java.util.Arrays; // Importing Arrays class to use the sort() method
import java.util.Scanner; // Importing Scanner class to take user input

public class problem1 // Class name must match file name if public
{
    public boolean containsDuplicate(int[] nums) 
    {
        Arrays.sort(nums); // Sort the array in ascending order

        for (int i = 1; i < nums.length; i++) 
        {
            if (nums[i] == nums[i - 1]) 
            {
                return true; // Duplicate found
            }
        }
        return false; // No duplicates
    }

     public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            
            int[] nums = new int[n];
            System.out.println("Enter " + n + " integer values:");
            for (int i = 0; i < n; i++)
            {
                nums[i] = sc.nextInt();
            }
            
            problem1 solution = new problem1(); // Use the same class name here
            boolean result = solution.containsDuplicate(nums);
            System.out.println(result);
        }
    }
}


/* This Java program is designed to determine whether any duplicate integers exist in a user-provided array. It begins by importing two essential classes: Arrays for sorting and Scanner for taking input 
from the user. The main class is named problem1, which matches the filename, as required when using a public class in Java. The key method, containsDuplicate, accepts an integer array, sorts it in ascending 
order using Arrays.sort(), and then iterates through the sorted array to check for any consecutive duplicate values. If such a duplicate is found, the method returns true; otherwise, it returns false. 
The main method starts by asking the user for the number of elements and then collects those integers into an array. It then creates an instance of the problem1 class and calls the containsDuplicate method 
with the user's input. The result (either true or false) is then printed directly, indicating whether any duplicate numbers were found in the array. This structure allows for a clean and efficient way to detect 
duplicates using sorting and a single pass through the data.
このJavaプログラムは、ユーザーが入力した配列に重複する整数が存在するかどうかを判定するために作成されています。
最初に、ソート処理のための `Arrays` クラスと、ユーザーからの入力を受け取るための `Scanner` クラスをインポートしています。
メインクラスの名前は `problem1` で、ファイル名と一致させる必要があります（`public` クラスを使用する際のJavaのルールです）。
中心となるメソッド `containsDuplicate` は整数の配列を引数に取り、`Arrays.sort()` を使って配列を昇順にソートし、隣接する要素を順番に比較して重複があるかを確認します。
もし同じ値が連続して見つかれば、`true` を返し、そうでなければ `false` を返します。`main` メソッドでは、最初に要素数をユーザーに尋ね、それらの整数を配列に格納します。
そして `problem1` クラスのインスタンスを生成し、`containsDuplicate` メソッドを呼び出します。最後に、戻り値（`true` または `false`）を出力し、配列内に重複があったかどうかを示します。
このプログラムは、ソートと1回の走査で効率的に重複を検出する構成になっています。*/ 
