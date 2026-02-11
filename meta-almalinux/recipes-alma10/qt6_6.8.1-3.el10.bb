
PN = "qt6"
PE = "0"
PV = "6.8.1"
PR = "3.el10"
PACKAGES = "qt6-filesystem qt6-rpm-macros qt6-srpm-macros"


URI_qt6-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-filesystem-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-filesystem = ""

URI_qt6-rpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-rpm-macros-6.8.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:qt6-rpm-macros = "
 gcc-c++
 chrpath
 bash
 cmake
"

URI_qt6-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-srpm-macros-6.8.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:qt6-srpm-macros = ""
