package com.google.android.fhir;

import java.lang.System;

/**
 * The FHIR Engine interface that handles the local storage of FHIR resources.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J1\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ1\u0010\u000f\u001a\u00020\u0010\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ/\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\b*\u00020\t2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\b0\u0013\"\u0002H\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J)\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\b0\u0015\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J;\u0010\u0016\u001a\u00020\u00102(\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJA\u0010\u001c\u001a\u00020\u00102.\u0010\u001d\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0015\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ#\u0010 \u001a\u00020\u0010\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\u0012\u001a\u0002H\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/google/android/fhir/FhirEngine;", "", "count", "", "search", "Lcom/google/android/fhir/search/Search;", "(Lcom/google/android/fhir/search/Search;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "R", "Lorg/hl7/fhir/r4/model/Resource;", "clazz", "Ljava/lang/Class;", "id", "", "(Ljava/lang/Class;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "", "save", "resource", "", "([Lorg/hl7/fhir/r4/model/Resource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "syncDownload", "download", "Lkotlin/Function2;", "Lcom/google/android/fhir/SyncDownloadContext;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncUpload", "upload", "Lcom/google/android/fhir/db/impl/dao/SquashedLocalChange;", "Lcom/google/android/fhir/db/impl/dao/LocalChangeToken;", "update", "(Lorg/hl7/fhir/r4/model/Resource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "engine_debug"})
public abstract interface FhirEngine {
    
    /**
     * Saves one or more FHIR [resource] s in the local storage. If any of the resources already
     * exist, they will be overwritten.
     *
     * @param <R> The resource type which should be a subtype of [Resource].
     */
    @org.jetbrains.annotations.Nullable()
    public abstract <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object save(@org.jetbrains.annotations.NotNull()
    R[] resource, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    /**
     * Updates a FHIR [resource] in the local storage.
     *
     * @param <R> The resource type which should be a subtype of [Resource].
     */
    @org.jetbrains.annotations.Nullable()
    public abstract <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object update(@org.jetbrains.annotations.NotNull()
    R resource, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    /**
     * Returns a FHIR resource of type [clazz] with [id] from the local storage.
     *
     * @param <R> The resource type which should be a subtype of [Resource].
     * @throws ResourceNotFoundException if the resource is not found
     */
    @org.jetbrains.annotations.Nullable()
    public abstract <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object load(@org.jetbrains.annotations.NotNull()
    java.lang.Class<R> clazz, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super R> p2);
    
    /**
     * Removes a FHIR resource of type [clazz] with [id] from the local storage.
     *
     * @param <R> The resource type which should be a subtype of [Resource].
     */
    @org.jetbrains.annotations.Nullable()
    public abstract <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object remove(@org.jetbrains.annotations.NotNull()
    java.lang.Class<R> clazz, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    /**
     * Searches the database and returns a list resources according to the [search] specifications.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object search(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.Search search, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends R>> p1);
    
    /**
     * Synchronizes the [upload] result in the database. The database will be updated to reflect the
     * result of the [upload] operation.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object syncUpload(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.util.List<com.google.android.fhir.db.impl.dao.SquashedLocalChange>, ? super kotlin.coroutines.Continuation<? super java.util.List<com.google.android.fhir.db.impl.dao.LocalChangeToken>>, ? extends java.lang.Object> upload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    /**
     * Synchronizes the [download] result in the database. The database will be updated to reflect the
     * result of the [download] operation.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object syncDownload(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.google.android.fhir.SyncDownloadContext, ? super kotlin.coroutines.Continuation<? super java.util.List<? extends org.hl7.fhir.r4.model.Resource>>, ? extends java.lang.Object> download, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    /**
     * Total count of entities available for given search
     *
     * @param search
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object count(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.Search search, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
}