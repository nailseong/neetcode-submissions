with score as (
    select
        student_id,
        max(score) as score
    from exam_results
    group by
        student_id
)
select
    s.student_id,
    min(re.exam_id) as exam_id,
    s.score
from exam_results re
    join score s
        on s.student_id = re.student_id 
        and s.score = re.score
group by 1, 3

