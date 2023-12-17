package com.lms.isco.user.entity.generic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data @AllArgsConstructor @NoArgsConstructor @Builder(toBuilder = true)
@Entity @Table(name = "m_role")
public class Role {
    @Id
    @GenericGenerator(strategy = "uuid2",name = "system-uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "role_id")
    private String id;

    @Enumerated(EnumType.STRING)
    private ERole role;

}
// TODO :
//   1. bisa nggak column name id bukan role_id
//   2. ERole eRole causes [No property 'role' found for type 'Role'; Did you mean 'ERole','eRole']
