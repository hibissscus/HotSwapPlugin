package org.hotswapagent.plugin.idea.util;

import org.hotswapagent.plugin.idea.HotSwapAgentIntegration;
import org.kohsuke.github.GHRelease;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.List;

public class GitHubUtil {

    public static String getLastRelease() {
        try {
            GitHub github = GitHub.connectAnonymously();
            GHRepository repo = github.getRepository(HotSwapAgentIntegration.GITHUB_REPOSITORY);

            final List<GHRelease> releases = repo.getReleases();

            return (!releases.isEmpty()) ? releases.get(0).getTagName() : null;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
