// Generated by data binding compiler. Do not edit!
package com.example.egone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.egone.People;
import com.example.egone.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final Button btn1;

  @NonNull
  public final EditText edTxt1;

  @NonNull
  public final EditText edTxt2;

  @NonNull
  public final TextView txt1;

  @NonNull
  public final TextView txt2;

  @Bindable
  protected People mPeople;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btn1, EditText edTxt1, EditText edTxt2, TextView txt1, TextView txt2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btn1 = btn1;
    this.edTxt1 = edTxt1;
    this.edTxt2 = edTxt2;
    this.txt1 = txt1;
    this.txt2 = txt2;
  }

  public abstract void setPeople(@Nullable People people);

  @Nullable
  public People getPeople() {
    return mPeople;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, R.layout.activity_main);
  }
}
