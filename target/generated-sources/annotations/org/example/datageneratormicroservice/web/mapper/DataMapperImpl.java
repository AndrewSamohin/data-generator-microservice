package org.example.datageneratormicroservice.web.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.example.datageneratormicroservice.model.Data;
import org.example.datageneratormicroservice.web.dto.DataDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-02T19:44:28+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class DataMapperImpl implements DataMapper {

    @Override
    public Data toEntity(DataDto d) {
        if ( d == null ) {
            return null;
        }

        Data data = new Data();

        data.setSensorId( d.getSensorId() );
        data.setTimestamp( d.getTimestamp() );
        data.setMeasurement( d.getMeasurement() );
        data.setMeasurementType( d.getMeasurementType() );

        return data;
    }

    @Override
    public List<Data> toEntity(List<DataDto> d) {
        if ( d == null ) {
            return null;
        }

        List<Data> list = new ArrayList<Data>( d.size() );
        for ( DataDto dataDto : d ) {
            list.add( toEntity( dataDto ) );
        }

        return list;
    }

    @Override
    public DataDto toDto(Data e) {
        if ( e == null ) {
            return null;
        }

        DataDto dataDto = new DataDto();

        dataDto.setSensorId( e.getSensorId() );
        dataDto.setTimestamp( e.getTimestamp() );
        dataDto.setMeasurement( e.getMeasurement() );
        dataDto.setMeasurementType( e.getMeasurementType() );

        return dataDto;
    }

    @Override
    public List<DataDto> toDto(List<Data> e) {
        if ( e == null ) {
            return null;
        }

        List<DataDto> list = new ArrayList<DataDto>( e.size() );
        for ( Data data : e ) {
            list.add( toDto( data ) );
        }

        return list;
    }
}
