
PN = "qt6-qtdeclarative"
PE = "0"
PV = "6.8.1"
PR = "4.el10"
PACKAGES = "qt6-qtdeclarative qt6-qtdeclarative-devel qt6-qtdeclarative-examples qt6-qtdeclarative-static qt6-qtdeclarative-tests"


URI_qt6-qtdeclarative = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtdeclarative-6.8.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtdeclarative = " \
 qt6-qtsvg \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtdeclarative-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtdeclarative-devel-6.8.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtdeclarative-devel = " \
 qt6-qtdeclarative \
 qt6-qtdeclarative-devel \
 cmake-filesystem \
 pkgconf-pkg-config \
 qt6-qtbase \
 qt6-qtbase-devel \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtdeclarative-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtdeclarative-examples-6.8.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtdeclarative-examples = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtdeclarative-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtdeclarative-static-6.8.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtdeclarative-static = " \
 qt6-qtdeclarative-devel \
 cmake-filesystem \
"

URI_qt6-qtdeclarative-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtdeclarative-tests-6.8.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtdeclarative-tests = " \
 python3 \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 bash \
 qt6-qtbase-gui \
 glibc \
"
