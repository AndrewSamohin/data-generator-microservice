package org.example.datageneratormicroservice.web.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.processing.Generated;
import org.example.datageneratormicroservice.model.Data;
import org.example.datageneratormicroservice.model.test.DataTestOptions;
import org.example.datageneratormicroservice.web.dto.DataTestOptionsDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-02T19:44:28+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class DataTestOptionsMapperImpl implements DataTestOptionsMapper {

    @Override
    public DataTestOptions toEntity(DataTestOptionsDto d) {
        if ( d == null ) {
            return null;
        }

        DataTestOptions dataTestOptions = new DataTestOptions();

        dataTestOptions.setDelayInSeconds( d.getDelayInSeconds() );
        Data.MeasurementType[] measurementTypes = d.getMeasurementTypes();
        if ( measurementTypes != null ) {
            dataTestOptions.setMeasurementTypes( Arrays.copyOf( measurementTypes, measurementTypes.length ) );
        }

        return dataTestOptions;
    }

    @Override
    public List<DataTestOptions> toEntity(List<DataTestOptionsDto> d) {
        if ( d == null ) {
            return null;
        }

        List<DataTestOptions> list = new ArrayList<DataTestOptions>( d.size() );
        for ( DataTestOptionsDto dataTestOptionsDto : d ) {
            list.add( toEntity( dataTestOptionsDto ) );
        }

        return list;
    }

    @Override
    public DataTestOptionsDto toDto(DataTestOptions e) {
        if ( e == null ) {
            return null;
        }

        DataTestOptionsDto dataTestOptionsDto = new DataTestOptionsDto();

        dataTestOptionsDto.setDelayInSeconds( e.getDelayInSeconds() );
        Data.MeasurementType[] measurementTypes = e.getMeasurementTypes();
        if ( measurementTypes != null ) {
            dataTestOptionsDto.setMeasurementTypes( Arrays.copyOf( measurementTypes, measurementTypes.length ) );
        }

        return dataTestOptionsDto;
    }

    @Override
    public List<DataTestOptionsDto> toDto(List<DataTestOptions> e) {
        if ( e == null ) {
            return null;
        }

        List<DataTestOptionsDto> list = new ArrayList<DataTestOptionsDto>( e.size() );
        for ( DataTestOptions dataTestOptions : e ) {
            list.add( toDto( dataTestOptions ) );
        }

        return list;
    }
}
