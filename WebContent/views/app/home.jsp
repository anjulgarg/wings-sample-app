<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
@extends("/views/app/layout")

@section("title")
Wings Framework - A Java Web Development Micro-Framework
@endsection

@section("content")
<div class="container">
	<div class="row">
		<div class="col-md-10 col-md-offset-1 text-center">
			<h1>Wings Framework</h1>
			<h3>${ quote }</h3>
		</div>
	</div>
</div>
@endsection