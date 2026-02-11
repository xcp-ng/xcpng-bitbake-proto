
PN = "qt6-qtlottie"
PE = "0"
PV = "6.8.1"
PR = "1.el10"
PACKAGES = "qt6-qtlottie qt6-qtlottie-devel qt6-qtlottie-tests"


URI_qt6-qtlottie = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtlottie-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtlottie = " \
 qt6-qtdeclarative \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtlottie-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtlottie-devel-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtlottie-devel = " \
 qt6-qtlottie \
 qt6-qtbase-devel \
 cmake-filesystem \
"

URI_qt6-qtlottie-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtlottie-tests-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtlottie-tests = " \
 qt6-qtdeclarative \
 qt6-qtlottie \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"
