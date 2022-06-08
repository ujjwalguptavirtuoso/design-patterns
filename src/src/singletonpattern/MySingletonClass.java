package singletonpattern;


/**
 * can be used for database connections, logger systems , rocketship guiding system
 */
public class MySingletonClass {

    private static MySingletonClass mySingletonClass;

    private MySingletonClass(){

    }

    public static MySingletonClass getInstance(){
        if(mySingletonClass == null){
            synchronized (MySingletonClass.class){
                mySingletonClass = new MySingletonClass();
            }
        }
        return mySingletonClass;
    }
}
