# Write your MySQL query statement below
SELECT v.customer_id ,COUNT(*) AS count_no_trans from Visits V left join Transactions T on V.visit_id = T.visit_id  where transaction_id is null
group by V.customer_id;