package xiangxiao.togglebuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity{
    private ToggleButton tb;
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = (ToggleButton) findViewById(R.id.toggleButton1);
        image = (ImageView) findViewById(R.id.imageView1);

        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                /*
                tb 被点击的时候,这个函数会运行
                buttonView---当前的这个button
                isChecked---是否checked
                 */
                if (isChecked) {
                    image.setBackgroundResource(R.drawable.on);
                } else {
                    image.setBackgroundResource(R.drawable.off);
                }
            }
        });
    }
}
