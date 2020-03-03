package ShiftZero;
import java.io.*;
import java.util.*;
public class zeroes_to_end
{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int size=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            String [] intarr=s.split(" ");
            int []arr=new int[size];
            int k=0;
            for(int i=0;i<intarr.length;i++)
            {
                int p=Integer.parseInt(intarr[i]);
                if(p!=0)
                {
                    arr[k]=p;
                    k++;

                }
            }
            for(int j=0;j<size;j++)
            {
                System.out.print(arr[j]+" ");
            }
        }
    }


