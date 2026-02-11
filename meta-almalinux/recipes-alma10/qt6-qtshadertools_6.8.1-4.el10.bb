
inherit dnf-bridge

PN = "qt6-qtshadertools"
PE = "0"
PV = "6.8.1"
PR = "4.el10"
PACKAGES = "qt6-qtshadertools qt6-qtshadertools-devel qt6-qtshadertools-tests"


URI_qt6-qtshadertools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtshadertools-6.8.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtshadertools = " \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
 spirv-tools-libs \
"

URI_qt6-qtshadertools-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtshadertools-devel-6.8.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtshadertools-devel = " \
 cmake-filesystem \
 pkgconf-pkg-config \
 qt6-qtbase-devel \
 spirv-tools \
 qt6-qtshadertools \
"

URI_qt6-qtshadertools-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtshadertools-tests-6.8.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtshadertools-tests = " \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
 qt6-qtshadertools \
"
