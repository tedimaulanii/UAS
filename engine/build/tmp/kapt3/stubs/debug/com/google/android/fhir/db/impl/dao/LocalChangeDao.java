package com.google.android.fhir.db.impl.dao;

import java.lang.System;

/**
 * Dao for local changes made to a resource. One row in LocalChangeEntity corresponds to one change
 * e.g. an INSERT or UPDATE. The UPDATES (diffs) are stored as RFC 6902 JSON patches. When a
 * resource needs to be synced, all corresponding LocalChanges are 'squashed' to create a a single
 * LocalChangeEntity to sync with the server.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ!\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ!\u0010\u001f\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010!\u001a\u00020\n2\u0006\u0010%\u001a\u00020&H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J#\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ!\u0010,\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Lcom/google/android/fhir/db/impl/dao/LocalChangeDao;", "", "()V", "iParser", "Lca/uhn/fhir/parser/IParser;", "getIParser", "()Lca/uhn/fhir/parser/IParser;", "setIParser", "(Lca/uhn/fhir/parser/IParser;)V", "addDelete", "", "resourceId", "", "resourceType", "Lorg/hl7/fhir/r4/model/ResourceType;", "(Ljava/lang/String;Lorg/hl7/fhir/r4/model/ResourceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addInsert", "resource", "Lorg/hl7/fhir/r4/model/Resource;", "(Lorg/hl7/fhir/r4/model/Resource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addInsertAll", "resources", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addLocalChange", "localChangeEntity", "Lcom/google/android/fhir/db/impl/entities/LocalChangeEntity;", "(Lcom/google/android/fhir/db/impl/entities/LocalChangeEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addUpdate", "oldResource", "(Lorg/hl7/fhir/r4/model/Resource;Lorg/hl7/fhir/r4/model/Resource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countLastChange", "", "discardLocalChanges", "token", "Lcom/google/android/fhir/db/impl/dao/LocalChangeToken;", "(Lcom/google/android/fhir/db/impl/dao/LocalChangeToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllLocalChanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lastChangeType", "Lcom/google/android/fhir/db/impl/entities/LocalChangeEntity$Type;", "localChangeIsEmpty", "", "InvalidLocalChangeException", "engine_debug"})
public abstract class LocalChangeDao {
    public ca.uhn.fhir.parser.IParser iParser;
    
    @org.jetbrains.annotations.NotNull()
    public final ca.uhn.fhir.parser.IParser getIParser() {
        return null;
    }
    
    public final void setIParser(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.parser.IParser p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object addLocalChange(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.LocalChangeEntity localChangeEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Transaction()
    public java.lang.Object addInsertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.hl7.fhir.r4.model.Resource> p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addInsert(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.Resource resource, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addUpdate(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.Resource oldResource, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.Resource resource, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addDelete(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceId, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType resourceType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT type \n        FROM LocalChangeEntity \n        WHERE resourceId = :resourceId \n        AND resourceType = :resourceType \n        ORDER BY id ASC\n        LIMIT 1\n    ")
    public abstract java.lang.Object lastChangeType(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceId, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType resourceType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.android.fhir.db.impl.entities.LocalChangeEntity.Type> p2);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT COUNT(type) \n        FROM LocalChangeEntity \n        WHERE resourceId = :resourceId \n        AND resourceType = :resourceType\n        LIMIT 1\n    ")
    public abstract java.lang.Object countLastChange(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceId, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType resourceType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p2);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT *\n        FROM LocalChangeEntity\n        ORDER BY LocalChangeEntity.id ASC")
    public abstract java.lang.Object getAllLocalChanges(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.google.android.fhir.db.impl.entities.LocalChangeEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        DELETE FROM LocalChangeEntity\n        WHERE LocalChangeEntity.id = (:id)\n    ")
    public abstract java.lang.Object discardLocalChanges(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object discardLocalChanges(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.dao.LocalChangeToken token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public LocalChangeDao() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/google/android/fhir/db/impl/dao/LocalChangeDao$InvalidLocalChangeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "engine_debug"})
    public static final class InvalidLocalChangeException extends java.lang.Exception {
        
        public InvalidLocalChangeException(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super();
        }
    }
}