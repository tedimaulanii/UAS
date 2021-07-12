// Generated by view binder compiler. Do not edit!
package com.google.android.fhir.reference.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.fhir.reference.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PatientListContentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView dob1;

  @NonNull
  public final TextView gender1;

  @NonNull
  public final TextView idText1;

  @NonNull
  public final TextView name1;

  private PatientListContentBinding(@NonNull LinearLayout rootView, @NonNull TextView dob1,
      @NonNull TextView gender1, @NonNull TextView idText1, @NonNull TextView name1) {
    this.rootView = rootView;
    this.dob1 = dob1;
    this.gender1 = gender1;
    this.idText1 = idText1;
    this.name1 = name1;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PatientListContentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PatientListContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.patient_list_content, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PatientListContentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dob1;
      TextView dob1 = rootView.findViewById(id);
      if (dob1 == null) {
        break missingId;
      }

      id = R.id.gender1;
      TextView gender1 = rootView.findViewById(id);
      if (gender1 == null) {
        break missingId;
      }

      id = R.id.id_text1;
      TextView idText1 = rootView.findViewById(id);
      if (idText1 == null) {
        break missingId;
      }

      id = R.id.name1;
      TextView name1 = rootView.findViewById(id);
      if (name1 == null) {
        break missingId;
      }

      return new PatientListContentBinding((LinearLayout) rootView, dob1, gender1, idText1, name1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
