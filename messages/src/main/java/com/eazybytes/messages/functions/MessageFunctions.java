package com.eazybytes.messages.functions;

import com.eazybytes.messages.dto.AccountsMsgDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class MessageFunctions {
    private static final Logger logger = LoggerFactory.getLogger(MessageFunctions.class);

    public Function<AccountsMsgDto, AccountsMsgDto> email(){
        return accountsMsgDto -> {
            logger.info("Sending email with details" + accountsMsgDto.toString());
            return accountsMsgDto;
        };
    }
}
