DROP DATABASE `pokku`;
CREATE DATABASE `pokku`;

USE `pokku`;

CREATE TABLE `user_info`(
	`user_name` VARCHAR(10) NOT NULL,
	`user_birth` DATE NOT NULL,
	`user_tel` VARCHAR(12) NOT NULL,
	`user_email` VARCHAR(50) NOT NULL,
	`user_id` VARCHAR(16) NOT NULL,
	`user_password` VARCHAR(20) NOT NULL,
	`user_nickname` VARCHAR(16) NOT NULL,
	`user_education` VARCHAR(50) NOT NULL,
	PRIMARY KEY(`user_id`)
)DEFAULT CHARSET = UTF8;

CREATE TABLE `user_info_instagram`(
	`user_id` VARCHAR(16) NOT NULL,
	`user_instagram` VARCHAR(128) NOT NULL,
	PRIMARY KEY(`user_instagram`),
	FOREIGN KEY(`user_id`) REFERENCES `user_info`(`user_id`)
)DEFAULT CHARSET = UTF8;

CREATE TABLE `user_info_github`(
	`user_id` VARCHAR(16) NOT NULL,
	`user_github` VARCHAR(128) NOT NULL,
	PRIMARY KEY(`user_github`),
	FOREIGN KEY(`user_id`) REFERENCES `user_info`(`user_id`)
)DEFAULT CHARSET = UTF8;

CREATE TABLE `user_info_blog`(
	`user_id` VARCHAR(16) NOT NULL,
	`user_blog` VARCHAR(128) NOT NULL,
	PRIMARY KEY(`user_blog`),
	FOREIGN KEY(`user_id`) REFERENCES `user_info`(`user_id`)
)DEFAULT CHARSET = UTF8;

CREATE TABLE `image`(
	`image_name` VARCHAR(32) NOT NULL,
	`image_url` VARCHAR(256) NOT NULL,
	PRIMARY KEY(`image_name`)
)DEFAULT CHARSET = UTF8;

CREATE TABLE `portfolio_about`(
	`portfolio_about_id` INT AUTO_INCREMENT,
	`user_id` VARCHAR(16) NOT NULL,
	`user_name_visible` BOOL DEFAULT FALSE,
	`user_tel_visible` BOOL DEFAULT FALSE,
	`user_email_visible` BOOL DEFAULT FALSE,
	`user_education_visible` BOOL DEFAULT FALSE,
	PRIMARY KEY(`portfolio_about_id`),
	FOREIGN KEY(`user_id`) REFERENCES `user_info`(`user_id`)
)DEFAULT CHARSET = UTF8;

CREATE TABLE `portfolio_skills_frontend`(
	`portfolio_skills_frontend_id` INT AUTO_INCREMENT,
	`user_id` VARCHAR(16) NOT NULL,
	`skill` VARCHAR(32) NOT NULL,
	PRIMARY KEY(`portfolio_skills_frontend_id`),
	FOREIGN KEY(`user_id`) REFERENCES `user_info`(`user_id`)
)DEFAULT CHARSET = UTF8;

CREATE TABLE `portfolio_skills_backend`(
	`portfolio_skills_backend_id` INT AUTO_INCREMENT,
	`user_id` VARCHAR(16) NOT NULL,
	`skill` VARCHAR(32) NOT NULL,
	PRIMARY KEY(`portfolio_skills_backend_id`),
	FOREIGN KEY(`user_id`) REFERENCES `user_info`(`user_id`)
)DEFAULT CHARSET = UTF8;

CREATE TABLE `portfolio_skills_mobileapp`(
	`portfolio_skills_mobileapp_id` INT AUTO_INCREMENT,
	`user_id` VARCHAR(16) NOT NULL,
	`skill` VARCHAR(32) NOT NULL,
	PRIMARY KEY(`portfolio_skills_mobileapp_id`),
	FOREIGN KEY(`user_id`) REFERENCES `user_info`(`user_id`)
)DEFAULT CHARSET = UTF8;

CREATE TABLE `portfolio_skills_deployment`(
	`portfolio_skills_deployment_id` INT AUTO_INCREMENT,
	`user_id` VARCHAR(16) NOT NULL,
	`skill` VARCHAR(32) NOT NULL,
	PRIMARY KEY(`portfolio_skills_deployment_id`),
	FOREIGN KEY(`user_id`) REFERENCES `user_info`(`user_id`)
)DEFAULT CHARSET = UTF8;

CREATE TABLE `portfolio_skills_versioncontrol`(
	`portfolio_skills_versioncontrol_id` INT AUTO_INCREMENT,
	`user_id` VARCHAR(16) NOT NULL,
	`skill` VARCHAR(32) NOT NULL,
	PRIMARY KEY(`portfolio_skills_versioncontrol_id`),
	FOREIGN KEY(`user_id`) REFERENCES `user_info`(`user_id`)
)DEFAULT CHARSET = UTF8;

CREATE TABLE `portfolio_skills_communication`(
	`portfolio_skills_communication_id` INT AUTO_INCREMENT,
	`user_id` VARCHAR(16) NOT NULL,
	`skill` VARCHAR(32) NOT NULL,
	PRIMARY KEY(`portfolio_skills_communication_id`),
	FOREIGN KEY(`user_id`) REFERENCES `user_info`(`user_id`)
)DEFAULT CHARSET = UTF8;

CREATE TABLE `portfolio_skills_certification`(
	`portfolio_skills_certification_id` INT AUTO_INCREMENT,
	`user_id` VARCHAR(16) NOT NULL,
	`skill` VARCHAR(32) NOT NULL,
	PRIMARY KEY(`portfolio_skills_certification_id`),
	FOREIGN KEY(`user_id`) REFERENCES `user_info`(`user_id`)
)DEFAULT CHARSET = UTF8;

CREATE TABLE `portfolio_archiving`(
	`portfolio_archiving_id` INT AUTO_INCREMENT,
	`user_id` VARCHAR(16) NOT NULL,
	`archiving_name` VARCHAR(32) NOT NULL,
	`archiving_explanation` VARCHAR(8192) NOT NULL,
	PRIMARY KEY(`portfolio_archiving_id`),
	FOREIGN KEY(`user_id`) REFERENCES `user_info`(`user_id`)
)DEFAULT CHARSET = UTF8;

CREATE TABLE `portfolio_project`(
	`portfolio_project_id` INT AUTO_INCREMENT,
	`user_id` VARCHAR(16) NOT NULL,
	`project_name` VARCHAR(32) NOT NULL,
	`project_explanation` VARCHAR(8192) NOT NULL,
	PRIMARY KEY(`portfolio_project_id`),
	FOREIGN KEY(`user_id`) REFERENCES `user_info`(`user_id`)
)DEFAULT CHARSET = UTF8;

CREATE TABLE `portfolio_career`(
	`portfolio_career_id` INT AUTO_INCREMENT,
	`user_id` VARCHAR(16) NOT NULL,
	`career_explanation` VARCHAR(8192) NOT NULL,
	PRIMARY KEY(`portfolio_career_id`),
	FOREIGN KEY(`user_id`) REFERENCES `user_info`(`user_id`)
)DEFAULT CHARSET = UTF8;