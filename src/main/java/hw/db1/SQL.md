Написать следующие SQL запросы:  
   
   1) получить название гор, на которые уже состоялись восхождения
    
SELECT DISTINCT mountains.title
FROM mountains
LEFT JOIN groups
on mountains.id = groups.mountain_id
WHERE endDate < GETDATE();
    
    

    2) получить название гор, на которые не было ни одного восхождения
SELECT DISTINCT mountains.title
FROM mountains
JOIN groups
on mountains.id = groups.mountain_id  
WHERE groups.startDate is NULL OR groups.startDate > GETDATE();

    3) получить имена альпинистов, которые ходили в поход на гору с определенным названием
SELECT climbers.fullName
FROM climbers
LEFT JOIN
groups_climbers
on climbers.id = groups_climbers.climber_id
JOIN groups
on groups_climbers.group_id = (SELECT * group_id
FROM groups
JOIN mountains
on mountains.id = groups.mountain_id
WHERE mountain.title = 'Elbrus';);


    4) получить названия и высоту гор, восхождение на которые планируется в определенный интервал времени
SELECT DISTINCT mountains.title, mountains.high
FROM mountains
JOIN groups
on mountains.id = groups.mountains_id
WHERE groups.startDate BETWEEN 2020 AND 2023;


    5) получить имена альпинистов, которые не записались в новые (время начала похода в будущем) группы

SELECT DISTINCT climbers.fullName
FROM climbers
JOIN groups
on climbers.id = groups.climber_id
WHERE groups.startDate < GETDATE() OR groups.startDate is NULL;