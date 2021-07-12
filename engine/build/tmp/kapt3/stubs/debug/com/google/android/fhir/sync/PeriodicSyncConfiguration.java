package com.google.android.fhir.sync;

import java.lang.System;

/**
 * Configuration for period synchronisation
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/google/android/fhir/sync/PeriodicSyncConfiguration;", "", "syncConstraints", "Landroidx/work/Constraints;", "repeat", "Lcom/google/android/fhir/sync/RepeatInterval;", "retryConfiguration", "Lcom/google/android/fhir/sync/RetryConfiguration;", "(Landroidx/work/Constraints;Lcom/google/android/fhir/sync/RepeatInterval;Lcom/google/android/fhir/sync/RetryConfiguration;)V", "getRepeat", "()Lcom/google/android/fhir/sync/RepeatInterval;", "getRetryConfiguration", "()Lcom/google/android/fhir/sync/RetryConfiguration;", "getSyncConstraints", "()Landroidx/work/Constraints;", "engine_debug"})
public final class PeriodicSyncConfiguration {
    
    /**
     * Constraints that specify the requirements needed before the synchronisation is triggered. E.g.
     * network type (Wifi, 3G etc), the device should be charging etc.
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.work.Constraints syncConstraints = null;
    
    /**
     * The interval at which the sync should be triggered in. It must be greater than or equal to
     * [androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS]
     */
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.fhir.sync.RepeatInterval repeat = null;
    
    /**
     * Configuration for synchronization retry
     */
    @org.jetbrains.annotations.Nullable()
    private final com.google.android.fhir.sync.RetryConfiguration retryConfiguration = null;
    
    /**
     * Constraints that specify the requirements needed before the synchronisation is triggered. E.g.
     * network type (Wifi, 3G etc), the device should be charging etc.
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.work.Constraints getSyncConstraints() {
        return null;
    }
    
    /**
     * The interval at which the sync should be triggered in. It must be greater than or equal to
     * [androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS]
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.sync.RepeatInterval getRepeat() {
        return null;
    }
    
    /**
     * Configuration for synchronization retry
     */
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.fhir.sync.RetryConfiguration getRetryConfiguration() {
        return null;
    }
    
    public PeriodicSyncConfiguration(@org.jetbrains.annotations.NotNull()
    androidx.work.Constraints syncConstraints, @org.jetbrains.annotations.NotNull()
    com.google.android.fhir.sync.RepeatInterval repeat, @org.jetbrains.annotations.Nullable()
    com.google.android.fhir.sync.RetryConfiguration retryConfiguration) {
        super();
    }
}