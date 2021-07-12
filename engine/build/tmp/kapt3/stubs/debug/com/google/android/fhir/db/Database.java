package com.google.android.fhir.db;

import java.lang.System;

/**
 * The interface for the FHIR resource database.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J1\u0010\u0007\u001a\u00020\b\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\f2\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J/\u0010\u0018\u001a\u00020\b\"\b\b\u0000\u0010\t*\u00020\n2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\t0\u001a\"\u0002H\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ/\u0010\u001c\u001a\u00020\b\"\b\b\u0000\u0010\t*\u00020\n2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\t0\u001a\"\u0002H\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ-\u0010\u001d\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u001b\u0010\"\u001a\u0004\u0018\u00010\u000e2\u0006\u0010#\u001a\u00020$H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J)\u0010&\u001a\b\u0012\u0004\u0012\u0002H\t0\u0015\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J1\u0010\'\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\f2\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ#\u0010(\u001a\u00020\b\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u0019\u001a\u0002H\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/google/android/fhir/db/Database;", "", "count", "", "query", "Lcom/google/android/fhir/search/SearchQuery;", "(Lcom/google/android/fhir/search/SearchQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "R", "Lorg/hl7/fhir/r4/model/Resource;", "clazz", "Ljava/lang/Class;", "id", "", "(Ljava/lang/Class;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUpdates", "token", "Lcom/google/android/fhir/db/impl/dao/LocalChangeToken;", "(Lcom/google/android/fhir/db/impl/dao/LocalChangeToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllLocalChanges", "", "Lcom/google/android/fhir/db/impl/dao/SquashedLocalChange;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "resource", "", "([Lorg/hl7/fhir/r4/model/Resource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRemote", "insertSyncedResources", "syncedResources", "Lcom/google/android/fhir/db/impl/entities/SyncedResourceEntity;", "resources", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lastUpdate", "resourceType", "Lorg/hl7/fhir/r4/model/ResourceType;", "(Lorg/hl7/fhir/r4/model/ResourceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "select", "update", "(Lorg/hl7/fhir/r4/model/Resource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "engine_debug"})
public abstract interface Database {
    
    /**
     * Inserts a list of local `resources` into the FHIR resource database. If any of the resources
     * already exists, it will be overwritten.
     *
     * @param <R> The resource type
     */
    @org.jetbrains.annotations.Nullable()
    public abstract <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    R[] resource, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    /**
     * Inserts a list of remote `resources` into the FHIR resource database. If any of the resources
     * already exists, it will be overwritten.
     *
     * @param <R> The resource type
     */
    @org.jetbrains.annotations.Nullable()
    public abstract <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object insertRemote(@org.jetbrains.annotations.NotNull()
    R[] resource, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    /**
     * Updates the `resource` in the FHIR resource database. If the resource does not already exist,
     * then it will not be created.
     *
     * @param <R> The resource type
     */
    @org.jetbrains.annotations.Nullable()
    public abstract <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object update(@org.jetbrains.annotations.NotNull()
    R resource, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    /**
     * Selects the FHIR resource of type `clazz` with `id`.
     *
     * @param <R> The resource type
     * @throws ResourceNotFoundException if the resource is not found in the database
     */
    @org.jetbrains.annotations.Nullable()
    public abstract <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object select(@org.jetbrains.annotations.NotNull()
    java.lang.Class<R> clazz, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super R> p2);
    
    /**
     * Return the last update data of a resource based on the resource type. If no resource of
     * [resourceType] is inserted, return `null`.
     * @param resourceType The resource type
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object lastUpdate(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType resourceType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1);
    
    /**
     * Insert resources that were synchronised.
     *
     * @param syncedResources The synced resource
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertSyncedResources(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.db.impl.entities.SyncedResourceEntity> syncedResources, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.hl7.fhir.r4.model.Resource> resources, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    /**
     * Deletes the FHIR resource of type `clazz` with `id`.
     *
     * @param <R> The resource type
     */
    @org.jetbrains.annotations.Nullable()
    public abstract <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    java.lang.Class<R> clazz, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object search(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.SearchQuery query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends R>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object count(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.SearchQuery query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    /**
     * Retrieves all [LocalChangeEntity] s for all [Resource] s, which can be used to update the
     * remote FHIR server. Each resource will have at most one
     * [LocalChangeEntity](multiple changes are squashed).
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllLocalChanges(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.google.android.fhir.db.impl.dao.SquashedLocalChange>> p0);
    
    /**
     * Remove the [LocalChangeEntity] s with given ids. Call this after a successful sync.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteUpdates(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.dao.LocalChangeToken token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}