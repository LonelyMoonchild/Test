package com.xiao.fibonacci;

public class FibonacciNumberMain {
    /*
     * a0 = a1 = 1
     * an = an-1 + an-2 (n > 1)
     */
     
    public final static int MAX = 20;
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int[] list = new int[MAX];
        for(int i=0; i<MAX; i++){
            
            if(i==0 || i==1){
                list[i] = 1;
            }else{
                list[i] = list[i-1]+list[i-2];
            }
            System.out.println(list[i]);
        }
    }
}
