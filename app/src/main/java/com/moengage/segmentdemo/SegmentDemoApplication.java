package com.moengage.segmentdemo;

import android.app.Application;

import com.segment.analytics.Analytics;
import com.segment.analytics.android.integrations.moengage.MoEngageIntegration;

/**
 * @author Umang Chamaria
 */
public class SegmentDemoApplication extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    Analytics analytics = new Analytics.Builder(getApplicationContext(),
            "xMESvGwLPeCwurQ4yY9fv3iaHlredqVC")//use your own write key
    .logLevel(Analytics.LogLevel.VERBOSE)// should be added only in debug builds. Make sure this
    // is removed before a signed apk is generated.
    .use(MoEngageIntegration.FACTORY)//enable MoEngage integration
    .build();

    Analytics.setSingletonInstance(analytics);//recommended as creating a new instance every time
    // is expensive in terms of resources used

  }
}
