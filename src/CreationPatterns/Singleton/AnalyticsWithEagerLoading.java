package CreationPatterns.Singleton;

public class AnalyticsWithEagerLoading {

    private static final AnalyticsWithEagerLoading analytics = new AnalyticsWithEagerLoading();

    private AnalyticsWithEagerLoading(){

    }
    public static AnalyticsWithEagerLoading getInstance(){
        return analytics;
    }

}
