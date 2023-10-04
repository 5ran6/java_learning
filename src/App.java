
import package1.HowAreYou;
import package2.DummyClass;

public class App {
    public static void main(String[] args) throws Exception {
        HowAreYou doll_baby = new HowAreYou();

        String response = doll_baby.sayHowAreThey();
        System.out.println("x is " + response);


        DummyClass dummy = new DummyClass();
        String dummyResponse = dummy.sayIamDummy();
        System.out.println("dummyResponse is " + dummyResponse);

    }
}

//public = can be used by any other class
//private = can only be used by the class it is in
//protected = can only be used by classes in the same package



// JAVA KEYWORDS

// while
// do
// for
// if
// else
// class
// package
// private
// protected
// public
// import


// switch
// case
// break
// continue
// default
// try
// catch
// finally
// throw
// throws

// interface
// abstract


