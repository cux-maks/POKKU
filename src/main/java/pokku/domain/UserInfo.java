package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_info")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    @Id
    @Column(name = "user_id")
    private String UserId;

    @Column(name = "user_name")
    private String UserName;

    @Column(name = "user_birth")
    private String UserBirth;

    @Column(name = "user_tel")
    private String UserTel;

    @Column(name = "user_email")
    private String UserEmail;

    @Column(name = "user_password")
    private String UserPassword;

    @Column(name = "user_nickname")
    private String UserNickname;

    @Column(name = "user_education")
    private String UserEducation;


    @OneToOne(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private UserInfoBlog userInfoBlog;

    @OneToOne(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private UserInfoGithub userInfoGithub;

    @OneToOne(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private UserInfoInstagram userInfoInstagram;

    @OneToOne(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private PortfolioAbout portfolioAbout;

    @OneToOne(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private PortfolioArchiving portfolioArchiving;

    @OneToOne(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private PortfolioCareer portfolioCareer;

    @OneToOne(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private PortfolioProject portfolioProject;

    @OneToMany(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private List<UserPortfolioSkillsBackend> userPortfolioSkillsBackendList = new ArrayList<>();

    @OneToMany(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private List<UserPortfolioSkillsCertification> userPortfolioSkillsCertificationList = new ArrayList<>();

    @OneToMany(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private List<UserPortfolioSkillsCommunication> userPortfolioSkillsCommunicationList = new ArrayList<>();

    @OneToMany(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private List<UserPortfolioSkillsDeployment> userPortfolioSkillsDeploymentList = new ArrayList<>();

    @OneToMany(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private List<UserPortfolioSkillsFrontend> userPortfolioSkillsFrontendList = new ArrayList<>();

    @OneToMany(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private List<UserPortfolioSkillsMobileapp> userPortfolioSkillsMobileappList = new ArrayList<>();

    @OneToMany(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private List<UserPortfolioSkillsVersioncontrol> userPortfolioSkillsVersioncontrolList = new ArrayList<>();

}
