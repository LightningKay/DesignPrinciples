package CreationPatterns.Singleton;

public class AnalyticsWithBillPurghTechnique {


    private AnalyticsWithBillPurghTechnique(){

    }
    private static class Holder {
        private static final AnalyticsWithBillPurghTechnique analytics = new AnalyticsWithBillPurghTechnique();
    }


    private AnalyticsWithBillPurghTechnique getInstance(){
        return Holder.analytics;
    }
}
