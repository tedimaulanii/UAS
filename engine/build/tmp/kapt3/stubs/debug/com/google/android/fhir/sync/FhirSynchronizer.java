package com.google.android.fhir.sync;

import java.lang.System;

/**
 * Class that helps synchronize the data source and save it in the local database
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012&\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n0\u0007j\u0002`\u000b\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J1\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J4\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\b2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0002J\u0011\u0010\u001c\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\u001d\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n0\u0007j\u0002`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/google/android/fhir/sync/FhirSynchronizer;", "", "fhirEngine", "Lcom/google/android/fhir/FhirEngine;", "dataSource", "Lcom/google/android/fhir/sync/DataSource;", "resourceSyncParams", "", "Lorg/hl7/fhir/r4/model/ResourceType;", "", "Lcom/google/android/fhir/sync/ParamMap;", "Lcom/google/android/fhir/sync/ResourceSyncParams;", "(Lcom/google/android/fhir/FhirEngine;Lcom/google/android/fhir/sync/DataSource;Ljava/util/Map;)V", "doUpload", "Lorg/hl7/fhir/r4/model/Resource;", "localChange", "Lcom/google/android/fhir/db/impl/entities/LocalChangeEntity;", "(Lcom/google/android/fhir/db/impl/entities/LocalChangeEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "download", "Lcom/google/android/fhir/sync/Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadResourceType", "", "resourceType", "params", "(Lorg/hl7/fhir/r4/model/ResourceType;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInitialUrl", "lastUpdate", "synchronize", "upload", "engine_debug"})
public final class FhirSynchronizer {
    private final com.google.android.fhir.FhirEngine fhirEngine = null;
    private final com.google.android.fhir.sync.DataSource dataSource = null;
    private final java.util.Map<org.hl7.fhir.r4.model.ResourceType, java.util.Map<java.lang.String, java.lang.String>> resourceSyncParams = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object synchronize(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.android.fhir.sync.Result> p0) {
        return null;
    }
    
    private final java.lang.String getInitialUrl(org.hl7.fhir.r4.model.ResourceType resourceType, java.util.Map<java.lang.String, java.lang.String> params, java.lang.String lastUpdate) {
        return null;
    }
    
    public FhirSynchronizer(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.FhirEngine fhirEngine, @org.jetbrains.annotations.NotNull()
    com.google.android.fhir.sync.DataSource dataSource, @org.jetbrains.annotations.NotNull()
    java.util.Map<org.hl7.fhir.r4.model.ResourceType, ? extends java.util.Map<java.lang.String, java.lang.String>> resourceSyncParams) {
        super();
    }
}