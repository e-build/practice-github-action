package com.example.riririri.domain

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@Table(name = "source")
@Entity
class Source(
    name: String,
    value: String,
    validated: Boolean,
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @Column(nullable = false)
    var name: String = name

    @Column(nullable = false)
    var value: String = value

    @Column(nullable = false)
    var validated: Boolean = validated

    @CreatedDate
    @Column(name = "created_at", columnDefinition = "datetime(6) default(now())", nullable = false, updatable = false)
    var createdAt : LocalDateTime = LocalDateTime.now()

    @LastModifiedDate
    @Column(name = "modified_at", columnDefinition = "datetime(6) default(now())", nullable = false)
    var modifiedAt: LocalDateTime = LocalDateTime.now()

}