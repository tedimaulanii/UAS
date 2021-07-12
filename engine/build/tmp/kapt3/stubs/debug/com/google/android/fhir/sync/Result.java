package com.google.android.fhir.sync;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/google/android/fhir/sync/Result;", "", "()V", "Error", "Success", "Lcom/google/android/fhir/sync/Result$Success;", "Lcom/google/android/fhir/sync/Result$Error;", "engine_debug"})
public abstract class Result {
    
    private Result() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/google/android/fhir/sync/Result$Success;", "Lcom/google/android/fhir/sync/Result;", "()V", "engine_debug"})
    public static final class Success extends com.google.android.fhir.sync.Result {
        @org.jetbrains.annotations.NotNull()
        public static final com.google.android.fhir.sync.Result.Success INSTANCE = null;
        
        private Success() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/google/android/fhir/sync/Result$Error;", "Lcom/google/android/fhir/sync/Result;", "exceptions", "", "Lcom/google/android/fhir/sync/ResourceSyncException;", "(Ljava/util/List;)V", "getExceptions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_debug"})
    public static final class Error extends com.google.android.fhir.sync.Result {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.google.android.fhir.sync.ResourceSyncException> exceptions = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.google.android.fhir.sync.ResourceSyncException> getExceptions() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.util.List<com.google.android.fhir.sync.ResourceSyncException> exceptions) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.google.android.fhir.sync.ResourceSyncException> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.fhir.sync.Result.Error copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.google.android.fhir.sync.ResourceSyncException> exceptions) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}