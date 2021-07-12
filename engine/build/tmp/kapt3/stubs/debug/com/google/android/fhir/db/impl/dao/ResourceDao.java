package com.google.android.fhir.db.impl.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J#\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ/\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ/\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u001f\u0010%\u001a\u00020!2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u0017H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0019\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020*H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u0019\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u0019\u00100\u001a\u00020!2\u0006\u00101\u001a\u000202H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u0019\u00104\u001a\u00020!2\u0006\u00105\u001a\u000206H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u0019\u00108\u001a\u00020!2\u0006\u00109\u001a\u00020:H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u0019\u0010<\u001a\u00020!2\u0006\u0010=\u001a\u00020>H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010?J\u0019\u0010@\u001a\u00020!2\u0006\u0010A\u001a\u00020BH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010CJ\u0019\u0010D\u001a\u00020!2\u0006\u0010\"\u001a\u00020EH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010FJ\u0019\u0010D\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010G\u001a\u00020!2\u0006\u0010H\u001a\u00020IH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010JJ\u0019\u0010K\u001a\u00020!2\u0006\u0010L\u001a\u00020MH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010NJ\u0019\u0010O\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J!\u0010P\u001a\u00020!2\u0006\u0010Q\u001a\u00020R2\u0006\u0010\"\u001a\u00020EH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010SJ)\u0010T\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010VR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006W"}, d2 = {"Lcom/google/android/fhir/db/impl/dao/ResourceDao;", "", "()V", "iParser", "Lca/uhn/fhir/parser/IParser;", "getIParser", "()Lca/uhn/fhir/parser/IParser;", "setIParser", "(Lca/uhn/fhir/parser/IParser;)V", "countResources", "", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteResource", "", "resourceId", "", "resourceType", "Lorg/hl7/fhir/r4/model/ResourceType;", "(Ljava/lang/String;Lorg/hl7/fhir/r4/model/ResourceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResource", "getResourceByCodeIndex", "", "indexPath", "indexSystem", "indexValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResourceByReferenceIndex", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResourceByStringIndex", "getResources", "insert", "", "resource", "Lorg/hl7/fhir/r4/model/Resource;", "(Lorg/hl7/fhir/r4/model/Resource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "resources", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCodeIndex", "tokenIndexEntity", "Lcom/google/android/fhir/db/impl/entities/TokenIndexEntity;", "(Lcom/google/android/fhir/db/impl/entities/TokenIndexEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDateIndex", "dateIndexEntity", "Lcom/google/android/fhir/db/impl/entities/DateIndexEntity;", "(Lcom/google/android/fhir/db/impl/entities/DateIndexEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDateTimeIndex", "dateTimeIndexEntity", "Lcom/google/android/fhir/db/impl/entities/DateTimeIndexEntity;", "(Lcom/google/android/fhir/db/impl/entities/DateTimeIndexEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertNumberIndex", "numberIndexEntity", "Lcom/google/android/fhir/db/impl/entities/NumberIndexEntity;", "(Lcom/google/android/fhir/db/impl/entities/NumberIndexEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPositionIndex", "positionIndexEntity", "Lcom/google/android/fhir/db/impl/entities/PositionIndexEntity;", "(Lcom/google/android/fhir/db/impl/entities/PositionIndexEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertQuantityIndex", "quantityIndexEntity", "Lcom/google/android/fhir/db/impl/entities/QuantityIndexEntity;", "(Lcom/google/android/fhir/db/impl/entities/QuantityIndexEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertReferenceIndex", "referenceIndexEntity", "Lcom/google/android/fhir/db/impl/entities/ReferenceIndexEntity;", "(Lcom/google/android/fhir/db/impl/entities/ReferenceIndexEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertResource", "Lcom/google/android/fhir/db/impl/entities/ResourceEntity;", "(Lcom/google/android/fhir/db/impl/entities/ResourceEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertStringIndex", "stringIndexEntity", "Lcom/google/android/fhir/db/impl/entities/StringIndexEntity;", "(Lcom/google/android/fhir/db/impl/entities/StringIndexEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertUriIndex", "uriIndexEntity", "Lcom/google/android/fhir/db/impl/entities/UriIndexEntity;", "(Lcom/google/android/fhir/db/impl/entities/UriIndexEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "updateIndicesForResource", "index", "Lcom/google/android/fhir/index/ResourceIndices;", "(Lcom/google/android/fhir/index/ResourceIndices;Lcom/google/android/fhir/db/impl/entities/ResourceEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateResource", "serializedResource", "(Ljava/lang/String;Lorg/hl7/fhir/r4/model/ResourceType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "engine_debug"})
public abstract class ResourceDao {
    public ca.uhn.fhir.parser.IParser iParser;
    
