$(document).ready(function() {

    //поиск при изменении имени ВС
    $('.vs-name').click(function() {
        let selectedStatus = $('#mes_status').text().trim();
        let selectedType = $('#mes_type').text().trim();
        let selectedDate = $('#mes_date').text().trim();

        let selectedName = $(this).text().trim();
        let currentValue = $('#vs_name');
        currentValue.text(selectedName);

        $.ajax({
            url: '/ajax/filter',
            type: 'GET',
            data: {
                vs_name: selectedName,
                status: selectedStatus,
                message_type: selectedType,
                date: selectedDate
             },
            success: function(response) {
                // Обработка ответа от сервера
                console.log(response);
            },
            error: function(jqXHR, textStatus, errorThrown) {
                console.log('Error: ' + textStatus);
            }
        });
    });

    //поиск при изменении статуса
    $('.mes-status').click(function() {
        let selectedName = $('#vs_name').text().trim();
        let selectedType = $('#mes_type').text().trim();
        let selectedDate = $('#mes_date').text().trim();

        let selectedStatus = $(this).text().trim();
        let currentValue = $('#mes_status');
        currentValue.text(selectedStatus);

        $.ajax({
            url: '/ajax/filter',
            type: 'GET',
           data: {
               vs_name: selectedName,
               status: selectedStatus,
               message_type: selectedType,
               date: selectedDate
            },
           success: function(response) {
               // Обработка ответа от сервера
               console.log(response);
           },
           error: function(jqXHR, textStatus, errorThrown) {
               console.log('Error: ' + textStatus);
           }
        });
    });

    //поиск при изменении типа
    $('.mes-type').click(function() {
        let selectedName = $('#vs_name').text().trim();
        let selectedStatus = $('#mes_status').text().trim();
        let selectedDate = $('#mes_date').text().trim();

        let selectedType = $(this).text().trim();
        let currentValue = $('#mes_type');
        currentValue.text(selectedType);

        $.ajax({
            url: '/ajax/filter',
            type: 'GET',
            data: {
                vs_name: selectedName,
                status: selectedStatus,
                message_type: selectedType,
                date: selectedDate
             },
            success: function(response) {
                // Обработка ответа от сервера
                console.log(response);
            },
            error: function(jqXHR, textStatus, errorThrown) {
                console.log('Error: ' + textStatus);
            }
        });
    });

    //поиск при изменеии даты
    $('.mes-date').click(function() {
        let selectedName = $('#vs_name').text().trim();
        let selectedType = $('#mes_type').text().trim();
        let selectedStatus = $('#mes_status').text().trim();

        let selectedDate = $(this).text().trim();
        let currentValue = $('#mes_date');
        currentValue.text(selectedDate);

        $.ajax({
            url: '/ajax/filter',
            type: 'GET',
            data: {
                vs_name: selectedName,
                status: selectedStatus,
                message_type: selectedType,
                date: selectedDate
             },
            success: function(response) {
                // Обработка ответа от сервера
                console.log(response);
            },
            error: function(jqXHR, textStatus, errorThrown) {
                console.log('Error: ' + textStatus);
            }
        });
    });



});
