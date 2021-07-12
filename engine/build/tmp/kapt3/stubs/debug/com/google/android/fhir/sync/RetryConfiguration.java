package com.google.android.fhir.sync;

import java.lang.System;

/**
 * Configuration for synchronization retry
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/google/android/fhir/sync/RetryConfiguration;", "", "backoffCriteria", "Lcom/google/android/fhir/sync/BackoffCriteria;", "maxRetries", "", "(Lcom/google/android/fhir/sync/BackoffCriteria;I)V", "getBackoffCriteria", "()Lcom/google/android/fhir/sync/BackoffCriteria;", "getMaxRetries", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "engine_debug"})
public final class RetryConfiguration {
    
    /**
     * The criteria to retry failed synchronization work based on
     * [androidx.work.WorkRequest.Builder.setBackoffCriteria]
     */
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.fhir.sync.BackoffCriteria backoffCriteria = null;
    
    /**
     * Maximum retries for a failing [FhirSyncWorker]
     */
    private final int maxRetries = 0;
    
    /**
     * The criteria to retry failed synchronization work based on
     * [androidx.work.WorkRequest.Builder.setBackoffCriteria]
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.sync.BackoffCriteria getBackoffCriteria() {
        return null;
    }
    
    /**
     * Maximum retries for a failing [FhirSyncWorker]
     */
    public final int getMaxRetries() {
        return 0;
    }
    
    public RetryConfiguration(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.sync.BackoffCriteria backoffCriteria, int maxRetries) {
        super();
    }
    
    /**
     * The criteria to retry failed synchronization work based on
     * [androidx.work.WorkRequest.Builder.setBackoffCriteria]
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.sync.BackoffCriteria component1() {
        return null;
    }
    
    /**
     * Maximum retries for a failing [FhirSyncWorker]
     */
    public final int component2() {
        return 0;
    }
    
    /**
     * Configuration for synchronization retry
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.sync.RetryConfiguration copy(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.sync.BackoffCriteria backoffCriteria, int maxRetries) {
        return null;
    }
    
    /**
     * Configuration for synchronization retry
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Configuration for synchronization retry
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Configuration for synchronization retry
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}