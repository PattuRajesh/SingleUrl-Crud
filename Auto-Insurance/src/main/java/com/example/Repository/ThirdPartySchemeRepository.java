package com.example.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Model.ThirdPartyScheme;

public interface ThirdPartySchemeRepository  extends JpaRepository <ThirdPartyScheme,Integer> {

	ThirdPartyScheme findBySchemeId(int schemeId);

}
