package com.google.android.fhir.sync;

import java.lang.System;

/**
 * A WorkManager Worker that handles periodic sync.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J(\u0010\u000e\u001a\"\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u00120\u000fj\u0002`\u0013H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/google/android/fhir/sync/FhirSyncWorker;", "Landroidx/work/CoroutineWorker;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataSource", "Lcom/google/android/fhir/sync/DataSource;", "getFhirEngine", "Lcom/google/android/fhir/FhirEngine;", "getSyncData", "", "Lorg/hl7/fhir/r4/model/ResourceType;", "", "Lcom/google/android/fhir/sync/ParamMap;", "Lcom/google/android/fhir/sync/ResourceSyncParams;", "engine_debug"})
public abstract class FhirSyncWorker extends androidx.work.CoroutineWorker {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.fhir.FhirEngine getFhirEngine();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.fhir.sync.DataSource getDataSource();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<org.hl7.fhir.r4.model.ResourceType, java.util.Map<java.lang.String, java.lang.String>> getSyncData();
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> p0) {
        return null;
    }
    
    public FhirSyncWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters workerParams) {
        super(null, null);
    }
}