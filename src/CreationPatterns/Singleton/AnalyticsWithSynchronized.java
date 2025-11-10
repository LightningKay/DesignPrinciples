package CreationPatterns.Singleton;

public class AnalyticsWithSynchronized {

    private static AnalyticsWithSynchronized analytics;

    private AnalyticsWithSynchronized(){

    }
    public static synchronized AnalyticsWithSynchronized getInstance(){
        if(analytics == null){
            analytics = new AnalyticsWithSynchronized();
        }

        return analytics;
    }

    public static AnalyticsWithSynchronized getInstanceDoubleChecking(){
        if(analytics == null){
            synchronized (AnalyticsWithSynchronized.class){
                if(analytics == null){
                    analytics = new AnalyticsWithSynchronized();
                }
            }
        }

        return analytics;
    }

}
