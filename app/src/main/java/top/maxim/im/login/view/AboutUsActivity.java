
package top.maxim.im.login.view;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import im.floo.floolib.BMXClient;
import top.maxim.im.BuildConfig;
import top.maxim.im.R;
import top.maxim.im.bmxmanager.BaseManager;
import top.maxim.im.common.base.BaseTitleActivity;
import top.maxim.im.common.view.Header;

/**
 * Description : 关于我们 Created by Mango on 2018/11/06
 */
public class AboutUsActivity extends BaseTitleActivity {

    private TextView mAppVersion;

    private TextView mFlooVersion;

    public static void startAboutUsActivity(Context context) {
        Intent intent = new Intent(context, AboutUsActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected Header onCreateHeader(RelativeLayout headerContainer) {
        Header.Builder builder = new Header.Builder(this, headerContainer);
        builder.setTitle(R.string.about_us);
        builder.setBackIcon(R.drawable.header_back_icon, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        return builder.build();
    }

    @Override
    protected View onCreateView() {
        View view = View.inflate(this, R.layout.activity_about_us, null);
        mAppVersion = view.findViewById(R.id.tv_app_version);
        mFlooVersion = view.findViewById(R.id.tv_floo_version);
        return view;
    }

    @Override
    protected void initDataForActivity() {
        // 获取app版本
        String versionName = BuildConfig.VERSION_NAME;
        mAppVersion.setText("MaxIM Version:" + versionName);
        BMXClient client = BaseManager.getBMXClient();
        String sdkVersion = "";
        if (client != null && client.getSDKConfig() != null && !TextUtils.isEmpty(client.getSDKConfig().getSDKVersion())) {
            sdkVersion = client.getSDKConfig().getSDKVersion();
        }
        mFlooVersion.setText("FlooSDK Version:" + sdkVersion);
    }
}
