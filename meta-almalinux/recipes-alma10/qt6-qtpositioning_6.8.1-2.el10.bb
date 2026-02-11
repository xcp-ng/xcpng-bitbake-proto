
inherit dnf-bridge

PN = "qt6-qtpositioning"
PE = "0"
PV = "6.8.1"
PR = "2.el10"
PACKAGES = "qt6-qtpositioning qt6-qtpositioning-devel qt6-qtpositioning-examples qt6-qtpositioning-tests"


URI_qt6-qtpositioning = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtpositioning-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtpositioning = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 glibc \
 qt6-qtserialport \
"

URI_qt6-qtpositioning-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtpositioning-devel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtpositioning-devel = " \
 qt6-qtdeclarative-devel \
 cmake-filesystem \
 pkgconf-pkg-config \
 qt6-qtpositioning \
 qt6-qtpositioning-devel \
 qt6-qtbase-devel \
"

URI_qt6-qtpositioning-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtpositioning-examples-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtpositioning-examples = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 qt6-qtpositioning \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtpositioning-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtpositioning-tests-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtpositioning-tests = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 qt6-qtpositioning \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"
