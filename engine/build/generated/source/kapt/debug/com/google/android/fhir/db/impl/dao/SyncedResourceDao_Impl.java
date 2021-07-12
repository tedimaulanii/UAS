package com.google.android.fhir.db.impl.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.google.android.fhir.db.impl.DbTypeConverters;
import com.google.android.fhir.db.impl.entities.SyncedResourceEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.hl7.fhir.r4.model.ResourceType;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SyncedResourceDao_Impl implements SyncedResourceDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SyncedResourceEntity> __insertionAdapterOfSyncedResourceEntity;

  public SyncedResourceDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSyncedResourceEntity = new EntityInsertionAdapter<SyncedResourceEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SyncedResourceEntity` (`resourceType`,`lastUpdate`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SyncedResourceEntity value) {
        final String _tmp;
        _tmp = DbTypeConverters.INSTANCE.typeToString(value.getResourceType());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getLastUpdate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getLastUpdate());
        }
      }
    };
  }

  @Override
  public Object insert(final SyncedResourceEntity entity, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSyncedResourceEntity.insert(entity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertAll(final List<SyncedResourceEntity> resources,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSyncedResourceEntity.insert(resources);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getLastUpdate(final ResourceType resourceType,
      final Continuation<? super String> p1) {
    final String _sql = "SELECT lastUpdate FROM SyncedResourceEntity \n"
            + "        WHERE resourceType = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
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
    }, p1);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
