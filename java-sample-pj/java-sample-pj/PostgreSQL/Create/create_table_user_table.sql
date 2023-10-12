CREATE TABLE users (
  user_id serial PRIMARY KEY,
  user_name varchar(256),
  password varchar(256),
  mail_address varchar(256) UNIQUE,
  create_date timestamp NOT NULL,
  update_date timestamp NOT NULL,
  delete_date timestamp NULL
);

COMMENT ON TABLE users IS 'ユーザ';
COMMENT ON COLUMN users.user_id IS 'ユーザID';
COMMENT ON COLUMN users.user_name IS 'ユーザ名';
COMMENT ON COLUMN users.password IS 'パスワード';
COMMENT ON COLUMN users.mail_address IS 'メールアドレス';
COMMENT ON COLUMN users.create_date IS '登録日時';
COMMENT ON COLUMN users.update_date IS '更新日時';
COMMENT ON COLUMN users.delete_date IS '削除日時';