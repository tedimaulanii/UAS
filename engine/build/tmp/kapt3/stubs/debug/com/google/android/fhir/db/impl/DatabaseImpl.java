package com.google.android.fhir.db.impl;

import java.lang.System;

/**
 * The implementation for the persistence layer using Room. See docs for
 * [com.google.android.fhir.db.Database] for the API docs.
 */
@kotlin.Suppress(names = {"UNCHECKED_CAST"})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 D2\u00020\u0001:\u0001DB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J1\u0010\"\u001a\u00020#\"\b\b\u0000\u0010$*\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H$0\'2\u0006\u0010(\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0019\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u0017\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J/\u00102\u001a\u00020#\"\b\b\u0000\u0010$*\u00020%2\u0012\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u0002H$04\"\u0002H$H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J/\u00106\u001a\u00020#\"\b\b\u0000\u0010$*\u00020%2\u0012\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u0002H$04\"\u0002H$H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J-\u00107\u001a\u00020#2\f\u00108\u001a\b\u0012\u0004\u0012\u0002090/2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020%0/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u001b\u0010<\u001a\u0004\u0018\u00010\b2\u0006\u0010=\u001a\u00020>H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010?J)\u0010@\u001a\b\u0012\u0004\u0012\u0002H$0/\"\b\b\u0000\u0010$*\u00020%2\u0006\u0010\u001f\u001a\u00020 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J1\u0010A\u001a\u0002H$\"\b\b\u0000\u0010$*\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H$0\'2\u0006\u0010(\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J#\u0010B\u001a\u00020#\"\b\b\u0000\u0010$*\u00020%2\u0006\u00103\u001a\u0002H$H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010CR\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006E"}, d2 = {"Lcom/google/android/fhir/db/impl/DatabaseImpl;", "Lcom/google/android/fhir/db/Database;", "context", "Landroid/content/Context;", "iParser", "Lca/uhn/fhir/parser/IParser;", "(Landroid/content/Context;Lca/uhn/fhir/parser/IParser;)V", "databaseName", "", "(Landroid/content/Context;Lca/uhn/fhir/parser/IParser;Ljava/lang/String;)V", "builder", "Landroidx/room/RoomDatabase$Builder;", "Lcom/google/android/fhir/db/impl/ResourceDatabase;", "kotlin.jvm.PlatformType", "getBuilder", "()Landroidx/room/RoomDatabase$Builder;", "db", "getDb", "()Lcom/google/android/fhir/db/impl/ResourceDatabase;", "localChangeDao", "Lcom/google/android/fhir/db/impl/dao/LocalChangeDao;", "resourceDao", "Lcom/google/android/fhir/db/impl/dao/ResourceDao;", "getResourceDao", "()Lcom/google/android/fhir/db/impl/dao/ResourceDao;", "resourceDao$delegate", "Lkotlin/Lazy;", "syncedResourceDao", "Lcom/google/android/fhir/db/impl/dao/SyncedResourceDao;", "count", "", "query", "Lcom/google/android/fhir/search/SearchQuery;", "(Lcom/google/android/fhir/search/SearchQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "R", "Lorg/hl7/fhir/r4/model/Resource;", "clazz", "Ljava/lang/Class;", "id", "(Ljava/lang/Class;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUpdates", "token", "Lcom/google/android/fhir/db/impl/dao/LocalChangeToken;", "(Lcom/google/android/fhir/db/impl/dao/LocalChangeToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllLocalChanges", "", "Lcom/google/android/fhir/db/impl/dao/SquashedLocalChange;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "resource", "", "([Lorg/hl7/fhir/r4/model/Resource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRemote", "insertSyncedResources", "syncedResources", "Lcom/google/android/fhir/db/impl/entities/SyncedResourceEntity;", "resources", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lastUpdate", "resourceType", "Lorg/hl7/fhir/r4/model/ResourceType;", "(Lorg/hl7/fhir/r4/model/ResourceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "select", "update", "(Lorg/hl7/fhir/r4/model/Resource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "engine_debug"})
public final class DatabaseImpl implements com.google.android.fhir.db.Database {
    @org.jetbrains.annotations.NotNull()
    private final androidx.room.RoomDatabase.Builder<com.google.android.fhir.db.impl.ResourceDatabase> builder = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.fhir.db.impl.ResourceDatabase db = null;
    private final kotlin.Lazy resourceDao$delegate = null;
    private final com.google.android.fhir.db.impl.dao.SyncedResourceDao syncedResourceDao = null;
    private final com.google.android.fhir.db.impl.dao.LocalChangeDao localChangeDao = null;
    private final ca.uhn.fhir.parser.IParser iParser = null;
    private static final java.lang.String DEFAULT_DATABASE_NAME = "ResourceDatabase";
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.fhir.db.impl.DatabaseImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.room.RoomDatabase.Builder<com.google.android.fhir.db.impl.ResourceDatabase> getBuilder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.db.impl.ResourceDatabase getDb() {
        return null;
    }
    
    private final com.google.android.fhir.db.impl.dao.ResourceDao getResourceDao() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    R[] resource, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object insertRemote(@org.jetbrains.annotations.NotNull()
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
    public <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object select(@org.jetbrains.annotations.NotNull()
    java.lang.Class<R> clazz, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super R> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object lastUpdate(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType resourceType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertSyncedResources(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.db.impl.entities.SyncedResourceEntity> syncedResources, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.hl7.fhir.r4.model.Resource> resources, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    java.lang.Class<R> clazz, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object search(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.SearchQuery query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends R>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object count(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.SearchQuery query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1) {
        return null;
    }
    
    /**
     * @returns a list of pairs. Each pair is a token + squashed local change. Each token is a list of
     * [LocalChangeEntity.id] s of rows of the [LocalChangeEntity].
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllLocalChanges(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.google.android.fhir.db.impl.dao.SquashedLocalChange>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteUpdates(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.dao.LocalChangeToken token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public DatabaseImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.parser.IParser iParser, @org.jetbrains.annotations.Nullable()
    java.lang.String databaseName) {
        super();
    }
    
    public DatabaseImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.parser.IParser iParser) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/google/android/fhir/db/impl/DatabaseImpl$Companion;", "", "()V", "DEFAULT_DATABASE_NAME", "", "engine_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}