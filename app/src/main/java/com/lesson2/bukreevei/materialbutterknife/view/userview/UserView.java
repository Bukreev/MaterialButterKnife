package com.lesson2.bukreevei.materialbutterknife.view.userview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.textfield.TextInputEditText;
import com.lesson2.bukreevei.materialbutterknife.R;
import com.lesson2.bukreevei.materialbutterknife.view.userview.callback.UserViewCallBackInterface;

import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnTextChanged;

/**
 * TODO: document your custom view class.
 */
public class UserView extends LinearLayout implements UserViewCallBackInterface {


    @BindView(R.id.material_text_button)
    Button material_text_button;
    @BindView(R.id.user_name)
    TextInputEditText user_name;
    @BindView(R.id.user_email)
    TextInputEditText user_email;
    @BindView(R.id.user_phone)
    TextInputEditText user_phone;

    public UserView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        material_text_button.setEnabled(false);
        LayoutInflater.from(context).inflate(R.layout.user_view, this);

        setOrientation(VERTICAL);
    }

    @Override
    public void buttonCallback() {

    }

    @OnTextChanged({R.id.user_name, R.id.user_email, R.id.user_phone})
    public void textChangeCallBack() {
        if (user_name.getTextSize() > 0 && user_email.getTextSize() > 0 && user_phone.getTextSize() > 0)
            material_text_button.setEnabled(true);
    }

    @OnClick(R.id.material_text_button)
    public void setButtonCallBack() {

    }


}
