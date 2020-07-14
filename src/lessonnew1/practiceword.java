package lessonnew1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class practiceword {

    // Complete the camelcase function below.
    static int camelcase(String s) {
    char[] arr=s.toCharArray();
    int count=0;
    for(char c:arr) {
    if(c>='A'&&c<='Z') {
    count++;
    }
   }
    return count+1;
}
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        int result = camelcase(s);

     //outpath路径 把GitHub里那段删掉  直接写这句 直接打印结果
        System.out.println(result);
        
        
        scanner.close();
    }
}
