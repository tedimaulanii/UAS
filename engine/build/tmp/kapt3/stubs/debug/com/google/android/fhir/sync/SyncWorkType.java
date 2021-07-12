package com.google.android.fhir.sync;

import java.lang.System;

/**
 * Defines different types of synchronisation workers: download and upload
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/google/android/fhir/sync/SyncWorkType;", "", "workerName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getWorkerName", "()Ljava/lang/String;", "DOWNLOAD", "UPLOAD", "engine_debug"})
public enum SyncWorkType {
    /*public static final*/ DOWNLOAD /* = new DOWNLOAD(null) */,
    /*public static final*/ UPLOAD /* = new UPLOAD(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String workerName = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWorkerName() {
        return null;
    }
    
    SyncWorkType(java.lang.String workerName) {
    }
}