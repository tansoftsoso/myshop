SELECT
  a.id,
  a.cid AS tb_item_cid,
  b.name AS tb_item_cname,
  a.title AS tb_item_title,
  a.sell_point AS tb_item_sell_point,
  c.item_desc AS tb_item_desc
FROM
  tb_item AS a
  LEFT JOIN tb_item_cat AS b
    ON a.cid = b.id
  LEFT JOIN tb_item_desc AS c
    ON c.item_id = a.id