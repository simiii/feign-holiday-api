# spring-feign-holiday-api

A spring feign client for holidayapi.com

## Getting Started

### Choose the version for your spring project

spring-feing-holiday-api 2.0.X > Spring-Boot-Version 2.0.4.RELEASE

### Usage

Use the annotation @EnableHolidayApi to enable the feign client for the holiday api

```
@Configuration
@EnableHolidayApi
@EnableFeignClients
public class FeignConfiguration {

}
```

Use the feign clients in your spring bean by autowiring 

```
@Service
public class HolidayApiService {

    @Autowired private CountriesApi countriesApi;
    
    @Autowired private HolidaysApi holidayApi;
    
    @Autowired private LanguagesApi languagesApi;
    
```

## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

Distributed under the Apache 2.0 License. See `LICENSE.txt` for more information.

## Contact

Simon Hirscher - [@simih1](https://twitter.com/simih1) - simon.hirscher@libal-tech.de

Project Link: [https://github.com/simiii/feign-holiday-api](https://github.com/simiii/feign-holiday-api)
