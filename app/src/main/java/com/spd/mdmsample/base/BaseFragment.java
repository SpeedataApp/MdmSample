package com.spd.mdmsample.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * @author :Reginer in  2017/9/18 13:10.
 * 联系方式:QQ:282921012
 * 功能描述:所有的Fragment父类.
 */
public abstract class BaseFragment extends Fragment {
    protected Context mContext;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getLayoutId(), container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view, savedInstanceState);
    }

    /**
     * 获取布局id
     *
     * @return layoutId
     */
    @LayoutRes
    protected abstract int getLayoutId();

    /**
     * 初始化
     *
     * @param view               view
     * @param savedInstanceState {{@link #onCreate(Bundle)}}
     */
    protected abstract void initView(View view, @Nullable Bundle savedInstanceState);
}
