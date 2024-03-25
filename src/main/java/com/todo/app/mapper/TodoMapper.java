package com.todo.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.todo.app.entity.Todo;

@Mapper
public interface TodoMapper {

    public List<Todo> selectAll();		//全てのテーブルリスト

    public List<Todo> selectIncomplete();	//done_flgが0のデータのみ

    public List<Todo> selectComplete();	//done_flgが1のデータのみ

    public void add(Todo todo);	//追加

    public void update(Todo todo);		//更新

    public void delete(Todo todo);		//削除

	public Todo findById(Long id);
}
