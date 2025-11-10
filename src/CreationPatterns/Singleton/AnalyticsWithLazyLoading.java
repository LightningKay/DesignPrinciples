package CreationPatterns.Singleton;

public class AnalyticsWithLazyLoading {

    public static AnalyticsWithLazyLoading analytics;

    private AnalyticsWithLazyLoading(){

    }
    public static AnalyticsWithLazyLoading getInstance(){
        if(analytics == null){
            analytics = new AnalyticsWithLazyLoading();
        }
        return analytics;
    }
}
