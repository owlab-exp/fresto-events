namespace java fresto.thrift

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


#struct PageNavigationEdge {
#	1: PageID current_page;
#	2: PageID next_page;
#}

#enum RequestMethod {
#	GET = 1,
#	POST = 2,
#	HEAD = 3,
#	PUT = 4,
#	DELETE = 5,
#	OPTIONS = 6,
#	CONNECT =7
#}
#####################################################

union HostID {
	1: string host_name;
	2: string ip_address;
}

union AppContextID {
	1: string context_path;
}

union EndPointResourceID {
	1: string servlet_path;
}

union TypeSignatureID {
	1: string type_name; # Type (Class) & Method
	2: string signature_name; # Type (Class) & Method
}

union EntryInvokeID {
	1: string uuid;
}
union EntryReturnID {
	1: string uuid;
} 

union MethodInvokeID {
	1: string uuid;
}

union MethodReturnID {
	1: string uuid;
} 

struct HostAppContextEdge {
	1: required HostID host;
	2: required AppContextID app_context;
}

struct AppResourceEdge {
	1: required AppContextID app_context;
	2: required EndPointResourceID resoure;
}

struct ResourceImplEdge {
	1: required EndPointResourceID resource;
	2: required TypeSignatureID type_signature;
}

struct EntryInvokePropertyValue {
	1: string http_method;
	2: HostID host;
	3: i32 port;
	4: AppContextID app_context;
	5: EndPointResourceID resource;
	6: TypeSignatureID type_signature;
	7: i64 timestamp;
}

struct EntryReturnPropertyValue {
	1: i32 response_code;
	2: i64 length;
	3: i64 timestamp;
}

struct EntryInvokeProperty {
	1: EntryInvokeID entry_invoke;
	2: EntryInvokePropertyValue property;
}

struct EntryReturnProperty {
	1: EntryReturnID entry_return;
	2: EntryReturnPropertyValue property;
}

struct MethodInvokePropertyValue {
	1: TypeSignatureID type_signature;
	2: i32 depth;
	3: i64 timestamp;
}

struct MethodReturnPropertyValue {
	1: TypeSignatureID type_signature;
	2: i32 depth;
	3: i64 timestamp;
}

struct MethodInvokeProperty {
	1: MethodInvokeID method_invoke;
	2: MethodInvokePropertyValue property;
}

struct MethodReturnProperty {
	1: MethodReturnID method_return;
	2: MethodReturnPropertyValue property;
}

struct ServerDataUnit {
	1: HostAppContextEdge host_app_context;
	2: AppResourceEdge app_resource;
	3: ResourceImplEdge resource_implement;
	4: EntryInvokeProperty entry_invoke;
	5: EntryReturnProperty entry_return;
	6: MethodInvokeProperty method_invoke;
	7: MethodReturnProperty method_return;
}

#####################################################
union DataUnit {
	1: ClientDataUnit client_data_unit;
	2: ServerDataUnit server_data_unit;
}

struct Pedigree {
	1: required i64 fresto_timstamp;
}

struct Data {
	1: required Pedigree pedigree;
	2: required DataUnit data_unit;
}
