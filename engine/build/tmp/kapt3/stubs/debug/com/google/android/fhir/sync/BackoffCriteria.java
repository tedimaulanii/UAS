package com.google.android.fhir.sync;

import java.lang.System;

/**
 * The criteria for [FhirSyncWorker] failure retry based on
 * [androidx.work.WorkRequest.Builder.setBackoffCriteria]
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/google/android/fhir/sync/BackoffCriteria;", "", "backoffPolicy", "Landroidx/work/BackoffPolicy;", "backoffDelay", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(Landroidx/work/BackoffPolicy;JLjava/util/concurrent/TimeUnit;)V", "getBackoffDelay", "()J", "getBackoffPolicy", "()Landroidx/work/BackoffPolicy;", "getTimeUnit", "()Ljava/util/concurrent/TimeUnit;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "engine_debug"})
public final class BackoffCriteria {
    
    /**
     * Backoff policy [androidx.work.BackoffPolicy]
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.work.BackoffPolicy backoffPolicy = null;
    
    /**
     * Backoff delay for each retry attempt. Check
     * [androidx.work.PeriodicWorkRequest.MIN_BACKOFF_MILLIS] and
     * [androidx.work.PeriodicWorkRequest.MAX_BACKOFF_MILLIS] for the min-max supported values
     */
    private final long backoffDelay = 0L;
    
    /**
     * The time unit for [backoffDelay]
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.TimeUnit timeUnit = null;
    
    /**
     * Backoff policy [androidx.work.BackoffPolicy]
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.work.BackoffPolicy getBackoffPolicy() {
        return null;
    }
    
    /**
     * Backoff delay for each retry attempt. Check
     * [androidx.work.PeriodicWorkRequest.MIN_BACKOFF_MILLIS] and
     * [androidx.work.PeriodicWorkRequest.MAX_BACKOFF_MILLIS] for the min-max supported values
     */
    public final long getBackoffDelay() {
        return 0L;
    }
    
    /**
     * The time unit for [backoffDelay]
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.TimeUnit getTimeUnit() {
        return null;
    }
    
    public BackoffCriteria(@org.jetbrains.annotations.NotNull()
    androidx.work.BackoffPolicy backoffPolicy, long backoffDelay, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit timeUnit) {
        super();
    }
    
    /**
     * Backoff policy [androidx.work.BackoffPolicy]
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.work.BackoffPolicy component1() {
        return null;
    }
    
    /**
     * Backoff delay for each retry attempt. Check
     * [androidx.work.PeriodicWorkRequest.MIN_BACKOFF_MILLIS] and
     * [androidx.work.PeriodicWorkRequest.MAX_BACKOFF_MILLIS] for the min-max supported values
     */
    public final long component2() {
        return 0L;
    }
    
    /**
     * The time unit for [backoffDelay]
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.TimeUnit component3() {
        return null;
    }
    
    /**
     * The criteria for [FhirSyncWorker] failure retry based on
     * [androidx.work.WorkRequest.Builder.setBackoffCriteria]
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.sync.BackoffCriteria copy(@org.jetbrains.annotations.NotNull()
    androidx.work.BackoffPolicy backoffPolicy, long backoffDelay, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit timeUnit) {
        return null;
    }
    
    /**
     * The criteria for [FhirSyncWorker] failure retry based on
     * [androidx.work.WorkRequest.Builder.setBackoffCriteria]
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * The criteria for [FhirSyncWorker] failure retry based on
     * [androidx.work.WorkRequest.Builder.setBackoffCriteria]
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * The criteria for [FhirSyncWorker] failure retry based on
     * [androidx.work.WorkRequest.Builder.setBackoffCriteria]
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}