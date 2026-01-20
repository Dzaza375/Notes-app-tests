

emulator-5554primary·2
Å
DeleteNoteActivityTestcom.example.notesapp.uideleteNote_noteIsRemoved2∞‡æÀÄ¬Úù:≥‡æÀÄÁˇ›B
emulator-5554primaryß+
¿java.lang.RuntimeException: java.lang.NoSuchMethodException: android.hardware.input.InputManager.getInstance []
at androidx.test.espresso.base.InputManagerEventInjectionStrategy.initialize(InputManagerEventInjectionStrategy.java:28)
at androidx.test.espresso.base.BaseLayerModule.provideEventInjector(BaseLayerModule.java:4)
at androidx.test.espresso.base.BaseLayerModule_ProvideEventInjectorFactory.provideEventInjector(BaseLayerModule_ProvideEventInjectorFactory.java:1)
at androidx.test.espresso.base.BaseLayerModule_ProvideEventInjectorFactory.get(BaseLayerModule_ProvideEventInjectorFactory.java:1)
at androidx.test.espresso.base.BaseLayerModule_ProvideEventInjectorFactory.get(BaseLayerModule_ProvideEventInjectorFactory.java:2)
at androidx.test.espresso.core.internal.deps.dagger.internal.DoubleCheck.get(DoubleCheck.java:6)
at androidx.test.espresso.base.UiControllerImpl_Factory.get(UiControllerImpl_Factory.java:1)
at androidx.test.espresso.base.UiControllerImpl_Factory.get(UiControllerImpl_Factory.java:2)
at androidx.test.espresso.core.internal.deps.dagger.internal.DoubleCheck.get(DoubleCheck.java:6)
at androidx.test.espresso.base.UiControllerModule_ProvideUiControllerFactory.get(UiControllerModule_ProvideUiControllerFactory.java:1)
at androidx.test.espresso.base.UiControllerModule_ProvideUiControllerFactory.get(UiControllerModule_ProvideUiControllerFactory.java:2)
at androidx.test.espresso.core.internal.deps.dagger.internal.DoubleCheck.get(DoubleCheck.java:6)
at androidx.test.espresso.DaggerBaseLayerComponent$ViewInteractionComponentImpl.viewInteraction(DaggerBaseLayerComponent.java:1)
at androidx.test.espresso.Espresso.onView(Espresso.java:3)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher$1.apply(DataInteraction.java:1)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher$1.apply(DataInteraction.java:2)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher.<init>(DataInteraction.java:7)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher.<init>(DataInteraction.java:13)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher.displayDataMatcher(DataInteraction.java:1)
at androidx.test.espresso.DataInteraction.makeTargetMatcher(DataInteraction.java:2)
at androidx.test.espresso.DataInteraction.perform(DataInteraction.java:1)
at com.example.notesapp.ui.DeleteNoteActivityTest.deleteNote_noteIsRemoved(DeleteNoteActivityTest.java:36)
... 34 trimmed
Caused by: java.lang.NoSuchMethodException: android.hardware.input.InputManager.getInstance []
at java.lang.Class.getMethod(Class.java:2934)
at java.lang.Class.getDeclaredMethod(Class.java:2913)
at androidx.test.espresso.base.InputManagerEventInjectionStrategy.initialize(InputManagerEventInjectionStrategy.java:5)
... 56 more
java.lang.NoSuchMethodException¿java.lang.RuntimeException: java.lang.NoSuchMethodException: android.hardware.input.InputManager.getInstance []
at androidx.test.espresso.base.InputManagerEventInjectionStrategy.initialize(InputManagerEventInjectionStrategy.java:28)
at androidx.test.espresso.base.BaseLayerModule.provideEventInjector(BaseLayerModule.java:4)
at androidx.test.espresso.base.BaseLayerModule_ProvideEventInjectorFactory.provideEventInjector(BaseLayerModule_ProvideEventInjectorFactory.java:1)
at androidx.test.espresso.base.BaseLayerModule_ProvideEventInjectorFactory.get(BaseLayerModule_ProvideEventInjectorFactory.java:1)
at androidx.test.espresso.base.BaseLayerModule_ProvideEventInjectorFactory.get(BaseLayerModule_ProvideEventInjectorFactory.java:2)
at androidx.test.espresso.core.internal.deps.dagger.internal.DoubleCheck.get(DoubleCheck.java:6)
at androidx.test.espresso.base.UiControllerImpl_Factory.get(UiControllerImpl_Factory.java:1)
at androidx.test.espresso.base.UiControllerImpl_Factory.get(UiControllerImpl_Factory.java:2)
at androidx.test.espresso.core.internal.deps.dagger.internal.DoubleCheck.get(DoubleCheck.java:6)
at androidx.test.espresso.base.UiControllerModule_ProvideUiControllerFactory.get(UiControllerModule_ProvideUiControllerFactory.java:1)
at androidx.test.espresso.base.UiControllerModule_ProvideUiControllerFactory.get(UiControllerModule_ProvideUiControllerFactory.java:2)
at androidx.test.espresso.core.internal.deps.dagger.internal.DoubleCheck.get(DoubleCheck.java:6)
at androidx.test.espresso.DaggerBaseLayerComponent$ViewInteractionComponentImpl.viewInteraction(DaggerBaseLayerComponent.java:1)
at androidx.test.espresso.Espresso.onView(Espresso.java:3)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher$1.apply(DataInteraction.java:1)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher$1.apply(DataInteraction.java:2)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher.<init>(DataInteraction.java:7)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher.<init>(DataInteraction.java:13)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher.displayDataMatcher(DataInteraction.java:1)
at androidx.test.espresso.DataInteraction.makeTargetMatcher(DataInteraction.java:2)
at androidx.test.espresso.DataInteraction.perform(DataInteraction.java:1)
at com.example.notesapp.ui.DeleteNoteActivityTest.deleteNote_noteIsRemoved(DeleteNoteActivityTest.java:36)
... 34 trimmed
Caused by: java.lang.NoSuchMethodException: android.hardware.input.InputManager.getInstance []
at java.lang.Class.getMethod(Class.java:2934)
at java.lang.Class.getDeclaredMethod(Class.java:2913)
at androidx.test.espresso.base.InputManagerEventInjectionStrategy.initialize(InputManagerEventInjectionStrategy.java:5)
... 56 more
"¯

