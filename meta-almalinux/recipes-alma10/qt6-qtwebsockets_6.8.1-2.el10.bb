
inherit dnf-bridge

PN = "qt6-qtwebsockets"
PE = "0"
PV = "6.8.1"
PR = "2.el10"
PACKAGES = "qt6-qtwebsockets qt6-qtwebsockets-devel qt6-qtwebsockets-examples qt6-qtwebsockets-tests"


URI_qt6-qtwebsockets = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtwebsockets-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtwebsockets = " \
 glibc \
 libstdc++ \
 qt6-qtbase \
"

URI_qt6-qtwebsockets-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtwebsockets-devel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtwebsockets-devel = " \
 qt6-qtdeclarative \
 cmake-filesystem \
 pkgconf-pkg-config \
 qt6-qtbase \
 qt6-qtbase-devel \
 libstdc++ \
 qt6-qtwebsockets \
 glibc \
"

URI_qt6-qtwebsockets-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtwebsockets-examples-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtwebsockets-examples = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 qt6-qtwebsockets \
 glibc \
"

URI_qt6-qtwebsockets-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtwebsockets-tests-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtwebsockets-tests = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtwebsockets \
 glibc \
"
