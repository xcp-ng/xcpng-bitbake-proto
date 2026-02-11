
PN = "qt6-qtremoteobjects"
PE = "0"
PV = "6.8.1"
PR = "2.el10"
PACKAGES = "qt6-qtremoteobjects qt6-qtremoteobjects-devel qt6-qtremoteobjects-examples qt6-qtremoteobjects-tests"


URI_qt6-qtremoteobjects = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtremoteobjects-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtremoteobjects = " \
 glibc \
 qt6-qtdeclarative \
 libstdc++ \
 qt6-qtbase \
"

URI_qt6-qtremoteobjects-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtremoteobjects-devel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtremoteobjects-devel = " \
 qt6-qtdeclarative-devel \
 cmake-filesystem \
 pkgconf-pkg-config \
 qt6-qtbase-devel \
 qt6-qtremoteobjects \
 qt6-qtremoteobjects-devel \
"

URI_qt6-qtremoteobjects-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtremoteobjects-examples-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtremoteobjects-examples = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 qt6-qtremoteobjects \
 glibc \
"

URI_qt6-qtremoteobjects-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtremoteobjects-tests-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtremoteobjects-tests = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 qt6-qtremoteobjects \
 glibc \
"
