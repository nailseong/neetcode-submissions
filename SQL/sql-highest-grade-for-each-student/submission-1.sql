-- Write your query below
with ranked as (
    select
        student_id,
        exam_id,
        score,
        rank() over (partition by student_id order by score desc, exam_id) as ranking
    from exam_results
)
select
    student_id,
    exam_id,
    score
from ranked
where ranking = 1