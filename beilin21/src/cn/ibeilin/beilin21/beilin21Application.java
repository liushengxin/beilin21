package cn.ibeilin.beilin21;

import com.avos.avoscloud.AVOSCloud;

import android.app.Application;

public class beilin21Application  extends Application {

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		// U need your AVOS key and so on to run the code.
		  AVOSCloud.initialize(this, "6qru9in7y91jlun3a7hkm761wihgycjh3l6lm9hv9xy3x0rz",
					"p4s3in2tdhks9giwldiu1zd399eqraa7koll384lxzko9mww");
	
	}
}
