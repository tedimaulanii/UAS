package com.google.android.fhir.sync;

import java.lang.System;

/**
 * Configuration for synchronization.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012.\b\u0002\u0010\u0002\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00070\u0004j\u0002`\b0\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ/\u0010\u0010\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00070\u0004j\u0002`\b0\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\nH\u00c6\u0003JC\u0010\u0012\u001a\u00020\u00002.\b\u0002\u0010\u0002\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00070\u0004j\u0002`\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001R7\u0010\u0002\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00070\u0004j\u0002`\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/google/android/fhir/sync/SyncConfiguration;", "", "resourceSyncParams", "", "", "Lorg/hl7/fhir/r4/model/ResourceType;", "", "Lcom/google/android/fhir/sync/ParamMap;", "Lcom/google/android/fhir/sync/ResourceSyncParams;", "retry", "", "(Ljava/util/List;Z)V", "getResourceSyncParams", "()Ljava/util/List;", "getRetry", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "engine_debug"})
public final class SyncConfiguration {
    
    /**
     * Data that needs to be synchronised
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.util.Map<org.hl7.fhir.r4.model.ResourceType, java.util.Map<java.lang.String, java.lang.String>>> resourceSyncParams = null;
    
    /**
     * true if the SDK needs to retry a failed sync attempt, false otherwise If this is set to true,
     * then the result of the sync will be reported after the retry.
     */
    private final boolean retry = false;
    
    /**
     * Data that needs to be synchronised
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.Map<org.hl7.fhir.r4.model.ResourceType, java.util.Map<java.lang.String, java.lang.String>>> getResourceSyncParams() {
        return null;
    }
    
    /**
     * true if the SDK needs to retry a failed sync attempt, false otherwise If this is set to true,
     * then the result of the sync will be reported after the retry.
     */
    public final boolean getRetry() {
        return false;
    }
    
    public SyncConfiguration(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.util.Map<org.hl7.fhir.r4.model.ResourceType, ? extends java.util.Map<java.lang.String, java.lang.String>>> resourceSyncParams, boolean retry) {
        super();
    }
    
    public SyncConfiguration() {
        super();
    }
    
    /**
     * Data that needs to be synchronised
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.Map<org.hl7.fhir.r4.model.ResourceType, java.util.Map<java.lang.String, java.lang.String>>> component1() {
        return null;
    }
    
    /**
     * true if the SDK needs to retry a failed sync attempt, false otherwise If this is set to true,
     * then the result of the sync will be reported after the retry.
     */
    public final boolean component2() {
        return false;
    }
    
    /**
     * Configuration for synchronization.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.sync.SyncConfiguration copy(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.util.Map<org.hl7.fhir.r4.model.ResourceType, ? extends java.util.Map<java.lang.String, java.lang.String>>> resourceSyncParams, boolean retry) {
        return null;
    }
    
    /**
     * Configuration for synchronization.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Configuration for synchronization.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Configuration for synchronization.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}