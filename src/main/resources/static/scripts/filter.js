$(document).ready(function() {

    //поиск только по названию ВС
    $('.vs-name').click(function() {
        let selectedValue = $(this).text().trim();
        let currentValue = $('#vs_name');
        currentValue.text(selectedValue);

        $.ajax({
            url: '/ajax/vs_name',
            type: 'GET',
            data: { vs_name: selectedValue },
            success: function(response) {
                // Обработка ответа от сервера
                console.log(response);
            },
            error: function(jqXHR, textStatus, errorThrown) {
                console.log('Error: ' + textStatus);
            }
        });
    });

    //поиск только по статусу
    $('.mes-status').click(function() {
        let selectedValue = $(this).text().trim();
        let currentValue = $('#mes_status');
        currentValue.text(selectedValue);

        $.ajax({
            url: '/ajax/status',
            type: 'GET',
            data: { status: selectedValue },
            success: function(response) {
                // Обработка ответа от сервера
                console.log(response);
            },
            error: function(jqXHR, textStatus, errorThrown) {
                console.log('Error: ' + textStatus);
            }
        });
    });

    //поиск только по типу
    $('.mes-type').click(function() {
        let selectedValue = $(this).text().trim();
        let currentValue = $('#mes_type');
        currentValue.text(selectedValue);

        $.ajax({
            url: '/ajax/message_type',
            type: 'GET',
            data: { message_type: selectedValue },
            success: function(response) {
                // Обработка ответа от сервера
                console.log(response);
            },
            error: function(jqXHR, textStatus, errorThrown) {
                console.log('Error: ' + textStatus);
            }
        });
    });

    //поиск только по дате
    $('.mes-date').click(function() {
        let selectedValue = $(this).text().trim();
        let currentValue = $('#mes_date');
        currentValue.text(selectedValue);

        $.ajax({
            url: '/ajax/time_range',
            type: 'GET',
            data: { value: selectedValue },
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
