package com.google.android.fhir.reference

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class PatientListFragmentDirections private constructor() {
  private data class NavigateToProductDetail(
    public val patientId: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.navigate_to_product_detail

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("patient_id", this.patientId)
      return result
    }
  }

  public companion object {
    public fun navigateToProductDetail(patientId: String): NavDirections =
        NavigateToProductDetail(patientId)

    public fun actionPatientListToAddPatientFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_patient_list_to_addPatientFragment)
  }
}
