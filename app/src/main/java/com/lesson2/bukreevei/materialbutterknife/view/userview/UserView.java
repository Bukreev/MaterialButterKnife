package com.lesson2.bukreevei.materialbutterknife.view.userview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.google.android.material.textfield.TextInputEditText;
import com.lesson2.bukreevei.materialbutterknife.R;
import com.lesson2.bukreevei.materialbutterknife.view.userview.callback.UserViewInterface;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnTextChanged;

/**
 * TODO: document your custom view class.
 */
public class UserView extends LinearLayout implements UserViewInterface {


    @BindView(R.id.user_name)
    protected TextInputEditText mUserName;
    @BindView(R.id.user_email)
    protected TextInputEditText mUserEmail;
    @BindView(R.id.user_phone)
    protected TextInputEditText mUserPhone;

    private final UserViewInterface binding;

    public UserView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.sample_user_view, this, true);
        setOrientation(VERTICAL);
    }

    public void bind() {
        bind
    }

    @OnTextChanged({R.id.user_name, R.id.user_email, R.id.user_phone})
    protected void onTextChange() {
        if (textCallBack != null) {
            textCallBack.textChangeCallBack();
        }
    }

    @Override
    public void buttonCallback() {

    }

    @Override
    public void textChangeCallBack() {

    }


}
