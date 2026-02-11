
PN = "qt6-qtsvg"
PE = "0"
PV = "6.8.1"
PR = "1.el10_0.1"
PACKAGES = "qt6-qtsvg qt6-qtsvg-devel qt6-qtsvg-examples qt6-qtsvg-tests"


URI_qt6-qtsvg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtsvg-6.8.1-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtsvg = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) libQt6Widgets.so.6()(64bit) ( ) libQt6Widgets.so.6(Qt_6)(64bit) ( ) libQt6Gui.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) libQt6Widgets.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) qt6-qtbase(x86-64) ( =  6.8.1)"
RPROVIDES:qt6-qtsvg = "libQt6Svg.so.6()(64bit) ( ) libQt6Svg.so.6(Qt_6)(64bit) ( ) libQt6SvgWidgets.so.6()(64bit) ( ) libQt6Svg.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) libQt6SvgWidgets.so.6(Qt_6)(64bit) ( ) libQt6Svg.so.6(NonQt)(64bit) ( ) libQt6SvgWidgets.so.6(NonQt)(64bit) ( ) libQt6SvgWidgets.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) qt6-qtsvg(x86-64) ( =  6.8.1-1.el10_0.1) qt6-qtsvg ( =  6.8.1-1.el10_0.1)"

URI_qt6-qtsvg-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtsvg-devel-6.8.1-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtsvg-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) qt6-qtbase-devel(x86-64) ( ) pkgconfig(Qt6Core) ( ) pkgconfig(Qt6Gui) ( ) libQt6Svg.so.6()(64bit) ( ) pkgconfig(Qt6Widgets) ( ) libQt6SvgWidgets.so.6()(64bit) ( ) pkgconfig(Qt6Svg) ( ) qt6-qtsvg(x86-64) ( =  6.8.1-1.el10_0.1)"
RPROVIDES:qt6-qtsvg-devel = "cmake(Qt6QSvgIconPlugin) ( ) cmake(Qt6QSvgPlugin) ( ) cmake(Qt6Svg) ( ) cmake(Qt6SvgWidgets) ( ) cmake(QtSvgTests) ( ) cmake(qt6qsvgiconplugin) ( ) cmake(qt6qsvgplugin) ( ) cmake(qt6svg) ( ) cmake(qt6svgwidgets) ( ) cmake(qtsvgtests) ( ) pkgconfig(Qt6Svg) ( =  6.8.1) pkgconfig(Qt6SvgWidgets) ( =  6.8.1) qt6-qtsvg-devel ( =  6.8.1-1.el10_0.1) qt6-qtsvg-devel(x86-64) ( =  6.8.1-1.el10_0.1)"

URI_qt6-qtsvg-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtsvg-examples-6.8.1-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtsvg-examples = "qt6-qtsvg(x86-64) ( =  6.8.1-1.el10_0.1)"
RPROVIDES:qt6-qtsvg-examples = "qt6-qtsvg-examples ( =  6.8.1-1.el10_0.1) qt6-qtsvg-examples(x86-64) ( =  6.8.1-1.el10_0.1)"

URI_qt6-qtsvg-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtsvg-tests-6.8.1-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtsvg-tests = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Test.so.6()(64bit) ( ) libQt6Test.so.6(Qt_6)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libQt6Widgets.so.6()(64bit) ( ) libQt6Widgets.so.6(Qt_6)(64bit) ( ) libQt6Xml.so.6()(64bit) ( ) libQt6Xml.so.6(Qt_6)(64bit) ( ) libQt6Svg.so.6()(64bit) ( ) libQt6Svg.so.6(Qt_6)(64bit) ( ) libQt6Svg.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) qt6-qtsvg(x86-64) ( =  6.8.1-1.el10_0.1)"
RPROVIDES:qt6-qtsvg-tests = "qt6-qtsvg-tests ( =  6.8.1-1.el10_0.1) qt6-qtsvg-tests(x86-64) ( =  6.8.1-1.el10_0.1)"
