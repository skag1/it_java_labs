public class ArrayAverage {
    public static void main(String[] args) {
        Object[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arrayAvg(arr, 5));
        }
        catch (IllegalArgumentException e){
            System.out.println("Все элементы массива должны быть числами");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Указанная длина выходит за пределы массива");
        }
    }
    public static double arrayAvg(Object[] arr, int len){
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if(arr[i] instanceof Integer) {
                sum += (int) arr[i];
            }
            else {
                throw new IllegalArgumentException();
            }
        }
        return (double) sum / len;
    }
}