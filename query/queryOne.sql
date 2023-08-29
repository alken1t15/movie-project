create table movie(
                      id serial primary key,
                      name varchar,
                      year integer
    ,
                      rating numeric(4,2),
                      count integer
);
create table actor(
                      id serial primary key,
                      name varchar,
                      surname varchar,
                      movie_id integer references movie(id
                          )
);
create table director(
                         id serial primary key,
                         name varchar,
                         surname varchar,
                         movie_id integer references movie(id
                             )
);
create table genre(
                      id serial primary key,
                      name varchar not null
);
create table movie_to_genre
(
    id serial primary key,
    movie_id integer references movie(id),
    genre_id integer references genre(id
        )
);
