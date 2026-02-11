
PN = "qt6-qtsensors"
PE = "0"
PV = "6.8.1"
PR = "2.el10"
PACKAGES = "qt6-qtsensors qt6-qtsensors-devel qt6-qtsensors-examples qt6-qtsensors-tests"


URI_qt6-qtsensors = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtsensors-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtsensors = "
 glibc
 qt6-qtdeclarative
 libstdc++
 qt6-qtbase
"

URI_qt6-qtsensors-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtsensors-devel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtsensors-devel = "
 qt6-qtdeclarative-devel
 cmake-filesystem
 pkgconf-pkg-config
 qt6-qtbase-devel
 qt6-qtsensors
 qt6-qtsensors-devel
"

URI_qt6-qtsensors-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtsensors-examples-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtsensors-examples = "
 qt6-qtdeclarative
 libgcc
 qt6-qtsensors
 qt6-qtbase
 libstdc++
 qt6-qtbase-gui
 glibc
"

URI_qt6-qtsensors-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtsensors-tests-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtsensors-tests = "
 qt6-qtdeclarative
 libgcc
 qt6-qtsensors
 qt6-qtbase
 libstdc++
 glibc
"
