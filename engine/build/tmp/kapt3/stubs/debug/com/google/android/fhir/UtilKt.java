package com.google.android.fhir;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\bH\u0001\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\t"}, d2 = {"logicalId", "", "Lorg/hl7/fhir/r4/model/Resource;", "getLogicalId", "(Lorg/hl7/fhir/r4/model/Resource;)Ljava/lang/String;", "isUploadSuccess", "", "toTimeZoneString", "Ljava/util/Date;", "engine_debug"})
public final class UtilKt {
    
    /**
     * Utility function to format a [Date] object using the system's default locale.
     */
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"NewApi"})
    public static final java.lang.String toTimeZoneString(@org.jetbrains.annotations.NotNull()
    java.util.Date $this$toTimeZoneString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getLogicalId(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.Resource $this$logicalId) {
        return null;
    }
    
    /**
     * Determines if the upload operation was successful or not.
     *
     * Current HAPI FHIR implementation does not give any signal other than 'severity' level for
     * operation success/failure. TODO: pass along the HTTP result (or any other signal) to determine
     * the outcome of an instance level RESTful operation.
     */
    public static final boolean isUploadSuccess(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.Resource $this$isUploadSuccess) {
        return false;
    }
}