
PN = "qt6-qtshadertools"
PE = "0"
PV = "6.8.1"
PR = "4.el10"
PACKAGES = "qt6-qtshadertools qt6-qtshadertools-devel qt6-qtshadertools-tests"


URI_qt6-qtshadertools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtshadertools-6.8.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtshadertools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.7)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) libSPIRV-Tools-opt.so()(64bit) ( ) libSPIRV-Tools.so()(64bit) ( ) qt6-qtbase(x86-64) ( =  6.8.1)"
RPROVIDES:qt6-qtshadertools = "libQt6ShaderTools.so.6()(64bit) ( ) libQt6ShaderTools.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) bundled(spirv-cross) ( ) libQt6ShaderTools.so.6(NonQt)(64bit) ( ) libQt6ShaderTools.so.6(Qt_6)(64bit) ( ) qt6-qtshadertools(x86-64) ( =  6.8.1-4.el10) qt6-qtshadertools ( =  6.8.1-4.el10)"

URI_qt6-qtshadertools-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtshadertools-devel-6.8.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtshadertools-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) qt6-qtbase-devel(x86-64) ( ) pkgconfig(Qt6Core) ( ) pkgconfig(Qt6Gui) ( ) libQt6ShaderTools.so.6()(64bit) ( ) spirv-tools ( ) qt6-qtshadertools(x86-64) ( =  6.8.1-4.el10)"
RPROVIDES:qt6-qtshadertools-devel = "cmake(Qt6ShaderTools) ( ) cmake(Qt6ShaderToolsTools) ( ) cmake(QtShaderToolsTests) ( ) cmake(qt6shadertools) ( ) cmake(qt6shadertoolstools) ( ) cmake(qtshadertoolstests) ( ) pkgconfig(Qt6ShaderTools) ( =  6.8.1) qt6-qtshadertools-devel ( =  6.8.1-4.el10) qt6-qtshadertools-devel(x86-64) ( =  6.8.1-4.el10)"

URI_qt6-qtshadertools-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtshadertools-tests-6.8.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtshadertools-tests = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Test.so.6()(64bit) ( ) libQt6Test.so.6(Qt_6)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libQt6Gui.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) libQt6ShaderTools.so.6()(64bit) ( ) libQt6ShaderTools.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) qt6-qtshadertools(x86-64) ( =  6.8.1-4.el10)"
RPROVIDES:qt6-qtshadertools-tests = "qt6-qtshadertools-tests ( =  6.8.1-4.el10) qt6-qtshadertools-tests(x86-64) ( =  6.8.1-4.el10)"
