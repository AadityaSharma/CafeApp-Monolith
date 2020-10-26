package aaditya.dev.cafeapp.web.mappers;

import aaditya.dev.cafeapp.domain.Beer;
import aaditya.dev.cafeapp.web.model.BeerDto;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-26T22:19:41+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
@Component
@Primary
public class BeerMapperImpl extends BeerMapperDecorator implements BeerMapper {

    @Autowired
    @Qualifier("delegate")
    private BeerMapper delegate;

    @Override
    public Beer beerDtoToBeer(BeerDto beerDto)  {
        return delegate.beerDtoToBeer( beerDto );
    }
}
