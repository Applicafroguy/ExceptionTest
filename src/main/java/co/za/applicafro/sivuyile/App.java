package co.za.applicafro.sivuyile;

/**
 * Hello world!
 *
 */
public class App 
{
    public App(String name) {
        if(name == null){
            throw new NullPointerException();
        }

        System.out.print("I am not null: "+ name);
    }

    public static void main(String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
