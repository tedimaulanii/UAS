// Generated by view binder compiler. Do not edit!
package com.google.android.fhir.reference.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.fhir.reference.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ObservationListViewBinding implements ViewBinding {
  @NonNull
  private final RecyclerView rootView;

  @NonNull
  public final RecyclerView observationList;

  private ObservationListViewBinding(@NonNull RecyclerView rootView,
      @NonNull RecyclerView observationList) {
    this.rootView = rootView;
    this.observationList = observationList;
  }

  @Override
  @NonNull
  public RecyclerView getRoot() {
    return rootView;
  }

  @NonNull
  public static ObservationListViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ObservationListViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.observation_list_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ObservationListViewBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    RecyclerView observationList = (RecyclerView) rootView;

    return new ObservationListViewBinding((RecyclerView) rootView, observationList);
  }
}
