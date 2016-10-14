package tddtrainer.gui.catalog;

import java.util.ResourceBundle;

import com.google.common.eventbus.EventBus;
import com.google.inject.Inject;
import com.google.inject.Provider;

import tddtrainer.catalog.CatalogDataSource;

/**
 * Provides an gui window where a user can select an Exercise from a exercise
 * catalog
 * 
 * @author Marcel
 */
public class ExerciseSelector {

    private CatalogDataSource dataSource;
    private Provider<ResourceBundle> bundleProvider;
    private EventBus bus;

    /**
     * Creates an ExerciseSelector
     * 
     * @param dataSource
     *            the data source from where the catalog should be read
     */
    @Inject
    public ExerciseSelector(CatalogDataSource dataSource, Provider<ResourceBundle> bundleProvider, EventBus bus) {
        this.dataSource = dataSource;
        this.bundleProvider = bundleProvider;
        this.bus = bus;
        bus.register(this);
    }

    public CatalogDataSource getDataSource() {
        return dataSource;
    }

    // /**
    // * Opens a new modal window where the user can select an Exercise from the
    // * catalog
    // *
    // * @return the selected Exercise or null if the dialog is canceled
    // */
    // @Subscribe
    // public void selectExercise(ShowSelectDialogRequest event) {
    // Stage dialogStage = new Stage();
    // Exercise exercise = null;
    // try {
    // URL location = getClass().getResource("ExerciseSelector.fxml");
    // FXMLLoader loader = new FXMLLoader(location);
    // loader.setResources(bundleProvider.get());
    // BorderPane pane = (BorderPane) loader.load();
    // ExerciseSelectorController controller = (ExerciseSelectorController)
    // loader.getController();
    //
    // dialogStage.setScene(new Scene(pane));
    // dialogStage.sizeToScene();
    // dialogStage.setResizable(false);
    // dialogStage.showAndWait();
    // exercise = controller.getSelectedExercise();
    //
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // if (exercise == null)
    // return;
    // if (exercise.isBabyStepsActivated()) {
    // bus.post(new Babysteps(exercise.getBabyStepsCodeTime()));
    // } else {
    // bus.post(new Babysteps(-1));
    // }
    // bus.post(new ExerciseEvent(exercise));
    // }

}
