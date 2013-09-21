namespace java fresto.command

enum TargetModule {
    CLIENT_EVENT_HUB = 1,
    SERVER_EVENT_HUB = 2,
    CLIENT_EVENT_WRITER = 3,
    SERVER_EVENT_WRITER = 4
}

enum Command {
    TERMINATE = 0
}

struct CommandEvent {
    1: required TargetModule target_module;
    2: required Command	command;
}
