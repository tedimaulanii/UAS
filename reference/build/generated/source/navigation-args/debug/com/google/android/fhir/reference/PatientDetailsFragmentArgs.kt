package com.google.android.fhir.reference

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class PatientDetailsFragmentArgs(
  public val patientId: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("patient_id", this.patientId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): PatientDetailsFragmentArgs {
      bundle.setClassLoader(PatientDetailsFragmentArgs::class.java.classLoader)
      val __patientId : String?
      if (bundle.containsKey("patient_id")) {
        __patientId = bundle.getString("patient_id")
        if (__patientId == null) {
          throw IllegalArgumentException("Argument \"patient_id\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"patient_id\" is missing and does not have an android:defaultValue")
      }
      return PatientDetailsFragmentArgs(__patientId)
    }
  }
}
