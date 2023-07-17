import java.util.Scanner;
public class AntiDiagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int array[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=sc.nextInt();
            }
        }
        antiDiagonal(array,n);
    }
    static void antiDiagonal(int array[][],int n){
        int i;
        int j;
        for(int x=0;x<n;x++){
            i=0;j=x;
            while (i<=n&&j>=0){
                System.out.print(array[i][j]+" ");
                i++;
                j--;
            }
            System.out.println();
        }
        for(int y=1;y< n;y++){
            i=y;j=n-1;
            while (i<n&&j>=0){
                System.out.print(array[i][j]+" ");
                i++;
                j--;
            }
            System.out.println();
        }
    }
}