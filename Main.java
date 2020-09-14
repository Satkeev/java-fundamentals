public class Main{
    public static void main(String[] args){

        String name = pluralize("Hi", 1);
       System.out.println(name); 

    }
public static String pluralize(String noun, int num){
    if(num == 1){
        return noun;
    }
    noun = noun + "s";
    return noun;
}
}