logcatandroid‚
ﬂC:\ForFor\ForOther\StudioProjects\NotesApp_FullProject\app\build\outputs\androidTest-results\connected\debug\Medium_Phone_API_36.1(AVD) - 16\logcat-com.example.notesapp.ui.DeleteNoteActivityTest-deleteNote_noteIsRemoved.txt"π

device-infoandroidû
õC:\ForFor\ForOther\StudioProjects\NotesApp_FullProject\app\build\outputs\androidTest-results\connected\debug\Medium_Phone_API_36.1(AVD) - 16\device-info.pb"∫

device-info.meminfoandroidó
îC:\ForFor\ForOther\StudioProjects\NotesApp_FullProject\app\build\outputs\androidTest-results\connected\debug\Medium_Phone_API_36.1(AVD) - 16\meminfo"∫

device-info.cpuinfoandroidó
îC:\ForFor\ForOther\StudioProjects\NotesApp_FullProject\app\build\outputs\androidTest-results\connected\debug\Medium_Phone_API_36.1(AVD) - 16\cpuinfo*û
c
test-results.logOcom.google.testing.platform.runtime.android.driver.AndroidInstrumentationDriver®
•C:\ForFor\ForOther\StudioProjects\NotesApp_FullProject\app\build\outputs\androidTest-results\connected\debug\Medium_Phone_API_36.1(AVD) - 16\testlog\test-results.log 2
text/plain