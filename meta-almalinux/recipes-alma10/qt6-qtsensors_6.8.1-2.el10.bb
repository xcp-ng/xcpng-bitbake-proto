
PN = "qt6-qtsensors"
PE = "0"
PV = "6.8.1"
PR = "2.el10"
PACKAGES = "qt6-qtsensors qt6-qtsensors-devel qt6-qtsensors-examples qt6-qtsensors-tests"


URI_qt6-qtsensors = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtsensors-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtsensors = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Core.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) libQt6Qml.so.6()(64bit) ( ) libQt6Qml.so.6(Qt_6)(64bit) ( ) libc.so.6(GLIBC_2.17)(64bit) ( ) libQt6DBus.so.6()(64bit) ( ) libQt6DBus.so.6(Qt_6)(64bit) ( ) qt6-qtbase(x86-64) ( =  6.8.1)"
RPROVIDES:qt6-qtsensors = "libQt6Sensors.so.6()(64bit) ( ) libQt6Sensors.so.6(Qt_6)(64bit) ( ) libQt6SensorsQuick.so.6()(64bit) ( ) libQt6Sensors.so.6(NonQt)(64bit) ( ) libQt6Sensors.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) libQt6SensorsQuick.so.6(NonQt)(64bit) ( ) libQt6SensorsQuick.so.6(Qt_6)(64bit) ( ) libQt6SensorsQuick.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) qt6qml(QtSensors) ( ) qt6-qtsensors(x86-64) ( =  6.8.1-2.el10) qt6-qtsensors ( =  6.8.1-2.el10)"

URI_qt6-qtsensors-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtsensors-devel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtsensors-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) qt6-qtbase-devel(x86-64) ( ) pkgconfig(Qt6Core) ( ) pkgconfig(Qt6Qml) ( ) libQt6Sensors.so.6()(64bit) ( ) libQt6SensorsQuick.so.6()(64bit) ( ) pkgconfig(Qt6Sensors) ( ) qt6-qtsensors(x86-64) ( =  6.8.1-2.el10)"
RPROVIDES:qt6-qtsensors-devel = "cmake(Qt6IIOSensorProxySensorPlugin) ( ) cmake(Qt6Sensors) ( ) cmake(Qt6SensorsQuick) ( ) cmake(Qt6SensorsQuickplugin) ( ) cmake(Qt6genericSensorPlugin) ( ) cmake(QtSensorsTests) ( ) cmake(qt6genericsensorplugin) ( ) cmake(qt6iiosensorproxysensorplugin) ( ) cmake(qt6sensors) ( ) cmake(qt6sensorsquick) ( ) cmake(qt6sensorsquickplugin) ( ) cmake(qtsensorstests) ( ) pkgconfig(Qt6Sensors) ( =  6.8.1) pkgconfig(Qt6SensorsQuick) ( =  6.8.1) qt6-qtsensors-devel ( =  6.8.1-2.el10) qt6-qtsensors-devel(x86-64) ( =  6.8.1-2.el10)"

URI_qt6-qtsensors-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtsensors-examples-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtsensors-examples = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libQt6Qml.so.6()(64bit) ( ) libQt6Qml.so.6(Qt_6)(64bit) ( ) libQt6Sensors.so.6()(64bit) ( ) libQt6Sensors.so.6(Qt_6)(64bit) ( ) qt6-qtsensors(x86-64) ( =  6.8.1-2.el10)"
RPROVIDES:qt6-qtsensors-examples = "qt6-qtsensors-examples ( =  6.8.1-2.el10) qt6-qtsensors-examples(x86-64) ( =  6.8.1-2.el10)"

URI_qt6-qtsensors-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtsensors-tests-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtsensors-tests = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Test.so.6()(64bit) ( ) libQt6Test.so.6(Qt_6)(64bit) ( ) libQt6Qml.so.6()(64bit) ( ) libQt6Qml.so.6(Qt_6)(64bit) ( ) libQt6QuickTest.so.6()(64bit) ( ) libQt6QuickTest.so.6(Qt_6)(64bit) ( ) libQt6Sensors.so.6()(64bit) ( ) libQt6Sensors.so.6(Qt_6)(64bit) ( ) libQt6Sensors.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) libQt6SensorsQuick.so.6()(64bit) ( ) libQt6SensorsQuick.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) qt6-qtsensors(x86-64) ( =  6.8.1-2.el10)"
RPROVIDES:qt6-qtsensors-tests = "qt6-qtsensors-tests ( =  6.8.1-2.el10) qt6-qtsensors-tests(x86-64) ( =  6.8.1-2.el10)"
