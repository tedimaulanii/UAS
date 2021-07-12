package com.google.android.fhir.db.impl.dao;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J%\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000\u00a2\u0006\u0002\b\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u0014\u0010\u0016\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018J$\u0010\u0019\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001b\u0012\u0004\u0012\u00020\u001c0\u001a*\u00020\bH\u0002\u00a8\u0006\u001d"}, d2 = {"Lcom/google/android/fhir/db/impl/dao/LocalChangeUtils;", "", "()V", "applyPatch", "", "resourceString", "patchString", "diff", "Lorg/json/JSONArray;", "parser", "Lca/uhn/fhir/parser/IParser;", "source", "Lorg/hl7/fhir/r4/model/Resource;", "target", "diff$engine_debug", "mergeLocalChanges", "Lcom/google/android/fhir/db/impl/entities/LocalChangeEntity;", "first", "second", "mergePatches", "firstPatch", "secondPatch", "squash", "localChangeEntities", "", "patchMergeMap", "", "Lkotlin/Pair;", "Lorg/json/JSONObject;", "engine_debug"})
public final class LocalChangeUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.fhir.db.impl.dao.LocalChangeUtils INSTANCE = null;
    
    /**
     * Squash the changes by merging them two at a time.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.db.impl.entities.LocalChangeEntity squash(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.db.impl.entities.LocalChangeEntity> localChangeEntities) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.db.impl.entities.LocalChangeEntity mergeLocalChanges(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.LocalChangeEntity first, @org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.LocalChangeEntity second) {
        return null;
    }
    
    /**
     * Update a JSON object with a JSON patch (RFC 6902).
     */
    private final java.lang.String applyPatch(java.lang.String resourceString, java.lang.String patchString) {
        return null;
    }
    
    /**
     * Merge two JSON patch strings by concatenating their elements into a new JSON array.
     */
    private final java.lang.String mergePatches(java.lang.String firstPatch, java.lang.String secondPatch) {
        return null;
    }
    
    /**
     * Calculates the JSON patch between two [Resource] s.
     */
    @org.jetbrains.annotations.NotNull()
    public final org.json.JSONArray diff$engine_debug(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.parser.IParser parser, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.Resource source, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.Resource target) {
        return null;
    }
    
    /**
     * Creates a mutable map from operation type (e.g. add/remove) + property path to the entire
     * operation containing the updated value. Two such maps can be merged using `Map.putAll()` to
     * yield a minimal set of operations equivalent to individual patches.
     */
    private final java.util.Map<kotlin.Pair<java.lang.String, java.lang.String>, org.json.JSONObject> patchMergeMap(org.json.JSONArray $this$patchMergeMap) {
        return null;
    }
    
    private LocalChangeUtils() {
        super();
    }
}