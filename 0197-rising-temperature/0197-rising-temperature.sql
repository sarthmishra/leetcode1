select v.id as Id
from weather w
join weather v on v.recordDate = w.recordDate + INTERVAL 1 DAY
where v.temperature > w.temperature;