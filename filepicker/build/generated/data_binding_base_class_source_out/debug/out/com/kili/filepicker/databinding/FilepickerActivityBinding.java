// Generated by data binding compiler. Do not edit!
package com.kili.filepicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.edmodo.cropper.CropImageView;
import com.kili.filepicker.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FilepickerActivityBinding extends ViewDataBinding {
  @NonNull
  public final CropImageView CropImageView;

  @NonNull
  public final TextView btnCancel;

  @NonNull
  public final TextView btnOk;

  @NonNull
  public final ConstraintLayout constraintLayout;

  protected FilepickerActivityBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CropImageView CropImageView, TextView btnCancel, TextView btnOk,
      ConstraintLayout constraintLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.CropImageView = CropImageView;
    this.btnCancel = btnCancel;
    this.btnOk = btnOk;
    this.constraintLayout = constraintLayout;
  }

  @NonNull
  public static FilepickerActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.filepicker_activity, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FilepickerActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FilepickerActivityBinding>inflateInternal(inflater, R.layout.filepicker_activity, root, attachToRoot, component);
  }

  @NonNull
  public static FilepickerActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.filepicker_activity, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FilepickerActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FilepickerActivityBinding>inflateInternal(inflater, R.layout.filepicker_activity, null, false, component);
  }

  public static FilepickerActivityBinding bind(@NonNull View view) {
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
  public static FilepickerActivityBinding bind(@NonNull View view, @Nullable Object component) {
    return (FilepickerActivityBinding)bind(component, view, R.layout.filepicker_activity);
  }
}
