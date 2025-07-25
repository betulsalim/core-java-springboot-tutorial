public class Substraction {
    public float Substraction(float a, float b){
        float result = 0;
        if(a>b){
            result = a - b;
        }
        else{
            result = b - a;
        }
        System.out.println(result);
        return result;
    }
}
