import java.util.Arrays;

public class Three_MergerSort {
    public static void main(String[] args) {
        //测试
        int[] arr = {3,1,4,1,5,9,2,6};
        int low=0;
        int high=arr.length-1;
        Mergesort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }

    private static void Mergesort(int[] a, int low, int high) {
        if(low<high) {
            //找中间值
            int mid=(low+high)>>1;
            Mergesort(a,low,mid);
            Mergesort(a,mid+1,high);
            Merge(a,low,mid,high);
        }
    }
    /**
     * @Description: 合并
     * @Param: [a, low, mid, high]
     * @return: void
     */
    private static void Merge(int[] a, int low, int mid, int high) {
        int b[]=new int[a.length];
        int i,j,k;
        for (k = low; k <= high; k++) {
            b[k]=a[k];
        }
        for(i=low,j=mid+1,k=i;i<=mid&&j<=high;k++) {
            if(b[i]<=b[j]) {
                a[k]=b[i];
                i++;
            }
            else {
                a[k]=b[j];
                j++;
            }
        }
        while(i<=mid) a[k++]=b[i++];
        while(j<=high) a[k++]=b[j++];
    }
}
