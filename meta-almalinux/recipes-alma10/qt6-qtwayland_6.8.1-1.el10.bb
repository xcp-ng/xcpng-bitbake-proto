
inherit dnf-bridge

PN = "qt6-qtwayland"
PE = "0"
PV = "6.8.1"
PR = "1.el10"
PACKAGES = "qt6-qtwayland qt6-qtwayland-devel qt6-qtwayland-examples qt6-qtwayland-tests"


URI_qt6-qtwayland = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtwayland-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtwayland = " \
 qt6-qtdeclarative \
 qt6-qtsvg \
 libwayland-client \
 libglvnd-egl \
 libwayland-cursor \
 libwayland-server \
 libglvnd-opengl \
 libwayland-egl \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
 libxkbcommon \
"

URI_qt6-qtwayland-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtwayland-devel-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtwayland-devel = " \
 qt6-qtdeclarative-devel \
 cmake-filesystem \
 pkgconf-pkg-config \
 qt6-qtbase \
 qt6-qtwayland \
 qt6-qtbase-devel \
 libstdc++ \
 glibc \
"

URI_qt6-qtwayland-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtwayland-examples-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtwayland-examples = " \
 qt6-qtdeclarative \
 libwayland-client \
 libwayland-server \
 libgcc \
 qt6-qtbase \
 qt6-qtwayland \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtwayland-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtwayland-tests-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtwayland-tests = " \
 libwayland-client \
 libwayland-cursor \
 libwayland-server \
 libgcc \
 libglvnd-opengl \
 qt6-qtbase \
 qt6-qtwayland \
 libstdc++ \
 bash \
 qt6-qtbase-gui \
 glibc \
"
