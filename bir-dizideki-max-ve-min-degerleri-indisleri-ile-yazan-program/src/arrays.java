public class arrays {
    public static void main(String[]args){
        int [][] sayilar={{15,23,86},
                {39,254,90},
                {8879,1,9}};

        int min=sayilar[0][0];
        int max=sayilar[0][0];
        int minRow=0;
        int minCol=0;
        int maxRow=0;
        int maxCol=0;

        for (int i=0;i< sayilar.length;i++){
            for (int j=0;j< sayilar[i].length;j++){
                if (sayilar[i][j]<min){
                    min=sayilar[i][j];
                    minRow=i;
                    minCol=j;
                }
                if (sayilar[i][j]>max){
                    max=sayilar[i][j];
                    maxRow=i;
                    maxCol=j;}
            }
        }
        System.out.println("min sayı:"+min+" "+"indeks:"+"["+minRow+"]"+"["+minCol+"]");
        System.out.println("max sayı:"+max+" "+"indeks:"+"["+maxRow+"]"+"["+maxCol+"]");

    }
}
