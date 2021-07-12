package com.google.android.fhir.db.impl.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.google.android.fhir.db.impl.DbTypeConverters;
import com.google.android.fhir.db.impl.entities.DateIndexEntity;
import com.google.android.fhir.db.impl.entities.DateTimeIndexEntity;
import com.google.android.fhir.db.impl.entities.NumberIndexEntity;
import com.google.android.fhir.db.impl.entities.PositionIndexEntity;
import com.google.android.fhir.db.impl.entities.QuantityIndexEntity;
import com.google.android.fhir.db.impl.entities.ReferenceIndexEntity;
import com.google.android.fhir.db.impl.entities.ResourceEntity;
import com.google.android.fhir.db.impl.entities.StringIndexEntity;
import com.google.android.fhir.db.impl.entities.TokenIndexEntity;
import com.google.android.fhir.db.impl.entities.UriIndexEntity;
import com.google.android.fhir.index.entities.DateIndex;
import com.google.android.fhir.index.entities.DateTimeIndex;
import com.google.android.fhir.index.entities.NumberIndex;
import com.google.android.fhir.index.entities.PositionIndex;
import com.google.android.fhir.index.entities.QuantityIndex;
import com.google.android.fhir.index.entities.ReferenceIndex;
import com.google.android.fhir.index.entities.StringIndex;
import com.google.android.fhir.index.entities.TokenIndex;
import com.google.android.fhir.index.entities.UriIndex;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.hl7.fhir.r4.model.ResourceType;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ResourceDao_Impl extends ResourceDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ResourceEntity> __insertionAdapterOfResourceEntity;

  private final EntityInsertionAdapter<StringIndexEntity> __insertionAdapterOfStringIndexEntity;

  private final EntityInsertionAdapter<ReferenceIndexEntity> __insertionAdapterOfReferenceIndexEntity;

  private final EntityInsertionAdapter<TokenIndexEntity> __insertionAdapterOfTokenIndexEntity;

  private final EntityInsertionAdapter<QuantityIndexEntity> __insertionAdapterOfQuantityIndexEntity;

  private final EntityInsertionAdapter<UriIndexEntity> __insertionAdapterOfUriIndexEntity;

  private final EntityInsertionAdapter<DateIndexEntity> __insertionAdapterOfDateIndexEntity;

  private final EntityInsertionAdapter<DateTimeIndexEntity> __insertionAdapterOfDateTimeIndexEntity;

  private final EntityInsertionAdapter<NumberIndexEntity> __insertionAdapterOfNumberIndexEntity;

  private final EntityInsertionAdapter<PositionIndexEntity> __insertionAdapterOfPositionIndexEntity;

  private final SharedSQLiteStatement __preparedStmtOfUpdateResource;

  private final SharedSQLiteStatement __preparedStmtOfDeleteResource;

  public ResourceDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfResourceEntity = new EntityInsertionAdapter<ResourceEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ResourceEntity` (`id`,`resourceType`,`resourceId`,`serializedResource`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ResourceEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = DbTypeConverters.INSTANCE.typeToString(value.getResourceType());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.getResourceId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getResourceId());
        }
        if (value.getSerializedResource() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSerializedResource());
        }
      }
    };
    this.__insertionAdapterOfStringIndexEntity = new EntityInsertionAdapter<StringIndexEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `StringIndexEntity` (`id`,`resourceType`,`resourceId`,`index_name`,`index_path`,`index_value`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StringIndexEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = DbTypeConverters.INSTANCE.typeToString(value.getResourceType());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.getResourceId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getResourceId());
        }
        final StringIndex _tmpIndex = value.getIndex();
        if(_tmpIndex != null) {
          if (_tmpIndex.getName() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpIndex.getName());
          }
          if (_tmpIndex.getPath() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpIndex.getPath());
          }
          if (_tmpIndex.getValue() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpIndex.getValue());
          }
        } else {
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
        }
      }
    };
    this.__insertionAdapterOfReferenceIndexEntity = new EntityInsertionAdapter<ReferenceIndexEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ReferenceIndexEntity` (`id`,`resourceType`,`resourceId`,`index_name`,`index_path`,`index_value`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ReferenceIndexEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = DbTypeConverters.INSTANCE.typeToString(value.getResourceType());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.getResourceId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getResourceId());
        }
        final ReferenceIndex _tmpIndex = value.getIndex();
        if(_tmpIndex != null) {
          if (_tmpIndex.getName() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpIndex.getName());
          }
          if (_tmpIndex.getPath() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpIndex.getPath());
          }
          if (_tmpIndex.getValue() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpIndex.getValue());
          }
        } else {
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
        }
      }
    };
    this.__insertionAdapterOfTokenIndexEntity = new EntityInsertionAdapter<TokenIndexEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `TokenIndexEntity` (`id`,`resourceType`,`resourceId`,`index_name`,`index_path`,`index_system`,`index_value`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TokenIndexEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = DbTypeConverters.INSTANCE.typeToString(value.getResourceType());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.getResourceId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getResourceId());
        }
        final TokenIndex _tmpIndex = value.getIndex();
        if(_tmpIndex != null) {
          if (_tmpIndex.getName() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpIndex.getName());
          }
          if (_tmpIndex.getPath() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpIndex.getPath());
          }
          if (_tmpIndex.getSystem() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpIndex.getSystem());
          }
          if (_tmpIndex.getValue() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmpIndex.getValue());
          }
        } else {
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
          stmt.bindNull(7);
        }
      }
    };
    this.__insertionAdapterOfQuantityIndexEntity = new EntityInsertionAdapter<QuantityIndexEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `QuantityIndexEntity` (`id`,`resourceType`,`resourceId`,`index_name`,`index_path`,`index_system`,`index_unit`,`index_value`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, QuantityIndexEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = DbTypeConverters.INSTANCE.typeToString(value.getResourceType());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.getResourceId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getResourceId());
        }
        final QuantityIndex _tmpIndex = value.getIndex();
        if(_tmpIndex != null) {
          if (_tmpIndex.getName() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpIndex.getName());
          }
          if (_tmpIndex.getPath() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpIndex.getPath());
          }
          if (_tmpIndex.getSystem() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpIndex.getSystem());
          }
          if (_tmpIndex.getUnit() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmpIndex.getUnit());
          }
          final double _tmp_1;
          _tmp_1 = DbTypeConverters.INSTANCE.bigDecimalToDouble(_tmpIndex.getValue());
          stmt.bindDouble(8, _tmp_1);
        } else {
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
          stmt.bindNull(7);
          stmt.bindNull(8);
        }
      }
    };
    this.__insertionAdapterOfUriIndexEntity = new EntityInsertionAdapter<UriIndexEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `UriIndexEntity` (`id`,`resourceType`,`resourceId`,`index_name`,`index_path`,`index_uri`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UriIndexEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = DbTypeConverters.INSTANCE.typeToString(value.getResourceType());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.getResourceId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getResourceId());
        }
        final UriIndex _tmpIndex = value.getIndex();
        if(_tmpIndex != null) {
          if (_tmpIndex.getName() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpIndex.getName());
          }
          if (_tmpIndex.getPath() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpIndex.getPath());
          }
          if (_tmpIndex.getUri() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpIndex.getUri());
          }
        } else {
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
        }
      }
    };
    this.__insertionAdapterOfDateIndexEntity = new EntityInsertionAdapter<DateIndexEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `DateIndexEntity` (`id`,`resourceType`,`resourceId`,`index_name`,`index_path`,`index_from`,`index_to`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DateIndexEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = DbTypeConverters.INSTANCE.typeToString(value.getResourceType());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.getResourceId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getResourceId());
        }
        final DateIndex _tmpIndex = value.getIndex();
        if(_tmpIndex != null) {
          if (_tmpIndex.getName() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpIndex.getName());
          }
          if (_tmpIndex.getPath() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpIndex.getPath());
          }
          stmt.bindLong(6, _tmpIndex.getFrom());
          stmt.bindLong(7, _tmpIndex.getTo());
        } else {
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
          stmt.bindNull(7);
        }
      }
    };
    this.__insertionAdapterOfDateTimeIndexEntity = new EntityInsertionAdapter<DateTimeIndexEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `DateTimeIndexEntity` (`id`,`resourceType`,`resourceId`,`index_name`,`index_path`,`index_from`,`index_to`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DateTimeIndexEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = DbTypeConverters.INSTANCE.typeToString(value.getResourceType());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.getResourceId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getResourceId());
        }
        final DateTimeIndex _tmpIndex = value.getIndex();
        if(_tmpIndex != null) {
          if (_tmpIndex.getName() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpIndex.getName());
          }
          if (_tmpIndex.getPath() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpIndex.getPath());
          }
          stmt.bindLong(6, _tmpIndex.getFrom());
          stmt.bindLong(7, _tmpIndex.getTo());
        } else {
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
          stmt.bindNull(7);
        }
      }
    };
    this.__insertionAdapterOfNumberIndexEntity = new EntityInsertionAdapter<NumberIndexEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `NumberIndexEntity` (`id`,`resourceType`,`resourceId`,`index_name`,`index_path`,`index_value`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NumberIndexEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = DbTypeConverters.INSTANCE.typeToString(value.getResourceType());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.getResourceId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getResourceId());
        }
        final NumberIndex _tmpIndex = value.getIndex();
        if(_tmpIndex != null) {
          if (_tmpIndex.getName() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpIndex.getName());
          }
          if (_tmpIndex.getPath() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpIndex.getPath());
          }
          final double _tmp_1;
          _tmp_1 = DbTypeConverters.INSTANCE.bigDecimalToDouble(_tmpIndex.getValue());
          stmt.bindDouble(6, _tmp_1);
        } else {
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
        }
      }
    };
    this.__insertionAdapterOfPositionIndexEntity = new EntityInsertionAdapter<PositionIndexEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `PositionIndexEntity` (`id`,`resourceType`,`resourceId`,`index_latitude`,`index_longitude`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PositionIndexEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = DbTypeConverters.INSTANCE.typeToString(value.getResourceType());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.getResourceId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getResourceId());
        }
        final PositionIndex _tmpIndex = value.getIndex();
        if(_tmpIndex != null) {
          stmt.bindDouble(4, _tmpIndex.getLatitude());
          stmt.bindDouble(5, _tmpIndex.getLongitude());
        } else {
          stmt.bindNull(4);
          stmt.bindNull(5);
        }
      }
    };
    this.__preparedStmtOfUpdateResource = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE ResourceEntity\n"
                + "        SET serializedResource = ?\n"
                + "        WHERE resourceId = ?\n"
                + "        AND resourceType = ?\n"
                + "        ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteResource = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        DELETE FROM ResourceEntity\n"
                + "        WHERE resourceId = ? AND resourceType = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertResource(final ResourceEntity resource, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfResourceEntity.insert(resource);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertStringIndex(final StringIndexEntity stringIndexEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStringIndexEntity.insert(stringIndexEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertReferenceIndex(final ReferenceIndexEntity referenceIndexEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfReferenceIndexEntity.insert(referenceIndexEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertCodeIndex(final TokenIndexEntity tokenIndexEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTokenIndexEntity.insert(tokenIndexEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertQuantityIndex(final QuantityIndexEntity quantityIndexEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfQuantityIndexEntity.insert(quantityIndexEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertUriIndex(final UriIndexEntity uriIndexEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUriIndexEntity.insert(uriIndexEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertDateIndex(final DateIndexEntity dateIndexEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDateIndexEntity.insert(dateIndexEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertDateTimeIndex(final DateTimeIndexEntity dateTimeIndexEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDateTimeIndexEntity.insert(dateTimeIndexEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertNumberIndex(final NumberIndexEntity numberIndexEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNumberIndexEntity.insert(numberIndexEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertPositionIndex(final PositionIndexEntity positionIndexEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPositionIndexEntity.insert(positionIndexEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateResource(final String resourceId, final ResourceType resourceType,
      final String serializedResource, final Continuation<? super Unit> p3) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateResource.acquire();
        int _argIndex = 1;
        if (serializedResource == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, serializedResource);
        }
        _argIndex = 2;
        if (resourceId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, resourceId);
        }
        _argIndex = 3;
        final String _tmp;
        _tmp = DbTypeConverters.INSTANCE.typeToString(resourceType);
        if (_tmp == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, _tmp);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateResource.release(_stmt);
        }
      }
    }, p3);
  }

  @Override
  public Object deleteResource(final String resourceId, final ResourceType resourceType,
      final Continuation<? super Integer> p2) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteResource.acquire();
        int _argIndex = 1;
        if (resourceId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, resourceId);
        }
        _argIndex = 2;
        final String _tmp;
        _tmp = DbTypeConverters.INSTANCE.typeToString(resourceType);
        if (_tmp == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, _tmp);
        }
        __db.beginTransaction();
        try {
          final java.lang.Integer _result = _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteResource.release(_stmt);
        }
      }
    }, p2);
  }

  @Override
  public Object getResource(final String resourceId, final ResourceType resourceType,
      final Continuation<? super String> p2) {
    final String _sql = "\n"
            + "        SELECT serializedResource\n"
            + "        FROM ResourceEntity\n"
            + "        WHERE resourceId = ? AND resourceType = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (resourceId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, resourceId);
    }
    _argIndex = 2;
    final String _tmp;
    _tmp = DbTypeConverters.INSTANCE.typeToString(resourceType);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<String>() {
      @Override
      public String call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final String _result;
          if(_cursor.moveToFirst()) {
            if (_cursor.isNull(0)) {
              _result = null;
            } else {
              _result = _cursor.getString(0);
            }
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p2);
  }

  @Override
  public Object getResourceByReferenceIndex(final String resourceType, final String indexPath,
      final String indexValue, final Continuation<? super List<String>> p3) {
    final String _sql = "\n"
            + "        SELECT ResourceEntity.serializedResource\n"
            + "        FROM ResourceEntity \n"
            + "        JOIN ReferenceIndexEntity\n"
            + "        ON ResourceEntity.resourceType = ReferenceIndexEntity.resourceType\n"
            + "            AND ResourceEntity.resourceId = ReferenceIndexEntity.resourceId\n"
            + "        WHERE ReferenceIndexEntity.resourceType = ?\n"
            + "            AND ReferenceIndexEntity.index_path = ?\n"
            + "            AND ReferenceIndexEntity.index_value = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (resourceType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, resourceType);
    }
    _argIndex = 2;
    if (indexPath == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, indexPath);
    }
    _argIndex = 3;
    if (indexValue == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, indexValue);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getString(0);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p3);
  }

  @Override
  public Object getResourceByStringIndex(final String resourceType, final String indexPath,
      final String indexValue, final Continuation<? super List<String>> p3) {
    final String _sql = "\n"
            + "        SELECT ResourceEntity.serializedResource\n"
            + "        FROM ResourceEntity\n"
            + "        JOIN StringIndexEntity\n"
            + "        ON ResourceEntity.resourceType = StringIndexEntity.resourceType\n"
            + "            AND ResourceEntity.resourceId = StringIndexEntity.resourceId\n"
            + "        WHERE StringIndexEntity.resourceType = ?\n"
            + "            AND StringIndexEntity.index_path = ?\n"
            + "            AND StringIndexEntity.index_value = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (resourceType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, resourceType);
    }
    _argIndex = 2;
    if (indexPath == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, indexPath);
    }
    _argIndex = 3;
    if (indexValue == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, indexValue);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getString(0);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p3);
  }

  @Override
  public Object getResourceByCodeIndex(final String resourceType, final String indexPath,
      final String indexSystem, final String indexValue,
      final Continuation<? super List<String>> p4) {
    final String _sql = "\n"
            + "        SELECT ResourceEntity.serializedResource\n"
            + "        FROM ResourceEntity\n"
            + "        JOIN TokenIndexEntity\n"
            + "        ON ResourceEntity.resourceType = TokenIndexEntity.resourceType\n"
            + "            AND ResourceEntity.resourceId = TokenIndexEntity.resourceId\n"
            + "        WHERE TokenIndexEntity.resourceType = ?\n"
            + "            AND TokenIndexEntity.index_path = ?\n"
            + "            AND TokenIndexEntity.index_system = ?\n"
            + "            AND TokenIndexEntity.index_value = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (resourceType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, resourceType);
    }
    _argIndex = 2;
    if (indexPath == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, indexPath);
    }
    _argIndex = 3;
    if (indexSystem == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, indexSystem);
    }
    _argIndex = 4;
    if (indexValue == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, indexValue);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getString(0);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p4);
  }

  @Override
  public Object getResources(final SupportSQLiteQuery query,
      final Continuation<? super List<String>> p1) {
    final SupportSQLiteQuery _internalQuery = query;
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getString(0);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }
    }, p1);
  }

  @Override
  public Object countResources(final SupportSQLiteQuery query,
      final Continuation<? super Long> p1) {
    final SupportSQLiteQuery _internalQuery = query;
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            if (_cursor.isNull(0)) {
              _result = null;
            } else {
              _result = _cursor.getLong(0);
            }
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }
    }, p1);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