    @org.jetbrains.annotations.NotNull()
    public final ca.uhn.fhir.parser.IParser getIParser() {
        return null;
    }
    
    public final void setIParser(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.parser.IParser p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @ca.uhn.fhir.rest.annotation.Transaction()
    public java.lang.Object update(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.Resource p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @ca.uhn.fhir.rest.annotation.Transaction()
    public java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.Resource p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @ca.uhn.fhir.rest.annotation.Transaction()
    public java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.hl7.fhir.r4.model.Resource> p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertResource(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.ResourceEntity resource, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertStringIndex(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.StringIndexEntity stringIndexEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertReferenceIndex(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.ReferenceIndexEntity referenceIndexEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertCodeIndex(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.TokenIndexEntity tokenIndexEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertQuantityIndex(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.QuantityIndexEntity quantityIndexEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertUriIndex(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.UriIndexEntity uriIndexEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertDateIndex(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.DateIndexEntity dateIndexEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertDateTimeIndex(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.DateTimeIndexEntity dateTimeIndexEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertNumberIndex(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.NumberIndexEntity numberIndexEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertPositionIndex(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.PositionIndexEntity positionIndexEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        UPDATE ResourceEntity\n        SET serializedResource = :serializedResource\n        WHERE resourceId = :resourceId\n        AND resourceType = :resourceType\n        ")
    public abstract java.lang.Object updateResource(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceId, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType resourceType, @org.jetbrains.annotations.NotNull()
    java.lang.String serializedResource, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p3);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        DELETE FROM ResourceEntity\n        WHERE resourceId = :resourceId AND resourceType = :resourceType")
    public abstract java.lang.Object deleteResource(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceId, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType resourceType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p2);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT serializedResource\n        FROM ResourceEntity\n        WHERE resourceId = :resourceId AND resourceType = :resourceType")
    public abstract java.lang.Object getResource(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceId, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType resourceType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p2);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT ResourceEntity.serializedResource\n        FROM ResourceEntity \n        JOIN ReferenceIndexEntity\n        ON ResourceEntity.resourceType = ReferenceIndexEntity.resourceType\n            AND ResourceEntity.resourceId = ReferenceIndexEntity.resourceId\n        WHERE ReferenceIndexEntity.resourceType = :resourceType\n            AND ReferenceIndexEntity.index_path = :indexPath\n            AND ReferenceIndexEntity.index_value = :indexValue")
    public abstract java.lang.Object getResourceByReferenceIndex(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceType, @org.jetbrains.annotations.NotNull()
    java.lang.String indexPath, @org.jetbrains.annotations.NotNull()
    java.lang.String indexValue, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT ResourceEntity.serializedResource\n        FROM ResourceEntity\n        JOIN StringIndexEntity\n        ON ResourceEntity.resourceType = StringIndexEntity.resourceType\n            AND ResourceEntity.resourceId = StringIndexEntity.resourceId\n        WHERE StringIndexEntity.resourceType = :resourceType\n            AND StringIndexEntity.index_path = :indexPath\n            AND StringIndexEntity.index_value = :indexValue")
    public abstract java.lang.Object getResourceByStringIndex(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceType, @org.jetbrains.annotations.NotNull()
    java.lang.String indexPath, @org.jetbrains.annotations.NotNull()
    java.lang.String indexValue, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT ResourceEntity.serializedResource\n        FROM ResourceEntity\n        JOIN TokenIndexEntity\n        ON ResourceEntity.resourceType = TokenIndexEntity.resourceType\n            AND ResourceEntity.resourceId = TokenIndexEntity.resourceId\n        WHERE TokenIndexEntity.resourceType = :resourceType\n            AND TokenIndexEntity.index_path = :indexPath\n            AND TokenIndexEntity.index_system = :indexSystem\n            AND TokenIndexEntity.index_value = :indexValue")
    public abstract java.lang.Object getResourceByCodeIndex(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceType, @org.jetbrains.annotations.NotNull()
    java.lang.String indexPath, @org.jetbrains.annotations.NotNull()
    java.lang.String indexSystem, @org.jetbrains.annotations.NotNull()
    java.lang.String indexValue, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> p4);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.RawQuery()
    public abstract java.lang.Object getResources(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.RawQuery()
    public abstract java.lang.Object countResources(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    public ResourceDao() {
        super();
    }
}