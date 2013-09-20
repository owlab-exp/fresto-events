namespace java fresto.data

##############################################
# Client side event data
##############################################
union ClientID {
	1: string client_ip;
}

union ReferrerID {
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

struct ClientRequestEdge {
	1: required ClientID client;
	2: required RequestID request;
}

struct RequestResourceEdge {
	1: required RequestID request;
	2: required ResourceID resource;
}

struct ResourceResponseEdge {
	1: required ResourceID resource;
	2: required ResponseID response;
}

struct ResponseClientEdge {
	1: required ResponseID response;
	2: required ClientID client;
}

struct ClientPropertyValue {
	1: string user_agent;
}

struct ClientProperty {
	1: ClientID client;
	2: ClientPropertyValue property;
}

struct ResourcePropertyValue {
}

struct ResourceProperty {
	1: ResourceID resource;
	2: ResourcePropertyValue property;
}

struct RequestPropertyValue {
	1: ReferrerID referrer;
	2: string method;
	3: string query;
	4: i64 timestamp;
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
	# Properties
	1: ClientProperty client_property;
	2: ResourceProperty resource_property;
	3: RequestProperty request_property;
	4: ResponseProperty response_property;
	# Edges
	5: ClientRequestEdge client_request_edge;
	6: RequestResourceEdge request_resource_edge;
	7: ResourceResponseEdge resource_response_edge;
	8: ResponseClientEdge response_client_edge;
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
# Server side performance event data
#####################################################
union HostID {
	1: string host_name;
	2: string ip_address;
}

union ApplicationID {
	1: string context_path;
}

union ManagedResourceID {
	1: string servlet_path;
}

union OperationID {
	1: string operation_name;
}

union TypeID {
	1: string type_name;
}

union EntryInvokeID {
	1: string uuid;
}
union EntryReturnID {
	1: string uuid;
} 

union OperationInvokeID {
	1: string uuid;
}

union OperationReturnID {
	1: string uuid;
} 

struct ServeApplicationEdge {
	1: required HostID host;
	2: required ApplicationID application;
}

struct ManageResourceEdge {
	1: required ApplicationID application;
	2: required ManagedResourceID managed_resource;
}

struct ImplementResourceEdge {
	1: required ManagedResourceID managed_resource;
	2: required OperationID operation;
}

struct EntryInvokeEdge {
	1: required EntryInvokeID entry_invoke;
	2: required OperationID operation;
}

struct EntryReturnEdge {
	1: required EntryReturnID entry_return;
	2: required OperationID operation;
}

struct CreateInvocationEdge {
	1: required OperationID operation;
	2: required OperationInvokeID operation_invoke;
}

struct MakeInvocationEdge {
	1: required OperationInvokeID operation_invoke;
	2: required OperationID operation;
}

struct CreateResultEdge {
	1: required OperationID operation;
	2: required OperationReturnID operation_return;
}

struct ReturnResultEdge {
	1: required OperationReturnID operation_return;
	2: required OperationID operation;
}

struct OperationPropertyValue {
	1: TypeID type;
}

struct OperationProperty {
	1: OperationID operation;
	2: OperationPropertyValue property;
}

struct EntryInvokePropertyValue {
	1: string http_method;
	2: HostID host;
	3: i32 port;
	4: ApplicationID application;
	5: ManagedResourceID managed_resource;
	6: OperationID operation;
	7: i64 timestamp;
}

struct EntryInvokeProperty {
	1: EntryInvokeID entry_invoke;
	2: EntryInvokePropertyValue property;
}

struct EntryReturnPropertyValue {
	1: i32 response_code;
	2: i64 length;
	3: i64 timestamp;
}

struct EntryReturnProperty {
	1: EntryReturnID entry_return;
	2: EntryReturnPropertyValue property;
}

struct OperationInvokePropertyValue {
	1: i32 depth;
	2: i64 timestamp;
}

struct OperationInvokeProperty {
	1: OperationInvokeID operation_invoke;
	2: OperationInvokePropertyValue property;
}

struct OperationReturnPropertyValue {
	1: i32 depth;
	2: i64 timestamp;
}

struct OperationReturnProperty {
	1: OperationReturnID operation_return;
	2: OperationReturnPropertyValue property;
}

union ApplicationDataUnit {
	# Properties
	1: EntryInvokeProperty entry_invoke_property;
	2: EntryReturnProperty entry_return_property;
	3: OperationProperty operation_property_property;
	4: OperationInvokeProperty operation_invoke_property;
	5: OperationReturnProperty operation_return_property;
	# Edges
	6: ServeApplicationEdge host_application_edge;
	7: ManageResourceEdge app_resource_edge;
	8: ImplementResourceEdge implement_resource_edge;
	9: EntryInvokeEdge entry_invoke_edge;
	10: EntryReturnEdge entry_return_edge;
	11: CreateInvocationEdge create_invocation_edge;
	12: MakeInvocationEdge make_invocation_edge;
	13: CreateResultEdge create_result_edge;
	14: ReturnResultEdge return_result_edge;
}

#####################################################
# Unified data
#####################################################
union DataUnit {
	1: ClientDataUnit client_data_unit;
	2: ApplicationDataUnit application_data_unit;
}

struct Pedigree {
	1: required i64 fresto_timestamp;
}

struct FrestoData {
	1: required Pedigree pedigree;
	2: required DataUnit data_unit;
}
