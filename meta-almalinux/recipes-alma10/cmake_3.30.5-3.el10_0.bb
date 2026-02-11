
PN = "cmake"
PE = "0"
PV = "3.30.5"
PR = "3.el10_0"
PACKAGES = "cmake cmake-data cmake-doc cmake-filesystem cmake-gui cmake-rpm-macros"


URI_cmake = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cmake-3.30.5-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:cmake = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) ( ) libcurl.so.4()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) ( ) libtinfo.so.6()(64bit) ( ) make ( ) libexpat.so.1()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.13)(64bit) ( ) libarchive.so.13()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.2)(64bit) ( ) libuv.so.1()(64bit) ( ) libncurses.so.6()(64bit) ( ) libform.so.6()(64bit) ( ) cmake-rpm-macros ( if  rpm-build) cmake-data ( =  3.30.5-3.el10_0) cmake-filesystem(x86-64) ( =  3.30.5-3.el10_0)"
RPROVIDES:cmake = "bundled(cppdap) ( ) bundled(jsoncpp) ( ) bundled(kwsys) ( ) bundled(md5-deutsch) ( ) bundled(rhash) ( ) cmake ( =  3.30.5-3.el10_0) cmake(x86-64) ( =  3.30.5-3.el10_0) cmake3 ( =  3.30.5-3.el10_0)"

URI_cmake-data = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cmake-data-3.30.5-3.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cmake-data = "cmake-filesystem ( ) vim-filesystem ( ) cmake ( =  3.30.5-3.el10_0) cmake-rpm-macros ( if  rpm-build) emacs-filesystem ( >=  29.4) cmake-filesystem ( =  3.30.5-3.el10_0)"
RPROVIDES:cmake-data = "cmake(CheckFlagCommon) ( ) cmake(FindPkg) ( ) cmake(UsePkg) ( ) cmake(checkflagcommon) ( ) cmake(findpkg) ( ) cmake(usepkg) ( ) cmake-data ( =  3.30.5-3.el10_0)"

URI_cmake-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cmake-doc-3.30.5-3.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cmake-doc = ""
RPROVIDES:cmake-doc = "cmake-doc ( =  3.30.5-3.el10_0)"

URI_cmake-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cmake-filesystem-3.30.5-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:cmake-filesystem = ""
RPROVIDES:cmake-filesystem = "cmake-filesystem(x86-64) ( =  3.30.5-3.el10_0) cmake-filesystem ( =  3.30.5-3.el10_0)"

URI_cmake-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cmake-gui-3.30.5-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:cmake-gui = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libcurl.so.4()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.13)(64bit) ( ) libQt6Widgets.so.6()(64bit) ( ) libarchive.so.13()(64bit) ( ) libQt6Widgets.so.6(Qt_6)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.11)(64bit) ( ) hicolor-icon-theme ( ) libuv.so.1()(64bit) ( ) shared-mime-info(x86-64) ( ) cmake(x86-64) ( =  3.30.5-3.el10_0)"
RPROVIDES:cmake-gui = "metainfo() ( ) application() ( ) application(cmake-gui.desktop) ( ) metainfo(cmake-gui.appdata.xml) ( ) mimehandler(application/x-cmakecache) ( ) cmake-gui ( =  3.30.5-3.el10_0) cmake-gui(x86-64) ( =  3.30.5-3.el10_0)"

URI_cmake-rpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cmake-rpm-macros-3.30.5-3.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cmake-rpm-macros = "/usr/bin/python3 ( ) rpm ( )"
RPROVIDES:cmake-rpm-macros = "rpm_macro(_cmake_lib_suffix64) ( ) rpm_macro(_cmake_shared_libs) ( ) rpm_macro(_cmake_skip_rpath) ( ) rpm_macro(_cmake_version) ( ) rpm_macro(cmake) ( ) rpm_macro(cmake3) ( ) rpm_macro(cmake3_build) ( ) rpm_macro(cmake3_install) ( ) rpm_macro(cmake_build) ( ) rpm_macro(cmake_install) ( ) rpm_macro(ctest) ( ) rpm_macro(ctest3) ( ) cmake-rpm-macros ( =  3.30.5-3.el10_0)"
