namespace java fresto.event

struct HttpRequestEvent {
3: optional string httpMethod;
5: required string localHost;
7: optional string localPort;
9: required string contextPath;
11: required string servletPath;
13: required string frestoUUID;
15: required i64 timestamp;
}