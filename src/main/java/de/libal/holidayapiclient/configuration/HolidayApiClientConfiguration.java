package de.libal.holidayapiclient.configuration;

import de.libal.holidayapiclient.client.HolidaysApi;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients(clients = HolidaysApi.class)
@ComponentScan("de.libal.holidayapiclient.client")
@Configuration
public class HolidayApiClientConfiguration {
}
