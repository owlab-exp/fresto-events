namespace java fresto.data

# Client events

union ClientID {
    1: string clientIp;
}

union ResourceID {
    1: string url; # not include query string to match with request url on server
}

struct RequestEdge {
    1: required ClientID clientId;
    2: required ResourceID resourceId;
    3: string referrer;
    4: string method;
    5: i64 timestamp;
    6: string uuid;
}

struct ResponseEdge {
    1: required ResourceID resourceId;
    2: required ClientID clientId;
    3: i32 httpStatus;
    4: required i32 elapsedTime;
    5: required i64 timestamp;
    6: required string uuid;
}

# Server events

struct OperationID {
    1: string typeName;
    2: string operationName;
}

struct EntryOperationCallEdge {
    1: required ResourceID resourceId;
    2: required OperationID operationId;
    3: string localHost;
    4: i32 localPort;
    5: string contextPath;
    6: string servletPath;
    7: string httpMethod;
    8: required i64 timestamp;
    9: required string uuid;
    10: i32 sequence = 0;
    11: i32 depth = 0;
}

struct EntryOperationReturnEdge {
    1: required OperationID operationId;
    2: required ResourceID resourceId;
    3: string servletPath;
    4: i32 httpStatus;
    5: required i32 elapsedTime;
    6: required i64 timestamp;
    7: required string uuid;
    8: i32 sequence;
    9: i32 depth;
}

struct OperationCallEdge {
#    1: required OperationID parentOperationId;
    2: required OperationID operationId;
    3: required i64 timestamp;
    4: required string uuid;
    5: i32 sequence;
    6: i32 depth;
}

struct OperationReturnEdge {
    1: required OperationID operationId;
#    2: required OperationID parentOperationId;
    3: required i64 timestamp;
    4: required i32 elapsedTime;
    5: required string uuid;
    6: i32 sequence;
    7: i32 depth;
}

struct SqlID {
	1: string databaseUrl;
	2: string sql;
}

struct SqlCallEdge {
#    1: required OperationID parentOperationId;
    2: required SqlID sqlId;
    3: required i64 timestamp;
    4: required string uuid;
    5: i32 sequence;
    6: i32 depth;
}

struct SqlReturnEdge {
    1: required SqlID sqlId;
#    2: required OperationID parentOperationId;
    3: required i64 timestamp;
    4: required i32 elapsedTime;
    5: required string uuid;
    6: i32 sequence;
    7: i32 depth;
}

# Define Data Units
union DataUnit {
    1: RequestEdge requestEdge;
    2: ResponseEdge responseEdge;
    3: EntryOperationCallEdge entryOperationCallEdge;
    4: EntryOperationReturnEdge entryOperationReturnEdge;
    5: OperationCallEdge operationCallEdge;
    6: OperationReturnEdge operationReturnEdge;
    7: SqlCallEdge sqlCallEdge;
    8: SqlReturnEdge sqlReturnEdge;
}

struct Pedigree {
    1: required i64 receivedTime;
}

struct FrestoData {
    1: required Pedigree pedigree;
    2: required DataUnit dataUnit;
}
