public class calculator {

    int a;
    int b;
    char action;

String res;

public static void printCallc(){
    System.out.println("This is a calculator");
}

//public void calc(int a, int b,char action){
public void calc(){
//    a=9; b=3;

    switch (action){
        case '+': res = String.valueOf( this.a  = this.b); break;
    case '-': res = String.valueOf( this.a  - this.b); break;
    case '*': res = String.valueOf( this.a  * this.b); break;
    case '/': res = String.valueOf( this.a  / this.b); break;

    }
    System.out.println(res);

}
}
