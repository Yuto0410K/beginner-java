FROM postgres:15.3

# timezone environment
ENV TZ=Asia/Tokyo
# ENV LANG ja_JP.utf8

# RUN mkdir /var/lib/postgres/data/sample-db
# UTF-8有効化
RUN localedef -i ja_JP -c -f UTF-8 -A /usr/share/locale/locale.alias ja_JP.UTF-8