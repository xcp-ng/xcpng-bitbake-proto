
PN = "qt6"
PE = "0"
PV = "6.8.1"
PR = "3.el10"
PACKAGES = "qt6-filesystem qt6-rpm-macros qt6-srpm-macros"


URI_qt6-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-filesystem-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-filesystem = ""
RPROVIDES:qt6-filesystem = "qt6-filesystem ( =  6.8.1-3.el10) qt6-filesystem(x86-64) ( =  6.8.1-3.el10)"

URI_qt6-rpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-rpm-macros-6.8.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:qt6-rpm-macros = "/usr/bin/sh ( ) gcc-c++ ( ) chrpath ( ) cmake ( >=  3)"
RPROVIDES:qt6-rpm-macros = "rpm_macro(_qt6_archdatadir) ( ) rpm_macro(_qt6_bindir) ( ) rpm_macro(_qt6_build_tool) ( ) rpm_macro(_qt6_build_type) ( ) rpm_macro(_qt6_cflags) ( ) rpm_macro(_qt6_cxxflags) ( ) rpm_macro(_qt6_datadir) ( ) rpm_macro(_qt6_descriptionsdir) ( ) rpm_macro(_qt6_docdir) ( ) rpm_macro(_qt6_examplesdir) ( ) rpm_macro(_qt6_headerdir) ( ) rpm_macro(_qt6_importdir) ( ) rpm_macro(_qt6_includedir) ( ) rpm_macro(_qt6_ldflags) ( ) rpm_macro(_qt6_libdir) ( ) rpm_macro(_qt6_libexecdir) ( ) rpm_macro(_qt6_metatypesdir) ( ) rpm_macro(_qt6_mkspecsdir) ( ) rpm_macro(_qt6_optflags) ( ) rpm_macro(_qt6_plugindir) ( ) rpm_macro(_qt6_prefix) ( ) rpm_macro(_qt6_qmake) ( ) rpm_macro(_qt6_qmake_flags) ( ) rpm_macro(_qt6_qmldir) ( ) rpm_macro(_qt6_settingsdir) ( ) rpm_macro(_qt6_sysconfdir) ( ) rpm_macro(_qt6_translationdir) ( ) rpm_macro(cmake_qt6) ( ) rpm_macro(qmake_qt6) ( ) rpm_macro(qmake_qt6_wrapper) ( ) rpm_macro(qt6_dont_autoinstall_tests) ( ) rpm_macro(qt6_fix_tests) ( ) rpm_macro(qt6_install_tests) ( ) qt6-rpm-macros ( =  6.8.1-3.el10)"

URI_qt6-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-srpm-macros-6.8.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:qt6-srpm-macros = ""
RPROVIDES:qt6-srpm-macros = "rpm_macro(qt6_qtwebengine_arches) ( ) qt6-srpm-macros ( =  6.8.1-3.el10)"
