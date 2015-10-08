package org.hotswapagent.plugin.idea;

public interface HowSwapAgentProperty {
    /**
     * Plugin version key
     */
    public final static String AGENT_VERSION_KEY = "org.hotswapagent.plugin.idea.version";

    /**
     * Name of GitHub repository for HotSwap
     */
    public final static String GITHUB_OWNER = "HotswapProjects";

    /**
     * Name of the project
     */
    public final static String GITHUB_PROJECT = "HotswapAgent";

    /**
     * Path to GitHab project
     */
    public final static String GITHUB_REPOSITORY = GITHUB_OWNER + "/" + GITHUB_PROJECT;

    /**
     * URL for downloading
     */
    public final static String ZIP_URL_PATTERN = "https://github.com/" + GITHUB_OWNER + "/" + GITHUB_PROJECT + "/releases/download/%s/" + GITHUB_PROJECT + "-0.3.zip";

    /**
     * Key for alternativ JVM (patched JVM)
     */
    public final static String ALT_JVM = "-XXaltjvm";

    /**
     * Key for HotSwap agent adding
     */
    public final static String JAVA_AGENT = "-javaagent";
}
