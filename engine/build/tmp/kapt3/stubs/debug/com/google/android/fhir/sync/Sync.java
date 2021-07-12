package com.google.android.fhir.sync;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u0004\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0081\bJ\u001d\u0010\t\u001a\u00020\n\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0081\bJ)\u0010\r\u001a\u00020\u000e\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086\bJI\u0010\r\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152&\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u0017j\u0002`\u001a0\u0017j\u0002`\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ%\u0010\u001d\u001a\u00020\u000e\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0086\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/google/android/fhir/sync/Sync;", "", "()V", "createOneTimeWorkRequest", "Landroidx/work/OneTimeWorkRequest;", "W", "Lcom/google/android/fhir/sync/FhirSyncWorker;", "retryConfiguration", "Lcom/google/android/fhir/sync/RetryConfiguration;", "createPeriodicWorkRequest", "Landroidx/work/PeriodicWorkRequest;", "periodicSyncConfiguration", "Lcom/google/android/fhir/sync/PeriodicSyncConfiguration;", "oneTimeSync", "", "context", "Landroid/content/Context;", "Lcom/google/android/fhir/sync/Result;", "fhirEngine", "Lcom/google/android/fhir/FhirEngine;", "dataSource", "Lcom/google/android/fhir/sync/DataSource;", "resourceSyncParams", "", "Lorg/hl7/fhir/r4/model/ResourceType;", "", "Lcom/google/android/fhir/sync/ParamMap;", "Lcom/google/android/fhir/sync/ResourceSyncParams;", "(Lcom/google/android/fhir/FhirEngine;Lcom/google/android/fhir/sync/DataSource;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "periodicSync", "engine_debug"})
public final class Sync {
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.fhir.sync.Sync INSTANCE = null;
    
    /**
     * Does a one time sync based on [ResourceSyncParams]. Returns a [Result] that tells caller
     * whether process was Success or Failure. In case of failure, caller needs to take care of the
     * retry
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object oneTimeSync(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.FhirEngine fhirEngine, @org.jetbrains.annotations.NotNull()
    com.google.android.fhir.sync.DataSource dataSource, @org.jetbrains.annotations.NotNull()
    java.util.Map<org.hl7.fhir.r4.model.ResourceType, ? extends java.util.Map<java.lang.String, java.lang.String>> resourceSyncParams, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.android.fhir.sync.Result> p3) {
        return null;
    }
    
    private Sync() {
        super();
    }
}