package com.google.android.fhir.db.impl;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.google.android.fhir.db.impl.dao.LocalChangeDao;
import com.google.android.fhir.db.impl.dao.LocalChangeDao_Impl;
import com.google.android.fhir.db.impl.dao.ResourceDao;
import com.google.android.fhir.db.impl.dao.ResourceDao_Impl;
import com.google.android.fhir.db.impl.dao.SyncedResourceDao;
import com.google.android.fhir.db.impl.dao.SyncedResourceDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ResourceDatabase_Impl extends ResourceDatabase {
  private volatile ResourceDao _resourceDao;

  private volatile SyncedResourceDao _syncedResourceDao;

  private volatile LocalChangeDao _localChangeDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ResourceEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `resourceType` TEXT NOT NULL, `resourceId` TEXT NOT NULL, `serializedResource` TEXT NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_ResourceEntity_resourceType_resourceId` ON `ResourceEntity` (`resourceType`, `resourceId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `StringIndexEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `resourceType` TEXT NOT NULL, `resourceId` TEXT NOT NULL, `index_name` TEXT NOT NULL, `index_path` TEXT NOT NULL, `index_value` TEXT NOT NULL, FOREIGN KEY(`resourceId`, `resourceType`) REFERENCES `ResourceEntity`(`resourceId`, `resourceType`) ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_StringIndexEntity_resourceType_index_name_index_value` ON `StringIndexEntity` (`resourceType`, `index_name`, `index_value`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_StringIndexEntity_resourceId_resourceType` ON `StringIndexEntity` (`resourceId`, `resourceType`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ReferenceIndexEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `resourceType` TEXT NOT NULL, `resourceId` TEXT NOT NULL, `index_name` TEXT NOT NULL, `index_path` TEXT NOT NULL, `index_value` TEXT NOT NULL, FOREIGN KEY(`resourceId`, `resourceType`) REFERENCES `ResourceEntity`(`resourceId`, `resourceType`) ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_ReferenceIndexEntity_resourceType_index_name_index_value` ON `ReferenceIndexEntity` (`resourceType`, `index_name`, `index_value`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_ReferenceIndexEntity_resourceId_resourceType` ON `ReferenceIndexEntity` (`resourceId`, `resourceType`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TokenIndexEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `resourceType` TEXT NOT NULL, `resourceId` TEXT NOT NULL, `index_name` TEXT NOT NULL, `index_path` TEXT NOT NULL, `index_system` TEXT, `index_value` TEXT NOT NULL, FOREIGN KEY(`resourceId`, `resourceType`) REFERENCES `ResourceEntity`(`resourceId`, `resourceType`) ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_TokenIndexEntity_resourceType_index_name_index_system_index_value` ON `TokenIndexEntity` (`resourceType`, `index_name`, `index_system`, `index_value`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_TokenIndexEntity_resourceId_resourceType` ON `TokenIndexEntity` (`resourceId`, `resourceType`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `QuantityIndexEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `resourceType` TEXT NOT NULL, `resourceId` TEXT NOT NULL, `index_name` TEXT NOT NULL, `index_path` TEXT NOT NULL, `index_system` TEXT NOT NULL, `index_unit` TEXT NOT NULL, `index_value` REAL NOT NULL, FOREIGN KEY(`resourceId`, `resourceType`) REFERENCES `ResourceEntity`(`resourceId`, `resourceType`) ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_QuantityIndexEntity_resourceType_index_name_index_value` ON `QuantityIndexEntity` (`resourceType`, `index_name`, `index_value`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_QuantityIndexEntity_resourceId_resourceType` ON `QuantityIndexEntity` (`resourceId`, `resourceType`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UriIndexEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `resourceType` TEXT NOT NULL, `resourceId` TEXT NOT NULL, `index_name` TEXT NOT NULL, `index_path` TEXT NOT NULL, `index_uri` TEXT NOT NULL, FOREIGN KEY(`resourceId`, `resourceType`) REFERENCES `ResourceEntity`(`resourceId`, `resourceType`) ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_UriIndexEntity_resourceType_index_name_index_uri` ON `UriIndexEntity` (`resourceType`, `index_name`, `index_uri`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_UriIndexEntity_resourceId_resourceType` ON `UriIndexEntity` (`resourceId`, `resourceType`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `DateIndexEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `resourceType` TEXT NOT NULL, `resourceId` TEXT NOT NULL, `index_name` TEXT NOT NULL, `index_path` TEXT NOT NULL, `index_from` INTEGER NOT NULL, `index_to` INTEGER NOT NULL, FOREIGN KEY(`resourceId`, `resourceType`) REFERENCES `ResourceEntity`(`resourceId`, `resourceType`) ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_DateIndexEntity_resourceType_index_name_index_from_index_to` ON `DateIndexEntity` (`resourceType`, `index_name`, `index_from`, `index_to`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_DateIndexEntity_resourceId_resourceType` ON `DateIndexEntity` (`resourceId`, `resourceType`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `DateTimeIndexEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `resourceType` TEXT NOT NULL, `resourceId` TEXT NOT NULL, `index_name` TEXT NOT NULL, `index_path` TEXT NOT NULL, `index_from` INTEGER NOT NULL, `index_to` INTEGER NOT NULL, FOREIGN KEY(`resourceId`, `resourceType`) REFERENCES `ResourceEntity`(`resourceId`, `resourceType`) ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_DateTimeIndexEntity_resourceType_index_name_index_from_index_to` ON `DateTimeIndexEntity` (`resourceType`, `index_name`, `index_from`, `index_to`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_DateTimeIndexEntity_resourceId_resourceType` ON `DateTimeIndexEntity` (`resourceId`, `resourceType`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `NumberIndexEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `resourceType` TEXT NOT NULL, `resourceId` TEXT NOT NULL, `index_name` TEXT NOT NULL, `index_path` TEXT NOT NULL, `index_value` REAL NOT NULL, FOREIGN KEY(`resourceId`, `resourceType`) REFERENCES `ResourceEntity`(`resourceId`, `resourceType`) ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_NumberIndexEntity_resourceType_index_name_index_value` ON `NumberIndexEntity` (`resourceType`, `index_name`, `index_value`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_NumberIndexEntity_resourceId_resourceType` ON `NumberIndexEntity` (`resourceId`, `resourceType`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SyncedResourceEntity` (`resourceType` TEXT NOT NULL, `lastUpdate` TEXT NOT NULL, PRIMARY KEY(`resourceType`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `LocalChangeEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `resourceType` TEXT NOT NULL, `resourceId` TEXT NOT NULL, `timestamp` TEXT NOT NULL, `type` INTEGER NOT NULL, `payload` TEXT NOT NULL)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_LocalChangeEntity_resourceType_resourceId` ON `LocalChangeEntity` (`resourceType`, `resourceId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PositionIndexEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `resourceType` TEXT NOT NULL, `resourceId` TEXT NOT NULL, `index_latitude` REAL NOT NULL, `index_longitude` REAL NOT NULL, FOREIGN KEY(`resourceId`, `resourceType`) REFERENCES `ResourceEntity`(`resourceId`, `resourceType`) ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_PositionIndexEntity_resourceType_index_latitude_index_longitude` ON `PositionIndexEntity` (`resourceType`, `index_latitude`, `index_longitude`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_PositionIndexEntity_resourceId_resourceType` ON `PositionIndexEntity` (`resourceId`, `resourceType`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '96355f03c269875c9aeeb4b359f5c77f')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `ResourceEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `StringIndexEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `ReferenceIndexEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `TokenIndexEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `QuantityIndexEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `UriIndexEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `DateIndexEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `DateTimeIndexEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `NumberIndexEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `SyncedResourceEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `LocalChangeEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `PositionIndexEntity`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsResourceEntity = new HashMap<String, TableInfo.Column>(4);
        _columnsResourceEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResourceEntity.put("resourceType", new TableInfo.Column("resourceType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResourceEntity.put("resourceId", new TableInfo.Column("resourceId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResourceEntity.put("serializedResource", new TableInfo.Column("serializedResource", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysResourceEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesResourceEntity = new HashSet<TableInfo.Index>(1);
        _indicesResourceEntity.add(new TableInfo.Index("index_ResourceEntity_resourceType_resourceId", true, Arrays.asList("resourceType","resourceId")));
        final TableInfo _infoResourceEntity = new TableInfo("ResourceEntity", _columnsResourceEntity, _foreignKeysResourceEntity, _indicesResourceEntity);
        final TableInfo _existingResourceEntity = TableInfo.read(_db, "ResourceEntity");
        if (! _infoResourceEntity.equals(_existingResourceEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "ResourceEntity(com.google.android.fhir.db.impl.entities.ResourceEntity).\n"
                  + " Expected:\n" + _infoResourceEntity + "\n"
                  + " Found:\n" + _existingResourceEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsStringIndexEntity = new HashMap<String, TableInfo.Column>(6);
        _columnsStringIndexEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStringIndexEntity.put("resourceType", new TableInfo.Column("resourceType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStringIndexEntity.put("resourceId", new TableInfo.Column("resourceId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStringIndexEntity.put("index_name", new TableInfo.Column("index_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStringIndexEntity.put("index_path", new TableInfo.Column("index_path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStringIndexEntity.put("index_value", new TableInfo.Column("index_value", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStringIndexEntity = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysStringIndexEntity.add(new TableInfo.ForeignKey("ResourceEntity", "CASCADE", "NO ACTION",Arrays.asList("resourceId","resourceType"), Arrays.asList("resourceId","resourceType")));
        final HashSet<TableInfo.Index> _indicesStringIndexEntity = new HashSet<TableInfo.Index>(2);
        _indicesStringIndexEntity.add(new TableInfo.Index("index_StringIndexEntity_resourceType_index_name_index_value", false, Arrays.asList("resourceType","index_name","index_value")));
        _indicesStringIndexEntity.add(new TableInfo.Index("index_StringIndexEntity_resourceId_resourceType", false, Arrays.asList("resourceId","resourceType")));
        final TableInfo _infoStringIndexEntity = new TableInfo("StringIndexEntity", _columnsStringIndexEntity, _foreignKeysStringIndexEntity, _indicesStringIndexEntity);
        final TableInfo _existingStringIndexEntity = TableInfo.read(_db, "StringIndexEntity");
        if (! _infoStringIndexEntity.equals(_existingStringIndexEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "StringIndexEntity(com.google.android.fhir.db.impl.entities.StringIndexEntity).\n"
                  + " Expected:\n" + _infoStringIndexEntity + "\n"
                  + " Found:\n" + _existingStringIndexEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsReferenceIndexEntity = new HashMap<String, TableInfo.Column>(6);
        _columnsReferenceIndexEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReferenceIndexEntity.put("resourceType", new TableInfo.Column("resourceType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReferenceIndexEntity.put("resourceId", new TableInfo.Column("resourceId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReferenceIndexEntity.put("index_name", new TableInfo.Column("index_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReferenceIndexEntity.put("index_path", new TableInfo.Column("index_path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReferenceIndexEntity.put("index_value", new TableInfo.Column("index_value", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysReferenceIndexEntity = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysReferenceIndexEntity.add(new TableInfo.ForeignKey("ResourceEntity", "CASCADE", "NO ACTION",Arrays.asList("resourceId","resourceType"), Arrays.asList("resourceId","resourceType")));
        final HashSet<TableInfo.Index> _indicesReferenceIndexEntity = new HashSet<TableInfo.Index>(2);
        _indicesReferenceIndexEntity.add(new TableInfo.Index("index_ReferenceIndexEntity_resourceType_index_name_index_value", false, Arrays.asList("resourceType","index_name","index_value")));
        _indicesReferenceIndexEntity.add(new TableInfo.Index("index_ReferenceIndexEntity_resourceId_resourceType", false, Arrays.asList("resourceId","resourceType")));
        final TableInfo _infoReferenceIndexEntity = new TableInfo("ReferenceIndexEntity", _columnsReferenceIndexEntity, _foreignKeysReferenceIndexEntity, _indicesReferenceIndexEntity);
        final TableInfo _existingReferenceIndexEntity = TableInfo.read(_db, "ReferenceIndexEntity");
        if (! _infoReferenceIndexEntity.equals(_existingReferenceIndexEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "ReferenceIndexEntity(com.google.android.fhir.db.impl.entities.ReferenceIndexEntity).\n"
                  + " Expected:\n" + _infoReferenceIndexEntity + "\n"
                  + " Found:\n" + _existingReferenceIndexEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsTokenIndexEntity = new HashMap<String, TableInfo.Column>(7);
        _columnsTokenIndexEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTokenIndexEntity.put("resourceType", new TableInfo.Column("resourceType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTokenIndexEntity.put("resourceId", new TableInfo.Column("resourceId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTokenIndexEntity.put("index_name", new TableInfo.Column("index_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTokenIndexEntity.put("index_path", new TableInfo.Column("index_path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTokenIndexEntity.put("index_system", new TableInfo.Column("index_system", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTokenIndexEntity.put("index_value", new TableInfo.Column("index_value", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTokenIndexEntity = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysTokenIndexEntity.add(new TableInfo.ForeignKey("ResourceEntity", "CASCADE", "NO ACTION",Arrays.asList("resourceId","resourceType"), Arrays.asList("resourceId","resourceType")));
        final HashSet<TableInfo.Index> _indicesTokenIndexEntity = new HashSet<TableInfo.Index>(2);
        _indicesTokenIndexEntity.add(new TableInfo.Index("index_TokenIndexEntity_resourceType_index_name_index_system_index_value", false, Arrays.asList("resourceType","index_name","index_system","index_value")));
        _indicesTokenIndexEntity.add(new TableInfo.Index("index_TokenIndexEntity_resourceId_resourceType", false, Arrays.asList("resourceId","resourceType")));
        final TableInfo _infoTokenIndexEntity = new TableInfo("TokenIndexEntity", _columnsTokenIndexEntity, _foreignKeysTokenIndexEntity, _indicesTokenIndexEntity);
        final TableInfo _existingTokenIndexEntity = TableInfo.read(_db, "TokenIndexEntity");
        if (! _infoTokenIndexEntity.equals(_existingTokenIndexEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "TokenIndexEntity(com.google.android.fhir.db.impl.entities.TokenIndexEntity).\n"
                  + " Expected:\n" + _infoTokenIndexEntity + "\n"
                  + " Found:\n" + _existingTokenIndexEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsQuantityIndexEntity = new HashMap<String, TableInfo.Column>(8);
        _columnsQuantityIndexEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQuantityIndexEntity.put("resourceType", new TableInfo.Column("resourceType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQuantityIndexEntity.put("resourceId", new TableInfo.Column("resourceId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQuantityIndexEntity.put("index_name", new TableInfo.Column("index_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQuantityIndexEntity.put("index_path", new TableInfo.Column("index_path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQuantityIndexEntity.put("index_system", new TableInfo.Column("index_system", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQuantityIndexEntity.put("index_unit", new TableInfo.Column("index_unit", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQuantityIndexEntity.put("index_value", new TableInfo.Column("index_value", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysQuantityIndexEntity = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysQuantityIndexEntity.add(new TableInfo.ForeignKey("ResourceEntity", "CASCADE", "NO ACTION",Arrays.asList("resourceId","resourceType"), Arrays.asList("resourceId","resourceType")));
        final HashSet<TableInfo.Index> _indicesQuantityIndexEntity = new HashSet<TableInfo.Index>(2);
        _indicesQuantityIndexEntity.add(new TableInfo.Index("index_QuantityIndexEntity_resourceType_index_name_index_value", false, Arrays.asList("resourceType","index_name","index_value")));
        _indicesQuantityIndexEntity.add(new TableInfo.Index("index_QuantityIndexEntity_resourceId_resourceType", false, Arrays.asList("resourceId","resourceType")));
        final TableInfo _infoQuantityIndexEntity = new TableInfo("QuantityIndexEntity", _columnsQuantityIndexEntity, _foreignKeysQuantityIndexEntity, _indicesQuantityIndexEntity);
        final TableInfo _existingQuantityIndexEntity = TableInfo.read(_db, "QuantityIndexEntity");
        if (! _infoQuantityIndexEntity.equals(_existingQuantityIndexEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "QuantityIndexEntity(com.google.android.fhir.db.impl.entities.QuantityIndexEntity).\n"
                  + " Expected:\n" + _infoQuantityIndexEntity + "\n"
                  + " Found:\n" + _existingQuantityIndexEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsUriIndexEntity = new HashMap<String, TableInfo.Column>(6);
        _columnsUriIndexEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUriIndexEntity.put("resourceType", new TableInfo.Column("resourceType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUriIndexEntity.put("resourceId", new TableInfo.Column("resourceId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUriIndexEntity.put("index_name", new TableInfo.Column("index_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUriIndexEntity.put("index_path", new TableInfo.Column("index_path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUriIndexEntity.put("index_uri", new TableInfo.Column("index_uri", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUriIndexEntity = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysUriIndexEntity.add(new TableInfo.ForeignKey("ResourceEntity", "CASCADE", "NO ACTION",Arrays.asList("resourceId","resourceType"), Arrays.asList("resourceId","resourceType")));
        final HashSet<TableInfo.Index> _indicesUriIndexEntity = new HashSet<TableInfo.Index>(2);
        _indicesUriIndexEntity.add(new TableInfo.Index("index_UriIndexEntity_resourceType_index_name_index_uri", false, Arrays.asList("resourceType","index_name","index_uri")));
        _indicesUriIndexEntity.add(new TableInfo.Index("index_UriIndexEntity_resourceId_resourceType", false, Arrays.asList("resourceId","resourceType")));
        final TableInfo _infoUriIndexEntity = new TableInfo("UriIndexEntity", _columnsUriIndexEntity, _foreignKeysUriIndexEntity, _indicesUriIndexEntity);
        final TableInfo _existingUriIndexEntity = TableInfo.read(_db, "UriIndexEntity");
        if (! _infoUriIndexEntity.equals(_existingUriIndexEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "UriIndexEntity(com.google.android.fhir.db.impl.entities.UriIndexEntity).\n"
                  + " Expected:\n" + _infoUriIndexEntity + "\n"
                  + " Found:\n" + _existingUriIndexEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsDateIndexEntity = new HashMap<String, TableInfo.Column>(7);
        _columnsDateIndexEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDateIndexEntity.put("resourceType", new TableInfo.Column("resourceType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDateIndexEntity.put("resourceId", new TableInfo.Column("resourceId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDateIndexEntity.put("index_name", new TableInfo.Column("index_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDateIndexEntity.put("index_path", new TableInfo.Column("index_path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDateIndexEntity.put("index_from", new TableInfo.Column("index_from", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDateIndexEntity.put("index_to", new TableInfo.Column("index_to", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDateIndexEntity = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysDateIndexEntity.add(new TableInfo.ForeignKey("ResourceEntity", "CASCADE", "NO ACTION",Arrays.asList("resourceId","resourceType"), Arrays.asList("resourceId","resourceType")));
        final HashSet<TableInfo.Index> _indicesDateIndexEntity = new HashSet<TableInfo.Index>(2);
        _indicesDateIndexEntity.add(new TableInfo.Index("index_DateIndexEntity_resourceType_index_name_index_from_index_to", false, Arrays.asList("resourceType","index_name","index_from","index_to")));
        _indicesDateIndexEntity.add(new TableInfo.Index("index_DateIndexEntity_resourceId_resourceType", false, Arrays.asList("resourceId","resourceType")));
        final TableInfo _infoDateIndexEntity = new TableInfo("DateIndexEntity", _columnsDateIndexEntity, _foreignKeysDateIndexEntity, _indicesDateIndexEntity);
        final TableInfo _existingDateIndexEntity = TableInfo.read(_db, "DateIndexEntity");
        if (! _infoDateIndexEntity.equals(_existingDateIndexEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "DateIndexEntity(com.google.android.fhir.db.impl.entities.DateIndexEntity).\n"
                  + " Expected:\n" + _infoDateIndexEntity + "\n"
                  + " Found:\n" + _existingDateIndexEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsDateTimeIndexEntity = new HashMap<String, TableInfo.Column>(7);
        _columnsDateTimeIndexEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDateTimeIndexEntity.put("resourceType", new TableInfo.Column("resourceType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDateTimeIndexEntity.put("resourceId", new TableInfo.Column("resourceId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDateTimeIndexEntity.put("index_name", new TableInfo.Column("index_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDateTimeIndexEntity.put("index_path", new TableInfo.Column("index_path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDateTimeIndexEntity.put("index_from", new TableInfo.Column("index_from", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDateTimeIndexEntity.put("index_to", new TableInfo.Column("index_to", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDateTimeIndexEntity = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysDateTimeIndexEntity.add(new TableInfo.ForeignKey("ResourceEntity", "CASCADE", "NO ACTION",Arrays.asList("resourceId","resourceType"), Arrays.asList("resourceId","resourceType")));
        final HashSet<TableInfo.Index> _indicesDateTimeIndexEntity = new HashSet<TableInfo.Index>(2);
        _indicesDateTimeIndexEntity.add(new TableInfo.Index("index_DateTimeIndexEntity_resourceType_index_name_index_from_index_to", false, Arrays.asList("resourceType","index_name","index_from","index_to")));
        _indicesDateTimeIndexEntity.add(new TableInfo.Index("index_DateTimeIndexEntity_resourceId_resourceType", false, Arrays.asList("resourceId","resourceType")));
        final TableInfo _infoDateTimeIndexEntity = new TableInfo("DateTimeIndexEntity", _columnsDateTimeIndexEntity, _foreignKeysDateTimeIndexEntity, _indicesDateTimeIndexEntity);
        final TableInfo _existingDateTimeIndexEntity = TableInfo.read(_db, "DateTimeIndexEntity");
        if (! _infoDateTimeIndexEntity.equals(_existingDateTimeIndexEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "DateTimeIndexEntity(com.google.android.fhir.db.impl.entities.DateTimeIndexEntity).\n"
                  + " Expected:\n" + _infoDateTimeIndexEntity + "\n"
                  + " Found:\n" + _existingDateTimeIndexEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsNumberIndexEntity = new HashMap<String, TableInfo.Column>(6);
        _columnsNumberIndexEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNumberIndexEntity.put("resourceType", new TableInfo.Column("resourceType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNumberIndexEntity.put("resourceId", new TableInfo.Column("resourceId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNumberIndexEntity.put("index_name", new TableInfo.Column("index_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNumberIndexEntity.put("index_path", new TableInfo.Column("index_path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNumberIndexEntity.put("index_value", new TableInfo.Column("index_value", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNumberIndexEntity = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysNumberIndexEntity.add(new TableInfo.ForeignKey("ResourceEntity", "CASCADE", "NO ACTION",Arrays.asList("resourceId","resourceType"), Arrays.asList("resourceId","resourceType")));
        final HashSet<TableInfo.Index> _indicesNumberIndexEntity = new HashSet<TableInfo.Index>(2);
        _indicesNumberIndexEntity.add(new TableInfo.Index("index_NumberIndexEntity_resourceType_index_name_index_value", false, Arrays.asList("resourceType","index_name","index_value")));
        _indicesNumberIndexEntity.add(new TableInfo.Index("index_NumberIndexEntity_resourceId_resourceType", false, Arrays.asList("resourceId","resourceType")));
        final TableInfo _infoNumberIndexEntity = new TableInfo("NumberIndexEntity", _columnsNumberIndexEntity, _foreignKeysNumberIndexEntity, _indicesNumberIndexEntity);
        final TableInfo _existingNumberIndexEntity = TableInfo.read(_db, "NumberIndexEntity");
        if (! _infoNumberIndexEntity.equals(_existingNumberIndexEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "NumberIndexEntity(com.google.android.fhir.db.impl.entities.NumberIndexEntity).\n"
                  + " Expected:\n" + _infoNumberIndexEntity + "\n"
                  + " Found:\n" + _existingNumberIndexEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsSyncedResourceEntity = new HashMap<String, TableInfo.Column>(2);
        _columnsSyncedResourceEntity.put("resourceType", new TableInfo.Column("resourceType", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncedResourceEntity.put("lastUpdate", new TableInfo.Column("lastUpdate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSyncedResourceEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSyncedResourceEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSyncedResourceEntity = new TableInfo("SyncedResourceEntity", _columnsSyncedResourceEntity, _foreignKeysSyncedResourceEntity, _indicesSyncedResourceEntity);
        final TableInfo _existingSyncedResourceEntity = TableInfo.read(_db, "SyncedResourceEntity");
        if (! _infoSyncedResourceEntity.equals(_existingSyncedResourceEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "SyncedResourceEntity(com.google.android.fhir.db.impl.entities.SyncedResourceEntity).\n"
                  + " Expected:\n" + _infoSyncedResourceEntity + "\n"
                  + " Found:\n" + _existingSyncedResourceEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsLocalChangeEntity = new HashMap<String, TableInfo.Column>(6);
        _columnsLocalChangeEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocalChangeEntity.put("resourceType", new TableInfo.Column("resourceType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocalChangeEntity.put("resourceId", new TableInfo.Column("resourceId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocalChangeEntity.put("timestamp", new TableInfo.Column("timestamp", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocalChangeEntity.put("type", new TableInfo.Column("type", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocalChangeEntity.put("payload", new TableInfo.Column("payload", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLocalChangeEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLocalChangeEntity = new HashSet<TableInfo.Index>(1);
        _indicesLocalChangeEntity.add(new TableInfo.Index("index_LocalChangeEntity_resourceType_resourceId", false, Arrays.asList("resourceType","resourceId")));
        final TableInfo _infoLocalChangeEntity = new TableInfo("LocalChangeEntity", _columnsLocalChangeEntity, _foreignKeysLocalChangeEntity, _indicesLocalChangeEntity);
        final TableInfo _existingLocalChangeEntity = TableInfo.read(_db, "LocalChangeEntity");
        if (! _infoLocalChangeEntity.equals(_existingLocalChangeEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "LocalChangeEntity(com.google.android.fhir.db.impl.entities.LocalChangeEntity).\n"
                  + " Expected:\n" + _infoLocalChangeEntity + "\n"
                  + " Found:\n" + _existingLocalChangeEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsPositionIndexEntity = new HashMap<String, TableInfo.Column>(5);
        _columnsPositionIndexEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPositionIndexEntity.put("resourceType", new TableInfo.Column("resourceType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPositionIndexEntity.put("resourceId", new TableInfo.Column("resourceId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPositionIndexEntity.put("index_latitude", new TableInfo.Column("index_latitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPositionIndexEntity.put("index_longitude", new TableInfo.Column("index_longitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPositionIndexEntity = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysPositionIndexEntity.add(new TableInfo.ForeignKey("ResourceEntity", "CASCADE", "NO ACTION",Arrays.asList("resourceId","resourceType"), Arrays.asList("resourceId","resourceType")));
        final HashSet<TableInfo.Index> _indicesPositionIndexEntity = new HashSet<TableInfo.Index>(2);
        _indicesPositionIndexEntity.add(new TableInfo.Index("index_PositionIndexEntity_resourceType_index_latitude_index_longitude", false, Arrays.asList("resourceType","index_latitude","index_longitude")));
        _indicesPositionIndexEntity.add(new TableInfo.Index("index_PositionIndexEntity_resourceId_resourceType", false, Arrays.asList("resourceId","resourceType")));
        final TableInfo _infoPositionIndexEntity = new TableInfo("PositionIndexEntity", _columnsPositionIndexEntity, _foreignKeysPositionIndexEntity, _indicesPositionIndexEntity);
        final TableInfo _existingPositionIndexEntity = TableInfo.read(_db, "PositionIndexEntity");
        if (! _infoPositionIndexEntity.equals(_existingPositionIndexEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "PositionIndexEntity(com.google.android.fhir.db.impl.entities.PositionIndexEntity).\n"
                  + " Expected:\n" + _infoPositionIndexEntity + "\n"
                  + " Found:\n" + _existingPositionIndexEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "96355f03c269875c9aeeb4b359f5c77f", "d4faa145b31500e24a3362a198a36d80");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "ResourceEntity","StringIndexEntity","ReferenceIndexEntity","TokenIndexEntity","QuantityIndexEntity","UriIndexEntity","DateIndexEntity","DateTimeIndexEntity","NumberIndexEntity","SyncedResourceEntity","LocalChangeEntity","PositionIndexEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `ResourceEntity`");
      _db.execSQL("DELETE FROM `StringIndexEntity`");
      _db.execSQL("DELETE FROM `ReferenceIndexEntity`");
      _db.execSQL("DELETE FROM `TokenIndexEntity`");
      _db.execSQL("DELETE FROM `QuantityIndexEntity`");
      _db.execSQL("DELETE FROM `UriIndexEntity`");
      _db.execSQL("DELETE FROM `DateIndexEntity`");
      _db.execSQL("DELETE FROM `DateTimeIndexEntity`");
      _db.execSQL("DELETE FROM `NumberIndexEntity`");
      _db.execSQL("DELETE FROM `SyncedResourceEntity`");
      _db.execSQL("DELETE FROM `LocalChangeEntity`");
      _db.execSQL("DELETE FROM `PositionIndexEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ResourceDao.class, ResourceDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SyncedResourceDao.class, SyncedResourceDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(LocalChangeDao.class, LocalChangeDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public ResourceDao resourceDao() {
    if (_resourceDao != null) {
      return _resourceDao;
    } else {
      synchronized(this) {
        if(_resourceDao == null) {
          _resourceDao = new ResourceDao_Impl(this);
        }
        return _resourceDao;
      }
    }
  }

  @Override
  public SyncedResourceDao syncedResourceDao() {
    if (_syncedResourceDao != null) {
      return _syncedResourceDao;
    } else {
      synchronized(this) {
        if(_syncedResourceDao == null) {
          _syncedResourceDao = new SyncedResourceDao_Impl(this);
        }
        return _syncedResourceDao;
      }
    }
  }

  @Override
  public LocalChangeDao localChangeDao() {
    if (_localChangeDao != null) {
      return _localChangeDao;
    } else {
      synchronized(this) {
        if(_localChangeDao == null) {
          _localChangeDao = new LocalChangeDao_Impl(this);
        }
        return _localChangeDao;
      }
    }
  }
}
