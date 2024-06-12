package com.example.demo.service;

import com.example.demo.models.dto.EgrZagsRequestDto;
import com.example.demo.models.dto.EgrZagsResponseDto;
import com.example.demo.models.xmls.root.FATALINFRequest;
import com.example.demo.models.xmls.root.FATALINFResponse;
import org.springframework.stereotype.Service;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.*;

@Service
public class MappingUtils {
    //из entity в dto
    public EgrZagsRequestDto mapToMessageDto(FATALINFRequest entity) {

        EgrZagsRequestDto dto = new EgrZagsRequestDto();


        if (entity.getСведОсн().getКодНормОсн() == null) {
            dto.setCodeOsn("");
        } else {
            dto.setCodeOsn(entity.getСведОсн().getКодНормОсн());
        }

        if (entity.getСведОсн().getСведДокОсн() == null)
            dto.setOrgRaspDoc("");
        else
            dto.setOrgRaspDoc(entity.getСведОсн().getСведДокОсн());

        if (entity.getСведЗапрос().get(0).getСведАГС().getНомерЗапис() == null)
            dto.setActNumber(entity.getСведЗапрос().get(0).getСведАГС().getНомерЗапис());
        else
            dto.setActNumber(entity.getСведЗапрос().get(0).getСведАГС().getНомерЗапис());

        if (entity.getСведЗапрос().get(0).getСведАГС().getОрганЗАГС().getНаимЗАГС() == null)
            dto.setZAGS("");
        else
            dto.setZAGS(entity.getСведЗапрос().get(0).getСведАГС().getОрганЗАГС().getНаимЗАГС());

        if (entity.getСведЗапрос().get(0).getСведАГС().getОрганЗАГС().getКодЗАГС() == null)
            dto.setCodeZAGS(entity.getСведЗапрос().get(0).getСведАГС().getОрганЗАГС().getКодЗАГС());
        else
            dto.setCodeZAGS(entity.getСведЗапрос().get(0).getСведАГС().getОрганЗАГС().getКодЗАГС());


        if (entity.getСведЗапрос().get(0).getСведФЛ().getСНИЛС() == null)
            dto.setSNILS("");
        else
            dto.setSNILS(entity.getСведЗапрос().get(0).getСведФЛ().getСНИЛС());

        if (entity.getСведЗапрос().get(0).getСведФЛ().getФИО().getФамилия() == null)
            dto.setLastName("");
        else
            dto.setLastName(entity.getСведЗапрос().get(0).getСведФЛ().getФИО().getФамилия());

        if (entity.getСведЗапрос().get(0).getСведФЛ().getФИО().getИмя() == null)
            dto.setFirstName("");
        else
            dto.setFirstName(entity.getСведЗапрос().get(0).getСведФЛ().getФИО().getИмя());

        if (entity.getСведЗапрос().get(0).getСведФЛ().getФИО().getОтчество() == null)
            dto.setPatronymic(entity.getСведЗапрос().get(0).getСведФЛ().getФИО().getОтчество());
        else
            dto.setPatronymic(entity.getСведЗапрос().get(0).getСведФЛ().getФИО().getОтчество());


        if (entity.getСведЗапрос().get(0).getСведФЛ().getУдЛичнФЛ() != null) {
            dto.setDocCode(entity.getСведЗапрос().get(0).getСведФЛ().getУдЛичнФЛ().getКодВидДок());
            dto.setDocSeries(entity.getСведЗапрос().get(0).getСведФЛ().getУдЛичнФЛ().getСерДок());
            dto.setDocNumber(entity.getСведЗапрос().get(0).getСведФЛ().getУдЛичнФЛ().getНомДок());
            dto.setOrgName(entity.getСведЗапрос().get(0).getСведФЛ().getУдЛичнФЛ().getВыдДок());
            dto.setOrgCode(entity.getСведЗапрос().get(0).getСведФЛ().getУдЛичнФЛ().getКодВыдДок());
            if (entity.getСведЗапрос().get(0).getСведФЛ().getУдЛичнФЛ().getДатаДок() == null)
                dto.setDocDate("");
            else {
                XMLGregorianCalendar xmlc = entity.getСведЗапрос().get(0).getСведФЛ().getУдЛичнФЛ().getДатаДок();

                LocalDate ldt = LocalDate.of(
                        xmlc.getYear(),
                        xmlc.getMonth(),
                        xmlc.getDay()
                );
                dto.setDocDate(ldt.toString());
            }
        } else {
            dto.setDocCode("");
            dto.setDocSeries("");
            dto.setDocNumber("");
            dto.setOrgName("");
            dto.setOrgCode("");
            dto.setDocDate("");
        }

        if (entity.getСведЗапрос().get(0).getРегионРегАГС() == null)
            dto.setSubjectName("");
        else
            dto.setSubjectName(entity.getСведЗапрос().get(0).getРегионРегАГС());


        if (entity.getСведЗапрос().get(0).getСведАГС().getДатаЗапис() == null)
            dto.setDocCreatedDate("");
        else {

            XMLGregorianCalendar xmlc = entity.getСведЗапрос().get(0).getСведАГС().getДатаЗапис();

            LocalDate ldt = LocalDate.of(
                    xmlc.getYear(),
                    xmlc.getMonth(),
                    xmlc.getDay()
            );
            dto.setDocCreatedDate(ldt.toString());
        }

        //if(entity.getСведЗапрос().get(0).getСведФЛ().getПрДатаРожд().equals("1")) {
        if (entity.getСведЗапрос().get(0).getСведФЛ().getДатаРождКаленд() == null)
            dto.setBirthday("");
        else {
            XMLGregorianCalendar xmlc = entity.getСведЗапрос().get(0).getСведФЛ().getДатаРождКаленд();

            LocalDate ldt = LocalDate.of(
                    xmlc.getYear(),
                    xmlc.getMonth(),
                    xmlc.getDay()
            );
            dto.setBirthday(ldt.toString());
        }
        //}


        return dto;
    }

