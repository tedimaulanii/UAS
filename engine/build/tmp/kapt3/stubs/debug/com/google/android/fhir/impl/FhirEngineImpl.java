package com.google.android.fhir.impl;

import java.lang.System;

/**
 * Implementation of [FhirEngine].
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ1\u0010\f\u001a\u0002H\r\"\b\b\u0000\u0010\r*\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J1\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\r*\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J/\u0010\u0016\u001a\u00020\u0015\"\b\b\u0000\u0010\r*\u00020\u000e2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\r0\u0018\"\u0002H\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J)\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\r0\u001a\"\b\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ;\u0010\u001b\u001a\u00020\u00152(\u0010\u001c\u001a$\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001a0\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001dH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!JA\u0010\"\u001a\u00020\u00152.\u0010#\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001a0\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001dH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J#\u0010&\u001a\u00020\u0015\"\b\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u0017\u001a\u0002H\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/google/android/fhir/impl/FhirEngineImpl;", "Lcom/google/android/fhir/FhirEngine;", "database", "Lcom/google/android/fhir/db/Database;", "context", "Landroid/content/Context;", "(Lcom/google/android/fhir/db/Database;Landroid/content/Context;)V", "count", "", "search", "Lcom/google/android/fhir/search/Search;", "(Lcom/google/android/fhir/search/Search;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "R", "Lorg/hl7/fhir/r4/model/Resource;", "clazz", "Ljava/lang/Class;", "id", "", "(Ljava/lang/Class;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "", "save", "resource", "", "([Lorg/hl7/fhir/r4/model/Resource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "syncDownload", "download", "Lkotlin/Function2;", "Lcom/google/android/fhir/SyncDownloadContext;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncUpload", "upload", "Lcom/google/android/fhir/db/impl/dao/SquashedLocalChange;", "Lcom/google/android/fhir/db/impl/dao/LocalChangeToken;", "update", "(Lorg/hl7/fhir/r4/model/Resource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "engine_debug"})
public final class FhirEngineImpl implements com.google.android.fhir.FhirEngine {
    private final com.google.android.fhir.db.Database database = null;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object save(@org.jetbrains.annotations.NotNull()
    R[] resource, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object update(@org.jetbrains.annotations.NotNull()
    R resource, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object load(@org.jetbrains.annotations.NotNull()
    java.lang.Class<R> clazz, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super R> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object remove(@org.jetbrains.annotations.NotNull()
    java.lang.Class<R> clazz, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object search(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.Search search, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends R>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object count(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.Search search, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object syncDownload(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.google.android.fhir.SyncDownloadContext, ? super kotlin.coroutines.Continuation<? super java.util.List<? extends org.hl7.fhir.r4.model.Resource>>, ? extends java.lang.Object> download, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object syncUpload(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.util.List<com.google.android.fhir.db.impl.dao.SquashedLocalChange>, ? super kotlin.coroutines.Continuation<? super java.util.List<com.google.android.fhir.db.impl.dao.LocalChangeToken>>, ? extends java.lang.Object> upload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public FhirEngineImpl(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.Database database, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}