/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.impala.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TErrorCode implements org.apache.thrift.TEnum {
  OK(0),
  UNUSED(1),
  GENERAL(2),
  CANCELLED(3),
  ANALYSIS_ERROR(4),
  NOT_IMPLEMENTED_ERROR(5),
  RUNTIME_ERROR(6),
  MEM_LIMIT_EXCEEDED(7),
  INTERNAL_ERROR(8),
  RECOVERABLE_ERROR(9),
  PARQUET_MULTIPLE_BLOCKS(10),
  PARQUET_COLUMN_METADATA_INVALID(11),
  PARQUET_HEADER_PAGE_SIZE_EXCEEDED(12),
  PARQUET_HEADER_EOF(13),
  PARQUET_GROUP_ROW_COUNT_ERROR(14),
  PARQUET_GROUP_ROW_COUNT_OVERFLOW(15),
  PARQUET_MISSING_PRECISION(16),
  PARQUET_WRONG_PRECISION(17),
  PARQUET_BAD_CONVERTED_TYPE(18),
  PARQUET_INCOMPATIBLE_DECIMAL(19),
  SEQUENCE_SCANNER_PARSE_ERROR(20),
  SNAPPY_DECOMPRESS_INVALID_BLOCK_SIZE(21),
  SNAPPY_DECOMPRESS_INVALID_COMPRESSED_LENGTH(22),
  SNAPPY_DECOMPRESS_UNCOMPRESSED_LENGTH_FAILED(23),
  SNAPPY_DECOMPRESS_RAW_UNCOMPRESS_FAILED(24),
  SNAPPY_DECOMPRESS_DECOMPRESS_SIZE_INCORRECT(25),
  HDFS_SCAN_NODE_UNKNOWN_DISK(26),
  FRAGMENT_EXECUTOR(27),
  PARTITIONED_HASH_JOIN_MAX_PARTITION_DEPTH(28),
  PARTITIONED_AGG_MAX_PARTITION_DEPTH(29),
  MISSING_BUILTIN(30),
  RPC_GENERAL_ERROR(31),
  RPC_TIMEOUT(32),
  UDF_VERIFY_FAILED(33),
  PARQUET_CORRUPT_VALUE(34),
  AVRO_DECIMAL_RESOLUTION_ERROR(35),
  AVRO_DECIMAL_METADATA_MISMATCH(36),
  AVRO_SCHEMA_RESOLUTION_ERROR(37),
  AVRO_SCHEMA_METADATA_MISMATCH(38),
  AVRO_UNSUPPORTED_DEFAULT_VALUE(39),
  AVRO_MISSING_FIELD(40),
  AVRO_MISSING_DEFAULT(41),
  AVRO_NULLABILITY_MISMATCH(42),
  AVRO_NOT_A_RECORD(43),
  PARQUET_DEF_LEVEL_ERROR(44),
  PARQUET_NUM_COL_VALS_ERROR(45),
  PARQUET_DICT_DECODE_FAILURE(46),
  SSL_PASSWORD_CMD_FAILED(47),
  SSL_CERTIFICATE_PATH_BLANK(48),
  SSL_PRIVATE_KEY_PATH_BLANK(49),
  SSL_CERTIFICATE_NOT_FOUND(50),
  SSL_PRIVATE_KEY_NOT_FOUND(51),
  SSL_SOCKET_CREATION_FAILED(52),
  MEM_ALLOC_FAILED(53),
  PARQUET_REP_LEVEL_ERROR(54),
  PARQUET_UNRECOGNIZED_SCHEMA(55),
  COLLECTION_ALLOC_FAILED(56),
  TMP_DEVICE_BLACKLISTED(57),
  TMP_FILE_BLACKLISTED(58),
  RPC_CLIENT_CONNECT_FAILURE(59),
  STALE_METADATA_FILE_TOO_SHORT(60),
  PARQUET_BAD_VERSION_NUMBER(61),
  SCANNER_INCOMPLETE_READ(62),
  SCANNER_INVALID_READ(63),
  AVRO_BAD_VERSION_HEADER(64),
  UDF_MEM_LIMIT_EXCEEDED(65),
  BTS_BLOCK_OVERFLOW(66),
  COMPRESSED_FILE_MULTIPLE_BLOCKS(67),
  COMPRESSED_FILE_BLOCK_CORRUPTED(68),
  COMPRESSED_FILE_DECOMPRESSOR_ERROR(69),
  COMPRESSED_FILE_DECOMPRESSOR_NO_PROGRESS(70),
  COMPRESSED_FILE_TRUNCATED(71),
  DATASTREAM_SENDER_TIMEOUT(72),
  KUDU_IMPALA_TYPE_MISSING(73),
  IMPALA_KUDU_TYPE_MISSING(74),
  KUDU_NOT_SUPPORTED_ON_OS(75),
  KUDU_NOT_ENABLED(76),
  PARTITIONED_HASH_JOIN_REPARTITION_FAILS(77),
  PARTITIONED_AGG_REPARTITION_FAILS(78);

  private final int value;

  private TErrorCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TErrorCode findByValue(int value) { 
    switch (value) {
      case 0:
        return OK;
      case 1:
        return UNUSED;
      case 2:
        return GENERAL;
      case 3:
        return CANCELLED;
      case 4:
        return ANALYSIS_ERROR;
      case 5:
        return NOT_IMPLEMENTED_ERROR;
      case 6:
        return RUNTIME_ERROR;
      case 7:
        return MEM_LIMIT_EXCEEDED;
      case 8:
        return INTERNAL_ERROR;
      case 9:
        return RECOVERABLE_ERROR;
      case 10:
        return PARQUET_MULTIPLE_BLOCKS;
      case 11:
        return PARQUET_COLUMN_METADATA_INVALID;
      case 12:
        return PARQUET_HEADER_PAGE_SIZE_EXCEEDED;
      case 13:
        return PARQUET_HEADER_EOF;
      case 14:
        return PARQUET_GROUP_ROW_COUNT_ERROR;
      case 15:
        return PARQUET_GROUP_ROW_COUNT_OVERFLOW;
      case 16:
        return PARQUET_MISSING_PRECISION;
      case 17:
        return PARQUET_WRONG_PRECISION;
      case 18:
        return PARQUET_BAD_CONVERTED_TYPE;
      case 19:
        return PARQUET_INCOMPATIBLE_DECIMAL;
      case 20:
        return SEQUENCE_SCANNER_PARSE_ERROR;
      case 21:
        return SNAPPY_DECOMPRESS_INVALID_BLOCK_SIZE;
      case 22:
        return SNAPPY_DECOMPRESS_INVALID_COMPRESSED_LENGTH;
      case 23:
        return SNAPPY_DECOMPRESS_UNCOMPRESSED_LENGTH_FAILED;
      case 24:
        return SNAPPY_DECOMPRESS_RAW_UNCOMPRESS_FAILED;
      case 25:
        return SNAPPY_DECOMPRESS_DECOMPRESS_SIZE_INCORRECT;
      case 26:
        return HDFS_SCAN_NODE_UNKNOWN_DISK;
      case 27:
        return FRAGMENT_EXECUTOR;
      case 28:
        return PARTITIONED_HASH_JOIN_MAX_PARTITION_DEPTH;
      case 29:
        return PARTITIONED_AGG_MAX_PARTITION_DEPTH;
      case 30:
        return MISSING_BUILTIN;
      case 31:
        return RPC_GENERAL_ERROR;
      case 32:
        return RPC_TIMEOUT;
      case 33:
        return UDF_VERIFY_FAILED;
      case 34:
        return PARQUET_CORRUPT_VALUE;
      case 35:
        return AVRO_DECIMAL_RESOLUTION_ERROR;
      case 36:
        return AVRO_DECIMAL_METADATA_MISMATCH;
      case 37:
        return AVRO_SCHEMA_RESOLUTION_ERROR;
      case 38:
        return AVRO_SCHEMA_METADATA_MISMATCH;
      case 39:
        return AVRO_UNSUPPORTED_DEFAULT_VALUE;
      case 40:
        return AVRO_MISSING_FIELD;
      case 41:
        return AVRO_MISSING_DEFAULT;
      case 42:
        return AVRO_NULLABILITY_MISMATCH;
      case 43:
        return AVRO_NOT_A_RECORD;
      case 44:
        return PARQUET_DEF_LEVEL_ERROR;
      case 45:
        return PARQUET_NUM_COL_VALS_ERROR;
      case 46:
        return PARQUET_DICT_DECODE_FAILURE;
      case 47:
        return SSL_PASSWORD_CMD_FAILED;
      case 48:
        return SSL_CERTIFICATE_PATH_BLANK;
      case 49:
        return SSL_PRIVATE_KEY_PATH_BLANK;
      case 50:
        return SSL_CERTIFICATE_NOT_FOUND;
      case 51:
        return SSL_PRIVATE_KEY_NOT_FOUND;
      case 52:
        return SSL_SOCKET_CREATION_FAILED;
      case 53:
        return MEM_ALLOC_FAILED;
      case 54:
        return PARQUET_REP_LEVEL_ERROR;
      case 55:
        return PARQUET_UNRECOGNIZED_SCHEMA;
      case 56:
        return COLLECTION_ALLOC_FAILED;
      case 57:
        return TMP_DEVICE_BLACKLISTED;
      case 58:
        return TMP_FILE_BLACKLISTED;
      case 59:
        return RPC_CLIENT_CONNECT_FAILURE;
      case 60:
        return STALE_METADATA_FILE_TOO_SHORT;
      case 61:
        return PARQUET_BAD_VERSION_NUMBER;
      case 62:
        return SCANNER_INCOMPLETE_READ;
      case 63:
        return SCANNER_INVALID_READ;
      case 64:
        return AVRO_BAD_VERSION_HEADER;
      case 65:
        return UDF_MEM_LIMIT_EXCEEDED;
      case 66:
        return BTS_BLOCK_OVERFLOW;
      case 67:
        return COMPRESSED_FILE_MULTIPLE_BLOCKS;
      case 68:
        return COMPRESSED_FILE_BLOCK_CORRUPTED;
      case 69:
        return COMPRESSED_FILE_DECOMPRESSOR_ERROR;
      case 70:
        return COMPRESSED_FILE_DECOMPRESSOR_NO_PROGRESS;
      case 71:
        return COMPRESSED_FILE_TRUNCATED;
      case 72:
        return DATASTREAM_SENDER_TIMEOUT;
      case 73:
        return KUDU_IMPALA_TYPE_MISSING;
      case 74:
        return IMPALA_KUDU_TYPE_MISSING;
      case 75:
        return KUDU_NOT_SUPPORTED_ON_OS;
      case 76:
        return KUDU_NOT_ENABLED;
      case 77:
        return PARTITIONED_HASH_JOIN_REPARTITION_FAILS;
      case 78:
        return PARTITIONED_AGG_REPARTITION_FAILS;
      default:
        return null;
    }
  }
}
