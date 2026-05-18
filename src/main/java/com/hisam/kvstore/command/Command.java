package com.hisam.kvstore.command;

import java.util.List;

public record Command(CommandType type, String key, String value) {}