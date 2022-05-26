package com.quentinfou.demoSpringFramework.data;

import com.quentinfou.demoSpringFramework.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface MessageDAO extends JpaRepository<Message,Long> {

}
