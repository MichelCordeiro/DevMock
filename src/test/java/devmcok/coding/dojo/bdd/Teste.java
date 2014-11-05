package devmcok.coding.dojo.bdd;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.jbehave.core.InjectableEmbedder;
import org.jbehave.core.annotations.Configure;
import org.jbehave.core.annotations.UsingEmbedder;
import org.jbehave.core.annotations.UsingSteps;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.AnnotatedEmbedderRunner;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AnnotatedEmbedderRunner.class)
@Configure(storyLoader = Teste.StoryLoader.class, storyReporterBuilder = Teste.ReportBuilder.class)
@UsingEmbedder(embedder = Embedder.class, generateViewAfterStories = true, ignoreFailureInStories = true, ignoreFailureInView = true, verboseFailures = true, storyTimeoutInSecs = 100, threads = 2, metaFilters = "-skip")
@UsingSteps(instances = { TesteSteps.class })
public class Teste extends InjectableEmbedder {

	@Test
	public void deveFazerNada() {
		assertTrue(true);
	}

	@Override
	@Test
	public void run() throws Throwable {
		List<String> storyPaths = new StoryFinder().findPaths(
				CodeLocations.codeLocationFromPath("src/resources"),
				"stories/*.story", "");
		injectedEmbedder().runStoriesAsPaths(storyPaths);
	}

	public static class StoryLoader extends LoadFromClasspath {
		public StoryLoader() {
			super(Teste.class.getClassLoader());
		}
	}

	public static class ReportBuilder extends StoryReporterBuilder {
		public ReportBuilder() {
			this.withFormats(org.jbehave.core.reporters.Format.CONSOLE,
					org.jbehave.core.reporters.Format.HTML)
					.withDefaultFormats();
		}
	}
}
