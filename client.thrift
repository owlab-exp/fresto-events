namespace java fresto.event.client

union ClientID {
	1: string client_ip;
}

union PageID {
	1: string url;
}

union ResourceID {
	1: string url;
}

union RequestID {
	1: string uuid;
}

union ResponseID {
	1: string uuid;
}

struct CreateRequestEdge {
	1: required ClientID client;
	2: required RequestID request;
	3: optional PageID page;
}

struct RequestResourceEdge {
	1: required RequestID request;
	2: required ResourceID resource;
}

struct ResourceResponseEdge {
	1: required ResourceID resource;
	2: required ResponseID response;
}

struct ReceiveResponseEdge {
	1: required ClientID client;
	2: required ResponseID response;
}

struct RequestPropertyValue {
	1: string method;
	2: string query;
	3: i64 timestamp;
}

struct RequestProperty {
	1: required RequestID request;
	2: required RequestPropertyValue property;
}

struct ResponsePropertyValue {
	1: i16 statusCode;
	2: i64 timestamp;
	3: i64 length;
}

struct ResponseProperty {
	1: required ResponseID response;
	2: required ResponsePropertyValue property;
}

union ClientDataUnit {
	1: RequestProperty request_property;
	2: ResponseProperty response_property;
	3: CreateRequestEdge create_request;
	4: RequestResourceEdge request_resource;
	5: ResourceResponseEdge resource_response;
	6: ReceiveResponseEdge receive_response;
}

union DataUnit {
	1: ClientDataUnit client_data_unit;
# possily server data unit will be here
}

struct Pedigree {
	1: required i64 fresto_timstamp;
}

struct Data {
	1: required Pedigree pedigree;
	2: required DataUnit data_unit;
}

#enum RequestMethod {
#	GET = 1,
#	POST = 2,
#	HEAD = 3,
#	PUT = 4,
#	DELETE = 5,
#	OPTIONS = 6,
#	CONNECT =7
#}
