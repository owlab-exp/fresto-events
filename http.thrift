namespace java fresto.event

struct HttpRequestEvent {
3: required string httpMethod;
5: required string localHost;
7: required i32 localPort;
9: required string contextPath;
11: required string servletPath;
13: required string frestoUUID;
15: required string typeName;
17: required string signatureName;
31: required i64 timestamp;
#33: required i64 receivedTime;
}