    public EgrZagsResponseDto mapToMessageDto(FATALINFResponse entity) {

        EgrZagsResponseDto dto = new EgrZagsResponseDto();


        if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getДатаЗаписДок() == null)
            dto.setDocCreatedDate("");
        else{
            String  day = "",
                    mounth = "",
                    year = "";

            if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getДатаЗаписДок().getПрДень() != null)
                day = entity.getСведОтветАГС().get(0).getСведРегСмерт().getДатаЗаписДок().getПрДень();
            else if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getДатаЗаписДок().getДень() != null)
                day = entity.getСведОтветАГС().get(0).getСведРегСмерт().getДатаЗаписДок().getДень().toString();

            if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getДатаЗаписДок().getПрМесяц() != null)
                mounth = entity.getСведОтветАГС().get(0).getСведРегСмерт().getДатаЗаписДок().getПрМесяц();
            else if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getДатаЗаписДок().getМесяц() != null)
                mounth = entity.getСведОтветАГС().get(0).getСведРегСмерт().getДатаЗаписДок().getМесяц().toString();

            if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getДатаЗаписДок().getГод() != null) {
                XMLGregorianCalendar xmlc = entity.getСведОтветАГС().get(0).getСведРегСмерт().getДатаЗаписДок().getГод();

                year = String.valueOf(xmlc.getYear());
            }
            if(!(day.isEmpty() && mounth.isEmpty() && year.isEmpty())) {
                LocalDate ldt = LocalDate.of(
                        Integer.parseInt(year),
                        Integer.parseInt(mounth),
                        Integer.parseInt(day)
                );

                dto.setDocCreatedDate(ldt.toString());
            }
            else dto.setDocCreatedDate("");
        }
        if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getОрганЗАГС().getНаимЗАГС() == null)
            dto.setZAGS("");
        else
            dto.setZAGS(entity.getСведОтветАГС().get(0).getСведРегСмерт().getОрганЗАГС().getНаимЗАГС());

        if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getОрганЗАГС().getКодЗАГС() == null)
            dto.setCodeZAGS("");
        else
            dto.setCodeZAGS(entity.getСведОтветАГС().get(0).getСведРегСмерт().getОрганЗАГС().getКодЗАГС());

        if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getФИОУмер().getФамилия() == null)
            dto.setLastName("");
        else
            dto.setLastName(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getФИОУмер().getФамилия());

        if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getФИОУмер().getИмя() == null)
            dto.setFirstName("");
        else
            dto.setFirstName(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getФИОУмер().getИмя());

        if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getФИОУмер().getОтчество() == null)
            dto.setPatronymic("");
        else
            dto.setPatronymic(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getФИОУмер().getОтчество());

        if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getДатаРождКаленд() == null)
            dto.setBirthday("");
        else {
            XMLGregorianCalendar xmlc = entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getДатаРождКаленд();

            LocalDate ldt = LocalDate.of(
                    xmlc.getYear(),
                    xmlc.getMonth(),
                    xmlc.getDay()
            );
            dto.setBirthday(ldt.toString());
        }

        if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getДатаСмертКаленд() == null)
            dto.setDeathday("");
        else {
            XMLGregorianCalendar xmlc = entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getДатаСмертКаленд();

            LocalDate ldt = LocalDate.of(
                    xmlc.getYear(),
                    xmlc.getMonth(),
                    xmlc.getDay()
            );
            dto.setDeathday(ldt.toString());
        }

        if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getВремяСмерт() == null)
            dto.setDeathtime("");
        else {
            XMLGregorianCalendar xmlc = entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getВремяСмерт();
            LocalTime lt = LocalTime.of(
                    xmlc.getHour(),
                    xmlc.getMinute()
            );

            dto.setDeathtime(lt.toString());
        }

        if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getПол() == null)
            dto.setGender("");
        else{
            if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getПол().equals("2"))
                dto.setGender("Женский");
            else
                dto.setGender("Мужской");
        }


        if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getГраждТекст() == null)
            dto.setCitizenship("");
        else
            dto.setCitizenship(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getГраждТекст());

        if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getМестоРожден().getМестоТекст() == null)
            dto.setBirthPlace("");
        else
            dto.setBirthPlace(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getМестоРожден().getМестоТекст());

        if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getМЖПосл().getАдрМЖРФ() == null) {
            if (entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getМЖПосл().getАдрМЖИн() == null) {
                if (entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getМЖПосл().getАдрМЖКонв() == null)
                    dto.setLocation("");
                else
                    dto.setLocation(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getМЖПосл().getАдрМЖКонв());
            } else
                dto.setLocation(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getМЖПосл().getАдрМЖИн().getАдрТекст());
        }
        else if (entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getМЖПосл().getАдрМЖРФ().getАдрРФФИАС() == null){
            if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getМЖПосл().getАдрМЖРФ().getАдрРФНеФИАС() == null){
                if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getМЖПосл().getАдрМЖРФ().getАдрТекст() == null)
                    dto.setLocation("");
                else dto.setLocation(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getМЖПосл().getАдрМЖРФ().getАдрТекст());
            }
            else dto.setLocation(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getМЖПосл().getАдрМЖРФ().getАдрРФНеФИАС().getАдрТекст());
        }
        else dto.setLocation(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getМЖПосл().getАдрМЖРФ().getАдрРФФИАС().getАдрТекст());

        if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getМестоСмерт().getМестоТекст() == null)
            dto.setDeathPlace("");
        else
            dto.setDeathPlace(entity.getСведОтветАГС().get(0).getСведРегСмерт().getПрдСведРег().getМестоСмерт().getМестоТекст());

        if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getСвидетСмерт().isEmpty()){
            dto.setDocSeries("");
            dto.setDocNumber("");
            dto.setDocDate("");
        }
        else{
            if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getСвидетСмерт().get(0).getСерияСвидет() == null)
                dto.setDocSeries("");
            else dto.setDocSeries(entity.getСведОтветАГС().get(0).getСведРегСмерт().getСвидетСмерт().get(0).getСерияСвидет());

            if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getСвидетСмерт().get(0).getНомерСвидет() == null)
                dto.setDocNumber("");
            else dto.setDocNumber(entity.getСведОтветАГС().get(0).getСведРегСмерт().getСвидетСмерт().get(0).getНомерСвидет());

            if(entity.getСведОтветАГС().get(0).getСведРегСмерт().getСвидетСмерт().get(0).getДатаВыдСвидет() == null)
                dto.setDocDate("");
            else {
                XMLGregorianCalendar xmlc = entity.getСведОтветАГС().get(0).getСведРегСмерт().getСвидетСмерт().get(0).getДатаВыдСвидет();

                LocalDate ldt = LocalDate.of(
                        xmlc.getYear(),
                        xmlc.getMonth(),
                        xmlc.getDay()
                );
                dto.setDocDate(ldt.toString());
            }
        }


        return dto;
    }

}
