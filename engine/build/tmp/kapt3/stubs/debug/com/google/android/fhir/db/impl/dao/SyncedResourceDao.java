package com.google.android.fhir.db.impl.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/google/android/fhir/db/impl/dao/SyncedResourceDao;", "", "getLastUpdate", "", "resourceType", "Lorg/hl7/fhir/r4/model/ResourceType;", "(Lorg/hl7/fhir/r4/model/ResourceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "entity", "Lcom/google/android/fhir/db/impl/entities/SyncedResourceEntity;", "(Lcom/google/android/fhir/db/impl/entities/SyncedResourceEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "resources", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "engine_debug"})
public abstract interface SyncedResourceDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.SyncedResourceEntity entity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.db.impl.entities.SyncedResourceEntity> resources, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    /**
     * We will always have 1 entry for each [ResourceType] as it's the primary key, so we can limit
     * the result to 1. If there is no entry for that [ResourceType] then `null` will be returned.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT lastUpdate FROM SyncedResourceEntity \n        WHERE resourceType = :resourceType LIMIT 1")
    public abstract java.lang.Object getLastUpdate(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType resourceType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1);
}