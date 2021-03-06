package io.fabric8.launcher.service.git.gitlab.api;

import io.fabric8.launcher.base.EnvironmentEnum;

/**
 * Contains names of environment variables or system properties
 * relating to the GitLab Service
 *
 * @deprecated use the {@link io.fabric8.launcher.service.git.api.GitServiceConfig} feature instead
 */
@Deprecated
public enum GitLabEnvironment implements EnvironmentEnum {
    LAUNCHER_MISSIONCONTROL_GITLAB_USERNAME,
    LAUNCHER_MISSIONCONTROL_GITLAB_PRIVATE_TOKEN,
    LAUNCHER_MISSIONCONTROL_GITLAB_URL
}