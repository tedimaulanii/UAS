package com.google.android.fhir.sync;

import java.lang.System;

/**
 * Repeat interval for periodic sync trigger. Check [androidx.work.PeriodicWorkRequest.Builder]
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/google/android/fhir/sync/RepeatInterval;", "", "interval", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)V", "getInterval", "()J", "getTimeUnit", "()Ljava/util/concurrent/TimeUnit;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "engine_debug"})
public final class RepeatInterval {
    
    /**
     * The interval at which the sync should be triggered in
     */
    private final long interval = 0L;
    
    /**
     * The time unit for the repeat interval
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.TimeUnit timeUnit = null;
    
    /**
     * The interval at which the sync should be triggered in
     */
    public final long getInterval() {
        return 0L;
    }
    
    /**
     * The time unit for the repeat interval
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.TimeUnit getTimeUnit() {
        return null;
    }
    
    public RepeatInterval(long interval, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit timeUnit) {
        super();
    }
    
    /**
     * The interval at which the sync should be triggered in
     */
    public final long component1() {
        return 0L;
    }
    
    /**
     * The time unit for the repeat interval
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.TimeUnit component2() {
        return null;
    }
    
    /**
     * Repeat interval for periodic sync trigger. Check [androidx.work.PeriodicWorkRequest.Builder]
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.sync.RepeatInterval copy(long interval, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit timeUnit) {
        return null;
    }
    
    /**
     * Repeat interval for periodic sync trigger. Check [androidx.work.PeriodicWorkRequest.Builder]
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Repeat interval for periodic sync trigger. Check [androidx.work.PeriodicWorkRequest.Builder]
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Repeat interval for periodic sync trigger. Check [androidx.work.PeriodicWorkRequest.Builder]
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}